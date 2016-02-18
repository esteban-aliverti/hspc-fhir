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

import java.util.List;

import ca.uhn.fhir.model.dstu2.composite.HumanNameDt;
import ca.uhn.fhir.model.primitive.StringDt;

/**
 * Default human name parser.
 */
public class HumanNameParser implements IHumanNameParser {
    
    @Override
    public String toString(HumanNameDt name) {
        StringBuilder sb = new StringBuilder();
        append(sb, name.getPrefix());
        append(sb, name.getFamily());
        sb.append(",");
        append(sb, name.getGiven());
        append(sb, name.getSuffix());
        return sb.toString();
    }
    
    @Override
    public HumanNameDt fromString(HumanNameDt name, String value) {
        String[] pcs = value.split("\\,", 2);
        String[] pcs1 = pcs[0].split("\\ ");
        String[] pcs2 = pcs.length == 1 ? null : pcs[1].split("\\ ");
        
        if (name == null) {
            name = new HumanNameDt();
        }
        
        for (String pc : pcs1) {
            pc = pc.trim();
            
            if (!pc.isEmpty()) {
                name.addFamily(pc);
            }
        }
        
        if (pcs2 != null) {
            for (String pc : pcs2) {
                pc = pc.trim();
                
                if (!pc.isEmpty()) {
                    name.addGiven(pc);
                }
            }
        }
        
        return name;
    }
    
    private void append(StringBuilder sb, List<StringDt> components) {
        for (StringDt component : components) {
            if (sb.length() > 0) {
                sb.append(" ");
            }
            
            sb.append(component);
        }
    }
    
}
