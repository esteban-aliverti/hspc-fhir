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

import ca.uhn.fhir.model.dstu2.resource.ReferralRequest;
import ca.uhn.fhir.model.api.ExtensionDt;
import java.util.List;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.ContainedDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.PeriodDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
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
import ca.uhn.fhir.model.dstu2.composite.NarrativeDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.CodeDt;
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
import ca.uhn.fhir.model.primitive.StringDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.valueset.ReferralStatusEnum;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.BoundCodeDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.IdentifierDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;

public interface IQICoreReferralRequest
{

   public ReferralRequest getAdaptee();

   public void setAdaptee(ReferralRequest param);

   public ContainedDt getContained();

   public IQICoreReferralRequest setContained(ContainedDt param);

   public QICoreEncounterAdapter getEncounterResource();

   public IQICoreReferralRequest setEncounterResource(
         QICoreEncounterAdapter param);

   public PeriodDt getFulfillmentTime();

   public IQICoreReferralRequest setFulfillmentTime(PeriodDt param);

   public IdDt getId();

   public IQICoreReferralRequest setId(IdDt param);

   public CodeableConceptDt getType();

   public IQICoreReferralRequest setType(CodeableConceptDt param);

   public CodeableConceptDt getReasonRefused();

   public IQICoreReferralRequest setReasonRefused(CodeableConceptDt param);

   public DateTimeDt getDateSentElement();

   public Date getDateSent();

   public IQICoreReferralRequest setDateSent(Date param);

   public IQICoreReferralRequest setDateSent(DateTimeDt param);

   public CodeableConceptDt getPriority();

   public IQICoreReferralRequest setPriority(CodeableConceptDt param);

   public NarrativeDt getText();

   public IQICoreReferralRequest setText(NarrativeDt param);

   public CodeDt getLanguage();

   public IQICoreReferralRequest setLanguage(CodeDt param);

   public DateTimeDt getDateElement();

   public Date getDate();

   public IQICoreReferralRequest setDate(Date param);

   public IQICoreReferralRequest setDate(DateTimeDt param);

   public CodeableConceptDt getReason();

   public IQICoreReferralRequest setReason(CodeableConceptDt param);

   public CodeableConceptDt getSpecialty();

   public IQICoreReferralRequest setSpecialty(CodeableConceptDt param);

   public StringDt getDescriptionElement();

   public String getDescription();

   public IQICoreReferralRequest setDescription(String param);

   public IQICoreReferralRequest setDescription(StringDt param);

   public String getStatus();

   public IQICoreReferralRequest setStatus(String param);

   public IQICoreReferralRequest setStatus(ReferralStatusEnum param);

   public BoundCodeDt<ReferralStatusEnum> getStatusElement();

   public IQICoreReferralRequest setStatus(
         BoundCodeDt<ReferralStatusEnum> param);

   public QICorePatientAdapter getPatientResource();

   public IQICoreReferralRequest setPatientResource(QICorePatientAdapter param);

   public List<IdentifierDt> getIdentifier();

   public IQICoreReferralRequest setIdentifier(List<IdentifierDt> param);

   public IQICoreReferralRequest addIdentifier(IdentifierDt param);

   public IdentifierDt addIdentifier();

   public IdentifierDt getIdentifierFirstRep();
}