/*
 * #%L
 * cwf-fhir-client
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
package org.hspconsortium.cwf.fhir.client;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.http.client.HttpClient;

import ca.uhn.fhir.context.FhirVersionEnum;
import ca.uhn.fhir.rest.client.GenericClient;
import ca.uhn.fhir.rest.client.IGenericClient;
import ca.uhn.fhir.rest.server.EncodingEnum;

/**
 * Subclasses FhirContext to allow custom RestfulClientFactory and to support various authentication
 * mechanisms.
 */
public class FhirContext extends ca.uhn.fhir.context.FhirContext {
    
    
    private final String proxy;
    
    private RestfulClientFactory myRestfulClientFactory;
    
    private static final Map<String, IAuthInterceptor> authInterceptors = new HashMap<>();
    
    /**
     * Registers a custom authentication interceptor.
     * 
     * @param id The unique identifier.
     * @param authInterceptor The authentication interceptor.
     */
    public static void registerAuthInterceptor(String id, IAuthInterceptor authInterceptor) {
        authInterceptors.put(id.toLowerCase(), authInterceptor);
    }
    
    public FhirContext() {
        this(null, null);
    }
    
    public FhirContext(FhirVersionEnum fhirVersion) {
        this(fhirVersion, null);
    }
    
    public FhirContext(FhirVersionEnum fhirVersion, String proxy) {
        super(fhirVersion);
        this.proxy = StringUtils.trimToNull(proxy);
    }
    
    /**
     * Creates a generic client.
     * 
     * @param serverBase The service root url.
     * @param authId The authentication interceptor id (null or empty for none)
     * @param validateConformance If true, validate the server conformance.
     * @param encoding The encoding type for client requests.
     * @param prettyPrint The pretty print setting.
     * @return The newly created generic client.
     */
    public IGenericClient newRestfulGenericClient(String serverBase, String authId, boolean validateConformance,
                                                  EncodingEnum encoding, boolean prettyPrint) {
        IGenericClient client = super.newRestfulGenericClient(serverBase);
        ((GenericClient) client).setDontValidateConformance(!validateConformance);
        IAuthInterceptor authInterceptor = getAuthInterceptor(authId);
        
        if (authInterceptor != null) {
            client.registerInterceptor(authInterceptor);
        }
        
        client.setPrettyPrint(prettyPrint);
        client.setEncoding(encoding);
        return client;
    }
    
    /**
     * Overridden to create a custom RESTful client factory.
     */
    @Override
    public RestfulClientFactory getRestfulClientFactory() {
        if (myRestfulClientFactory == null) {
            myRestfulClientFactory = new RestfulClientFactory(this);
            
            if (proxy != null) {
                String[] pcs = proxy.split("\\:", 2);
                myRestfulClientFactory.setProxy(pcs[0], Integer.parseInt(pcs[1]));
            }
        }
        
        return myRestfulClientFactory;
    }
    
    /**
     * Returns the authentication interceptor with the specified id, throwing an exception if not
     * found.
     * 
     * @param id The unique id.
     * @return The corresponding authentication interceptor, or null if authType was not specified.
     */
    private IAuthInterceptor getAuthInterceptor(String id) {
        if (id == null || id.isEmpty()) {
            return null;
        }
        
        IAuthInterceptor authInterceptor = authInterceptors.get(id.toLowerCase());
        
        if (authInterceptor == null) {
            throw new RuntimeException("No authentication interceptor with the identifier " + id);
        }
        
        return authInterceptor;
    }
    
    /**
     * Supports registering special http clients to handle requests based on URL patterns.
     * 
     * @param pattern Url pattern
     * @param client
     */
    public void registerHttpClient(String pattern, HttpClient client) {
        getRestfulClientFactory().getNativeHttpClient().registerHttpClient(pattern, client);
    }
    
}
