/*
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
package org.socraticgrid.fhir.generated;

import java.util.Date;
import java.util.List;

import ca.uhn.fhir.model.dstu2.composite.AnnotationDt;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.dstu2.composite.ContainedDt;
import ca.uhn.fhir.model.dstu2.composite.IdentifierDt;
import ca.uhn.fhir.model.dstu2.composite.NarrativeDt;
import ca.uhn.fhir.model.dstu2.composite.SimpleQuantityDt;
import ca.uhn.fhir.model.dstu2.resource.Encounter;
import ca.uhn.fhir.model.dstu2.resource.Immunization;
import ca.uhn.fhir.model.dstu2.resource.Location;
import ca.uhn.fhir.model.dstu2.resource.Organization;
import ca.uhn.fhir.model.dstu2.resource.Patient;
import ca.uhn.fhir.model.dstu2.resource.Practitioner;
import ca.uhn.fhir.model.primitive.BooleanDt;
import ca.uhn.fhir.model.primitive.CodeDt;
import ca.uhn.fhir.model.primitive.DateDt;
import ca.uhn.fhir.model.primitive.DateTimeDt;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.primitive.StringDt;

public class ImmunizationAdapter implements IImmunization {
    
    
    private Immunization adaptedClass = null;
    
    public ImmunizationAdapter() {
        this.adaptedClass = new ca.uhn.fhir.model.dstu2.resource.Immunization();
    }
    
    public ImmunizationAdapter(Immunization adaptee) {
        this.adaptedClass = adaptee;
    }
    
    @Override
    public Immunization getAdaptee() {
        return adaptedClass;
    }
    
    @Override
    public void setAdaptee(Immunization param) {
        this.adaptedClass = param;
    }
    
    @Override
    public List<Immunization.VaccinationProtocol> getVaccinationProtocol() {
        return adaptedClass.getVaccinationProtocol();
    }
    
    @Override
    public IImmunization setVaccinationProtocol(List<Immunization.VaccinationProtocol> param) {
        adaptedClass.setVaccinationProtocol(param);
        return this;
    }
    
    @Override
    public IImmunization addVaccinationProtocol(Immunization.VaccinationProtocol param) {
        adaptedClass.addVaccinationProtocol(param);
        return this;
    }
    
    @Override
    public Immunization.VaccinationProtocol addVaccinationProtocol() {
        ca.uhn.fhir.model.dstu2.resource.Immunization.VaccinationProtocol item = new ca.uhn.fhir.model.dstu2.resource.Immunization.VaccinationProtocol();
        adaptedClass.addVaccinationProtocol(item);
        return item;
    }
    
    @Override
    public Immunization.VaccinationProtocol getVaccinationProtocolFirstRep() {
        return adaptedClass.getVaccinationProtocolFirstRep();
    }
    
    @Override
    public BooleanDt getWasNotGivenElement() {
        return adaptedClass.getWasNotGivenElement();
    }
    
    @Override
    public Boolean getWasNotGiven() {
        return adaptedClass.getWasNotGiven();
    }
    
    @Override
    public IImmunization setWasNotGiven(Boolean param) {
        adaptedClass.setWasNotGiven(new ca.uhn.fhir.model.primitive.BooleanDt(param));
        return this;
    }
    
    @Override
    public IImmunization setWasNotGiven(BooleanDt param) {
        adaptedClass.setWasNotGiven(param);
        return this;
    }
    
    @Override
    public SimpleQuantityDt getDoseQuantity() {
        return adaptedClass.getDoseQuantity();
    }
    
    @Override
    public IImmunization setDoseQuantity(SimpleQuantityDt param) {
        adaptedClass.setDoseQuantity(param);
        return this;
    }
    
    @Override
    public List<IdentifierDt> getIdentifier() {
        return adaptedClass.getIdentifier();
    }
    
    @Override
    public IImmunization setIdentifier(List<IdentifierDt> param) {
        adaptedClass.setIdentifier(param);
        return this;
    }
    
    @Override
    public IImmunization addIdentifier(IdentifierDt param) {
        adaptedClass.addIdentifier(param);
        return this;
    }
    
    @Override
    public IdentifierDt addIdentifier() {
        ca.uhn.fhir.model.dstu2.composite.IdentifierDt item = new ca.uhn.fhir.model.dstu2.composite.IdentifierDt();
        adaptedClass.addIdentifier(item);
        return item;
    }
    
    @Override
    public IdentifierDt getIdentifierFirstRep() {
        return adaptedClass.getIdentifierFirstRep();
    }
    
    @Override
    public StringDt getLotNumberElement() {
        return adaptedClass.getLotNumberElement();
    }
    
    @Override
    public String getLotNumber() {
        return adaptedClass.getLotNumber();
    }
    
    @Override
    public IImmunization setLotNumber(String param) {
        adaptedClass.setLotNumber(new ca.uhn.fhir.model.primitive.StringDt(param));
        return this;
    }
    
    @Override
    public IImmunization setLotNumber(StringDt param) {
        adaptedClass.setLotNumber(param);
        return this;
    }
    
    @Override
    public List<Immunization.Reaction> getReaction() {
        return adaptedClass.getReaction();
    }
    
    @Override
    public IImmunization setReaction(List<Immunization.Reaction> param) {
        adaptedClass.setReaction(param);
        return this;
    }
    
    @Override
    public IImmunization addReaction(Immunization.Reaction param) {
        adaptedClass.addReaction(param);
        return this;
    }
    
    @Override
    public Immunization.Reaction addReaction() {
        ca.uhn.fhir.model.dstu2.resource.Immunization.Reaction item = new ca.uhn.fhir.model.dstu2.resource.Immunization.Reaction();
        adaptedClass.addReaction(item);
        return item;
    }
    
    @Override
    public Immunization.Reaction getReactionFirstRep() {
        return adaptedClass.getReactionFirstRep();
    }
    
    @Override
    public BooleanDt getReportedElement() {
        return adaptedClass.getReportedElement();
    }
    
    @Override
    public Boolean getReported() {
        return adaptedClass.getReported();
    }
    
    @Override
    public IImmunization setReported(Boolean param) {
        adaptedClass.setReported(new ca.uhn.fhir.model.primitive.BooleanDt(param));
        return this;
    }
    
    @Override
    public IImmunization setReported(BooleanDt param) {
        adaptedClass.setReported(param);
        return this;
    }
    
    @Override
    public Practitioner getPerformerResource() {
        if (adaptedClass.getPerformer().getResource() instanceof ca.uhn.fhir.model.dstu2.resource.Practitioner) {
            return (ca.uhn.fhir.model.dstu2.resource.Practitioner) adaptedClass.getPerformer().getResource();
        } else {
            return null;
        }
    }
    
    @Override
    public IImmunization setPerformerResource(Practitioner param) {
        adaptedClass.getPerformer().setResource(param);
        return this;
    }
    
    @Override
    public Encounter getEncounterResource() {
        if (adaptedClass.getEncounter().getResource() instanceof ca.uhn.fhir.model.dstu2.resource.Encounter) {
            return (ca.uhn.fhir.model.dstu2.resource.Encounter) adaptedClass.getEncounter().getResource();
        } else {
            return null;
        }
    }
    
    @Override
    public IImmunization setEncounterResource(Encounter param) {
        adaptedClass.getEncounter().setResource(param);
        return this;
    }
    
    @Override
    public CodeableConceptDt getRoute() {
        return adaptedClass.getRoute();
    }
    
    @Override
    public IImmunization setRoute(CodeableConceptDt param) {
        adaptedClass.setRoute(param);
        return this;
    }
    
    @Override
    public Organization getManufacturerResource() {
        if (adaptedClass.getManufacturer().getResource() instanceof ca.uhn.fhir.model.dstu2.resource.Organization) {
            return (ca.uhn.fhir.model.dstu2.resource.Organization) adaptedClass.getManufacturer().getResource();
        } else {
            return null;
        }
    }
    
    @Override
    public IImmunization setManufacturerResource(Organization param) {
        adaptedClass.getManufacturer().setResource(param);
        return this;
    }
    
    @Override
    public IdDt getId() {
        return adaptedClass.getId();
    }
    
    @Override
    public IImmunization setId(IdDt param) {
        adaptedClass.setId(param);
        return this;
    }
    
    @Override
    public ContainedDt getContained() {
        return adaptedClass.getContained();
    }
    
    @Override
    public IImmunization setContained(ContainedDt param) {
        adaptedClass.setContained(param);
        return this;
    }
    
    @Override
    public List<AnnotationDt> getNote() {
        return adaptedClass.getNote();
    }
    
    @Override
    public IImmunization setNote(List<AnnotationDt> param) {
        adaptedClass.setNote(param);
        return this;
    }
    
    @Override
    public IImmunization addNote(AnnotationDt param) {
        adaptedClass.addNote(param);
        return this;
    }
    
    @Override
    public AnnotationDt addNote() {
        ca.uhn.fhir.model.dstu2.composite.AnnotationDt item = new ca.uhn.fhir.model.dstu2.composite.AnnotationDt();
        adaptedClass.addNote(item);
        return item;
    }
    
    @Override
    public AnnotationDt getNoteFirstRep() {
        return adaptedClass.getNoteFirstRep();
    }
    
    @Override
    public Practitioner getRequesterResource() {
        if (adaptedClass.getRequester().getResource() instanceof ca.uhn.fhir.model.dstu2.resource.Practitioner) {
            return (ca.uhn.fhir.model.dstu2.resource.Practitioner) adaptedClass.getRequester().getResource();
        } else {
            return null;
        }
    }
    
    @Override
    public IImmunization setRequesterResource(Practitioner param) {
        adaptedClass.getRequester().setResource(param);
        return this;
    }
    
    @Override
    public DateTimeDt getDateElement() {
        return adaptedClass.getDateElement();
    }
    
    @Override
    public Date getDate() {
        return adaptedClass.getDate();
    }
    
    @Override
    public IImmunization setDate(Date param) {
        adaptedClass.setDate(new ca.uhn.fhir.model.primitive.DateTimeDt(param));
        return this;
    }
    
    @Override
    public IImmunization setDate(DateTimeDt param) {
        adaptedClass.setDate(param);
        return this;
    }
    
    @Override
    public NarrativeDt getText() {
        return adaptedClass.getText();
    }
    
    @Override
    public IImmunization setText(NarrativeDt param) {
        adaptedClass.setText(param);
        return this;
    }
    
    @Override
    public Patient getPatientResource() {
        if (adaptedClass.getPatient().getResource() instanceof ca.uhn.fhir.model.dstu2.resource.Patient) {
            return (ca.uhn.fhir.model.dstu2.resource.Patient) adaptedClass.getPatient().getResource();
        } else {
            return null;
        }
    }
    
    @Override
    public IImmunization setPatientResource(Patient param) {
        adaptedClass.getPatient().setResource(param);
        return this;
    }
    
    @Override
    public Immunization.Explanation getExplanation() {
        return adaptedClass.getExplanation();
    }
    
    @Override
    public IImmunization setExplanation(Immunization.Explanation param) {
        adaptedClass.setExplanation(param);
        return this;
    }
    
    @Override
    public DateDt getExpirationDateElement() {
        return adaptedClass.getExpirationDateElement();
    }
    
    @Override
    public Date getExpirationDate() {
        return adaptedClass.getExpirationDate();
    }
    
    @Override
    public IImmunization setExpirationDate(Date param) {
        adaptedClass.setExpirationDate(new ca.uhn.fhir.model.primitive.DateDt(param));
        return this;
    }
    
    @Override
    public IImmunization setExpirationDate(DateDt param) {
        adaptedClass.setExpirationDate(param);
        return this;
    }
    
    @Override
    public String getStatus() {
        return adaptedClass.getStatus();
    }
    
    @Override
    public IImmunization setStatus(String param) {
        adaptedClass.setStatus(param);
        return this;
    }
    
    @Override
    public CodeDt getStatusElement() {
        return adaptedClass.getStatusElement();
    }
    
    @Override
    public IImmunization setStatus(CodeDt param) {
        adaptedClass.setStatus(param);
        return this;
    }
    
    @Override
    public CodeableConceptDt getVaccineCode() {
        return adaptedClass.getVaccineCode();
    }
    
    @Override
    public IImmunization setVaccineCode(CodeableConceptDt param) {
        adaptedClass.setVaccineCode(param);
        return this;
    }
    
    @Override
    public CodeDt getLanguage() {
        return adaptedClass.getLanguage();
    }
    
    @Override
    public IImmunization setLanguage(CodeDt param) {
        adaptedClass.setLanguage(param);
        return this;
    }
    
    @Override
    public CodeableConceptDt getSite() {
        return adaptedClass.getSite();
    }
    
    @Override
    public IImmunization setSite(CodeableConceptDt param) {
        adaptedClass.setSite(param);
        return this;
    }
    
    @Override
    public Location getLocationResource() {
        if (adaptedClass.getLocation().getResource() instanceof ca.uhn.fhir.model.dstu2.resource.Location) {
            return (ca.uhn.fhir.model.dstu2.resource.Location) adaptedClass.getLocation().getResource();
        } else {
            return null;
        }
    }
    
    @Override
    public IImmunization setLocationResource(Location param) {
        adaptedClass.getLocation().setResource(param);
        return this;
    }
}
