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

import ca.uhn.fhir.model.dstu2.resource.ProcedureRequest;
import ca.uhn.fhir.model.api.ExtensionDt;
import java.util.List;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.AnnotationDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.ContainedDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.valueset.ProcedureRequestPriorityEnum;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.BoundCodeDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.valueset.ProcedureRequestStatusEnum;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.NarrativeDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.BooleanDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.DecimalDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.IdentifierDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.DateTimeDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import java.util.Date;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.PeriodDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.TimingDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.CodeDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;

public interface IQICoreProcedureRequest
{

   public ProcedureRequest getAdaptee();

   public void setAdaptee(ProcedureRequest param);

   public List<AnnotationDt> getNotes();

   public IQICoreProcedureRequest setNotes(List<AnnotationDt> param);

   public IQICoreProcedureRequest addNotes(AnnotationDt param);

   public AnnotationDt addNotes();

   public AnnotationDt getNotesFirstRep();

   public ContainedDt getContained();

   public IQICoreProcedureRequest setContained(ContainedDt param);

   public String getPriority();

   public IQICoreProcedureRequest setPriority(String param);

   public IQICoreProcedureRequest setPriority(
         ProcedureRequestPriorityEnum param);

   public BoundCodeDt<ProcedureRequestPriorityEnum> getPriorityElement();

   public IQICoreProcedureRequest setPriority(
         BoundCodeDt<ProcedureRequestPriorityEnum> param);

   public CodeableConceptDt getCode();

   public IQICoreProcedureRequest setCode(CodeableConceptDt param);

   public String getStatus();

   public IQICoreProcedureRequest setStatus(String param);

   public IQICoreProcedureRequest setStatus(ProcedureRequestStatusEnum param);

   public BoundCodeDt<ProcedureRequestStatusEnum> getStatusElement();

   public IQICoreProcedureRequest setStatus(
         BoundCodeDt<ProcedureRequestStatusEnum> param);

   public CodeableConceptDt getReasonRefused();

   public IQICoreProcedureRequest setReasonRefused(CodeableConceptDt param);

   public NarrativeDt getText();

   public IQICoreProcedureRequest setText(NarrativeDt param);

   public BooleanDt getAsNeededBooleanElement();

   public Boolean getAsNeededBoolean();

   public IQICoreProcedureRequest setAsNeededBoolean(BooleanDt param);

   public IQICoreProcedureRequest setAsNeededBoolean(Boolean param);

   public CodeableConceptDt getAsNeededCodeableConcept();

   public IQICoreProcedureRequest setAsNeededCodeableConcept(
         CodeableConceptDt param);

   public CodeableConceptDt getReasonCodeableConcept();

   public IQICoreProcedureRequest setReasonCodeableConcept(
         CodeableConceptDt param);

   public ResourceReferenceDt getReasonReference();

   public IQICoreProcedureRequest setReasonReference(ResourceReferenceDt param);

   public List<ResourceReferenceDt> getApproachBodySite();

   public IQICoreProcedureRequest setApproachBodySite(
         List<ResourceReferenceDt> param);

   public DecimalDt getAppropriatenessScore();

   public IQICoreProcedureRequest setAppropriatenessScore(DecimalDt param);

   public List<IdentifierDt> getIdentifier();

   public IQICoreProcedureRequest setIdentifier(List<IdentifierDt> param);

   public IQICoreProcedureRequest addIdentifier(IdentifierDt param);

   public IdentifierDt addIdentifier();

   public IdentifierDt getIdentifierFirstRep();

   public DateTimeDt getOrderedOnElement();

   public Date getOrderedOn();

   public IQICoreProcedureRequest setOrderedOn(Date param);

   public IQICoreProcedureRequest setOrderedOn(DateTimeDt param);

   public QICoreEncounterAdapter getEncounterResource();

   public IQICoreProcedureRequest setEncounterResource(
         QICoreEncounterAdapter param);

   public IdDt getId();

   public IQICoreProcedureRequest setId(IdDt param);

   public DateTimeDt getScheduledDateTimeElement();

   public Date getScheduledDateTime();

   public IQICoreProcedureRequest setScheduledDateTime(DateTimeDt param);

   public IQICoreProcedureRequest setScheduledDateTime(Date param);

   public PeriodDt getScheduledPeriod();

   public IQICoreProcedureRequest setScheduledPeriod(PeriodDt param);

   public TimingDt getScheduledTiming();

   public IQICoreProcedureRequest setScheduledTiming(TimingDt param);

   public CodeDt getLanguage();

   public IQICoreProcedureRequest setLanguage(CodeDt param);
}