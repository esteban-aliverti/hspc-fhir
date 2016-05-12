/*
 * #%L
 * cwf-fhir-core
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
package org.hspconsortium.cwf.fhir.common;

import org.springframework.beans.factory.annotation.Value;

import org.hspconsortium.cwf.fhir.client.IFhirClientConfigurator;
import org.hspconsortium.cwf.fhir.client.IFhirContextConfigurator;

import ca.uhn.fhir.context.FhirVersionEnum;
import ca.uhn.fhir.rest.server.EncodingEnum;

/**
 * Configurator for all FHIR-related settings.
 */
public class FhirConfigurator implements IFhirContextConfigurator, IFhirClientConfigurator {
    
    
    @Value("${fhir.version:DSTU3}")
    private FhirVersionEnum version;
    
    @Value("${fhir.service.proxy:}")
    private String proxy;
    
    @Value("${fhir.service.root.url}")
    private String rootUrl;
    
    @Value("${fhir.service.authentication.type:}")
    private String authenticationType;
    
    @Value("${fhir.service.validate.conformance:true}")
    private boolean validateConformance;
    
    @Value("${fhir.client.encoding:}")
    private EncodingEnum encoding;
    
    @Value("${fhir.client.prettyprint:false}")
    private boolean prettyPrint;
    
    /* (non-Javadoc)
     * @see org.hspconsortium.cwf.fhir.common.IFhirConfigurator#getVersion()
     */
    @Override
    public FhirVersionEnum getVersion() {
        return version;
    }
    
    /* (non-Javadoc)
     * @see org.hspconsortium.cwf.fhir.common.IFhirConfigurator#getProxy()
     */
    @Override
    public String getProxy() {
        return proxy;
    }
    
    /* (non-Javadoc)
     * @see org.hspconsortium.cwf.fhir.common.IFhirConfigurator#getRootUrl()
     */
    @Override
    public String getRootUrl() {
        return rootUrl;
    }
    
    /* (non-Javadoc)
     * @see org.hspconsortium.cwf.fhir.common.IFhirConfigurator#getAuthenticationType()
     */
    @Override
    public String getAuthenticationType() {
        return authenticationType;
    }
    
    /* (non-Javadoc)
     * @see org.hspconsortium.cwf.fhir.common.IFhirConfigurator#isValidateConformance()
     */
    @Override
    public boolean isValidateConformance() {
        return validateConformance;
    }
    
    /* (non-Javadoc)
     * @see org.hspconsortium.cwf.fhir.common.IFhirConfigurator#getEncoding()
     */
    @Override
    public EncodingEnum getEncoding() {
        return encoding;
    }
    
    /* (non-Javadoc)
     * @see org.hspconsortium.cwf.fhir.common.IFhirConfigurator#isPrettyPrint()
     */
    @Override
    public boolean isPrettyPrint() {
        return prettyPrint;
    }
    
}
