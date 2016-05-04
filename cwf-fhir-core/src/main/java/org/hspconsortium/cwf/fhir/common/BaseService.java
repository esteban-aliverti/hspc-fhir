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

import java.util.List;

import org.hl7.fhir.dstu3.model.Bundle;
import org.hl7.fhir.dstu3.model.Identifier;
import org.hl7.fhir.dstu3.model.Patient;
import org.hl7.fhir.dstu3.model.Reference;
import org.hl7.fhir.instance.model.api.IBaseResource;
import org.hl7.fhir.instance.model.api.IIdType;

import ca.uhn.fhir.model.primitive.UriDt;
import ca.uhn.fhir.rest.api.MethodOutcome;
import ca.uhn.fhir.rest.client.GenericClient;
import ca.uhn.fhir.rest.client.IGenericClient;
import ca.uhn.fhir.rest.gclient.ReferenceClientParam;
import ca.uhn.fhir.rest.gclient.TokenClientParam;

public class BaseService {
    
    
    public static final String SP_IDENTIFIER = "identifier";
    
    public static final String SP_PATIENT = "patient";
    
    public static final TokenClientParam PARAM_IDENTIFIER = new TokenClientParam(SP_IDENTIFIER);
    
    public static final ReferenceClientParam PARAM_PATIENT = new ReferenceClientParam(SP_PATIENT);
    
    private final IGenericClient client;
    
    public BaseService(IGenericClient client) {
        this.client = client;
    }
    
    public IGenericClient getClient() {
        return this.client;
    }
    
    public <T extends IBaseResource> T updateResource(T resource) {
        MethodOutcome outcome = getClient().update().resource(FhirUtil.stripVersion(resource)).execute();
        return processOutcome(outcome, resource);
    }
    
    public <T extends IBaseResource> T createResource(T resource) {
        MethodOutcome outcome = getClient().create().resource(resource).execute();
        return processOutcome(outcome, resource);
    }
    
    public <T extends IBaseResource> T createOrUpdateResource(T resource) {
        return resource.getIdElement().isEmpty() ? createResource(resource) : updateResource(resource);
    }
    
    @SuppressWarnings("unchecked")
    private <T extends IBaseResource> T processOutcome(MethodOutcome outcome, T resource) {
        IIdType id = outcome.getId();
        IBaseResource newResource = outcome.getResource();
        
        if (id != null) {
            resource.setId(id);
        } else if (newResource != null && newResource.getClass() == resource.getClass()) {
            resource = (T) newResource;
        }
        
        return resource;
    }
    
    /**
     * Method creates a resource only if the resource with that identifier does not already exist.
     * At this time, the call appears to create the resource even when it already exists.
     * 
     * @param resource A FHIR resource.
     * @param identifier The resource identifier.
     * @return The outcome of the operation.
     */
    public MethodOutcome createResourceIfNotExist(IBaseResource resource, Identifier identifier) {
        return getClient().create().resource(resource).conditional()
                .where(PARAM_IDENTIFIER.exactly().systemAndIdentifier(identifier.getSystem(), identifier.getValue()))
                .execute();
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
        if (reference == null || reference.isEmpty()) {
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
     * Search for patient-based resources of the given class.
     * 
     * @param patient Patient to be searched.
     * @param clazz Class of the resources to be returned.
     * @return List of matching resources.
     */
    public <T extends IBaseResource> List<T> searchResourcesForPatient(Patient patient, Class<T> clazz) {
        Bundle bundle = getClient().search().forResource(clazz)
                .where(PARAM_PATIENT.hasId(FhirUtil.getResourceIdPath(patient))).returnBundle(Bundle.class).execute();
        
        return FhirUtil.getEntries(bundle, clazz);
    }
    
    /**
     * Returns all resources of the given class that contain the identifier.
     * 
     * @param system The identifier's system.
     * @param value The identifier's value.
     * @param clazz Class of the resources to be searched.
     * @return List of resources containing the identifier.
     */
    public <T extends IBaseResource> List<T> searchResourcesByIdentifier(String system, String value, Class<T> clazz) {
        return searchResourcesByIdentifier(FhirUtil.createIdentifier(system, value), clazz);
    }
    
    /**
     * Returns all resources of the given class that contain the identifier.
     * 
     * @param identifier Resources with this identifier will be returned.
     * @param clazz Class of the resources to be searched.
     * @return List of resources containing the identifier.
     */
    public <T extends IBaseResource> List<T> searchResourcesByIdentifier(Identifier identifier, Class<T> clazz) {
        Bundle bundle = getClient().search().forResource(clazz)
                .where(PARAM_IDENTIFIER.exactly().systemAndIdentifier(identifier.getSystem(), identifier.getValue()))
                .returnBundle(Bundle.class).execute();
        
        return FhirUtil.getEntries(bundle, clazz);
    }
    
    /**
     * Deletes all resources of the given class that contain the identifier.
     * 
     * @param identifier Resources with this identifier will be deleted.
     * @param clazz Class of the resources to be searched.
     * @return Count of deleted resources.
     */
    public <T extends IBaseResource> int deleteResourcesByIdentifier(Identifier identifier, Class<T> clazz) {
        List<T> resources = searchResourcesByIdentifier(identifier, clazz);
        deleteResources(resources);
        return resources.size();
    }
    
    /**
     * Deletes all resources in the provided list.
     * 
     * @param resources Resources to delete.
     */
    public <T extends IBaseResource> void deleteResources(List<T> resources) {
        for (T resource : resources) {
            deleteResource(resource);
        }
    }
    
    /**
     * Deletes a resource.
     * 
     * @param resource Resource to delete.
     */
    public void deleteResource(IBaseResource resource) {
        getClient().delete().resource(resource).execute();
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
        return url.contains(":/") ? url : FhirUtil.concatPath(getServiceRoot(), url);
    }
    
}
