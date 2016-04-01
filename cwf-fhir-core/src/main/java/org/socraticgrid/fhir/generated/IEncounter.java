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

public interface IEncounter {
    
    
    public Encounter getAdaptee();
    
    public void setAdaptee(Encounter param);
    
    public Encounter.Hospitalization getHospitalization();
    
    public IEncounter setHospitalization(Encounter.Hospitalization param);
    
    public CodeDt getLanguage();
    
    public IEncounter setLanguage(CodeDt param);
    
    public List<Encounter.Location> getLocation();
    
    public IEncounter setLocation(List<Encounter.Location> param);
    
    public IEncounter addLocation(Encounter.Location param);
    
    public Encounter.Location addLocation();
    
    public Encounter.Location getLocationFirstRep();
    
    public Encounter getPartOfResource();
    
    public IEncounter setPartOfResource(Encounter param);
    
    public List<Encounter.StatusHistory> getStatusHistory();
    
    public IEncounter setStatusHistory(List<Encounter.StatusHistory> param);
    
    public IEncounter addStatusHistory(Encounter.StatusHistory param);
    
    public Encounter.StatusHistory addStatusHistory();
    
    public Encounter.StatusHistory getStatusHistoryFirstRep();
    
    public NarrativeDt getText();
    
    public IEncounter setText(NarrativeDt param);
    
    public List<Encounter.Participant> getParticipant();
    
    public IEncounter setParticipant(List<Encounter.Participant> param);
    
    public IEncounter addParticipant(Encounter.Participant param);
    
    public Encounter.Participant addParticipant();
    
    public Encounter.Participant getParticipantFirstRep();
    
    public IdDt getId();
    
    public IEncounter setId(IdDt param);
    
    public Organization getServiceProviderResource();
    
    public IEncounter setServiceProviderResource(Organization param);
    
    public Patient getPatientResource();
    
    public IEncounter setPatientResource(Patient param);
    
    public ContainedDt getContained();
    
    public IEncounter setContained(ContainedDt param);
    
    public String getClassElement();
    
    public IEncounter setClassElement(String param);
    
    public IEncounter setClassElement(EncounterClassEnum param);
    
    public BoundCodeDt<EncounterClassEnum> getClassElementElement();
    
    public IEncounter setClassElement(BoundCodeDt<EncounterClassEnum> param);
    
    public Appointment getAppointmentResource();
    
    public IEncounter setAppointmentResource(Appointment param);
    
    public CodeableConceptDt getPriority();
    
    public IEncounter setPriority(CodeableConceptDt param);
    
    public PeriodDt getPeriod();
    
    public IEncounter setPeriod(PeriodDt param);
    
    public DurationDt getLength();
    
    public IEncounter setLength(DurationDt param);
    
    public List<IdentifierDt> getIdentifier();
    
    public IEncounter setIdentifier(List<IdentifierDt> param);
    
    public IEncounter addIdentifier(IdentifierDt param);
    
    public IdentifierDt addIdentifier();
    
    public IdentifierDt getIdentifierFirstRep();
    
    public String getStatus();
    
    public IEncounter setStatus(String param);
    
    public IEncounter setStatus(EncounterStateEnum param);
    
    public BoundCodeDt<EncounterStateEnum> getStatusElement();
    
    public IEncounter setStatus(BoundCodeDt<EncounterStateEnum> param);
}
