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

import org.hl7.fhir.instance.model.api.IBaseResource;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.dstu2.composite.IdentifierDt;
import ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.primitive.UriDt;
import ca.uhn.fhir.rest.api.MethodOutcome;
import ca.uhn.fhir.rest.client.GenericClient;
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
    public <T extends IBaseResource> T getResource(ResourceReferenceDt reference, Class<T> clazz) {
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
    public IBaseResource getResource(ResourceReferenceDt reference) {
        if (reference.isEmpty()) {
            return null;
        }
        
        if (reference.getResource() != null) {
            return reference.getResource();
        }
        
        IdDt resourceId = reference.getReference();
        
        if (resourceId == null) {
            throw new IllegalStateException("Reference has no resource ID defined");
        }
        
        String resourceUrl = expandURL(resourceId.getValue());
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
