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

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.reflect.MethodUtils;

import org.carewebframework.common.DateUtil;

import org.hl7.fhir.dstu3.model.Address;
import org.hl7.fhir.dstu3.model.Address.AddressUse;
import org.hl7.fhir.dstu3.model.Annotation;
import org.hl7.fhir.dstu3.model.Bundle;
import org.hl7.fhir.dstu3.model.Bundle.BundleEntryComponent;
import org.hl7.fhir.dstu3.model.CodeableConcept;
import org.hl7.fhir.dstu3.model.Coding;
import org.hl7.fhir.dstu3.model.ContactPoint;
import org.hl7.fhir.dstu3.model.DateTimeType;
import org.hl7.fhir.dstu3.model.DateType;
import org.hl7.fhir.dstu3.model.HumanName;
import org.hl7.fhir.dstu3.model.HumanName.NameUse;
import org.hl7.fhir.dstu3.model.Identifier;
import org.hl7.fhir.dstu3.model.OperationOutcome;
import org.hl7.fhir.dstu3.model.OperationOutcome.IssueSeverity;
import org.hl7.fhir.dstu3.model.OperationOutcome.OperationOutcomeIssueComponent;
import org.hl7.fhir.dstu3.model.Patient;
import org.hl7.fhir.dstu3.model.Period;
import org.hl7.fhir.dstu3.model.Quantity;
import org.hl7.fhir.dstu3.model.Reference;
import org.hl7.fhir.dstu3.model.SimpleQuantity;
import org.hl7.fhir.dstu3.model.Timing;
import org.hl7.fhir.dstu3.model.Timing.TimingRepeatComponent;
import org.hl7.fhir.dstu3.model.Timing.UnitsOfTime;
import org.hl7.fhir.instance.model.api.IBaseCoding;
import org.hl7.fhir.instance.model.api.IBaseDatatype;
import org.hl7.fhir.instance.model.api.IBaseResource;
import org.hl7.fhir.instance.model.api.IIdType;

import ca.uhn.fhir.rest.api.MethodOutcome;

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
    public static CodeableConcept createCodeableConcept(String system, String code, String displayName) {
        CodeableConcept codeableConcept = new CodeableConcept();
        Coding coding = new Coding(system, code, displayName);
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
    public static Period createPeriod(Date startDate, Date endDate) {
        Period period = null;
        
        if (startDate != null) {
            period = new Period();
            period.setStart(startDate);
        }
        
        if (endDate != null) {
            (period == null ? period = new Period() : period).setEnd(endDate);
        }
        
        return period;
    }
    
    public static Identifier createIdentifier(String system, String value) {
        Identifier identifier = new Identifier();
        identifier.setSystem(system);
        identifier.setValue(value);
        return identifier;
    }
    
    /**
     * Convert a string-based time unit to the corresponding enum.
     * 
     * @param timeUnit The time unit.
     * @return The corresponding enumeration value.
     */
    public static UnitsOfTime convertTimeUnitToEnum(String timeUnit) {
        try {
            return UnitsOfTime.valueOf(timeUnit.toUpperCase());
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
    public static Coding getFrequencyFromRepeat(TimingRepeatComponent repeat) {
        Coding frequency = new Coding();
        if (repeat != null && repeat.getPeriod() != null) {
            frequency.setSystem(FhirTerminology.SYS_COGMED);
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
    public static TimingRepeatComponent getRepeatFromFrequencyCode(String frequencyCode) {
        TimingRepeatComponent repeat = new TimingRepeatComponent();
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
     * Extracts resources of the specified class from a bundle.
     * 
     * @param bundle The bundle.
     * @param clazz Class of resource to extract.
     * @return The list of extracted resources.
     */
    @SuppressWarnings("unchecked")
    public static <T extends IBaseResource> List<T> getEntries(Bundle bundle, Class<T> clazz) {
        return (List<T>) getEntries(bundle, Collections.singletonList(clazz), null);
    }
    
    /**
     * Extracts resources from a bundle according to the inclusion and exclusion criteria.
     * 
     * @param bundle The bundle.
     * @param inclusions List of resource classes to extract. May be null to indicate all classes
     *            should be extracted.
     * @param exclusions List of resource classes to be excluded. May be null to indicate no classes
     *            should be excluded. Exclusions take precedence over inclusions.
     * @return The list of extracted resources.
     */
    public static <T extends IBaseResource> List<IBaseResource> getEntries(Bundle bundle, List<Class<T>> inclusions,
                                                                           List<Class<T>> exclusions) {
        List<IBaseResource> entries = new ArrayList<>();
        
        if (bundle != null) {
            for (BundleEntryComponent entry : bundle.getEntry()) {
                IBaseResource resource = entry.getResource();
                boolean exclude = exclusions != null && classMatches(exclusions, resource);
                boolean include = !exclude && (inclusions == null || classMatches(inclusions, resource));
                
                if (include) {
                    entries.add(resource);
                }
            }
        }
        
        return entries;
    }
    
    /**
     * Returns true if the resource is assignment-compatible with one of the classes list.
     * 
     * @param classes List of classes to check.
     * @param resource The resource to test.
     * @return True if the resource is assignment-compatible with one of the classes in the list.
     */
    private static <T extends IBaseResource> boolean classMatches(List<Class<T>> classes, IBaseResource resource) {
        for (Class<T> clazz : classes) {
            if (clazz.isInstance(resource)) {
                return true;
            }
        }
        
        return false;
    }
    
    /**
     * Returns a coding of the desired system from a list.
     * 
     * @param list List of codings to consider.
     * @param systems One or more systems to consider. These are searched in order until one is
     *            found. A null value matches any system.
     * @return An coding with a matching system, or null if none found.
     */
    public static Coding getCoding(List<Coding> list, String... systems) {
        for (String system : systems) {
            for (Coding coding : list) {
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
    public static Address getAddress(List<Address> list, AddressUse... uses) {
        for (AddressUse use : uses) {
            for (Address address : list) {
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
    public static ContactPoint getContact(List<ContactPoint> list, String type) {
        String[] pcs = type.split(":", 2);
        
        for (ContactPoint contact : list) {
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
    public static HumanName getName(List<HumanName> list, NameUse... uses) {
        for (NameUse use : uses) {
            for (HumanName name : list) {
                if (use == null || use.equals(name.getUse())) {
                    return name;
                }
            }
        }
        
        return null;
    }
    
    public static HumanName parseName(String name) {
        return name == null ? null : defaultHumanNameParser.fromString(null, name);
    }
    
    public static String formatName(HumanName name) {
        return name == null ? "" : defaultHumanNameParser.toString(name);
    }
    
    /**
     * Format the "usual" name.
     * 
     * @param names List of names
     * @return A formatted name.
     */
    public static String formatName(List<HumanName> names) {
        return formatName(names, NameUse.USUAL, null);
    }
    
    /**
     * Format a name of the specified use category.
     * 
     * @param names List of names
     * @param uses Use categories (use categories to search).
     * @return A formatted name.
     */
    public static String formatName(List<HumanName> names, NameUse... uses) {
        return formatName(getName(names, uses));
    }
    
    /**
     * Converts a list of objects to a list of their string equivalents.
     * 
     * @param source The source list.
     * @return A list of string equivalents.
     */
    public static List<String> toStringList(List<?> source) {
        List<String> dest = new ArrayList<>(source.size());
        
        for (Object value : source) {
            dest.add(value.toString());
        }
        
        return dest;
    }
    
    /**
     * Concatenates a path fragment to a root path. Ensures that a single "/" character separates
     * the two parts.
     * 
     * @param root The root path.
     * @param fragment The path fragment.
     * @return The concatenated result.
     */
    public static String concatPath(String root, String fragment) {
        while (root.endsWith("/")) {
            root = root.substring(0, root.length() - 1);
        }
        
        while (fragment.startsWith("/")) {
            fragment = fragment.substring(1);
        }
        
        return root + "/" + fragment;
    }
    
    /**
     * Returns a patient's MRN. (What types should be explicitly considered?)
     * 
     * @param patient Patient
     * @return MRN identifier
     */
    public static Identifier getMRN(Patient patient) {
        return patient == null ? null : getIdentifier(patient.getIdentifier(), FhirTerminology.CODING_MRN);
    }
    
    public static Identifier getIdentifier(List<Identifier> list, Coding... types) {
        for (Coding type : types) {
            for (Identifier id : list) {
                for (Coding coding : id.getType().getCoding()) {
                    if (coding.getSystem().equals(type.getSystem()) && coding.getCode().equals(type.getCode())) {
                        return id;
                    }
                }
            }
        }
        
        return null;
    }
    
    /**
     * Returns identifiers for the given resource, if any.
     * 
     * @param resource Resource whose identifiers are sought.
     * @return List of associated identifier, or null if the resource doesn't support identifiers.
     */
    @SuppressWarnings("unchecked")
    public static List<Identifier> getIdentifiers(IBaseResource resource) {
        return getProperty(resource, "getIdentifier", List.class);
    }
    
    /**
     * Returns the patient associated with a resource.
     * 
     * @param resource Resource whose associated patient is sought.
     * @return A patient resource.
     */
    public static Reference getPatient(IBaseResource resource) {
        Reference ref = getProperty(resource, "getPatient", Reference.class);
        ref = ref != null ? ref : getProperty(resource, "getSubject", Reference.class);
        return ref == null || !ref.hasReference() ? null
                : "Patient".equals(getResourceType(ref.getReferenceElement())) ? ref : null;
    }
    
    @SuppressWarnings("unchecked")
    private static <T> T getProperty(IBaseResource resource, String getter, Class<T> expectedClass) {
        Object result = null;
        
        try {
            result = MethodUtils.invokeMethod(resource, getter, (Object[]) null);
            result = result == null || expectedClass == null ? result : expectedClass.isInstance(result) ? result : null;
        } catch (Exception e) {}
        
        return (T) result;
    }
    
    /**
     * Extracts a resource type from an id.
     * 
     * @param id Identifier.
     * @return The resource type.
     */
    public static String getResourceType(IIdType id) {
        return id == null || id.isEmpty() ? null : id.getResourceType();
    }
    
    /**
     * Returns the resource type from a resource.
     * 
     * @param resource The resource.
     * @return The type of resource.
     */
    public static String getResourceType(IBaseResource resource) {
        return resource == null ? null : getResourceType(resource.getIdElement());
    }
    
    /**
     * Returns the resource ID relative path from a IdDt datatype.
     * 
     * @param resource The resource.
     * @return The resource's relative path.
     */
    public static String getResourceIdPath(IBaseResource resource) {
        return resource.getIdElement().getResourceType() + "/" + resource.getIdElement().getIdPart();
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
        try (InputStream is = FhirUtil.class.getClassLoader().getResource(resourceName).openStream()) {
            return IOUtils.toByteArray(is);
        } catch (Exception e) {
            throw new RuntimeException("Error deserializing file " + resourceName, e);
        }
    }
    
    /**
     * Adds a tag to a resource if not already present.
     * 
     * @param tag Tag to add.
     * @param resource Resource to receive tag.
     * @return True if the tag was added.
     */
    public static boolean addTag(IBaseCoding tag, IBaseResource resource) {
        boolean exists = resource.getMeta().getTag(tag.getSystem(), tag.getCode()) != null;
        
        if (!exists) {
            IBaseCoding newTag = resource.getMeta().addTag();
            newTag.setCode(tag.getCode());
            newTag.setSystem(tag.getSystem());
            newTag.setDisplay(tag.getDisplay());
        }
        
        return !exists;
    }
    
    /**
     * Removes a tag from a resource if present.
     * 
     * @param tag Tag to remove.
     * @param resource Resource to containing tag.
     * @return True if the tag was removed.
     */
    public static boolean removeTag(IBaseCoding tag, IBaseResource resource) {
        IBaseCoding theTag = resource.getMeta().getTag(tag.getSystem(), tag.getCode());
        
        if (theTag != null) {
            resource.getMeta().getTag().remove(theTag);
            return true;
        }
        
        return false;
    }
    
    /**
     * Returns a patient's MRN. (What labels should be explicitly considered?)
     * 
     * @param patient Patient
     * @return MRN as a string.
     */
    public static String getMRNString(Patient patient) {
        Identifier identifier = getMRN(patient);
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
    public static <T extends IBaseResource> boolean areEqual(T res1, T res2) {
        return areEqual(res1, res2, false);
    }
    
    /**
     * Performs an equality check on two resources using their id's.
     * 
     * @param res1 The first resource.
     * @param res2 The second resource.
     * @param ignoreVersion If true, ignore any version qualifiers in the comparison.
     * @return True if the two resources have equal id's.
     */
    public static <T extends IBaseResource> boolean areEqual(T res1, T res2, boolean ignoreVersion) {
        if (res1 == null || res2 == null) {
            return false;
        }
        
        return res1 == res2 || getIdAsString(res1, ignoreVersion).equals(getIdAsString(res2, ignoreVersion));
    }
    
    /**
     * Returns the string representation of the resource's id.
     * 
     * @param resource The resource.
     * @param stripVersion If true and the id has a version qualifier, remove it.
     * @return The string representation of the resource's id.
     */
    public static <T extends IBaseResource> String getIdAsString(T resource, boolean stripVersion) {
        return getIdAsString(resource.getIdElement(), stripVersion);
    }
    
    /**
     * Returns the string representation of the id.
     * 
     * @param id The id.
     * @param stripVersion If true and the id has a version qualifier, remove it.
     * @return The string representation of the id.
     */
    public static String getIdAsString(IIdType id, boolean stripVersion) {
        String result = id == null ? null : id.getValueAsString();
        return result == null ? "" : stripVersion && id.hasVersionIdPart() ? stripVersion(result) : result;
    }
    
    /**
     * Strips the version qualifier from an id, if present.
     * 
     * @param id The id.
     * @return The id without a version qualifier.
     */
    public static String stripVersion(String id) {
        int i = id.lastIndexOf("/_history");
        return i == -1 ? id : id.substring(0, i);
    }
    
    /**
     * Strips the version qualifier from a resource, if present.
     * 
     * @param resource The resource.
     * @return The input resource, possibly modified.
     */
    public static <T extends IBaseResource> T stripVersion(T resource) {
        IIdType id = resource.getIdElement();
        
        if (id.hasVersionIdPart()) {
            id.setValue(stripVersion(id.getValue()));
            resource.setId(id);
        }
        
        return resource;
    }
    
    /**
     * Method returns true if two quantities are equal. Compares two quantities by comparing their
     * values and their units. TODO Do a comparator instead
     * 
     * @param qty1 The first quantity
     * @param qty2 The second quantity
     * @return True if the two quantities are equal.
     */
    public static boolean equalQuantities(Quantity qty1, Quantity qty2) {
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
    public static String getDisplayValue(CodeableConcept value) {
        Coding coding = FhirUtil.getFirst(value.getCoding());
        String result = coding == null ? "" : coding.getDisplay();
        return result == null ? coding.getCode() : result;
    }
    
    public static String getDisplayValue(DateTimeType value) {
        return DateUtil.formatDate(value.getValue());
    }
    
    public static String getDisplayValue(DateType value) {
        return DateUtil.formatDate(value.getValue());
    }
    
    public static String getDisplayValue(Quantity value) {
        String units = value.getUnit();
        return value.getValue().toString() + (units == null ? "" : " " + units);
    }
    
    public static String getDisplayValue(Period value) {
        Date start = value.getStart();
        Date end = value.getEnd();
        String result = "";
        
        if (start != null) {
            result = DateUtil.formatDate(start);
            
            if (start.equals(end)) {
                end = null;
            }
        }
        
        if (end != null) {
            result += (result.isEmpty() ? "" : " - ") + DateUtil.formatDate(end);
        }
        
        return result;
    }
    
    public static String getDisplayValue(Reference value) {
        return value.getDisplay();
    }
    
    public static String getDisplayValue(Annotation value) {
        return value.getText();
    }
    
    public static String getDisplayValue(SimpleQuantity value) {
        String unit = value.hasUnit() ? " " + value.getUnit() : "";
        return value.getValue().toPlainString() + unit;
    }
    
    public static String getDisplayValue(Timing value) {
        StringBuilder sb = new StringBuilder(getDisplayValueForType(value.getCode())).append(" ");
        TimingRepeatComponent repeat = value.getRepeat();
        
        if (!repeat.isEmpty()) {
            // TODO: finish
        }
        
        if (!value.getEvent().isEmpty()) {
            sb.append(" at ").append(getDisplayValueForTypes(value.getEvent(), ", "));
        }
        
        return sb.toString();
    }
    
    /**
     * Delegates to the getDisplayValue function for the runtime type of value, if available.
     * Otherwise, calls toString() on the value.
     * 
     * @param value Value to format for display.
     * @return The formatted value.
     */
    public static String getDisplayValueForType(IBaseDatatype value) {
        if (value == null || value.isEmpty()) {
            return "";
        }
        
        try {
            Method method = MethodUtils.getAccessibleMethod(FhirUtil.class, "getDisplayValue", value.getClass());
            return method == null ? value.toString() : (String) method.invoke(null, value);
        } catch (Exception e) {
            return value.toString();
        }
    }
    
    /**
     * Invokes getDisplayValueForType on each list element, using the specified delimiter to
     * separate results.
     * 
     * @param values Values to format for display.
     * @param delimiter Delimiter to separate multiple values.
     * @return The formatted values.
     */
    public static String getDisplayValueForTypes(List<? extends IBaseDatatype> values, String delimiter) {
        StringBuilder sb = new StringBuilder();
        
        for (IBaseDatatype value : values) {
            String result = getDisplayValueForType(value);
            
            if (!result.isEmpty()) {
                sb.append(sb.length() == 0 ? "" : delimiter).append(result);
            }
        }
        
        return sb.toString();
    }
    
    /**
     * Checks the response from a server request to determine if it is an OperationOutcome with a
     * severity of ERROR or FATAL. If so, it will throw a runtime exception with the diagnostics of
     * the issue(s).
     * 
     * @param resource The resource returned by a server request.
     * @return Returns true if the resource was an OperationOutcome with no critical issues.
     */
    public static boolean checkOutcome(IBaseResource resource) {
        if (resource instanceof OperationOutcome) {
            OperationOutcome outcome = (OperationOutcome) resource;
            
            if (outcome.hasIssue()) {
                StringBuilder sb = new StringBuilder();
                
                for (OperationOutcomeIssueComponent issue : outcome.getIssue()) {
                    if (issue.getSeverity() == IssueSeverity.ERROR || issue.getSeverity() == IssueSeverity.FATAL) {
                        sb.append(issue.getDiagnostics()).append('\n');
                    }
                }
                
                if (sb.length() != 0) {
                    throw new RuntimeException(sb.toString());
                }
                
            }
            
            return true;
        }
        
        return false;
    }
    
    /**
     * Processes a MethodOutcome from a create or update request. If the request returns an updated
     * version of the resource, that resource is returned. If the request returns a logical id, that
     * id is set in the original resource. If the request resulted in an error, a runtime exception
     * is thrown.
     * 
     * @param outcome The method outcome.
     * @param resource The resource upon which the method was performed.
     * @return If the method returned a new resource, that resource is returned. Otherwise, the
     *         original resource is returned, possibly with an updated logical id.
     */
    @SuppressWarnings("unchecked")
    public static <T extends IBaseResource> T processMethodOutcome(MethodOutcome outcome, T resource) {
        checkOutcome(outcome.getOperationOutcome());
        IIdType id = outcome.getId();
        IBaseResource newResource = outcome.getResource();
        
        if (id != null) {
            resource.setId(id);
        } else if (newResource != null && newResource.getClass() == resource.getClass()) {
            resource = (T) newResource;
        }
        
        return resource;
    }
    
    /**
     * Enforce static class.
     */
    private FhirUtil() {
    }
}
