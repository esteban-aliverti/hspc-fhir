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

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;

import ca.uhn.fhir.model.api.Bundle;
import ca.uhn.fhir.model.api.BundleEntry;
import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.dstu2.composite.AddressDt;
import ca.uhn.fhir.model.dstu2.composite.BoundCodeableConceptDt;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.dstu2.composite.CodingDt;
import ca.uhn.fhir.model.dstu2.composite.ContactPointDt;
import ca.uhn.fhir.model.dstu2.composite.HumanNameDt;
import ca.uhn.fhir.model.dstu2.composite.IdentifierDt;
import ca.uhn.fhir.model.dstu2.composite.PeriodDt;
import ca.uhn.fhir.model.dstu2.composite.QuantityDt;
import ca.uhn.fhir.model.dstu2.composite.TimingDt.Repeat;
import ca.uhn.fhir.model.dstu2.resource.Patient;
import ca.uhn.fhir.model.dstu2.valueset.AddressUseEnum;
import ca.uhn.fhir.model.dstu2.valueset.IdentifierTypeCodesEnum;
import ca.uhn.fhir.model.dstu2.valueset.NameUseEnum;
import ca.uhn.fhir.model.dstu2.valueset.UnitsOfTimeEnum;
import ca.uhn.fhir.model.primitive.DateTimeDt;

/**
 * Domain object utility methods.
 */
public class FhirUtil {
    
    
    public static IHumanNameParser defaultHumanNameParser = new HumanNameParser();
    
    /**
     * Convenience method that creates a CodeableConcept with a single coding.
     * 
     * @param system The coding system.
     * @param code The code.
     * @param displayName The concept's display name.
     * @return A CodeableConcept instance.
     */
    public static CodeableConceptDt createCodeableConcept(String system, String code, String displayName) {
        CodeableConceptDt codeableConcept = new CodeableConceptDt();
        CodingDt coding = new CodingDt(system, code);
        coding.setDisplay(displayName);
        codeableConcept.addCoding(coding);
        return codeableConcept;
    }
    
    /**
     * Creates a period object from a start and end date.
     * 
     * @param startDate The starting date.
     * @param endDate The ending date.
     * @return A period object, or null if both dates are null.
     */
    public static PeriodDt createPeriod(Date startDate, Date endDate) {
        PeriodDt period = null;
        
        if (startDate != null) {
            period = new PeriodDt();
            period.setStart(new DateTimeDt(startDate));
        }
        
        if (endDate != null) {
            (period == null ? period = new PeriodDt() : period).setEnd(new DateTimeDt(endDate));
        }
        
        return period;
    }
    
    /**
     * Convert a string-based time unit to the corresponding enum.
     * 
     * @param timeUnit The time unit.
     * @return The corresponding enumeration value.
     */
    public static UnitsOfTimeEnum convertTimeUnitToEnum(String timeUnit) {
        try {
            return UnitsOfTimeEnum.valueOf(timeUnit.toUpperCase());
        } catch (Exception e) {
            throw new IllegalArgumentException("Unknown time unit " + timeUnit);
        }
    }
    
    /**
     * Attempts to find the frequency code for the proposed timing. For instance Frequency = 1 in
     * Duration of 24h is 'QD' TODO Handle hard coding used for initial wiring
     * 
     * @param repeat The timing.
     * @return Frequency code corresponding to timing.
     */
    public static CodingDt getFrequencyFromRepeat(Repeat repeat) {
        CodingDt frequency = new CodingDt();
        if (repeat != null && repeat.getPeriod() != null) {
            frequency.setSystem(FhirTerminology.COGMED);
            if (repeat.getFrequency() == 1 && repeat.getPeriod().intValue() == 24) {
                frequency.setCode("1");
                frequency.setDisplay("QD");
            } else if ((repeat.getFrequency() == 1 && repeat.getPeriod().intValue() == 8)
                    || (repeat.getFrequency() == 3 && repeat.getPeriod().intValue() == 24)) {
                frequency.setCode("2");
                frequency.setDisplay("Q8H");
            }
        }
        return frequency;
    }
    
    /**
     * Method sets the FHIR repeat for the given frequency code
     * 
     * @param frequencyCode The frequency code.
     * @return The corresponding timing.
     */
    public static Repeat getRepeatFromFrequencyCode(String frequencyCode) {
        Repeat repeat = new Repeat();
        if (frequencyCode != null && frequencyCode.equals("QD")) {
            repeat.setFrequency(1);
            repeat.setPeriod(24);
        }
        if (frequencyCode != null && frequencyCode.equals("Q8H")) {
            repeat.setFrequency(1);
            repeat.setPeriod(8);
        }
        return repeat;
    }
    
    /**
     * Returns the first element in a list, or null if there is none.
     * 
     * @param list A list.
     * @return The first list element, or null if none.
     */
    public static <T> T getFirst(List<T> list) {
        return list == null || list.isEmpty() ? null : list.get(0);
    }
    
    /**
     * Returns the last element in a list, or null if there is none.
     * 
     * @param list A list.
     * @return The last list element, or null if none.
     */
    public static <T> T getLast(List<T> list) {
        return list == null || list.isEmpty() ? null : list.get(list.size() - 1);
    }
    
    /**
     * Extracts the list of resource from a bundle.
     * 
     * @param bundle The bundle.
     * @param clazz Class of resource to extract.
     * @return The list of extracted resources.
     */
    @SuppressWarnings("unchecked")
    public static <T extends IResource> List<T> getEntries(Bundle bundle, Class<T> clazz) {
        List<T> entries = new ArrayList<T>();
        
        if (bundle != null) {
            for (BundleEntry entry : bundle.getEntries()) {
                IResource resource = entry.getResource();
                
                if (clazz.isInstance(resource)) {
                    entries.add((T) entry.getResource());
                }
            }
        }
        
        return entries;
    }
    
    /**
     * Returns a coding of the desired system from a list.
     * 
     * @param list List of codings to consider.
     * @param systems One or more systems to consider. These are searched in order until one is
     *            found. A null value matches any system.
     * @return An coding with a matching system, or null if none found.
     */
    public static CodingDt getCoding(List<CodingDt> list, String... systems) {
        for (String system : systems) {
            for (CodingDt coding : list) {
                if (system == null || system.equals(coding.getSystem())) {
                    return coding;
                }
            }
        }
        
        return null;
    }
    
    /**
     * Returns an address of the desired use category from a list.
     * 
     * @param list List of addresses to consider.
     * @param uses One or more use categories. These are searched in order until one is found. A
     *            null value matches any use category.
     * @return An address with a matching use category, or null if none found.
     */
    public static AddressDt getAddress(List<AddressDt> list, AddressUseEnum... uses) {
        for (AddressUseEnum use : uses) {
            for (AddressDt address : list) {
                if (use == null || use.equals(address.getUse())) {
                    return address;
                }
            }
        }
        
        return null;
    }
    
    /**
     * Returns an contact of the desired type category from a list.
     * 
     * @param list List of contacts to consider.
     * @param type Contact type to find (e.g., "home:phone").
     * @return A contact with a matching type, or null if none found.
     */
    public static ContactPointDt getContact(List<ContactPointDt> list, String type) {
        String[] pcs = type.split(":", 2);
        
        for (ContactPointDt contact : list) {
            if (pcs[0].equals(contact.getUse()) && pcs[1].equals(contact.getSystem())) {
                return contact;
            }
        }
        
        return null;
    }
    
    /**
     * Returns a name of the desired use category from a list.
     * 
     * @param list List of names to consider.
     * @param uses One or more use categories. These are searched in order until one is found. A
     *            null value matches any use category.
     * @return A name with a matching use category, or null if none found.
     */
    public static HumanNameDt getName(List<HumanNameDt> list, NameUseEnum... uses) {
        for (NameUseEnum use : uses) {
            for (HumanNameDt name : list) {
                if (use == null || use.equals(name.getUse())) {
                    return name;
                }
            }
        }
        
        return null;
    }
    
    public static HumanNameDt parseName(String name) {
        return name == null ? null : defaultHumanNameParser.fromString(null, name);
    }
    
    public static String formatName(HumanNameDt name) {
        return name == null ? "" : defaultHumanNameParser.toString(name);
    }
    
    /**
     * Format the "usual" name.
     * 
     * @param names List of names
     * @return A formatted name.
     */
    public static String formatName(List<HumanNameDt> names) {
        return formatName(names, NameUseEnum.USUAL, null);
    }
    
    /**
     * Format a name of the specified use category.
     * 
     * @param names List of names
     * @param uses Use categories (use categories to search).
     * @return A formatted name.
     */
    public static String formatName(List<HumanNameDt> names, NameUseEnum... uses) {
        return formatName(getName(names, uses));
    }
    
    /**
     * Converts a list of objects to a list of their string equivalents.
     * 
     * @param source The source list.
     * @return A list of string equivalents.
     */
    public static List<String> toStringList(List<?> source) {
        List<String> dest = new ArrayList<String>(source.size());
        
        for (Object value : source) {
            dest.add(value.toString());
        }
        
        return dest;
    }
    
    /**
     * Returns a patient's MRN. (What types should be explicitly considered?)
     * 
     * @param patient Patient
     * @return MRN identifier
     */
    public static IdentifierDt getMRN(Patient patient) {
        return patient == null ? null : getIdentifier(patient.getIdentifier(), IdentifierTypeCodesEnum.MR);
    }
    
    public static IdentifierDt getIdentifier(List<IdentifierDt> list, IdentifierTypeCodesEnum... types) {
        for (IdentifierTypeCodesEnum type : types) {
            for (IdentifierDt id : list) {
                for (CodingDt coding : id.getType().getCoding()) {
                    if (coding.getSystem().equals(type.getSystem()) && coding.getCode().equals(type.getCode())) {
                        return id;
                    }
                }
            }
        }
        
        return null;
    }
    
    /**
     * Sets the identifier's type. This is a workaround for HAPI-FHIR's restrictive setter for this
     * property.
     * 
     * @param identifier The identifier whose type is to be set.
     * @param system The identifier type system.
     * @param code The identifier type code.
     */
    public static void setIdentifierType(IdentifierDt identifier, String system, String code) {
        setIdentifierType(identifier, new CodeableConceptDt(system, code));
    }
    
    /**
     * Sets the identifier's type. This is a workaround for HAPI-FHIR's restrictive setter for this
     * property.
     * 
     * @param identifier The identifier whose type is to be set.
     * @param code The identifier type.
     */
    @SuppressWarnings("unchecked")
    public static void setIdentifierType(IdentifierDt identifier, CodeableConceptDt code) {
        identifier.setType((BoundCodeableConceptDt<IdentifierTypeCodesEnum>) code);
    }
    
    /**
     * Returns the resource ID relative path from a IdDt datatype.
     * 
     * @param resource The resource.
     * @return The resource's relative path.
     */
    public static String getResourceIdPath(IResource resource) {
        return resource.getId().getResourceType() + "/" + resource.getId().getIdPart();
    }
    
    /**
     * Returns the base 64-encoded equivalent of a resource.
     * 
     * @param resourceName The resource name.
     * @return The base 64-encoded resource.
     */
    public static byte[] getResourceAndConvertToBase64(String resourceName) {
        return Base64.encodeBase64(getResourceAsByteArray(resourceName));
    }
    
    /**
     * Returns the resource as a byte array.
     * 
     * @param resourceName The resource name.
     * @return The resource as a byte array.
     */
    public static byte[] getResourceAsByteArray(String resourceName) {
        try {
            File file = new File(FhirUtil.class.getClassLoader().getResource(resourceName).getFile());
            return FileUtils.readFileToByteArray(file);
        } catch (Exception e) {
            throw new RuntimeException("Error deserializing file " + resourceName, e);
        }
    }
    
    /**
     * Returns a patient's MRN. (What labels should be explicitly considered?)
     * 
     * @param patient Patient
     * @return MRN as a string.
     */
    public static String getMRNString(Patient patient) {
        IdentifierDt identifier = getMRN(patient);
        return identifier == null ? "" : identifier.getValue();
    }
    
    /**
     * Casts an unspecified data type to a specific data type if possible.
     * 
     * @param value The value to cast.
     * @param clazz The type to cast to.
     * @return The value cast to the specified type, or null if not possible.
     */
    @SuppressWarnings("unchecked")
    public static <V, T extends V> T getTyped(V value, Class<T> clazz) {
        return clazz.isInstance(value) ? (T) value : null;
    }
    
    /**
     * Performs an equality check on two resources using their id's.
     * 
     * @param res1 The first resource.
     * @param res2 The second resource.
     * @return True if the two resources have equal id's.
     */
    public static <T extends IResource> boolean areEqual(T res1, T res2) {
        if (res1 == null || res2 == null) {
            return false;
        }
        
        return res1 == res2 || res1.getId().equals(res2.getId());
    }
    
    /**
     * Method returns true if two quantities are equal. Compares two quantities by comparing their
     * values and their units. TODO Do a comparator instead
     * 
     * @param qty1 The first quantity
     * @param qty2 The second quantity
     * @return True if the two quantities are equal.
     */
    public static boolean equalQuantities(QuantityDt qty1, QuantityDt qty2) {
        if (qty1 == null || qty2 == null || qty1.getUnit() == null || qty2.getUnit() == null || qty1.getValue() == null
                || qty2.getValue() == null) {
            return false;
        } else if (qty1 == qty2) {
            return true;
        } else if ((qty1.getValue().compareTo(qty2.getValue()) == 0) && qty1.getUnit().equals(qty2.getUnit())) {
            // TODO: Fix floating compares within some margin.
            return true;
        } else {
            // TODO Flawed because no unit conversion done here. I am leaving this for a good utility.
            return false;
        }
    }
    
    /**
     * Returns a displayable value for a codeable concept.
     * 
     * @param value Codeable concept.
     * @return Displayable value.
     */
    public static String getDisplayValue(CodeableConceptDt value) {
        CodingDt coding = value.getCodingFirstRep();
        String result = coding.getDisplay();
        return result == null ? coding.getCode() : result;
    }
    
    /**
     * Enforce static class.
     */
    private FhirUtil() {
    };
}
