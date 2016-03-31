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
import org.socraticgrid.fhir.generated.QICoreGoalTarget;
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
import ca.uhn.fhir.model.dstu2.composite.NarrativeDt;
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
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.ContainedDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.valueset.GoalStatusReasonEnum;
import ca.uhn.fhir.model.dstu2.composite.BoundCodeableConceptDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.valueset.GoalStatusEnum;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.BoundCodeDt;
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

public interface IQICoreGoal
{

   public Goal getAdaptee();

   public void setAdaptee(Goal param);

   public List<QICoreGoalTarget> getTarget();

   public IQICoreGoal setTarget(List<QICoreGoalTarget> param);

   public DateDt getStartDateElement();

   public Date getStartDate();

   public IQICoreGoal setStartDate(DateDt param);

   public IQICoreGoal setStartDate(Date param);

   public CodeableConceptDt getStartCodeableConcept();

   public IQICoreGoal setStartCodeableConcept(CodeableConceptDt param);

   public NarrativeDt getText();

   public IQICoreGoal setText(NarrativeDt param);

   public DateDt getTargetDateElement();

   public Date getTargetDate();

   public IQICoreGoal setTargetDate(DateDt param);

   public IQICoreGoal setTargetDate(Date param);

   public DurationDt getTargetQuantity();

   public IQICoreGoal setTargetQuantity(DurationDt param);

   public StringDt getDescriptionElement();

   public String getDescription();

   public IQICoreGoal setDescription(String param);

   public IQICoreGoal setDescription(StringDt param);

   public List<AnnotationDt> getNote();

   public IQICoreGoal setNote(List<AnnotationDt> param);

   public IQICoreGoal addNote(AnnotationDt param);

   public AnnotationDt addNote();

   public AnnotationDt getNoteFirstRep();

   public IdDt getId();

   public IQICoreGoal setId(IdDt param);

   public CodeableConceptDt getReasonRejected();

   public IQICoreGoal setReasonRejected(CodeableConceptDt param);

   public List<Goal.Outcome> getOutcome();

   public IQICoreGoal setOutcome(List<Goal.Outcome> param);

   public IQICoreGoal addOutcome(Goal.Outcome param);

   public Goal.Outcome addOutcome();

   public Goal.Outcome getOutcomeFirstRep();

   public ContainedDt getContained();

   public IQICoreGoal setContained(ContainedDt param);

   public BoundCodeableConceptDt<GoalStatusReasonEnum> getStatusReason();

   public IQICoreGoal setStatusReason(
         BoundCodeableConceptDt<GoalStatusReasonEnum> param);

   public String getStatus();

   public IQICoreGoal setStatus(String param);

   public IQICoreGoal setStatus(GoalStatusEnum param);

   public BoundCodeDt<GoalStatusEnum> getStatusElement();

   public IQICoreGoal setStatus(BoundCodeDt<GoalStatusEnum> param);

   public List<IdentifierDt> getIdentifier();

   public IQICoreGoal setIdentifier(List<IdentifierDt> param);

   public IQICoreGoal addIdentifier(IdentifierDt param);

   public IdentifierDt addIdentifier();

   public IdentifierDt getIdentifierFirstRep();

   public DateDt getStatusDateElement();

   public Date getStatusDate();

   public IQICoreGoal setStatusDate(Date param);

   public IQICoreGoal setStatusDate(DateDt param);

   public CodeDt getLanguage();

   public IQICoreGoal setLanguage(CodeDt param);

   public BoundCodeableConceptDt<GoalPriorityEnum> getPriority();

   public IQICoreGoal setPriority(
         BoundCodeableConceptDt<GoalPriorityEnum> param);
}