/*
 * #%L
 * cwf-fhir-validator
 * %%
 * Copyright (C) 2014 - 2016 Healthcare Services Platform Consortium
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package org.hspconsortium.cwf.fhir.validator;

import org.apache.commons.lang3.StringUtils;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.context.FhirVersionEnum;
import ca.uhn.fhir.model.api.Bundle;
import ca.uhn.fhir.model.base.resource.BaseOperationOutcome;
import ca.uhn.fhir.model.base.resource.BaseOperationOutcome.BaseIssue;
import ca.uhn.fhir.model.primitive.UriDt;
import ca.uhn.fhir.rest.client.GenericClient;
import ca.uhn.fhir.rest.client.interceptor.BasicAuthInterceptor;
import ca.uhn.fhir.rest.server.EncodingEnum;
import ca.uhn.fhir.util.VersionUtil;
import ca.uhn.fhir.validation.FhirValidator;
import ca.uhn.fhir.validation.ValidationResult;

/**
 * Fhir Resource Validator
 */
public class FhirValidate {
    
    public static void main(String[] args) throws Exception {
        if (args.length != 4) {
            usage();
            System.exit(1);
        }
        
        try {
            FhirVersionEnum fhirVersion = FhirVersionEnum.valueOf(args[0].toUpperCase());
            EncodingEnum encoding = EncodingEnum.valueOf(args[1].toUpperCase());
            System.out.printf("\nUsing FHIR version %s, encoding %s\n", fhirVersion.name(), encoding.name());
            FhirContext ctx = new FhirContext(fhirVersion);
            FhirValidator validator = ctx.newValidator();
            validator.setValidateAgainstStandardSchema(true);
            validator.setValidateAgainstStandardSchematron(true);
            String[] uri = parseURI(args[2]);
            GenericClient client = (GenericClient) ctx.newRestfulGenericClient(uri[0]);
            client.setEncoding(encoding);
            
            if (!uri[1].isEmpty() || !uri[2].isEmpty()) {
                client.registerInterceptor(new BasicAuthInterceptor(uri[1], uri[2]));
            }
            
            UriDt id = new UriDt(fixURI(args[3]));
            ValidationResult result = null;
            int count = 1;
            
            if (isResource(id)) {
                System.out.print("Validating resource: " + id.getValue() + "...  ");
                result = validator.validateWithResult(client.read(id));
            } else {
                System.out.print("Validating bundle:   " + id.getValue() + "...  ");
                Bundle bundle = client.search(id);
                count = bundle.getTotalResults().getValue();
                result = validator.validateWithResult(bundle);
            }
            
            System.out.printf("(%d) ", count);
            
            if (!result.isSuccessful()) {
                BaseOperationOutcome outcome = (BaseOperationOutcome) result.toOperationOutcome();
                System.out.println("failed:");
                
                for (BaseIssue issue : outcome.getIssue()) {
                    System.out.println(issue.getDetailsElement().getValue());
                }
                
                System.exit(2);
            }
            
            System.out.println("succeeded.");
            System.exit(0);
        } catch (Exception e) {
            System.out.println("failed:");
            System.out.println(e.getMessage());
            System.exit(3);
        }
    }
    
    private static boolean isResource(UriDt id) {
        return StringUtils.countMatches(id.getValue(), "/") % 2 == 1;
    }
    
    private static String fixURI(String uri) {
        if (uri.contains("?")) {
            uri = uri.split("\\?")[0];
        }
        
        while (uri.endsWith("/")) {
            uri = uri.substring(0, uri.length() - 1);
        }
        
        return uri;
    }
    
    /**
     * Parse components of URI.
     * 
     * @param uri The URI
     * @return Array of parsed components as: <code>
     *  0 = The normalized URI
     *  1 = The username
     *  2 = The password
     *  </code>
     */
    private static String[] parseURI(String uri) {
        String[] result = { "", "", "" };
        uri = fixURI(uri);
        
        if (!uri.contains("://")) {
            uri = "http://" + uri;
        }
        
        if (uri.contains("@")) {
            String[] pcs1 = uri.split("@", 2);
            String[] pcs2 = pcs1[0].split("://", 2);
            uri = pcs2[0] + "://" + pcs1[1];
            pcs1 = ele(pcs2, 1).split(":", 2);
            result[1] = ele(pcs1, 0);
            result[2] = ele(pcs1, 1);
        }
        
        result[0] = uri;
        return result;
    }
    
    private static String ele(String[] array, int index) {
        return index < array.length ? array[index] : "";
    }
    
    private static void usage() {
        StringBuilder sb = new StringBuilder();
        
        for (FhirVersionEnum version : FhirVersionEnum.values()) {
            if (version.isPresentOnClasspath()) {
                sb.append(sb.length() == 0 ? "" : " | ").append(version.name());
            }
        }
        
        System.out.println("\nUsage:\n");
        System.out.println("  validate fhir-version encoding-type service-root resource-path\n");
        System.out.println("Where:\n");
        System.out.println("  fhir-version  = " + sb.toString());
        System.out.println("  encoding-type = XML | JSON");
        System.out.println("  service-base  = root URL of FHIR service endpoint.");
        System.out.println("  resource-path = path of request resource.\n");
        System.out.println("Note that for secured endpoints a username and password may be specified");
        System.out.println("in the service root using the syntax:\n");
        System.out.println("  http://username:password@domainname.org/...\n");
        System.out.println("HAPI-FHIR version is " + VersionUtil.getVersion() + "\n");
    }
}
