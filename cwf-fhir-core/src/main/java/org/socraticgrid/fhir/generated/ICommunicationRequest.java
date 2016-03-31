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

import ca.uhn.fhir.model.dstu2.resource.CommunicationRequest;
import ca.uhn.fhir.model.api.ExtensionDt;
import java.util.List;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.IdentifierDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.Encounter;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.DateTimeDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import java.util.Date;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.PeriodDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.NarrativeDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.valueset.CommunicationRequestStatusEnum;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.BoundCodeDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.Patient;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.ContainedDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.CodeDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;

public interface ICommunicationRequest
{

   public CommunicationRequest getAdaptee();

   public void setAdaptee(CommunicationRequest param);

   public List<IdentifierDt> getIdentifier();

   public ICommunicationRequest setIdentifier(List<IdentifierDt> param);

   public ICommunicationRequest addIdentifier(IdentifierDt param);

   public IdentifierDt addIdentifier();

   public IdentifierDt getIdentifierFirstRep();

   public Encounter getEncounterResource();

   public ICommunicationRequest setEncounterResource(Encounter param);

   public IdDt getId();

   public ICommunicationRequest setId(IdDt param);

   public DateTimeDt getScheduledDateTimeElement();

   public Date getScheduledDateTime();

   public ICommunicationRequest setScheduledDateTime(DateTimeDt param);

   public ICommunicationRequest setScheduledDateTime(Date param);

   public PeriodDt getScheduledPeriod();

   public ICommunicationRequest setScheduledPeriod(PeriodDt param);

   public NarrativeDt getText();

   public ICommunicationRequest setText(NarrativeDt param);

   public String getStatus();

   public ICommunicationRequest setStatus(String param);

   public ICommunicationRequest setStatus(CommunicationRequestStatusEnum param);

   public BoundCodeDt<CommunicationRequestStatusEnum> getStatusElement();

   public ICommunicationRequest setStatus(
         BoundCodeDt<CommunicationRequestStatusEnum> param);

   public DateTimeDt getRequestedOnElement();

   public Date getRequestedOn();

   public ICommunicationRequest setRequestedOn(Date param);

   public ICommunicationRequest setRequestedOn(DateTimeDt param);

   public List<CommunicationRequest.Payload> getPayload();

   public ICommunicationRequest setPayload(
         List<CommunicationRequest.Payload> param);

   public ICommunicationRequest addPayload(CommunicationRequest.Payload param);

   public CommunicationRequest.Payload addPayload();

   public CommunicationRequest.Payload getPayloadFirstRep();

   public Patient getSubjectResource();

   public ICommunicationRequest setSubjectResource(Patient param);

   public CodeableConceptDt getPriority();

   public ICommunicationRequest setPriority(CodeableConceptDt param);

   public ContainedDt getContained();

   public ICommunicationRequest setContained(ContainedDt param);

   public CodeDt getLanguage();

   public ICommunicationRequest setLanguage(CodeDt param);

   public CodeableConceptDt getCategory();

   public ICommunicationRequest setCategory(CodeableConceptDt param);
}