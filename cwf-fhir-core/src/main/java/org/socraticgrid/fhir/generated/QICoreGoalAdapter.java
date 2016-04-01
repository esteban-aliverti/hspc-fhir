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
import ca.uhn.fhir.model.dstu2.composite.BoundCodeableConceptDt;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.dstu2.composite.ContainedDt;
import ca.uhn.fhir.model.dstu2.composite.DurationDt;
import ca.uhn.fhir.model.dstu2.composite.IdentifierDt;
import ca.uhn.fhir.model.dstu2.composite.NarrativeDt;
import ca.uhn.fhir.model.dstu2.resource.Goal;
import ca.uhn.fhir.model.dstu2.valueset.GoalPriorityEnum;
import ca.uhn.fhir.model.dstu2.valueset.GoalStatusEnum;
import ca.uhn.fhir.model.primitive.BoundCodeDt;
import ca.uhn.fhir.model.primitive.CodeDt;
import ca.uhn.fhir.model.primitive.DateDt;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.primitive.StringDt;

public class QICoreGoalAdapter implements IQICoreGoal {
    
    
    private Goal adaptedClass = null;
    
    public QICoreGoalAdapter() {
        this.adaptedClass = new ca.uhn.fhir.model.dstu2.resource.Goal();
    }
    
    public QICoreGoalAdapter(Goal adaptee) {
        this.adaptedClass = adaptee;
    }
    
    @Override
    public Goal getAdaptee() {
        return adaptedClass;
    }
    
    @Override
    public void setAdaptee(Goal param) {
        this.adaptedClass = param;
    }
    
    @Override
    public List<QICoreGoalTarget> getTarget() {
        List<ca.uhn.fhir.model.api.ExtensionDt> extensions = adaptedClass
                .getUndeclaredExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/goal-target");
        List<org.socraticgrid.fhir.generated.QICoreGoalTarget> returnList = new java.util.ArrayList<>();
        for (ca.uhn.fhir.model.api.ExtensionDt extension : extensions) {
            org.socraticgrid.fhir.generated.QICoreGoalTarget udt = new org.socraticgrid.fhir.generated.QICoreGoalTarget();
            udt.setRootObjectExtension(extension);
            returnList.add(udt);
        }
        return returnList;
    }
    
    @Override
    public IQICoreGoal setTarget(List<QICoreGoalTarget> param) {
        if (param != null && param.size() > 0) {
            for (int index = 0; index < param.size(); index++) {
                adaptedClass.addUndeclaredExtension(param.get(index).getRootObjectExtension());
            }
        }
        return this;
    }
    
    @Override
    public DateDt getStartDateElement() {
        if (adaptedClass.getStart() != null && adaptedClass.getStart() instanceof ca.uhn.fhir.model.primitive.DateDt) {
            return (ca.uhn.fhir.model.primitive.DateDt) adaptedClass.getStart();
        } else {
            return null;
        }
    }
    
    @Override
    public Date getStartDate() {
        if (adaptedClass.getStart() != null && adaptedClass.getStart() instanceof ca.uhn.fhir.model.primitive.DateDt) {
            return ((ca.uhn.fhir.model.primitive.DateDt) adaptedClass.getStart()).getValue();
        } else {
            return null;
        }
    }
    
    @Override
    public IQICoreGoal setStartDate(DateDt param) {
        adaptedClass.setStart(param);
        return this;
    }
    
    @Override
    public IQICoreGoal setStartDate(Date param) {
        adaptedClass.setStart(new ca.uhn.fhir.model.primitive.DateDt(param));
        return this;
    }
    
    @Override
    public CodeableConceptDt getStartCodeableConcept() {
        if (adaptedClass.getStart() != null
                && adaptedClass.getStart() instanceof ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt) {
            return (ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt) adaptedClass.getStart();
        } else {
            return null;
        }
    }
    
    @Override
    public IQICoreGoal setStartCodeableConcept(CodeableConceptDt param) {
        adaptedClass.setStart(param);
        return this;
    }
    
    @Override
    public NarrativeDt getText() {
        return adaptedClass.getText();
    }
    
    @Override
    public IQICoreGoal setText(NarrativeDt param) {
        adaptedClass.setText(param);
        return this;
    }
    
    @Override
    public DateDt getTargetDateElement() {
        if (adaptedClass.getTarget() != null && adaptedClass.getTarget() instanceof ca.uhn.fhir.model.primitive.DateDt) {
            return (ca.uhn.fhir.model.primitive.DateDt) adaptedClass.getTarget();
        } else {
            return null;
        }
    }
    
    @Override
    public Date getTargetDate() {
        if (adaptedClass.getTarget() != null && adaptedClass.getTarget() instanceof ca.uhn.fhir.model.primitive.DateDt) {
            return ((ca.uhn.fhir.model.primitive.DateDt) adaptedClass.getTarget()).getValue();
        } else {
            return null;
        }
    }
    
    @Override
    public IQICoreGoal setTargetDate(DateDt param) {
        adaptedClass.setTarget(param);
        return this;
    }
    
    @Override
    public IQICoreGoal setTargetDate(Date param) {
        adaptedClass.setTarget(new ca.uhn.fhir.model.primitive.DateDt(param));
        return this;
    }
    
    @Override
    public DurationDt getTargetQuantity() {
        if (adaptedClass.getTarget() != null
                && adaptedClass.getTarget() instanceof ca.uhn.fhir.model.dstu2.composite.DurationDt) {
            return (ca.uhn.fhir.model.dstu2.composite.DurationDt) adaptedClass.getTarget();
        } else {
            return null;
        }
    }
    
    @Override
    public IQICoreGoal setTargetQuantity(DurationDt param) {
        adaptedClass.setTarget(param);
        return this;
    }
    
    @Override
    public StringDt getDescriptionElement() {
        return adaptedClass.getDescriptionElement();
    }
    
    @Override
    public String getDescription() {
        return adaptedClass.getDescription();
    }
    
    @Override
    public IQICoreGoal setDescription(String param) {
        adaptedClass.setDescription(new ca.uhn.fhir.model.primitive.StringDt(param));
        return this;
    }
    
    @Override
    public IQICoreGoal setDescription(StringDt param) {
        adaptedClass.setDescription(param);
        return this;
    }
    
    @Override
    public List<AnnotationDt> getNote() {
        return adaptedClass.getNote();
    }
    
    @Override
    public IQICoreGoal setNote(List<AnnotationDt> param) {
        adaptedClass.setNote(param);
        return this;
    }
    
    @Override
    public IQICoreGoal addNote(AnnotationDt param) {
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
    public IdDt getId() {
        return adaptedClass.getId();
    }
    
    @Override
    public IQICoreGoal setId(IdDt param) {
        adaptedClass.setId(param);
        return this;
    }
    
    @Override
    public CodeableConceptDt getReasonRejected() {
        List<ca.uhn.fhir.model.api.ExtensionDt> extensions = adaptedClass
                .getUndeclaredExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/goal-reasonRejected");
        if (extensions == null || extensions.size() <= 0) {
            return null;
        } else if (extensions.size() == 1) {
            return (ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt) extensions.get(0).getValue();
        } else {
            throw new RuntimeException("More than one extension exists for reasonRejected");
        }
    }
    
    @Override
    public IQICoreGoal setReasonRejected(CodeableConceptDt param) {
        adaptedClass.addUndeclaredExtension(false, "http://hl7.org/fhir/StructureDefinition/goal-reasonRejected", param);
        return this;
    }
    
    @Override
    public List<Goal.Outcome> getOutcome() {
        return adaptedClass.getOutcome();
    }
    
    @Override
    public IQICoreGoal setOutcome(List<Goal.Outcome> param) {
        adaptedClass.setOutcome(param);
        return this;
    }
    
    @Override
    public IQICoreGoal addOutcome(Goal.Outcome param) {
        adaptedClass.addOutcome(param);
        return this;
    }
    
    @Override
    public Goal.Outcome addOutcome() {
        ca.uhn.fhir.model.dstu2.resource.Goal.Outcome item = new ca.uhn.fhir.model.dstu2.resource.Goal.Outcome();
        adaptedClass.addOutcome(item);
        return item;
    }
    
    @Override
    public Goal.Outcome getOutcomeFirstRep() {
        return adaptedClass.getOutcomeFirstRep();
    }
    
    @Override
    public ContainedDt getContained() {
        return adaptedClass.getContained();
    }
    
    @Override
    public IQICoreGoal setContained(ContainedDt param) {
        adaptedClass.setContained(param);
        return this;
    }
    
    @Override
    public CodeableConceptDt getStatusReason() {
        return adaptedClass.getStatusReason();
    }
    
    @Override
    public IQICoreGoal setStatusReason(CodeableConceptDt param) {
        adaptedClass.setStatusReason(param);
        return this;
    }
    
    @Override
    public String getStatus() {
        return adaptedClass.getStatus();
    }
    
    @Override
    public IQICoreGoal setStatus(String param) {
        adaptedClass.setStatus(ca.uhn.fhir.model.dstu2.valueset.GoalStatusEnum.valueOf(param));
        return this;
    }
    
    @Override
    public IQICoreGoal setStatus(GoalStatusEnum param) {
        adaptedClass.setStatus(param);
        return this;
    }
    
    @Override
    public BoundCodeDt<GoalStatusEnum> getStatusElement() {
        return adaptedClass.getStatusElement();
    }
    
    @Override
    public IQICoreGoal setStatus(BoundCodeDt<GoalStatusEnum> param) {
        adaptedClass.setStatus(param);
        return this;
    }
    
    @Override
    public List<IdentifierDt> getIdentifier() {
        return adaptedClass.getIdentifier();
    }
    
    @Override
    public IQICoreGoal setIdentifier(List<IdentifierDt> param) {
        adaptedClass.setIdentifier(param);
        return this;
    }
    
    @Override
    public IQICoreGoal addIdentifier(IdentifierDt param) {
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
    public DateDt getStatusDateElement() {
        return adaptedClass.getStatusDateElement();
    }
    
    @Override
    public Date getStatusDate() {
        return adaptedClass.getStatusDate();
    }
    
    @Override
    public IQICoreGoal setStatusDate(Date param) {
        adaptedClass.setStatusDate(new ca.uhn.fhir.model.primitive.DateDt(param));
        return this;
    }
    
    @Override
    public IQICoreGoal setStatusDate(DateDt param) {
        adaptedClass.setStatusDate(param);
        return this;
    }
    
    @Override
    public CodeDt getLanguage() {
        return adaptedClass.getLanguage();
    }
    
    @Override
    public IQICoreGoal setLanguage(CodeDt param) {
        adaptedClass.setLanguage(param);
        return this;
    }
    
    @Override
    public BoundCodeableConceptDt<GoalPriorityEnum> getPriority() {
        return adaptedClass.getPriority();
    }
    
    @Override
    public IQICoreGoal setPriority(BoundCodeableConceptDt<GoalPriorityEnum> param) {
        adaptedClass.setPriority(param);
        return this;
    }
}
