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
package org.hspconsortium.cwf.fhir.medication;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.hspconsortium.cwf.fhir.common.BaseService;
import org.hspconsortium.cwf.fhir.common.FhirUtil;
import org.socraticgrid.fhir.generated.IQICoreMedicationAdministration;
import org.socraticgrid.fhir.generated.IQICoreMedicationOrder;
import org.socraticgrid.fhir.generated.IQICorePatient;
import org.socraticgrid.fhir.generated.QICoreMedicationAdministrationAdapter;
import org.socraticgrid.fhir.generated.QICoreMedicationOrderAdapter;

import ca.uhn.fhir.model.dstu2.composite.IdentifierDt;
import ca.uhn.fhir.model.dstu2.resource.Bundle;
import ca.uhn.fhir.model.dstu2.resource.Bundle.Entry;
import ca.uhn.fhir.model.dstu2.resource.Condition;
import ca.uhn.fhir.model.dstu2.resource.MedicationAdministration;
import ca.uhn.fhir.model.dstu2.resource.MedicationOrder;
import ca.uhn.fhir.rest.api.MethodOutcome;

public class PatientMedicationService extends BaseService {
    
    
    public PatientMedicationService() {
    }
    
    public List<IQICoreMedicationAdministration> searchMedAdminByIdentifier(String system, String code) {
        IdentifierDt identifier = new IdentifierDt(system, code);
        return searchMedAdminByIdentifier(identifier);
    }
    
    public List<IQICoreMedicationAdministration> searchMedAdminByIdentifier(IdentifierDt identifier) {
        List<IQICoreMedicationAdministration> meds = new ArrayList<>();
        Bundle patientBundle = getClient().search().forResource(MedicationAdministration.class)
                .where(MedicationAdministration.IDENTIFIER.exactly().identifier(identifier)).returnBundle(Bundle.class)
                .execute();
        for (Entry entry : patientBundle.getEntry()) {
            MedicationAdministration medication = (MedicationAdministration) entry.getResource();
            if (medication != null) {
                IQICoreMedicationAdministration adapter = new QICoreMedicationAdministrationAdapter();
                adapter.setAdaptee(medication);
                meds.add(adapter);
            }
        }
        return meds;
    }
    
    public List<IQICoreMedicationOrder> searchMedOrderByIdentifier(String system, String code) {
        IdentifierDt identifier = new IdentifierDt(system, code);
        return searchMedOrderByIdentifier(identifier);
    }
    
    public List<IQICoreMedicationOrder> searchMedOrderByIdentifier(IdentifierDt identifier) {
        List<IQICoreMedicationOrder> meds = new ArrayList<>();
        Bundle patientBundle = getClient().search().forResource(MedicationOrder.class)
                .where(MedicationOrder.IDENTIFIER.exactly().identifier(identifier)).returnBundle(Bundle.class).execute();
        for (Entry entry : patientBundle.getEntry()) {
            MedicationOrder medOrder = (MedicationOrder) entry.getResource();
            if (medOrder != null) {
                IQICoreMedicationOrder adapter = new QICoreMedicationOrderAdapter();
                adapter.setAdaptee(medOrder);
                meds.add(adapter);
            }
        }
        return meds;
    }
    
    public void updateMedicationAdministration(IQICoreMedicationAdministration medAdmin) {
        updateResource(medAdmin.getAdaptee());
    }
    
    public void updateMedicationOrder(IQICoreMedicationOrder medOrder) {
        updateResource(medOrder.getAdaptee());
    }
    
    public MethodOutcome createMedicationAdministration(IQICoreMedicationAdministration medAdmin) {
        return createResource(medAdmin.getAdaptee());
    }
    
    public MethodOutcome createMedicationOrder(IQICoreMedicationOrder medOrder) {
        return createResource(medOrder.getAdaptee());
    }
    
    public MethodOutcome addMedicationAdministrationIfNotExist(IQICoreMedicationAdministration medAdmin,
                                                               IdentifierDt identifier) {
        return createResourceIfNotExist(medAdmin.getAdaptee(), identifier);
    }
    
    public MethodOutcome addMedicationOrderIfNotExist(IQICoreMedicationOrder medOrder, IdentifierDt identifier) {
        return createResourceIfNotExist(medOrder.getAdaptee(), identifier);
    }
    
    public List<IQICoreMedicationAdministration> searchMedicationAdministrationsForPatient(IQICorePatient patient) {
        List<IQICoreMedicationAdministration> medAdmins = new ArrayList<>();
        System.out.println(FhirUtil.getResourceIdPath(patient.getAdaptee()));
        Bundle bundle = getClient().search().forResource(MedicationAdministration.class)
                .where(MedicationAdministration.PATIENT.hasId(FhirUtil.getResourceIdPath(patient.getAdaptee())))
                .returnBundle(Bundle.class).execute();
        for (Bundle.Entry entry : bundle.getEntry()) {
            if (entry.getResource() instanceof MedicationAdministration) {
                QICoreMedicationAdministrationAdapter adapter = new QICoreMedicationAdministrationAdapter();
                adapter.setAdaptee((MedicationAdministration) entry.getResource());//Fix this
                medAdmins.add(adapter);
            }
        }
        Collections.sort(medAdmins, Comparators.MED_ADMIN_EFFECTIVE_TIME);
        return medAdmins;
    }
    
    public List<IQICoreMedicationOrder> searchMedicationOrdersForPatient(IQICorePatient patient) {
        List<IQICoreMedicationOrder> medOrders = new ArrayList<>();
        System.out.println(FhirUtil.getResourceIdPath(patient.getAdaptee()));
        Bundle bundle = getClient().search().forResource(MedicationOrder.class)
                .where(MedicationOrder.PATIENT.hasId(FhirUtil.getResourceIdPath(patient.getAdaptee())))
                .returnBundle(Bundle.class).execute();
        for (Bundle.Entry entry : bundle.getEntry()) {
            if (entry.getResource() instanceof MedicationOrder) {
                QICoreMedicationOrderAdapter adapter = new QICoreMedicationOrderAdapter();
                adapter.setAdaptee((MedicationOrder) entry.getResource());//Fix this
                medOrders.add(adapter);
            }
        }
        Collections.sort(medOrders, Comparators.MED_ORDER_DATE_WRITTEN);
        return medOrders;
    }
    
    public void deleteMedicationAdministrationsByIdentifier(IdentifierDt identifier) {
        Bundle medAdminBundle = getClient().search().forResource(MedicationAdministration.class)
                .where(MedicationAdministration.IDENTIFIER.exactly().identifier(identifier)).returnBundle(Bundle.class)
                .execute();
        List<Entry> entries = medAdminBundle.getEntry();
        for (Entry entry : entries) {
            MedicationAdministration medAdmin = (MedicationAdministration) entry.getResource();
            getClient().delete().resource(medAdmin).execute();
        }
    }
    
    public void deleteMedicationOrdersByIdentifier(IdentifierDt identifier) {
        Bundle medOrderBundle = getClient().search().forResource(MedicationOrder.class)
                .where(MedicationOrder.IDENTIFIER.exactly().identifier(identifier)).returnBundle(Bundle.class).execute();
        List<Entry> entries = medOrderBundle.getEntry();
        for (Entry entry : entries) {
            getClient().delete().resource(entry.getResource()).execute();
        }
    }
    
    public void deleteConditionsByIdentifier(IdentifierDt identifier) {
        Bundle conditionBundle = getClient().search().forResource(Condition.class)
                .where(Condition.IDENTIFIER.exactly().identifier(identifier)).returnBundle(Bundle.class).execute();
        List<Entry> entries = conditionBundle.getEntry();
        for (Entry entry : entries) {
            getClient().delete().resource(entry.getResource()).execute();
        }
    }
    
}
