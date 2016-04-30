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
package org.hspconsortium.cwf.fhir.condition;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.hl7.fhir.dstu3.model.Bundle;
import org.hl7.fhir.dstu3.model.Bundle.BundleEntryComponent;
import org.hl7.fhir.dstu3.model.Condition;
import org.hl7.fhir.dstu3.model.Identifier;
import org.hl7.fhir.dstu3.model.MedicationAdministration;
import org.hl7.fhir.dstu3.model.Patient;
import org.hspconsortium.cwf.fhir.common.BaseService;
import org.hspconsortium.cwf.fhir.common.FhirUtil;

import ca.uhn.fhir.rest.api.MethodOutcome;
import ca.uhn.fhir.rest.client.IGenericClient;

public class ConditionService extends BaseService {
    
    
    public ConditionService(IGenericClient client) {
        super(client);
    }
    
    public List<Condition> searchConditionsByIdentifier(String system, String code) {
        Identifier identifier = FhirUtil.createIdentifier(system, code);
        return searchConditionsByIdentifier(identifier);
    }
    
    public List<Condition> searchConditionsByIdentifier(Identifier identifier) {
        List<Condition> conditions = new ArrayList<Condition>();
        Bundle patientBundle = getClient().search().forResource(Condition.class)
                .where(Condition.IDENTIFIER.exactly().systemAndIdentifier(identifier.getSystem(), identifier.getValue()))
                .returnBundle(Bundle.class).execute();
        for (BundleEntryComponent entry : patientBundle.getEntry()) {
            Condition condition = (Condition) entry.getResource();
            if (condition != null) {
                conditions.add(condition);
            }
        }
        return conditions;
    }
    
    public void updateCondition(Condition condition) {
        updateResource(condition);
    }
    
    public MethodOutcome createCondition(Condition condition) {
        return createResource(condition);
    }
    
    public MethodOutcome addConditionIfNotExist(Condition condition, Identifier identifier) {
        return createResourceIfNotExist(condition, identifier);
    }
    
    public List<Condition> searchConditionForPatient(Patient patient) {
        List<Condition> conditions = new ArrayList<Condition>();
        System.out.println(FhirUtil.getResourceIdPath(patient));
        Bundle bundle = getClient().search().forResource(Condition.class)
                .where(Condition.PATIENT.hasId(FhirUtil.getResourceIdPath(patient))).returnBundle(Bundle.class).execute();
        for (BundleEntryComponent entry : bundle.getEntry()) {
            if (entry.getResource() instanceof Condition) {
                conditions.add((Condition) entry.getResource());//Fix this
            }
        }
        Collections.sort(conditions, Comparators.CONDITION_DATE_RECORDED);
        return conditions;
    }
    
    public void deleteConditionByIdentifier(Identifier identifier) {
        Bundle conditionBundle = getClient().search()
                .forResource(Condition.class).where(MedicationAdministration.IDENTIFIER.exactly()
                        .systemAndIdentifier(identifier.getSystem(), identifier.getValue()))
                .returnBundle(Bundle.class).execute();
        List<BundleEntryComponent> entries = conditionBundle.getEntry();
        for (BundleEntryComponent entry : entries) {
            getClient().delete().resource(entry.getResource()).execute();
        }
    }
    
}
