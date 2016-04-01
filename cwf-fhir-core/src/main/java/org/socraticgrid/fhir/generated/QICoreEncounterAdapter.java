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

import java.util.List;

import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.dstu2.composite.ContainedDt;
import ca.uhn.fhir.model.dstu2.composite.DurationDt;
import ca.uhn.fhir.model.dstu2.composite.IdentifierDt;
import ca.uhn.fhir.model.dstu2.composite.NarrativeDt;
import ca.uhn.fhir.model.dstu2.composite.PeriodDt;
import ca.uhn.fhir.model.dstu2.resource.Appointment;
import ca.uhn.fhir.model.dstu2.resource.Encounter;
import ca.uhn.fhir.model.dstu2.valueset.EncounterClassEnum;
import ca.uhn.fhir.model.dstu2.valueset.EncounterStateEnum;
import ca.uhn.fhir.model.primitive.BoundCodeDt;
import ca.uhn.fhir.model.primitive.CodeDt;
import ca.uhn.fhir.model.primitive.IdDt;

public class QICoreEncounterAdapter implements IQICoreEncounter {
    
    
    private Encounter adaptedClass = null;
    
    public QICoreEncounterAdapter() {
        this.adaptedClass = new ca.uhn.fhir.model.dstu2.resource.Encounter();
    }
    
    public QICoreEncounterAdapter(Encounter adaptee) {
        this.adaptedClass = adaptee;
    }
    
    @Override
    public Encounter getAdaptee() {
        return adaptedClass;
    }
    
    @Override
    public void setAdaptee(Encounter param) {
        this.adaptedClass = param;
    }
    
    @Override
    public Encounter.Hospitalization getHospitalization() {
        return adaptedClass.getHospitalization();
    }
    
    @Override
    public IQICoreEncounter setHospitalization(Encounter.Hospitalization param) {
        adaptedClass.setHospitalization(param);
        return this;
    }
    
    @Override
    public CodeableConceptDt getReasonCancelled() {
        List<ca.uhn.fhir.model.api.ExtensionDt> extensions = adaptedClass
                .getUndeclaredExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/encounter-reasonCancelled");
        if (extensions == null || extensions.size() <= 0) {
            return null;
        } else if (extensions.size() == 1) {
            return (ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt) extensions.get(0).getValue();
        } else {
            throw new RuntimeException("More than one extension exists for reasonCancelled");
        }
    }
    
    @Override
    public IQICoreEncounter setReasonCancelled(CodeableConceptDt param) {
        adaptedClass.addUndeclaredExtension(false, "http://hl7.org/fhir/StructureDefinition/encounter-reasonCancelled",
            param);
        return this;
    }
    
    @Override
    public CodeDt getLanguage() {
        return adaptedClass.getLanguage();
    }
    
    @Override
    public IQICoreEncounter setLanguage(CodeDt param) {
        adaptedClass.setLanguage(param);
        return this;
    }
    
    @Override
    public List<Encounter.Location> getLocation() {
        return adaptedClass.getLocation();
    }
    
    @Override
    public IQICoreEncounter setLocation(List<Encounter.Location> param) {
        adaptedClass.setLocation(param);
        return this;
    }
    
    @Override
    public IQICoreEncounter addLocation(Encounter.Location param) {
        adaptedClass.addLocation(param);
        return this;
    }
    
    @Override
    public Encounter.Location addLocation() {
        ca.uhn.fhir.model.dstu2.resource.Encounter.Location item = new ca.uhn.fhir.model.dstu2.resource.Encounter.Location();
        adaptedClass.addLocation(item);
        return item;
    }
    
    @Override
    public Encounter.Location getLocationFirstRep() {
        return adaptedClass.getLocationFirstRep();
    }
    
    @Override
    public List<Encounter.StatusHistory> getStatusHistory() {
        return adaptedClass.getStatusHistory();
    }
    
    @Override
    public IQICoreEncounter setStatusHistory(List<Encounter.StatusHistory> param) {
        adaptedClass.setStatusHistory(param);
        return this;
    }
    
    @Override
    public IQICoreEncounter addStatusHistory(Encounter.StatusHistory param) {
        adaptedClass.addStatusHistory(param);
        return this;
    }
    
    @Override
    public Encounter.StatusHistory addStatusHistory() {
        ca.uhn.fhir.model.dstu2.resource.Encounter.StatusHistory item = new ca.uhn.fhir.model.dstu2.resource.Encounter.StatusHistory();
        adaptedClass.addStatusHistory(item);
        return item;
    }
    
    @Override
    public Encounter.StatusHistory getStatusHistoryFirstRep() {
        return adaptedClass.getStatusHistoryFirstRep();
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
    public IQICoreEncounter setPatientResource(QICorePatientAdapter param) {
        adaptedClass.getPatient().setResource(param.getAdaptee());
        return this;
    }
    
    @Override
    public List<Encounter.Participant> getParticipant() {
        return adaptedClass.getParticipant();
    }
    
    @Override
    public IQICoreEncounter setParticipant(List<Encounter.Participant> param) {
        adaptedClass.setParticipant(param);
        return this;
    }
    
    @Override
    public IQICoreEncounter addParticipant(Encounter.Participant param) {
        adaptedClass.addParticipant(param);
        return this;
    }
    
    @Override
    public Encounter.Participant addParticipant() {
        ca.uhn.fhir.model.dstu2.resource.Encounter.Participant item = new ca.uhn.fhir.model.dstu2.resource.Encounter.Participant();
        adaptedClass.addParticipant(item);
        return item;
    }
    
    @Override
    public Encounter.Participant getParticipantFirstRep() {
        return adaptedClass.getParticipantFirstRep();
    }
    
    @Override
    public CodeableConceptDt getPriority() {
        return adaptedClass.getPriority();
    }
    
    @Override
    public IQICoreEncounter setPriority(CodeableConceptDt param) {
        adaptedClass.setPriority(param);
        return this;
    }
    
    @Override
    public PeriodDt getPeriod() {
        return adaptedClass.getPeriod();
    }
    
    @Override
    public IQICoreEncounter setPeriod(PeriodDt param) {
        adaptedClass.setPeriod(param);
        return this;
    }
    
    @Override
    public List<IdentifierDt> getIdentifier() {
        return adaptedClass.getIdentifier();
    }
    
    @Override
    public IQICoreEncounter setIdentifier(List<IdentifierDt> param) {
        adaptedClass.setIdentifier(param);
        return this;
    }
    
    @Override
    public IQICoreEncounter addIdentifier(IdentifierDt param) {
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
    public QICoreEncounterAdapter getPartOfResource() {
        if (adaptedClass.getPartOf().getResource() instanceof ca.uhn.fhir.model.dstu2.resource.Encounter) {
            org.socraticgrid.fhir.generated.QICoreEncounterAdapter profiledType = new org.socraticgrid.fhir.generated.QICoreEncounterAdapter();
            profiledType.setAdaptee((ca.uhn.fhir.model.dstu2.resource.Encounter) adaptedClass.getPartOf().getResource());
            return profiledType;
        } else {
            return null;
        }
    }
    
    @Override
    public IQICoreEncounter setPartOfResource(QICoreEncounterAdapter param) {
        adaptedClass.getPartOf().setResource(param.getAdaptee());
        return this;
    }
    
    @Override
    public NarrativeDt getText() {
        return adaptedClass.getText();
    }
    
    @Override
    public IQICoreEncounter setText(NarrativeDt param) {
        adaptedClass.setText(param);
        return this;
    }
    
    @Override
    public IdDt getId() {
        return adaptedClass.getId();
    }
    
    @Override
    public IQICoreEncounter setId(IdDt param) {
        adaptedClass.setId(param);
        return this;
    }
    
    @Override
    public QICoreOrganizationAdapter getServiceProviderResource() {
        if (adaptedClass.getServiceProvider().getResource() instanceof ca.uhn.fhir.model.dstu2.resource.Organization) {
            org.socraticgrid.fhir.generated.QICoreOrganizationAdapter profiledType = new org.socraticgrid.fhir.generated.QICoreOrganizationAdapter();
            profiledType.setAdaptee(
                (ca.uhn.fhir.model.dstu2.resource.Organization) adaptedClass.getServiceProvider().getResource());
            return profiledType;
        } else {
            return null;
        }
    }
    
    @Override
    public IQICoreEncounter setServiceProviderResource(QICoreOrganizationAdapter param) {
        adaptedClass.getServiceProvider().setResource(param.getAdaptee());
        return this;
    }
    
    @Override
    public ContainedDt getContained() {
        return adaptedClass.getContained();
    }
    
    @Override
    public IQICoreEncounter setContained(ContainedDt param) {
        adaptedClass.setContained(param);
        return this;
    }
    
    @Override
    public String getClassElement() {
        return adaptedClass.getClassElement();
    }
    
    @Override
    public IQICoreEncounter setClassElement(String param) {
        adaptedClass.setClassElement(ca.uhn.fhir.model.dstu2.valueset.EncounterClassEnum.valueOf(param));
        return this;
    }
    
    @Override
    public IQICoreEncounter setClassElement(EncounterClassEnum param) {
        adaptedClass.setClassElement(param);
        return this;
    }
    
    @Override
    public BoundCodeDt<EncounterClassEnum> getClassElementElement() {
        return adaptedClass.getClassElementElement();
    }
    
    @Override
    public IQICoreEncounter setClassElement(BoundCodeDt<EncounterClassEnum> param) {
        adaptedClass.setClassElement(param);
        return this;
    }
    
    @Override
    public List<QICoreEncounterRelatedCondition> getRelatedCondition() {
        List<ca.uhn.fhir.model.api.ExtensionDt> extensions = adaptedClass
                .getUndeclaredExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/encounter-relatedCondition");
        List<org.socraticgrid.fhir.generated.QICoreEncounterRelatedCondition> returnList = new java.util.ArrayList<>();
        for (ca.uhn.fhir.model.api.ExtensionDt extension : extensions) {
            org.socraticgrid.fhir.generated.QICoreEncounterRelatedCondition udt = new org.socraticgrid.fhir.generated.QICoreEncounterRelatedCondition();
            udt.setRootObjectExtension(extension);
            returnList.add(udt);
        }
        return returnList;
    }
    
    @Override
    public IQICoreEncounter setRelatedCondition(List<QICoreEncounterRelatedCondition> param) {
        if (param != null && param.size() > 0) {
            for (int index = 0; index < param.size(); index++) {
                adaptedClass.addUndeclaredExtension(param.get(index).getRootObjectExtension());
            }
        }
        return this;
    }
    
    @Override
    public Appointment getAppointmentResource() {
        if (adaptedClass.getAppointment().getResource() instanceof ca.uhn.fhir.model.dstu2.resource.Appointment) {
            return (ca.uhn.fhir.model.dstu2.resource.Appointment) adaptedClass.getAppointment().getResource();
        } else {
            return null;
        }
    }
    
    @Override
    public IQICoreEncounter setAppointmentResource(Appointment param) {
        adaptedClass.getAppointment().setResource(param);
        return this;
    }
    
    @Override
    public DurationDt getLength() {
        return adaptedClass.getLength();
    }
    
    @Override
    public IQICoreEncounter setLength(DurationDt param) {
        adaptedClass.setLength(param);
        return this;
    }
    
    @Override
    public String getStatus() {
        return adaptedClass.getStatus();
    }
    
    @Override
    public IQICoreEncounter setStatus(String param) {
        adaptedClass.setStatus(ca.uhn.fhir.model.dstu2.valueset.EncounterStateEnum.valueOf(param));
        return this;
    }
    
    @Override
    public IQICoreEncounter setStatus(EncounterStateEnum param) {
        adaptedClass.setStatus(param);
        return this;
    }
    
    @Override
    public BoundCodeDt<EncounterStateEnum> getStatusElement() {
        return adaptedClass.getStatusElement();
    }
    
    @Override
    public IQICoreEncounter setStatus(BoundCodeDt<EncounterStateEnum> param) {
        adaptedClass.setStatus(param);
        return this;
    }
}
