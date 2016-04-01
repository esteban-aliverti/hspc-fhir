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

import ca.uhn.fhir.rest.client.apache.ApacheRestfulClientFactory;

/**
 * Subclass RestfulClientFactory to return http client proxy.
 */
public class RestfulClientFactory extends ApacheRestfulClientFactory {
    
    
    private HttpClientProxy myClient;
    
    public RestfulClientFactory(FhirContext fhirContext) {
        super(fhirContext);
    }
    
    @Override
    public synchronized HttpClientProxy getNativeHttpClient() {
        if (myClient == null) {
            myClient = new HttpClientProxy(super.getNativeHttpClient());
        }
        
        return myClient;
    }
    
}
