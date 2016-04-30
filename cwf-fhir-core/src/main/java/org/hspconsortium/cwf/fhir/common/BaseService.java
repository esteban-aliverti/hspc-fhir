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

import org.hl7.fhir.dstu3.model.Identifier;
import org.hl7.fhir.dstu3.model.Reference;
import org.hl7.fhir.instance.model.api.IAnyResource;
import org.hl7.fhir.instance.model.api.IBaseResource;

import ca.uhn.fhir.model.primitive.UriDt;
import ca.uhn.fhir.rest.api.MethodOutcome;
import ca.uhn.fhir.rest.client.GenericClient;
import ca.uhn.fhir.rest.client.IGenericClient;
import ca.uhn.fhir.rest.gclient.TokenClientParam;

public class BaseService {
    
    
    public static final String SP_IDENTIFIER = "identifier";
    
    public static final TokenClientParam IDENTIFIER = new TokenClientParam(SP_IDENTIFIER);
    
    private final IGenericClient client;
    
    public BaseService(IGenericClient client) {
        this.client = client;
    }
    
    public IGenericClient getClient() {
        return this.client;
    }
    
    public void updateResource(IBaseResource resource) {
        getClient().update().resource(resource).execute();
    }
    
    public MethodOutcome createResource(IBaseResource resource) {
        return getClient().create().resource(resource).execute();
    }
    
    /**
     * Method creates a resource only if the resource with that identifier does not already exist.
     * At this time, the call appears to create the resource even when it already exists.
     * 
     * @param resource A FHIR resource.
     * @param identifier The resource identifier.
     * @return The outcome of the operation.
     */
    public MethodOutcome createResourceIfNotExist(IAnyResource resource, Identifier identifier) {
        return getClient().create().resource(resource).conditional()
                .where(IDENTIFIER.exactly().systemAndIdentifier(identifier.getSystem(), identifier.getValue())).execute();
    }
    
    /**
     * Returns a resource of the specified type given a resource reference. If the resource has not
     * been previously fetched, it will be fetched from the server. If the referenced resource is
     * not of the specified type, null is returned.
     * 
     * @param reference A resource reference.
     * @param clazz The desired resource class.
     * @return The corresponding resource.
     */
    @SuppressWarnings("unchecked")
    public <T extends IBaseResource> T getResource(Reference reference, Class<T> clazz) {
        IBaseResource resource = getResource(reference);
        return clazz.isInstance(resource) ? (T) resource : null;
    }
    
    /**
     * Returns a resource given a resource reference. If the resource has not been previously
     * fetched, it will be fetched from the server.
     * 
     * @param reference A resource reference.
     * @return The corresponding resource.
     */
    public IBaseResource getResource(Reference reference) {
        if (reference.isEmpty()) {
            return null;
        }
        
        if (reference.getResource() != null) {
            return reference.getResource();
        }
        
        String resourceId = reference.getReference();
        
        if (resourceId == null) {
            throw new IllegalStateException("Reference has no resource ID defined");
        }
        
        String resourceUrl = expandURL(resourceId);
        IBaseResource resource = getClient().read(new UriDt(resourceUrl));
        reference.setResource(resource);
        return resource;
    }
    
    /**
     * Returns the default FHIR service root url.
     * 
     * @return Default FHIR service root url.
     */
    public String getServiceRoot() {
        return ((GenericClient) getClient()).getUrlBase();
    }
    
    /**
     * For urls without a service root, prepends the default service root.
     * 
     * @param url URL to expand.
     * @return URL with a service root prepended.
     */
    public String expandURL(String url) {
        return url.matches("^.+:/") ? url : FhirUtil.concatPath(getServiceRoot(), url);
    }
    
}
