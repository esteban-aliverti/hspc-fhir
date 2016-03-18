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

import java.util.Comparator;

import org.socraticgrid.fhir.generated.IQICoreMedicationAdministration;
import org.socraticgrid.fhir.generated.IQICoreMedicationOrder;

/**
 * Comparators for sorting lists of medication-related resources.
 */
public class Comparators {
    
    
    public static final Comparator<IQICoreMedicationAdministration> MED_ADMIN_EFFECTIVE_TIME = new Comparator<IQICoreMedicationAdministration>() {
        
        
        @Override
        public int compare(IQICoreMedicationAdministration o1, IQICoreMedicationAdministration o2) {
            return o1 == o2 ? 0
                    : o1 == null ? -1
                            : o2 == null ? 1 : o1.getEffectiveTimeDateTime().compareTo(o2.getEffectiveTimeDateTime());
        }
    };
    
    public static final Comparator<IQICoreMedicationOrder> MED_ORDER_DATE_WRITTEN = new Comparator<IQICoreMedicationOrder>() {
        
        
        @Override
        public int compare(IQICoreMedicationOrder o1, IQICoreMedicationOrder o2) {
            return o1 == o2 ? 0 : o1 == null ? -1 : o2 == null ? 1 : o1.getDateWritten().compareTo(o2.getDateWritten());
        }
    };
    
    private Comparators() {
    };
}
