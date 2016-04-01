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
import ca.uhn.fhir.model.dstu2.resource.Organization;
import ca.uhn.fhir.model.dstu2.resource.Patient;
import ca.uhn.fhir.model.dstu2.valueset.EncounterClassEnum;
import ca.uhn.fhir.model.dstu2.valueset.EncounterStateEnum;
import ca.uhn.fhir.model.primitive.BoundCodeDt;
import ca.uhn.fhir.model.primitive.CodeDt;
import ca.uhn.fhir.model.primitive.IdDt;

public class EncounterAdapter implements IEncounter {
    
    
    private Encounter adaptedClass = null;
    
    public EncounterAdapter() {
        this.adaptedClass = new ca.uhn.fhir.model.dstu2.resource.Encounter();
    }
    
    public EncounterAdapter(Encounter adaptee) {
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
    public IEncounter setHospitalization(Encounter.Hospitalization param) {
        adaptedClass.setHospitalization(param);
        return this;
    }
    
    @Override
    public CodeDt getLanguage() {
        return adaptedClass.getLanguage();
    }
    
    @Override
    public IEncounter setLanguage(CodeDt param) {
        adaptedClass.setLanguage(param);
        return this;
    }
    
    @Override
    public List<Encounter.Location> getLocation() {
        return adaptedClass.getLocation();
    }
    
    @Override
    public IEncounter setLocation(List<Encounter.Location> param) {
        adaptedClass.setLocation(param);
        return this;
    }
    
    @Override
    public IEncounter addLocation(Encounter.Location param) {
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
    public Encounter getPartOfResource() {
        if (adaptedClass.getPartOf().getResource() instanceof ca.uhn.fhir.model.dstu2.resource.Encounter) {
            return (ca.uhn.fhir.model.dstu2.resource.Encounter) adaptedClass.getPartOf().getResource();
        } else {
            return null;
        }
    }
    
    @Override
    public IEncounter setPartOfResource(Encounter param) {
        adaptedClass.getPartOf().setResource(param);
        return this;
    }
    
    @Override
    public List<Encounter.StatusHistory> getStatusHistory() {
        return adaptedClass.getStatusHistory();
    }
    
    @Override
    public IEncounter setStatusHistory(List<Encounter.StatusHistory> param) {
        adaptedClass.setStatusHistory(param);
        return this;
    }
    
    @Override
    public IEncounter addStatusHistory(Encounter.StatusHistory param) {
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
    public NarrativeDt getText() {
        return adaptedClass.getText();
    }
    
    @Override
    public IEncounter setText(NarrativeDt param) {
        adaptedClass.setText(param);
        return this;
    }
    
    @Override
    public List<Encounter.Participant> getParticipant() {
        return adaptedClass.getParticipant();
    }
    
    @Override
    public IEncounter setParticipant(List<Encounter.Participant> param) {
        adaptedClass.setParticipant(param);
        return this;
    }
    
    @Override
    public IEncounter addParticipant(Encounter.Participant param) {
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
    public IdDt getId() {
        return adaptedClass.getId();
    }
    
    @Override
    public IEncounter setId(IdDt param) {
        adaptedClass.setId(param);
        return this;
    }
    
    @Override
    public Organization getServiceProviderResource() {
        if (adaptedClass.getServiceProvider().getResource() instanceof ca.uhn.fhir.model.dstu2.resource.Organization) {
            return (ca.uhn.fhir.model.dstu2.resource.Organization) adaptedClass.getServiceProvider().getResource();
        } else {
            return null;
        }
    }
    
    @Override
    public IEncounter setServiceProviderResource(Organization param) {
        adaptedClass.getServiceProvider().setResource(param);
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
    public IEncounter setPatientResource(Patient param) {
        adaptedClass.getPatient().setResource(param);
        return this;
    }
    
    @Override
    public ContainedDt getContained() {
        return adaptedClass.getContained();
    }
    
    @Override
    public IEncounter setContained(ContainedDt param) {
        adaptedClass.setContained(param);
        return this;
    }
    
    @Override
    public String getClassElement() {
        return adaptedClass.getClassElement();
    }
    
    @Override
    public IEncounter setClassElement(String param) {
        adaptedClass.setClassElement(ca.uhn.fhir.model.dstu2.valueset.EncounterClassEnum.valueOf(param));
        return this;
    }
    
    @Override
    public IEncounter setClassElement(EncounterClassEnum param) {
        adaptedClass.setClassElement(param);
        return this;
    }
    
    @Override
    public BoundCodeDt<EncounterClassEnum> getClassElementElement() {
        return adaptedClass.getClassElementElement();
    }
    
    @Override
    public IEncounter setClassElement(BoundCodeDt<EncounterClassEnum> param) {
        adaptedClass.setClassElement(param);
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
    public IEncounter setAppointmentResource(Appointment param) {
        adaptedClass.getAppointment().setResource(param);
        return this;
    }
    
    @Override
    public CodeableConceptDt getPriority() {
        return adaptedClass.getPriority();
    }
    
    public IEncounter setPriority(CodeableConceptDt param) {
        adaptedClass.setPriority(param);
        return this;
    }
    
    @Override
    public PeriodDt getPeriod() {
        return adaptedClass.getPeriod();
    }
    
    @Override
    public IEncounter setPeriod(PeriodDt param) {
        adaptedClass.setPeriod(param);
        return this;
    }
    
    @Override
    public DurationDt getLength() {
        return adaptedClass.getLength();
    }
    
    @Override
    public IEncounter setLength(DurationDt param) {
        adaptedClass.setLength(param);
        return this;
    }
    
    @Override
    public List<IdentifierDt> getIdentifier() {
        return adaptedClass.getIdentifier();
    }
    
    @Override
    public IEncounter setIdentifier(List<IdentifierDt> param) {
        adaptedClass.setIdentifier(param);
        return this;
    }
    
    @Override
    public IEncounter addIdentifier(IdentifierDt param) {
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
    public String getStatus() {
        return adaptedClass.getStatus();
    }
    
    @Override
    public IEncounter setStatus(String param) {
        adaptedClass.setStatus(ca.uhn.fhir.model.dstu2.valueset.EncounterStateEnum.valueOf(param));
        return this;
    }
    
    @Override
    public IEncounter setStatus(EncounterStateEnum param) {
        adaptedClass.setStatus(param);
        return this;
    }
    
    @Override
    public BoundCodeDt<EncounterStateEnum> getStatusElement() {
        return adaptedClass.getStatusElement();
    }
    
    @Override
    public IEncounter setStatus(BoundCodeDt<EncounterStateEnum> param) {
        adaptedClass.setStatus(param);
        return this;
    }
}
