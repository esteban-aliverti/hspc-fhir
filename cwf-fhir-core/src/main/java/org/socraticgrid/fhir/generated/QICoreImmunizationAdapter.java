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
import ca.uhn.fhir.model.dstu2.resource.Immunization;
import ca.uhn.fhir.model.primitive.BooleanDt;
import ca.uhn.fhir.model.primitive.CodeDt;
import ca.uhn.fhir.model.primitive.DateDt;
import ca.uhn.fhir.model.primitive.DateTimeDt;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.primitive.StringDt;

public class QICoreImmunizationAdapter implements IQICoreImmunization {
    
    
    private Immunization adaptedClass = null;
    
    public QICoreImmunizationAdapter() {
        this.adaptedClass = new ca.uhn.fhir.model.dstu2.resource.Immunization();
    }
    
    public QICoreImmunizationAdapter(Immunization adaptee) {
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
    public IQICoreImmunization setVaccinationProtocol(List<Immunization.VaccinationProtocol> param) {
        adaptedClass.setVaccinationProtocol(param);
        return this;
    }
    
    @Override
    public IQICoreImmunization addVaccinationProtocol(Immunization.VaccinationProtocol param) {
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
    public IQICoreImmunization setWasNotGiven(Boolean param) {
        adaptedClass.setWasNotGiven(new ca.uhn.fhir.model.primitive.BooleanDt(param));
        return this;
    }
    
    @Override
    public IQICoreImmunization setWasNotGiven(BooleanDt param) {
        adaptedClass.setWasNotGiven(param);
        return this;
    }
    
    @Override
    public SimpleQuantityDt getDoseQuantity() {
        return adaptedClass.getDoseQuantity();
    }
    
    @Override
    public IQICoreImmunization setDoseQuantity(SimpleQuantityDt param) {
        adaptedClass.setDoseQuantity(param);
        return this;
    }
    
    @Override
    public List<IdentifierDt> getIdentifier() {
        return adaptedClass.getIdentifier();
    }
    
    @Override
    public IQICoreImmunization setIdentifier(List<IdentifierDt> param) {
        adaptedClass.setIdentifier(param);
        return this;
    }
    
    @Override
    public IQICoreImmunization addIdentifier(IdentifierDt param) {
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
    public IQICoreImmunization setLotNumber(String param) {
        adaptedClass.setLotNumber(new ca.uhn.fhir.model.primitive.StringDt(param));
        return this;
    }
    
    @Override
    public IQICoreImmunization setLotNumber(StringDt param) {
        adaptedClass.setLotNumber(param);
        return this;
    }
    
    @Override
    public List<Immunization.Reaction> getReaction() {
        return adaptedClass.getReaction();
    }
    
    @Override
    public IQICoreImmunization setReaction(List<Immunization.Reaction> param) {
        adaptedClass.setReaction(param);
        return this;
    }
    
    @Override
    public IQICoreImmunization addReaction(Immunization.Reaction param) {
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
    public IQICoreImmunization setReported(Boolean param) {
        adaptedClass.setReported(new ca.uhn.fhir.model.primitive.BooleanDt(param));
        return this;
    }
    
    @Override
    public IQICoreImmunization setReported(BooleanDt param) {
        adaptedClass.setReported(param);
        return this;
    }
    
    @Override
    public QICorePractitionerAdapter getPerformerResource() {
        if (adaptedClass.getPerformer().getResource() instanceof ca.uhn.fhir.model.dstu2.resource.Practitioner) {
            org.socraticgrid.fhir.generated.QICorePractitionerAdapter profiledType = new org.socraticgrid.fhir.generated.QICorePractitionerAdapter();
            profiledType
                    .setAdaptee((ca.uhn.fhir.model.dstu2.resource.Practitioner) adaptedClass.getPerformer().getResource());
            return profiledType;
        } else {
            return null;
        }
    }
    
    @Override
    public IQICoreImmunization setPerformerResource(QICorePractitionerAdapter param) {
        adaptedClass.getPerformer().setResource(param.getAdaptee());
        return this;
    }
    
    @Override
    public QICoreEncounterAdapter getEncounterResource() {
        if (adaptedClass.getEncounter().getResource() instanceof ca.uhn.fhir.model.dstu2.resource.Encounter) {
            org.socraticgrid.fhir.generated.QICoreEncounterAdapter profiledType = new org.socraticgrid.fhir.generated.QICoreEncounterAdapter();
            profiledType.setAdaptee((ca.uhn.fhir.model.dstu2.resource.Encounter) adaptedClass.getEncounter().getResource());
            return profiledType;
        } else {
            return null;
        }
    }
    
    @Override
    public IQICoreImmunization setEncounterResource(QICoreEncounterAdapter param) {
        adaptedClass.getEncounter().setResource(param.getAdaptee());
        return this;
    }
    
    @Override
    public CodeableConceptDt getRoute() {
        return adaptedClass.getRoute();
    }
    
    @Override
    public IQICoreImmunization setRoute(CodeableConceptDt param) {
        adaptedClass.setRoute(param);
        return this;
    }
    
    @Override
    public QICoreOrganizationAdapter getManufacturerResource() {
        if (adaptedClass.getManufacturer().getResource() instanceof ca.uhn.fhir.model.dstu2.resource.Organization) {
            org.socraticgrid.fhir.generated.QICoreOrganizationAdapter profiledType = new org.socraticgrid.fhir.generated.QICoreOrganizationAdapter();
            profiledType.setAdaptee(
                (ca.uhn.fhir.model.dstu2.resource.Organization) adaptedClass.getManufacturer().getResource());
            return profiledType;
        } else {
            return null;
        }
    }
    
    @Override
    public IQICoreImmunization setManufacturerResource(QICoreOrganizationAdapter param) {
        adaptedClass.getManufacturer().setResource(param.getAdaptee());
        return this;
    }
    
    @Override
    public IdDt getId() {
        return adaptedClass.getId();
    }
    
    @Override
    public IQICoreImmunization setId(IdDt param) {
        adaptedClass.setId(param);
        return this;
    }
    
    @Override
    public ContainedDt getContained() {
        return adaptedClass.getContained();
    }
    
    @Override
    public IQICoreImmunization setContained(ContainedDt param) {
        adaptedClass.setContained(param);
        return this;
    }
    
    @Override
    public List<AnnotationDt> getNote() {
        return adaptedClass.getNote();
    }
    
    @Override
    public IQICoreImmunization setNote(List<AnnotationDt> param) {
        adaptedClass.setNote(param);
        return this;
    }
    
    @Override
    public IQICoreImmunization addNote(AnnotationDt param) {
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
    public QICorePractitionerAdapter getRequesterResource() {
        if (adaptedClass.getRequester().getResource() instanceof ca.uhn.fhir.model.dstu2.resource.Practitioner) {
            org.socraticgrid.fhir.generated.QICorePractitionerAdapter profiledType = new org.socraticgrid.fhir.generated.QICorePractitionerAdapter();
            profiledType
                    .setAdaptee((ca.uhn.fhir.model.dstu2.resource.Practitioner) adaptedClass.getRequester().getResource());
            return profiledType;
        } else {
            return null;
        }
    }
    
    @Override
    public IQICoreImmunization setRequesterResource(QICorePractitionerAdapter param) {
        adaptedClass.getRequester().setResource(param.getAdaptee());
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
    public IQICoreImmunization setDate(Date param) {
        adaptedClass.setDate(new ca.uhn.fhir.model.primitive.DateTimeDt(param));
        return this;
    }
    
    @Override
    public IQICoreImmunization setDate(DateTimeDt param) {
        adaptedClass.setDate(param);
        return this;
    }
    
    @Override
    public NarrativeDt getText() {
        return adaptedClass.getText();
    }
    
    @Override
    public IQICoreImmunization setText(NarrativeDt param) {
        adaptedClass.setText(param);
        return this;
    }
    
    @Override
    public QICorePatientAdapter getPatientResource() {
        if (adaptedClass.getPatient().getResource() instanceof ca.uhn.fhir.model.dstu2.resource.Patient) {
            org.socraticgrid.fhir.generated.QICorePatientAdapter profiledType = new org.socraticgrid.fhir.generated.QICorePatientAdapter();
            profiledType.setAdaptee((ca.uhn.fhir.model.dstu2.resource.Patient) adaptedClass.getPatient().getResource());
            return profiledType;
        } else {
            return null;
        }
    }
    
    @Override
    public IQICoreImmunization setPatientResource(QICorePatientAdapter param) {
        adaptedClass.getPatient().setResource(param.getAdaptee());
        return this;
    }
    
    @Override
    public Immunization.Explanation getExplanation() {
        return adaptedClass.getExplanation();
    }
    
    @Override
    public IQICoreImmunization setExplanation(Immunization.Explanation param) {
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
    public IQICoreImmunization setExpirationDate(Date param) {
        adaptedClass.setExpirationDate(new ca.uhn.fhir.model.primitive.DateDt(param));
        return this;
    }
    
    @Override
    public IQICoreImmunization setExpirationDate(DateDt param) {
        adaptedClass.setExpirationDate(param);
        return this;
    }
    
    @Override
    public String getStatus() {
        return adaptedClass.getStatus();
    }
    
    @Override
    public IQICoreImmunization setStatus(String param) {
        adaptedClass.setStatus(param);
        return this;
    }
    
    @Override
    public CodeDt getStatusElement() {
        return adaptedClass.getStatusElement();
    }
    
    @Override
    public IQICoreImmunization setStatus(CodeDt param) {
        adaptedClass.setStatus(param);
        return this;
    }
    
    @Override
    public CodeableConceptDt getVaccineCode() {
        return adaptedClass.getVaccineCode();
    }
    
    @Override
    public IQICoreImmunization setVaccineCode(CodeableConceptDt param) {
        adaptedClass.setVaccineCode(param);
        return this;
    }
    
    @Override
    public CodeDt getLanguage() {
        return adaptedClass.getLanguage();
    }
    
    @Override
    public IQICoreImmunization setLanguage(CodeDt param) {
        adaptedClass.setLanguage(param);
        return this;
    }
    
    @Override
    public CodeableConceptDt getSite() {
        return adaptedClass.getSite();
    }
    
    @Override
    public IQICoreImmunization setSite(CodeableConceptDt param) {
        adaptedClass.setSite(param);
        return this;
    }
    
    @Override
    public QICoreLocationAdapter getLocationResource() {
        if (adaptedClass.getLocation().getResource() instanceof ca.uhn.fhir.model.dstu2.resource.Location) {
            org.socraticgrid.fhir.generated.QICoreLocationAdapter profiledType = new org.socraticgrid.fhir.generated.QICoreLocationAdapter();
            profiledType.setAdaptee((ca.uhn.fhir.model.dstu2.resource.Location) adaptedClass.getLocation().getResource());
            return profiledType;
        } else {
            return null;
        }
    }
    
    @Override
    public IQICoreImmunization setLocationResource(QICoreLocationAdapter param) {
        adaptedClass.getLocation().setResource(param.getAdaptee());
        return this;
    }
}
