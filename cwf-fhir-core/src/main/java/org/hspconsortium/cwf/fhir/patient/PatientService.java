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

public class PatientService extends BaseService {
    
    
    public PatientService() {
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
