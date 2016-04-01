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

public interface IQICoreEncounter {
    
    
    public Encounter getAdaptee();
    
    public void setAdaptee(Encounter param);
    
    public Encounter.Hospitalization getHospitalization();
    
    public IQICoreEncounter setHospitalization(Encounter.Hospitalization param);
    
    public CodeableConceptDt getReasonCancelled();
    
    public IQICoreEncounter setReasonCancelled(CodeableConceptDt param);
    
    public CodeDt getLanguage();
    
    public IQICoreEncounter setLanguage(CodeDt param);
    
    public List<Encounter.Location> getLocation();
    
    public IQICoreEncounter setLocation(List<Encounter.Location> param);
    
    public IQICoreEncounter addLocation(Encounter.Location param);
    
    public Encounter.Location addLocation();
    
    public Encounter.Location getLocationFirstRep();
    
    public List<Encounter.StatusHistory> getStatusHistory();
    
    public IQICoreEncounter setStatusHistory(List<Encounter.StatusHistory> param);
    
    public IQICoreEncounter addStatusHistory(Encounter.StatusHistory param);
    
    public Encounter.StatusHistory addStatusHistory();
    
    public Encounter.StatusHistory getStatusHistoryFirstRep();
    
    public QICorePatientAdapter getPatientResource();
    
    public IQICoreEncounter setPatientResource(QICorePatientAdapter param);
    
    public List<Encounter.Participant> getParticipant();
    
    public IQICoreEncounter setParticipant(List<Encounter.Participant> param);
    
    public IQICoreEncounter addParticipant(Encounter.Participant param);
    
    public Encounter.Participant addParticipant();
    
    public Encounter.Participant getParticipantFirstRep();
    
    public CodeableConceptDt getPriority();
    
    public IQICoreEncounter setPriority(CodeableConceptDt param);
    
    public PeriodDt getPeriod();
    
    public IQICoreEncounter setPeriod(PeriodDt param);
    
    public List<IdentifierDt> getIdentifier();
    
    public IQICoreEncounter setIdentifier(List<IdentifierDt> param);
    
    public IQICoreEncounter addIdentifier(IdentifierDt param);
    
    public IdentifierDt addIdentifier();
    
    public IdentifierDt getIdentifierFirstRep();
    
    public QICoreEncounterAdapter getPartOfResource();
    
    public IQICoreEncounter setPartOfResource(QICoreEncounterAdapter param);
    
    public NarrativeDt getText();
    
    public IQICoreEncounter setText(NarrativeDt param);
    
    public IdDt getId();
    
    public IQICoreEncounter setId(IdDt param);
    
    public QICoreOrganizationAdapter getServiceProviderResource();
    
    public IQICoreEncounter setServiceProviderResource(QICoreOrganizationAdapter param);
    
    public ContainedDt getContained();
    
    public IQICoreEncounter setContained(ContainedDt param);
    
    public String getClassElement();
    
    public IQICoreEncounter setClassElement(String param);
    
    public IQICoreEncounter setClassElement(EncounterClassEnum param);
    
    public BoundCodeDt<EncounterClassEnum> getClassElementElement();
    
    public IQICoreEncounter setClassElement(BoundCodeDt<EncounterClassEnum> param);
    
    public List<QICoreEncounterRelatedCondition> getRelatedCondition();
    
    public IQICoreEncounter setRelatedCondition(List<QICoreEncounterRelatedCondition> param);
    
    public Appointment getAppointmentResource();
    
    public IQICoreEncounter setAppointmentResource(Appointment param);
    
    public DurationDt getLength();
    
    public IQICoreEncounter setLength(DurationDt param);
    
    public String getStatus();
    
    public IQICoreEncounter setStatus(String param);
    
    public IQICoreEncounter setStatus(EncounterStateEnum param);
    
    public BoundCodeDt<EncounterStateEnum> getStatusElement();
    
    public IQICoreEncounter setStatus(BoundCodeDt<EncounterStateEnum> param);
}
