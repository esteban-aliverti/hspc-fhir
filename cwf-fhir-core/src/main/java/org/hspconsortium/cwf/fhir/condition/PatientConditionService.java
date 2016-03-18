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

import org.hspconsortium.cwf.fhir.common.BaseService;
import org.hspconsortium.cwf.fhir.common.FhirUtil;
import org.socraticgrid.fhir.generated.IQICoreCondition;
import org.socraticgrid.fhir.generated.IQICorePatient;
import org.socraticgrid.fhir.generated.QICoreConditionAdapter;

import ca.uhn.fhir.model.dstu2.composite.IdentifierDt;
import ca.uhn.fhir.model.dstu2.resource.Bundle;
import ca.uhn.fhir.model.dstu2.resource.Bundle.Entry;
import ca.uhn.fhir.model.dstu2.resource.Condition;
import ca.uhn.fhir.model.dstu2.resource.MedicationAdministration;
import ca.uhn.fhir.rest.api.MethodOutcome;

public class PatientConditionService extends BaseService {
    
    
    public PatientConditionService() {
    }
    
    public List<IQICoreCondition> searchConditionsByIdentifier(String system, String code) {
        IdentifierDt identifier = new IdentifierDt(system, code);
        return searchConditionsByIdentifier(identifier);
    }
    
    public List<IQICoreCondition> searchConditionsByIdentifier(IdentifierDt identifier) {
        List<IQICoreCondition> conditions = new ArrayList<IQICoreCondition>();
        Bundle patientBundle = getClient().search().forResource(Condition.class)
                .where(Condition.IDENTIFIER.exactly().identifier(identifier)).returnBundle(Bundle.class).execute();
        for (Entry entry : patientBundle.getEntry()) {
            Condition condition = (Condition) entry.getResource();
            if (condition != null) {
                IQICoreCondition adapter = new QICoreConditionAdapter();
                adapter.setAdaptee(condition);
                conditions.add(adapter);
            }
        }
        return conditions;
    }
    
    public void updateCondition(IQICoreCondition condition) {
        updateResource(condition.getAdaptee());
    }
    
    public MethodOutcome createCondition(IQICoreCondition condition) {
        return createResource(condition.getAdaptee());
    }
    
    public MethodOutcome addConditionIfNotExist(IQICoreCondition condition, IdentifierDt identifier) {
        return createResourceIfNotExist(condition.getAdaptee(), identifier);
    }
    
    public List<IQICoreCondition> searchConditionForPatient(IQICorePatient patient) {
        List<IQICoreCondition> conditions = new ArrayList<IQICoreCondition>();
        System.out.println(FhirUtil.getResourceIdPath(patient.getAdaptee()));
        Bundle bundle = getClient().search().forResource(Condition.class)
                .where(Condition.PATIENT.hasId(FhirUtil.getResourceIdPath(patient.getAdaptee()))).returnBundle(Bundle.class)
                .execute();
        for (Bundle.Entry entry : bundle.getEntry()) {
            if (entry.getResource() instanceof Condition) {
                IQICoreCondition adapter = new QICoreConditionAdapter();
                adapter.setAdaptee((Condition) entry.getResource());//Fix this
                conditions.add(adapter);
            }
        }
        Collections.sort(conditions, Comparators.CONDITION_DATE_RECORDED);
        return conditions;
    }
    
    public void deleteConditionByIdentifier(IdentifierDt identifier) {
        Bundle conditionBundle = getClient().search().forResource(Condition.class)
                .where(MedicationAdministration.IDENTIFIER.exactly().identifier(identifier)).returnBundle(Bundle.class)
                .execute();
        List<Entry> entries = conditionBundle.getEntry();
        for (Entry entry : entries) {
            getClient().delete().resource(entry.getResource()).execute();
        }
    }
    
}
