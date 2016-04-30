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

import java.util.ArrayList;
import java.util.List;

import org.hl7.fhir.dstu3.model.Bundle;
import org.hl7.fhir.dstu3.model.Bundle.BundleEntryComponent;
import org.hl7.fhir.dstu3.model.Identifier;
import org.hl7.fhir.dstu3.model.Patient;
import org.hspconsortium.cwf.fhir.common.BaseService;
import org.hspconsortium.cwf.fhir.common.FhirUtil;

import ca.uhn.fhir.rest.api.MethodOutcome;
import ca.uhn.fhir.rest.client.IGenericClient;

public class PatientService extends BaseService {
    
    
    public PatientService(IGenericClient client) {
        super(client);
    }
    
    public List<Patient> searchPatientByIdentifier(String system, String code) {
        Identifier identifier = FhirUtil.createIdentifier(system, code);
        return searchPatientByIdentifier(identifier);
    }
    
    public List<Patient> searchPatientByIdentifier(Identifier identifier) {
        List<Patient> patients = new ArrayList<Patient>();
        Bundle patientBundle = getClient().search().forResource(Patient.class)
                .where(Patient.IDENTIFIER.exactly().systemAndIdentifier(identifier.getSystem(), identifier.getValue()))
                .returnBundle(Bundle.class).execute();
        for (BundleEntryComponent entry : patientBundle.getEntry()) {
            if (entry.getResource() != null) {
                Patient patient = (Patient) entry.getResource();
                patients.add(patient);
            }
        }
        return patients;
    }
    
    public void updatePatient(Patient patient) {
        updateResource(patient);
    }
    
    public MethodOutcome createPatient(Patient patient) {
        return createResource(patient);
    }
    
    public MethodOutcome addPatientIfNotExist(Patient patient, Identifier identifier) {
        //return createResourceIfNotExist(patient.getAdaptee(), identifier);//Does not appear to be working
        List<Patient> patientAdapters = searchPatientByIdentifier(identifier);
        MethodOutcome outcome = null;
        if (patientAdapters.size() == 0) {
            outcome = createPatient(patient);
        } else {
            outcome = new MethodOutcome();
            outcome.setCreated(false);
        }
        return outcome;
    }
    
    public void deletePatientByIdentifier(Identifier identifier) {
        Bundle patientBundle = getClient().search().forResource(Patient.class)
                //				.prettyPrint()
                //				.encodedJson()
                .where(Patient.IDENTIFIER.exactly().systemAndIdentifier(identifier.getSystem(), identifier.getValue()))
                .returnBundle(Bundle.class).execute();
        List<BundleEntryComponent> entries = patientBundle.getEntry();
        for (BundleEntryComponent entry : entries) {
            getClient().delete().resource(entry.getResource()).execute();
        }
    }
}
