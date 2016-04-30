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

import org.hl7.fhir.dstu3.model.Bundle;
import org.hl7.fhir.dstu3.model.Bundle.BundleEntryComponent;
import org.hl7.fhir.dstu3.model.Condition;
import org.hl7.fhir.dstu3.model.Identifier;
import org.hl7.fhir.dstu3.model.MedicationAdministration;
import org.hl7.fhir.dstu3.model.MedicationOrder;
import org.hl7.fhir.dstu3.model.Patient;
import org.hspconsortium.cwf.fhir.common.BaseService;
import org.hspconsortium.cwf.fhir.common.FhirUtil;

import ca.uhn.fhir.rest.api.MethodOutcome;
import ca.uhn.fhir.rest.client.IGenericClient;

public class MedicationService extends BaseService {
    
    
    public MedicationService(IGenericClient client) {
        super(client);
    }
    
    public List<MedicationAdministration> searchMedAdminByIdentifier(String system, String code) {
        Identifier identifier = FhirUtil.createIdentifier(system, code);
        return searchMedAdminByIdentifier(identifier);
    }
    
    public List<MedicationAdministration> searchMedAdminByIdentifier(Identifier identifier) {
        List<MedicationAdministration> meds = new ArrayList<>();
        
        Bundle patientBundle = getClient().search()
                .forResource(MedicationAdministration.class).where(MedicationAdministration.IDENTIFIER.exactly()
                        .systemAndIdentifier(identifier.getSystem(), identifier.getValue()))
                .returnBundle(Bundle.class).execute();
        for (BundleEntryComponent entry : patientBundle.getEntry()) {
            MedicationAdministration medication = (MedicationAdministration) entry.getResource();
            if (medication != null) {
                meds.add(medication);
            }
        }
        return meds;
    }
    
    public List<MedicationOrder> searchMedOrderByIdentifier(String system, String code) {
        Identifier identifier = FhirUtil.createIdentifier(system, code);
        return searchMedOrderByIdentifier(identifier);
    }
    
    public List<MedicationOrder> searchMedOrderByIdentifier(Identifier identifier) {
        List<MedicationOrder> meds = new ArrayList<>();
        Bundle patientBundle = getClient().search().forResource(MedicationOrder.class)
                .where(
                    MedicationOrder.IDENTIFIER.exactly().systemAndIdentifier(identifier.getSystem(), identifier.getValue()))
                .returnBundle(Bundle.class).execute();
        for (BundleEntryComponent entry : patientBundle.getEntry()) {
            MedicationOrder medOrder = (MedicationOrder) entry.getResource();
            if (medOrder != null) {
                meds.add(medOrder);
            }
        }
        return meds;
    }
    
    public void updateMedicationAdministration(MedicationAdministration medAdmin) {
        updateResource(medAdmin);
    }
    
    public void updateMedicationOrder(MedicationOrder medOrder) {
        updateResource(medOrder);
    }
    
    public MethodOutcome createMedicationAdministration(MedicationAdministration medAdmin) {
        return createResource(medAdmin);
    }
    
    public MethodOutcome createMedicationOrder(MedicationOrder medOrder) {
        return createResource(medOrder);
    }
    
    public MethodOutcome addMedicationAdministrationIfNotExist(MedicationAdministration medAdmin, Identifier identifier) {
        return createResourceIfNotExist(medAdmin, identifier);
    }
    
    public MethodOutcome addMedicationOrderIfNotExist(MedicationOrder medOrder, Identifier identifier) {
        return createResourceIfNotExist(medOrder, identifier);
    }
    
    public List<MedicationAdministration> searchMedicationAdministrationsForPatient(Patient patient) {
        List<MedicationAdministration> medAdmins = new ArrayList<>();
        Bundle bundle = getClient().search().forResource(MedicationAdministration.class)
                .where(MedicationAdministration.PATIENT.hasId(FhirUtil.getResourceIdPath(patient)))
                .returnBundle(Bundle.class).execute();
        for (BundleEntryComponent entry : bundle.getEntry()) {
            if (entry.getResource() instanceof MedicationAdministration) {
                medAdmins.add((MedicationAdministration) entry.getResource());//Fix this
            }
        }
        Collections.sort(medAdmins, Comparators.MED_ADMIN_EFFECTIVE_TIME);
        return medAdmins;
    }
    
    public List<MedicationOrder> searchMedicationOrdersForPatient(Patient patient) {
        List<MedicationOrder> medOrders = new ArrayList<>();
        System.out.println(FhirUtil.getResourceIdPath(patient));
        Bundle bundle = getClient().search().forResource(MedicationOrder.class)
                .where(MedicationOrder.PATIENT.hasId(FhirUtil.getResourceIdPath(patient))).returnBundle(Bundle.class)
                .execute();
        for (BundleEntryComponent entry : bundle.getEntry()) {
            if (entry.getResource() instanceof MedicationOrder) {
                medOrders.add((MedicationOrder) entry.getResource());//Fix this
            }
        }
        Collections.sort(medOrders, Comparators.MED_ORDER_DATE_WRITTEN);
        return medOrders;
    }
    
    public void deleteMedicationAdministrationsByIdentifier(Identifier identifier) {
        Bundle medAdminBundle = getClient().search()
                .forResource(MedicationAdministration.class).where(MedicationAdministration.IDENTIFIER.exactly()
                        .systemAndIdentifier(identifier.getSystem(), identifier.getValue()))
                .returnBundle(Bundle.class).execute();
        List<BundleEntryComponent> entries = medAdminBundle.getEntry();
        for (BundleEntryComponent entry : entries) {
            MedicationAdministration medAdmin = (MedicationAdministration) entry.getResource();
            getClient().delete().resource(medAdmin).execute();
        }
    }
    
    public void deleteMedicationOrdersByIdentifier(Identifier identifier) {
        Bundle medOrderBundle = getClient().search().forResource(MedicationOrder.class)
                .where(
                    MedicationOrder.IDENTIFIER.exactly().systemAndIdentifier(identifier.getSystem(), identifier.getValue()))
                .returnBundle(Bundle.class).execute();
        List<BundleEntryComponent> entries = medOrderBundle.getEntry();
        for (BundleEntryComponent entry : entries) {
            getClient().delete().resource(entry.getResource()).execute();
        }
    }
    
    public void deleteConditionsByIdentifier(Identifier identifier) {
        Bundle conditionBundle = getClient().search().forResource(Condition.class)
                .where(Condition.IDENTIFIER.exactly().systemAndIdentifier(identifier.getSystem(), identifier.getValue()))
                .returnBundle(Bundle.class).execute();
        List<BundleEntryComponent> entries = conditionBundle.getEntry();
        for (BundleEntryComponent entry : entries) {
            getClient().delete().resource(entry.getResource()).execute();
        }
    }
    
}
