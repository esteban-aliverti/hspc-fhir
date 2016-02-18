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

import ca.uhn.fhir.rest.client.GenericClient;
import ca.uhn.fhir.rest.client.IGenericClient;
import ca.uhn.fhir.rest.client.IRestfulClientFactory;

/**
 * Subclasses FhirContext to allow custom RestfulClientFactory and to support various authentication
 * mechanisms.
 */
public class FhirContext extends ca.uhn.fhir.context.FhirContext {
    
    private IRestfulClientFactory myRestfulClientFactory;
    
    private static final Map<String, IAuthInterceptor> authInterceptors = new HashMap<String, IAuthInterceptor>();
    
    /**
     * Registers a custom authentication interceptor.
     * 
     * @param id The unique identifier.
     * @param authInterceptor The authentication interceptor.
     */
    public static void registerAuthInterceptor(String id, IAuthInterceptor authInterceptor) {
        authInterceptors.put(id.toLowerCase(), authInterceptor);
    }
    
    /**
     * Creates a generic client.
     * 
     * @param serverBase The service root url.
     * @param authId The authentication interceptor id (null or empty for none)
     * @param validateConformance If true, validate the server conformance.
     * @return The newly created generic client.
     */
    public IGenericClient newRestfulGenericClient(String serverBase, String authId, boolean validateConformance) {
        IGenericClient client = super.newRestfulGenericClient(serverBase);
        ((GenericClient) client).setDontValidateConformance(!validateConformance);
        IAuthInterceptor authInterceptor = getAuthInterceptor(authId);
        
        if (authInterceptor != null) {
            client.registerInterceptor(authInterceptor);
        }
        
        return client;
    }
    
    /**
     * Overridden to create a custom RESTful client factory.
     */
    @Override
    public IRestfulClientFactory getRestfulClientFactory() {
        if (myRestfulClientFactory == null) {
            myRestfulClientFactory = new RestfulClientFactory(this);
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
    
}