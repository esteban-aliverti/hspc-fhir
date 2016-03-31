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

import org.socraticgrid.fhir.generated.IQICoreCondition;
import ca.uhn.fhir.model.dstu2.resource.Condition;
import java.util.List;
import ca.uhn.fhir.model.dstu2.composite.IdentifierDt;
import ca.uhn.fhir.model.primitive.DateDt;
import java.util.Date;
import ca.uhn.fhir.model.dstu2.valueset.ConditionCategoryCodesEnum;
import ca.uhn.fhir.model.dstu2.composite.BoundCodeableConceptDt;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.primitive.CodeDt;
import ca.uhn.fhir.model.dstu2.valueset.ConditionClinicalStatusCodesEnum;
import ca.uhn.fhir.model.primitive.BoundCodeDt;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.primitive.DateTimeDt;
import ca.uhn.fhir.model.dstu2.composite.QuantityDt;
import ca.uhn.fhir.model.dstu2.composite.PeriodDt;
import ca.uhn.fhir.model.dstu2.composite.RangeDt;
import ca.uhn.fhir.model.primitive.StringDt;
import ca.uhn.fhir.model.dstu2.composite.ContainedDt;
import ca.uhn.fhir.model.dstu2.valueset.ConditionVerificationStatusEnum;
import ca.uhn.fhir.model.dstu2.composite.NarrativeDt;
import ca.uhn.fhir.model.primitive.BooleanDt;
import ca.uhn.fhir.model.api.ExtensionDt;
import ca.uhn.fhir.model.dstu2.resource.*;

public class QICoreConditionAdapter implements IQICoreCondition
{

   private Condition adaptedClass = null;

   public QICoreConditionAdapter()
   {
      this.adaptedClass = new ca.uhn.fhir.model.dstu2.resource.Condition();
   }

   public QICoreConditionAdapter(Condition adaptee)
   {
      this.adaptedClass = adaptee;
   }

   public Condition getAdaptee()
   {
      return adaptedClass;
   }

   public void setAdaptee(Condition param)
   {
      this.adaptedClass = param;
   }

   public QICorePatientAdapter getPatientResource()
   {
      if (adaptedClass.getPatient().getResource() instanceof ca.uhn.fhir.model.dstu2.resource.Patient)
      {
         org.socraticgrid.fhir.generated.QICorePatientAdapter profiledType = new org.socraticgrid.fhir.generated.QICorePatientAdapter();
         profiledType
               .setAdaptee((ca.uhn.fhir.model.dstu2.resource.Patient) adaptedClass
                     .getPatient().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public IQICoreCondition setPatientResource(QICorePatientAdapter param)
   {
      adaptedClass.getPatient().setResource(param.getAdaptee());
      return this;
   }

   public List<IdentifierDt> getIdentifier()
   {
      return adaptedClass.getIdentifier();
   }

   public IQICoreCondition setIdentifier(List<IdentifierDt> param)
   {
      adaptedClass.setIdentifier(param);
      return this;
   }

   public IQICoreCondition addIdentifier(IdentifierDt param)
   {
      adaptedClass.addIdentifier(param);
      return this;
   }

   public IdentifierDt addIdentifier()
   {
      ca.uhn.fhir.model.dstu2.composite.IdentifierDt item = new ca.uhn.fhir.model.dstu2.composite.IdentifierDt();
      adaptedClass.addIdentifier(item);
      return item;
   }

   public IdentifierDt getIdentifierFirstRep()
   {
      return adaptedClass.getIdentifierFirstRep();
   }

   public DateDt getDateRecordedElement()
   {
      return adaptedClass.getDateRecordedElement();
   }

   public Date getDateRecorded()
   {
      return adaptedClass.getDateRecorded();
   }

   public IQICoreCondition setDateRecorded(Date param)
   {
      adaptedClass.setDateRecorded(new ca.uhn.fhir.model.primitive.DateDt(
            param));
      return this;
   }

   public IQICoreCondition setDateRecorded(DateDt param)
   {
      adaptedClass.setDateRecorded(param);
      return this;
   }

   public BoundCodeableConceptDt<ConditionCategoryCodesEnum> getCategory()
   {
      return adaptedClass.getCategory();
   }

   public IQICoreCondition setCategory(
         BoundCodeableConceptDt<ConditionCategoryCodesEnum> param)
   {
      adaptedClass.setCategory(param);
      return this;
   }

   public CodeableConceptDt getCode()
   {
      return adaptedClass.getCode();
   }

   public IQICoreCondition setCode(CodeableConceptDt param)
   {
      adaptedClass.setCode(param);
      return this;
   }

   public CodeDt getLanguage()
   {
      return adaptedClass.getLanguage();
   }

   public IQICoreCondition setLanguage(CodeDt param)
   {
      adaptedClass.setLanguage(param);
      return this;
   }

   public QICoreEncounterAdapter getEncounterResource()
   {
      if (adaptedClass.getEncounter().getResource() instanceof ca.uhn.fhir.model.dstu2.resource.Encounter)
      {
         org.socraticgrid.fhir.generated.QICoreEncounterAdapter profiledType = new org.socraticgrid.fhir.generated.QICoreEncounterAdapter();
         profiledType
               .setAdaptee((ca.uhn.fhir.model.dstu2.resource.Encounter) adaptedClass
                     .getEncounter().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public IQICoreCondition setEncounterResource(QICoreEncounterAdapter param)
   {
      adaptedClass.getEncounter().setResource(param.getAdaptee());
      return this;
   }

   public Condition.Stage getStage()
   {
      return adaptedClass.getStage();
   }

   public IQICoreCondition setStage(Condition.Stage param)
   {
      adaptedClass.setStage(param);
      return this;
   }

   public List<Condition.Evidence> getEvidence()
   {
      return adaptedClass.getEvidence();
   }

   public IQICoreCondition setEvidence(List<Condition.Evidence> param)
   {
      adaptedClass.setEvidence(param);
      return this;
   }

   public IQICoreCondition addEvidence(Condition.Evidence param)
   {
      adaptedClass.addEvidence(param);
      return this;
   }

   public Condition.Evidence addEvidence()
   {
      ca.uhn.fhir.model.dstu2.resource.Condition.Evidence item = new ca.uhn.fhir.model.dstu2.resource.Condition.Evidence();
      adaptedClass.addEvidence(item);
      return item;
   }

   public Condition.Evidence getEvidenceFirstRep()
   {
      return adaptedClass.getEvidenceFirstRep();
   }

   public String getClinicalStatus()
   {
      return adaptedClass.getClinicalStatus();
   }

   public IQICoreCondition setClinicalStatus(String param)
   {
      adaptedClass
            .setClinicalStatus(ca.uhn.fhir.model.dstu2.valueset.ConditionClinicalStatusCodesEnum
                  .valueOf(param));
      return this;
   }

   public IQICoreCondition setClinicalStatus(
         ConditionClinicalStatusCodesEnum param)
   {
      adaptedClass.setClinicalStatus(param);
      return this;
   }

   public BoundCodeDt<ConditionClinicalStatusCodesEnum> getClinicalStatusElement()
   {
      return adaptedClass.getClinicalStatusElement();
   }

   public IQICoreCondition setClinicalStatus(
         BoundCodeDt<ConditionClinicalStatusCodesEnum> param)
   {
      adaptedClass.setClinicalStatus(param);
      return this;
   }

   public CodeableConceptDt getSeverity()
   {
      return adaptedClass.getSeverity();
   }

   public IQICoreCondition setSeverity(CodeableConceptDt param)
   {
      adaptedClass.setSeverity(param);
      return this;
   }

   public IdDt getId()
   {
      return adaptedClass.getId();
   }

   public IQICoreCondition setId(IdDt param)
   {
      adaptedClass.setId(param);
      return this;
   }

   public DateTimeDt getOnsetDateTimeElement()
   {
      if (adaptedClass.getOnset() != null
            && adaptedClass.getOnset() instanceof ca.uhn.fhir.model.primitive.DateTimeDt)
      {
         return (ca.uhn.fhir.model.primitive.DateTimeDt) adaptedClass
               .getOnset();
      }
      else
      {
         return null;
      }
   }

   public Date getOnsetDateTime()
   {
      if (adaptedClass.getOnset() != null
            && adaptedClass.getOnset() instanceof ca.uhn.fhir.model.primitive.DateTimeDt)
      {
         return ((ca.uhn.fhir.model.primitive.DateTimeDt) adaptedClass
               .getOnset()).getValue();
      }
      else
      {
         return null;
      }
   }

   public IQICoreCondition setOnsetDateTime(DateTimeDt param)
   {
      adaptedClass.setOnset(param);
      return this;
   }

   public IQICoreCondition setOnsetDateTime(Date param)
   {
      adaptedClass
            .setOnset(new ca.uhn.fhir.model.primitive.DateTimeDt(param));
      return this;
   }

   public QuantityDt getOnsetQuantity()
   {
      if (adaptedClass.getOnset() != null
            && adaptedClass.getOnset() instanceof ca.uhn.fhir.model.dstu2.composite.QuantityDt)
      {
         return (ca.uhn.fhir.model.dstu2.composite.QuantityDt) adaptedClass
               .getOnset();
      }
      else
      {
         return null;
      }
   }

   public IQICoreCondition setOnsetQuantity(QuantityDt param)
   {
      adaptedClass.setOnset(param);
      return this;
   }

   public PeriodDt getOnsetPeriod()
   {
      if (adaptedClass.getOnset() != null
            && adaptedClass.getOnset() instanceof ca.uhn.fhir.model.dstu2.composite.PeriodDt)
      {
         return (ca.uhn.fhir.model.dstu2.composite.PeriodDt) adaptedClass
               .getOnset();
      }
      else
      {
         return null;
      }
   }

   public IQICoreCondition setOnsetPeriod(PeriodDt param)
   {
      adaptedClass.setOnset(param);
      return this;
   }

   public RangeDt getOnsetRange()
   {
      if (adaptedClass.getOnset() != null
            && adaptedClass.getOnset() instanceof ca.uhn.fhir.model.dstu2.composite.RangeDt)
      {
         return (ca.uhn.fhir.model.dstu2.composite.RangeDt) adaptedClass
               .getOnset();
      }
      else
      {
         return null;
      }
   }

   public IQICoreCondition setOnsetRange(RangeDt param)
   {
      adaptedClass.setOnset(param);
      return this;
   }

   public StringDt getOnsetStringElement()
   {
      if (adaptedClass.getOnset() != null
            && adaptedClass.getOnset() instanceof ca.uhn.fhir.model.primitive.StringDt)
      {
         return (ca.uhn.fhir.model.primitive.StringDt) adaptedClass
               .getOnset();
      }
      else
      {
         return null;
      }
   }

   public String getOnsetString()
   {
      if (adaptedClass.getOnset() != null
            && adaptedClass.getOnset() instanceof ca.uhn.fhir.model.primitive.StringDt)
      {
         return ((ca.uhn.fhir.model.primitive.StringDt) adaptedClass
               .getOnset()).getValue();
      }
      else
      {
         return null;
      }
   }

   public IQICoreCondition setOnsetString(StringDt param)
   {
      adaptedClass.setOnset(param);
      return this;
   }

   public IQICoreCondition setOnsetString(String param)
   {
      adaptedClass.setOnset(new ca.uhn.fhir.model.primitive.StringDt(param));
      return this;
   }

   public ContainedDt getContained()
   {
      return adaptedClass.getContained();
   }

   public IQICoreCondition setContained(ContainedDt param)
   {
      adaptedClass.setContained(param);
      return this;
   }

   public String getVerificationStatus()
   {
      return adaptedClass.getVerificationStatus();
   }

   public IQICoreCondition setVerificationStatus(String param)
   {
      adaptedClass
            .setVerificationStatus(ca.uhn.fhir.model.dstu2.valueset.ConditionVerificationStatusEnum
                  .valueOf(param));
      return this;
   }

   public IQICoreCondition setVerificationStatus(
         ConditionVerificationStatusEnum param)
   {
      adaptedClass.setVerificationStatus(param);
      return this;
   }

   public BoundCodeDt<ConditionVerificationStatusEnum> getVerificationStatusElement()
   {
      return adaptedClass.getVerificationStatusElement();
   }

   public IQICoreCondition setVerificationStatus(
         BoundCodeDt<ConditionVerificationStatusEnum> param)
   {
      adaptedClass.setVerificationStatus(param);
      return this;
   }

   public NarrativeDt getText()
   {
      return adaptedClass.getText();
   }

   public IQICoreCondition setText(NarrativeDt param)
   {
      adaptedClass.setText(param);
      return this;
   }

   public DateTimeDt getAbatementDateTimeElement()
   {
      if (adaptedClass.getAbatement() != null
            && adaptedClass.getAbatement() instanceof ca.uhn.fhir.model.primitive.DateTimeDt)
      {
         return (ca.uhn.fhir.model.primitive.DateTimeDt) adaptedClass
               .getAbatement();
      }
      else
      {
         return null;
      }
   }

   public Date getAbatementDateTime()
   {
      if (adaptedClass.getAbatement() != null
            && adaptedClass.getAbatement() instanceof ca.uhn.fhir.model.primitive.DateTimeDt)
      {
         return ((ca.uhn.fhir.model.primitive.DateTimeDt) adaptedClass
               .getAbatement()).getValue();
      }
      else
      {
         return null;
      }
   }

   public IQICoreCondition setAbatementDateTime(DateTimeDt param)
   {
      adaptedClass.setAbatement(param);
      return this;
   }

   public IQICoreCondition setAbatementDateTime(Date param)
   {
      adaptedClass.setAbatement(new ca.uhn.fhir.model.primitive.DateTimeDt(
            param));
      return this;
   }

   public QuantityDt getAbatementQuantity()
   {
      if (adaptedClass.getAbatement() != null
            && adaptedClass.getAbatement() instanceof ca.uhn.fhir.model.dstu2.composite.QuantityDt)
      {
         return (ca.uhn.fhir.model.dstu2.composite.QuantityDt) adaptedClass
               .getAbatement();
      }
      else
      {
         return null;
      }
   }

   public IQICoreCondition setAbatementQuantity(QuantityDt param)
   {
      adaptedClass.setAbatement(param);
      return this;
   }

   public BooleanDt getAbatementBooleanElement()
   {
      if (adaptedClass.getAbatement() != null
            && adaptedClass.getAbatement() instanceof ca.uhn.fhir.model.primitive.BooleanDt)
      {
         return (ca.uhn.fhir.model.primitive.BooleanDt) adaptedClass
               .getAbatement();
      }
      else
      {
         return null;
      }
   }

   public Boolean getAbatementBoolean()
   {
      if (adaptedClass.getAbatement() != null
            && adaptedClass.getAbatement() instanceof ca.uhn.fhir.model.primitive.BooleanDt)
      {
         return ((ca.uhn.fhir.model.primitive.BooleanDt) adaptedClass
               .getAbatement()).getValue();
      }
      else
      {
         return null;
      }
   }

   public IQICoreCondition setAbatementBoolean(BooleanDt param)
   {
      adaptedClass.setAbatement(param);
      return this;
   }

   public IQICoreCondition setAbatementBoolean(Boolean param)
   {
      adaptedClass.setAbatement(new ca.uhn.fhir.model.primitive.BooleanDt(
            param));
      return this;
   }

   public PeriodDt getAbatementPeriod()
   {
      if (adaptedClass.getAbatement() != null
            && adaptedClass.getAbatement() instanceof ca.uhn.fhir.model.dstu2.composite.PeriodDt)
      {
         return (ca.uhn.fhir.model.dstu2.composite.PeriodDt) adaptedClass
               .getAbatement();
      }
      else
      {
         return null;
      }
   }

   public IQICoreCondition setAbatementPeriod(PeriodDt param)
   {
      adaptedClass.setAbatement(param);
      return this;
   }

   public RangeDt getAbatementRange()
   {
      if (adaptedClass.getAbatement() != null
            && adaptedClass.getAbatement() instanceof ca.uhn.fhir.model.dstu2.composite.RangeDt)
      {
         return (ca.uhn.fhir.model.dstu2.composite.RangeDt) adaptedClass
               .getAbatement();
      }
      else
      {
         return null;
      }
   }

   public IQICoreCondition setAbatementRange(RangeDt param)
   {
      adaptedClass.setAbatement(param);
      return this;
   }

   public StringDt getAbatementStringElement()
   {
      if (adaptedClass.getAbatement() != null
            && adaptedClass.getAbatement() instanceof ca.uhn.fhir.model.primitive.StringDt)
      {
         return (ca.uhn.fhir.model.primitive.StringDt) adaptedClass
               .getAbatement();
      }
      else
      {
         return null;
      }
   }

   public String getAbatementString()
   {
      if (adaptedClass.getAbatement() != null
            && adaptedClass.getAbatement() instanceof ca.uhn.fhir.model.primitive.StringDt)
      {
         return ((ca.uhn.fhir.model.primitive.StringDt) adaptedClass
               .getAbatement()).getValue();
      }
      else
      {
         return null;
      }
   }

   public IQICoreCondition setAbatementString(StringDt param)
   {
      adaptedClass.setAbatement(param);
      return this;
   }

   public IQICoreCondition setAbatementString(String param)
   {
      adaptedClass.setAbatement(new ca.uhn.fhir.model.primitive.StringDt(
            param));
      return this;
   }

   public StringDt getNotesElement()
   {
      return adaptedClass.getNotesElement();
   }

   public String getNotes()
   {
      return adaptedClass.getNotes();
   }

   public IQICoreCondition setNotes(String param)
   {
      adaptedClass.setNotes(new ca.uhn.fhir.model.primitive.StringDt(param));
      return this;
   }

   public IQICoreCondition setNotes(StringDt param)
   {
      adaptedClass.setNotes(param);
      return this;
   }

   public CodeableConceptDt getCriticality()
   {
      List<ca.uhn.fhir.model.api.ExtensionDt> extensions = adaptedClass
            .getUndeclaredExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/condition-criticality");
      if (extensions == null || extensions.size() <= 0)
      {
         return null;
      }
      else if (extensions.size() == 1)
      {
         return (ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt) extensions
               .get(0).getValue();
      }
      else
      {
         throw new RuntimeException(
               "More than one extension exists for criticality");
      }
   }

   public IQICoreCondition setCriticality(CodeableConceptDt param)
   {
      adaptedClass
            .addUndeclaredExtension(
                  false,
                  "http://hl7.org/fhir/StructureDefinition/condition-criticality",
                  param);
      return this;
   }
}