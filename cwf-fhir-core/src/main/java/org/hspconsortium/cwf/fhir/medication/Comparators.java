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
import java.util.Date;

import org.carewebframework.common.DateUtil;

import org.hl7.fhir.dstu3.model.MedicationAdministration;
import org.hl7.fhir.dstu3.model.MedicationOrder;

/**
 * Comparators for sorting lists of medication-related resources.
 */
public class Comparators {
    
    
    public static final Comparator<MedicationAdministration> MED_ADMIN_EFFECTIVE_TIME = new Comparator<MedicationAdministration>() {
        
        
        @Override
        public int compare(MedicationAdministration o1, MedicationAdministration o2) {
            return o1 == o2 ? 0
                    : o1 == null ? -1 : o2 == null ? 1 : DateUtil.compare(getEffectiveTime(o1), getEffectiveTime(o2));
        }
    };
    
    public static final Comparator<MedicationOrder> MED_ORDER_DATE_WRITTEN = new Comparator<MedicationOrder>() {
        
        
        @Override
        public int compare(MedicationOrder o1, MedicationOrder o2) {
            return o1 == o2 ? 0 : o1 == null ? -1 : o2 == null ? 1 : o1.getDateWritten().compareTo(o2.getDateWritten());
        }
    };
    
    private static final Date getEffectiveTime(MedicationAdministration ma) {
        try {
            if (ma.hasEffectiveTimeDateTimeType()) {
                return ma.getEffectiveTimeDateTimeType().getValue();
            }
            
            if (ma.hasEffectiveTimePeriod()) {
                return ma.getEffectiveTimePeriod().getStart();
            }
        } catch (Exception e) {}
        
        return null;
    }
    
    private Comparators() {
    }
}
