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
package org.hspconsortium.cwf.fhir.common;

import org.hl7.fhir.dstu3.model.HumanName;

public interface IHumanNameParser {
    
    
    /**
     * Converts human name to displayable text.
     * 
     * @param name Human name.
     * @return Displayable text.
     */
    String toString(HumanName name);
    
    /**
     * Converts text to a human name equivalent.
     * 
     * @param name Human name (may be null).
     * @param value Value to convert.
     * @return The human name parsed from the input value.
     */
    HumanName fromString(HumanName name, String value);
    
}
