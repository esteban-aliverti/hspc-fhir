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

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.rest.client.GenericClient;
import ca.uhn.fhir.rest.client.IGenericClient;

import org.apache.http.impl.client.CloseableHttpClient;

/**
 * Subclass RestfulClientFactory to return http client proxy.
 */
public class RestfulClientFactory extends ca.uhn.fhir.rest.client.RestfulClientFactory {
    
    private HttpClientProxy myClient;
    
    private FhirContext myContext;
    
    public RestfulClientFactory(FhirContext theFhirContext) {
        super(theFhirContext);
        myContext = theFhirContext;
    }
    
    @Override
    public void setFhirContext(FhirContext theContext) {
        super.setFhirContext(theContext);
        myContext = theContext;
    }
    
    @Override
    public IGenericClient newGenericClient(String theServerBase) {
        return new GenericClient(myContext, getHttpClient(), theServerBase, this);
    }
    
    @Override
    public synchronized HttpClientProxy getHttpClient() {
        if (myClient == null) {
            myClient = new HttpClientProxy((CloseableHttpClient) super.getHttpClient());
        }
        
        return myClient;
    }
}
