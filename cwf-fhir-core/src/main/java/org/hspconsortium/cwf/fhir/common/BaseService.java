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

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.dstu2.composite.IdentifierDt;
import ca.uhn.fhir.rest.api.MethodOutcome;
import ca.uhn.fhir.rest.client.IGenericClient;
import ca.uhn.fhir.rest.gclient.TokenClientParam;

public class BaseService {
    
    
    public static final String SP_IDENTIFIER = "identifier";
    
    public static final TokenClientParam IDENTIFIER = new TokenClientParam(SP_IDENTIFIER);
    
    private FhirContext ctx;
    
    private IGenericClient client;
    
    public BaseService() {
    }
    
    public IGenericClient getClient() {
        return this.client;
    }
    
    public void setClient(IGenericClient client) {
        this.client = client;
    }
    
    protected FhirContext getFhirContext() {
        return this.ctx;
    }
    
    public void setFhirContext(FhirContext ctx) {
        this.ctx = ctx;
    }
    
    public void updateResource(IResource resource) {
        getClient().update().resource(resource)
                // .prettyPrint()
                // .encodedJson()
                .execute();
    }
    
    public MethodOutcome createResource(IResource resource) {
        return getClient().create().resource(resource).execute();
    }
    
    /**
     * Method creates a resource only if the resource with that identifier does not already exist.
     * At this time, the call appears to create the resource even when it already exists.
     * 
     * @param resource
     * @param identifier
     * @return
     */
    public MethodOutcome createResourceIfNotExist(IResource resource, IdentifierDt identifier) {
        return getClient().create().resource(resource)
                // .prettyPrint()
                // .encodedJson()
                .conditional().where(IDENTIFIER.exactly().identifier(identifier)).execute();
    }
}
