/*-
 * #%L
 * FHIR Core Library
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
package org.hspconsortium.cwf.fhir.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.carewebframework.common.DateUtil;
import org.hl7.fhir.dstu3.model.Address;
import org.hl7.fhir.dstu3.model.CodeableConcept;
import org.hl7.fhir.dstu3.model.Coding;
import org.hl7.fhir.dstu3.model.Encounter;
import org.hl7.fhir.dstu3.model.HumanName;
import org.hl7.fhir.dstu3.model.HumanName.NameUse;
import org.hl7.fhir.dstu3.model.Identifier;
import org.hl7.fhir.dstu3.model.Patient;
import org.hl7.fhir.dstu3.model.Period;
import org.hl7.fhir.dstu3.model.Practitioner;
import org.hl7.fhir.dstu3.model.Timing.UnitsOfTime;
import org.hspconsortium.cwf.fhir.common.FhirUtil;
import org.junit.Test;

public class CommonTest {
    
    @Test
    public void testCreateCodeableConcept() {
        CodeableConcept cc = FhirUtil.createCodeableConcept("system", "code", "display");
        Coding coding = FhirUtil.getFirst(cc.getCoding());
        assertEquals("system", coding.getSystem());
        assertEquals("code", coding.getCode());
        assertEquals("display", coding.getDisplay());
    }
    
    @Test
    public void testCreatePeriod() {
        Date startDate = DateUtil.toDate(5, 6, 2007);
        Date endDate = DateUtil.toDate(8, 9, 2010);
        Period p = FhirUtil.createPeriod(startDate, endDate);
        assertEquals(startDate, p.getStart());
        assertEquals(endDate, p.getEnd());
    }
    
    @Test
    public void testCreateIdentifier() {
        Identifier id = FhirUtil.createIdentifier("system", "value");
        assertEquals("system", id.getSystem());
        assertEquals("value", id.getValue());
    }
    
    @Test
    public void testConvertTimeUnitToEnum() {
        assertEquals(UnitsOfTime.A, FhirUtil.convertTimeUnitToEnum("a"));
        assertEquals(UnitsOfTime.S, FhirUtil.convertTimeUnitToEnum("s"));
        assertEquals(UnitsOfTime.MIN, FhirUtil.convertTimeUnitToEnum("min"));
        assertEquals(UnitsOfTime.H, FhirUtil.convertTimeUnitToEnum("h"));
        assertEquals(UnitsOfTime.D, FhirUtil.convertTimeUnitToEnum("d"));
        assertEquals(UnitsOfTime.WK, FhirUtil.convertTimeUnitToEnum("wk"));
        assertEquals(UnitsOfTime.MO, FhirUtil.convertTimeUnitToEnum("mo"));
        
        try {
            assertEquals(UnitsOfTime.NULL, FhirUtil.convertTimeUnitToEnum("bad"));
            fail("Should throw illegal argument exception.");
        } catch (IllegalArgumentException e) {}
    }
    
    @Test
    public void testFirstLast() {
        List<String> list = null;
        assertNull(FhirUtil.getFirst(list));
        assertNull(FhirUtil.getLast(list));
        list = new ArrayList<>();
        assertNull(FhirUtil.getFirst(list));
        assertNull(FhirUtil.getLast(list));
        list.add("first");
        list.add("second");
        list.add("last");
        assertEquals("first", FhirUtil.getFirst(list));
        assertEquals("last", FhirUtil.getLast(list));
    }
    
    @Test
    public void testAddressUtils() {
        Address a = new Address();
        a.setCity("city");
        a.setCountry("country");
        a.setDistrict("district");
        a.addLine("line1");
        a.addLine("line2");
        a.setState("state");
        a.setPostalCode("postalcode");
        Patient patient = new Patient();
        patient.addAddress(a);
        Practitioner practitioner = new Practitioner();
        practitioner.addAddress(a);
        Encounter encounter = new Encounter();
        assertSame(a, FhirUtil.getFirst(FhirUtil.getAddresses(patient)));
        assertSame(a, FhirUtil.getFirst(FhirUtil.getAddresses(practitioner)));
        assertNull(FhirUtil.getFirst(FhirUtil.getAddresses(encounter)));
    }
    
    @Test
    public void testNameUtils() {
        HumanName n = FhirUtil.parseName("last, first middle");
        assertEquals("last", n.getFamilyAsSingleString());
        assertEquals("first middle", n.getGivenAsSingleString());
        assertEquals("first", n.getGiven().get(0).getValue());
        assertEquals("middle", n.getGiven().get(1).getValue());
        assertEquals("last, first middle", FhirUtil.formatName(n));
        n.setUse(NameUse.USUAL);
        HumanName n2 = FhirUtil.parseName(",nickname");
        n2.setUse(NameUse.NICKNAME);
        List<HumanName> list = new ArrayList<>();
        list.add(n);
        list.add(n2);
        assertSame(n, FhirUtil.getName(list, NameUse.USUAL));
        assertSame(n, FhirUtil.getName(list, NameUse.USUAL, NameUse.NICKNAME));
        assertSame(n2, FhirUtil.getName(list, NameUse.NICKNAME));
        assertSame(n2, FhirUtil.getName(list, NameUse.NICKNAME, NameUse.USUAL));
        assertNull(FhirUtil.getName(list, NameUse.OLD));
        Patient patient = new Patient();
        patient.setName(list);
        Practitioner practitioner = new Practitioner();
        practitioner.setName(list);
        Encounter encounter = new Encounter();
        assertSame(list, FhirUtil.getNames(patient));
        assertSame(list, FhirUtil.getNames(practitioner));
        assertNull(FhirUtil.getNames(encounter));
    }
}
