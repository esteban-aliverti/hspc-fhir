/*
 * #%L
 * FHIR Core Library
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
package org.hspconsortium.cwf.fhir.patient;

import org.hl7.fhir.dstu3.model.Identifier;
import org.hl7.fhir.dstu3.model.Patient;
import org.hspconsortium.cwf.fhir.common.BaseService;

import ca.uhn.fhir.rest.api.MethodOutcome;
import ca.uhn.fhir.rest.client.IGenericClient;

public class PatientService extends BaseService {
    
    
    public PatientService(IGenericClient client) {
        super(client);
    }
    
    public void updatePatient(Patient patient) {
        updateResource(patient);
    }
    
    public MethodOutcome createPatient(Patient patient) {
        return createResource(patient);
    }
    
    public MethodOutcome addPatientIfNotExist(Patient patient, Identifier identifier) {
        return createResourceIfNotExist(patient, identifier);
    }
    
}
