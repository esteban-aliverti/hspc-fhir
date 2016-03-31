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

import ca.uhn.fhir.model.dstu2.resource.AllergyIntolerance;
import ca.uhn.fhir.model.api.ExtensionDt;
import java.util.List;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.DateTimeDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import java.util.Date;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import org.socraticgrid.fhir.generated.QICoreAllergyIntoleranceReaction;
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
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.valueset.AllergyIntoleranceStatusEnum;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.BoundCodeDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
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
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.valueset.AllergyIntoleranceCategoryEnum;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.valueset.AllergyIntoleranceTypeEnum;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.valueset.AllergyIntoleranceCriticalityEnum;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.ContainedDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
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
import ca.uhn.fhir.model.dstu2.composite.NarrativeDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.AnnotationDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;

public interface IQICoreAllergyIntolerance
{

   public AllergyIntolerance getAdaptee();

   public void setAdaptee(AllergyIntolerance param);

   public DateTimeDt getRecordedDateElement();

   public Date getRecordedDate();

   public IQICoreAllergyIntolerance setRecordedDate(Date param);

   public IQICoreAllergyIntolerance setRecordedDate(DateTimeDt param);

   public List<QICoreAllergyIntoleranceReaction> getWrappedReaction();

   public IQICoreAllergyIntolerance setWrappedReaction(
         List<QICoreAllergyIntoleranceReaction> param);

   public IQICoreAllergyIntolerance addWrappedReaction(
         QICoreAllergyIntoleranceReaction param);

   public QICoreAllergyIntoleranceReaction addWrappedReaction();

   public QICoreAllergyIntoleranceReaction getWrappedReactionFirstRep();

   public List<AllergyIntolerance.Reaction> getReaction();

   public IQICoreAllergyIntolerance setReaction(
         List<AllergyIntolerance.Reaction> param);

   public IQICoreAllergyIntolerance addReaction(
         AllergyIntolerance.Reaction param);

   public AllergyIntolerance.Reaction addReaction();

   public AllergyIntolerance.Reaction getReactionFirstRep();

   public String getStatus();

   public IQICoreAllergyIntolerance setStatus(String param);

   public IQICoreAllergyIntolerance setStatus(
         AllergyIntoleranceStatusEnum param);

   public BoundCodeDt<AllergyIntoleranceStatusEnum> getStatusElement();

   public IQICoreAllergyIntolerance setStatus(
         BoundCodeDt<AllergyIntoleranceStatusEnum> param);

   public CodeableConceptDt getReasonRefuted();

   public IQICoreAllergyIntolerance setReasonRefuted(CodeableConceptDt param);

   public CodeableConceptDt getSubstance();

   public IQICoreAllergyIntolerance setSubstance(CodeableConceptDt param);

   public List<IdentifierDt> getIdentifier();

   public IQICoreAllergyIntolerance setIdentifier(List<IdentifierDt> param);

   public IQICoreAllergyIntolerance addIdentifier(IdentifierDt param);

   public IdentifierDt addIdentifier();

   public IdentifierDt getIdentifierFirstRep();

   public IdDt getId();

   public IQICoreAllergyIntolerance setId(IdDt param);

   public String getCategory();

   public IQICoreAllergyIntolerance setCategory(String param);

   public IQICoreAllergyIntolerance setCategory(
         AllergyIntoleranceCategoryEnum param);

   public BoundCodeDt<AllergyIntoleranceCategoryEnum> getCategoryElement();

   public IQICoreAllergyIntolerance setCategory(
         BoundCodeDt<AllergyIntoleranceCategoryEnum> param);

   public String getType();

   public IQICoreAllergyIntolerance setType(String param);

   public IQICoreAllergyIntolerance setType(AllergyIntoleranceTypeEnum param);

   public BoundCodeDt<AllergyIntoleranceTypeEnum> getTypeElement();

   public IQICoreAllergyIntolerance setType(
         BoundCodeDt<AllergyIntoleranceTypeEnum> param);

   public DateTimeDt getOnsetElement();

   public Date getOnset();

   public IQICoreAllergyIntolerance setOnset(Date param);

   public IQICoreAllergyIntolerance setOnset(DateTimeDt param);

   public String getCriticality();

   public IQICoreAllergyIntolerance setCriticality(String param);

   public IQICoreAllergyIntolerance setCriticality(
         AllergyIntoleranceCriticalityEnum param);

   public BoundCodeDt<AllergyIntoleranceCriticalityEnum> getCriticalityElement();

   public IQICoreAllergyIntolerance setCriticality(
         BoundCodeDt<AllergyIntoleranceCriticalityEnum> param);

   public ContainedDt getContained();

   public IQICoreAllergyIntolerance setContained(ContainedDt param);

   public ExtensionDt getResolutionAge();

   public IQICoreAllergyIntolerance setResolutionAge(ExtensionDt param);

   public CodeDt getLanguage();

   public IQICoreAllergyIntolerance setLanguage(CodeDt param);

   public QICorePatientAdapter getPatientResource();

   public IQICoreAllergyIntolerance setPatientResource(
         QICorePatientAdapter param);

   public DateTimeDt getLastOccurenceElement();

   public Date getLastOccurence();

   public IQICoreAllergyIntolerance setLastOccurence(Date param);

   public IQICoreAllergyIntolerance setLastOccurence(DateTimeDt param);

   public NarrativeDt getText();

   public IQICoreAllergyIntolerance setText(NarrativeDt param);

   public AnnotationDt getNote();

   public IQICoreAllergyIntolerance setNote(AnnotationDt param);
}