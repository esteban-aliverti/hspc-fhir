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

import org.hspconsortium.cwf.fhir.common.BaseService;
import org.socraticgrid.fhir.generated.IQICorePatient;
import org.socraticgrid.fhir.generated.QICorePatientAdapter;

import ca.uhn.fhir.model.dstu2.composite.IdentifierDt;
import ca.uhn.fhir.model.dstu2.resource.Bundle;
import ca.uhn.fhir.model.dstu2.resource.Bundle.Entry;
import ca.uhn.fhir.model.dstu2.resource.Patient;
import ca.uhn.fhir.rest.api.MethodOutcome;
import ca.uhn.fhir.rest.client.IGenericClient;

public class PatientService extends BaseService {
    
    
    public PatientService(IGenericClient client) {
        super(client);
    }
    
    public List<IQICorePatient> searchPatientByIdentifier(String system, String code) {
        IdentifierDt identifier = new IdentifierDt(system, code);
        return searchPatientByIdentifier(identifier);
    }
    
    public List<IQICorePatient> searchPatientByIdentifier(IdentifierDt identifier) {
        List<IQICorePatient> patients = new ArrayList<IQICorePatient>();
        Bundle patientBundle = getClient().search().forResource(Patient.class)
                .where(Patient.IDENTIFIER.exactly().identifier(identifier)).returnBundle(Bundle.class).execute();
        for (Entry entry : patientBundle.getEntry()) {
            if (entry.getResource() != null) {
                Patient patient = (Patient) entry.getResource();
                QICorePatientAdapter adapter = new QICorePatientAdapter();
                adapter.setAdaptee(patient);
                patients.add(adapter);
            }
        }
        return patients;
    }
    
    public void updatePatient(IQICorePatient patient) {
        updateResource(patient.getAdaptee());
    }
    
    public MethodOutcome createPatient(IQICorePatient patient) {
        return createResource(patient.getAdaptee());
    }
    
    public MethodOutcome addPatientIfNotExist(IQICorePatient patient, IdentifierDt identifier) {
        //return createResourceIfNotExist(patient.getAdaptee(), identifier);//Does not appear to be working
        List<IQICorePatient> patientAdapters = searchPatientByIdentifier(identifier);
        MethodOutcome outcome = null;
        if (patientAdapters.size() == 0) {
            outcome = createPatient(patient);
        } else {
            outcome = new MethodOutcome();
            outcome.setCreated(false);
        }
        return outcome;
    }
    
    public void deletePatientByIdentifier(IdentifierDt identifier) {
        Bundle patientBundle = getClient().search().forResource(Patient.class)
                //				.prettyPrint()
                //				.encodedJson()
                .where(Patient.IDENTIFIER.exactly().identifier(identifier)).returnBundle(Bundle.class).execute();
        List<Entry> entries = patientBundle.getEntry();
        for (Entry entry : entries) {
            getClient().delete().resource(entry.getResource()).execute();
        }
    }
}
