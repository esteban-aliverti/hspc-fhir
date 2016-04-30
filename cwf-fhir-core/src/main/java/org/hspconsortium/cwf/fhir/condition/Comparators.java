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

import java.util.Comparator;

import org.hl7.fhir.dstu3.model.Condition;

/**
 * Comparators for sorting lists of condition-related resources.
 */
public class Comparators {
    
    
    public static final Comparator<Condition> CONDITION_DATE_RECORDED = new Comparator<Condition>() {
        
        
        @Override
        public int compare(Condition o1, Condition o2) {
            return o1 == o2 ? 0 : o1 == null ? -1 : o2 == null ? 1 : o1.getDateRecorded().compareTo(o2.getDateRecorded());
        }
    };
    
    private Comparators() {
    };
}
