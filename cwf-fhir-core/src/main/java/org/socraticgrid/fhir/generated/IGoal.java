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

import ca.uhn.fhir.model.dstu2.resource.Goal;
import ca.uhn.fhir.model.api.ExtensionDt;
import java.util.List;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.ContainedDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.DateDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import java.util.Date;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.valueset.GoalStatusReasonEnum;
import ca.uhn.fhir.model.dstu2.composite.BoundCodeableConceptDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.NarrativeDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.valueset.GoalStatusEnum;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.BoundCodeDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.DurationDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.StringDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.AnnotationDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.IdentifierDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.CodeDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.valueset.GoalPriorityEnum;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;

public interface IGoal
{

   public Goal getAdaptee();

   public void setAdaptee(Goal param);

   public ContainedDt getContained();

   public IGoal setContained(ContainedDt param);

   public DateDt getStartDateElement();

   public Date getStartDate();

   public IGoal setStartDate(DateDt param);

   public IGoal setStartDate(Date param);

   public CodeableConceptDt getStartCodeableConcept();

   public IGoal setStartCodeableConcept(CodeableConceptDt param);

   public BoundCodeableConceptDt<GoalStatusReasonEnum> getStatusReason();

   public IGoal setStatusReason(
         BoundCodeableConceptDt<GoalStatusReasonEnum> param);

   public NarrativeDt getText();

   public IGoal setText(NarrativeDt param);

   public List<Goal.Outcome> getOutcome();

   public IGoal setOutcome(List<Goal.Outcome> param);

   public IGoal addOutcome(Goal.Outcome param);

   public Goal.Outcome addOutcome();

   public Goal.Outcome getOutcomeFirstRep();

   public String getStatus();

   public IGoal setStatus(String param);

   public IGoal setStatus(GoalStatusEnum param);

   public BoundCodeDt<GoalStatusEnum> getStatusElement();

   public IGoal setStatus(BoundCodeDt<GoalStatusEnum> param);

   public DateDt getTargetDateElement();

   public Date getTargetDate();

   public IGoal setTargetDate(DateDt param);

   public IGoal setTargetDate(Date param);

   public DurationDt getTargetQuantity();

   public IGoal setTargetQuantity(DurationDt param);

   public StringDt getDescriptionElement();

   public String getDescription();

   public IGoal setDescription(String param);

   public IGoal setDescription(StringDt param);

   public List<AnnotationDt> getNote();

   public IGoal setNote(List<AnnotationDt> param);

   public IGoal addNote(AnnotationDt param);

   public AnnotationDt addNote();

   public AnnotationDt getNoteFirstRep();

   public IdDt getId();

   public IGoal setId(IdDt param);

   public List<IdentifierDt> getIdentifier();

   public IGoal setIdentifier(List<IdentifierDt> param);

   public IGoal addIdentifier(IdentifierDt param);

   public IdentifierDt addIdentifier();

   public IdentifierDt getIdentifierFirstRep();

   public DateDt getStatusDateElement();

   public Date getStatusDate();

   public IGoal setStatusDate(Date param);

   public IGoal setStatusDate(DateDt param);

   public CodeDt getLanguage();

   public IGoal setLanguage(CodeDt param);

   public BoundCodeableConceptDt<GoalPriorityEnum> getPriority();

   public IGoal setPriority(BoundCodeableConceptDt<GoalPriorityEnum> param);
}