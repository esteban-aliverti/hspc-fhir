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

import ca.uhn.fhir.model.dstu2.resource.MedicationOrder;
import ca.uhn.fhir.model.api.ExtensionDt;
import java.util.List;
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
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.CodeDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.IdentifierDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
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
import ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.ContainedDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.Practitioner;
import ca.uhn.fhir.model.dstu2.resource.*;
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
import ca.uhn.fhir.model.dstu2.resource.Patient;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.Encounter;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.valueset.MedicationOrderStatusEnum;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.BoundCodeDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.StringDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;

public interface IMedicationOrder
{

   public MedicationOrder getAdaptee();

   public void setAdaptee(MedicationOrder param);

   public MedicationOrder getPriorPrescriptionResource();

   public IMedicationOrder setPriorPrescriptionResource(MedicationOrder param);

   public List<MedicationOrder.DosageInstruction> getDosageInstruction();

   public IMedicationOrder setDosageInstruction(
         List<MedicationOrder.DosageInstruction> param);

   public IMedicationOrder addDosageInstruction(
         MedicationOrder.DosageInstruction param);

   public MedicationOrder.DosageInstruction addDosageInstruction();

   public MedicationOrder.DosageInstruction getDosageInstructionFirstRep();

   public MedicationOrder.Substitution getSubstitution();

   public IMedicationOrder setSubstitution(MedicationOrder.Substitution param);

   public MedicationOrder.DispenseRequest getDispenseRequest();

   public IMedicationOrder setDispenseRequest(
         MedicationOrder.DispenseRequest param);

   public CodeDt getLanguage();

   public IMedicationOrder setLanguage(CodeDt param);

   public List<IdentifierDt> getIdentifier();

   public IMedicationOrder setIdentifier(List<IdentifierDt> param);

   public IMedicationOrder addIdentifier(IdentifierDt param);

   public IdentifierDt addIdentifier();

   public IdentifierDt getIdentifierFirstRep();

   public CodeableConceptDt getReasonEnded();

   public IMedicationOrder setReasonEnded(CodeableConceptDt param);

   public NarrativeDt getText();

   public IMedicationOrder setText(NarrativeDt param);

   public CodeableConceptDt getMedicationCodeableConcept();

   public IMedicationOrder setMedicationCodeableConcept(CodeableConceptDt param);

   public ResourceReferenceDt getMedicationReference();

   public IMedicationOrder setMedicationReference(ResourceReferenceDt param);

   public ContainedDt getContained();

   public IMedicationOrder setContained(ContainedDt param);

   public Practitioner getPrescriberResource();

   public IMedicationOrder setPrescriberResource(Practitioner param);

   public CodeableConceptDt getReasonCodeableConcept();

   public IMedicationOrder setReasonCodeableConcept(CodeableConceptDt param);

   public ResourceReferenceDt getReasonReference();

   public IMedicationOrder setReasonReference(ResourceReferenceDt param);

   public DateTimeDt getDateWrittenElement();

   public Date getDateWritten();

   public IMedicationOrder setDateWritten(Date param);

   public IMedicationOrder setDateWritten(DateTimeDt param);

   public Patient getPatientResource();

   public IMedicationOrder setPatientResource(Patient param);

   public IdDt getId();

   public IMedicationOrder setId(IdDt param);

   public Encounter getEncounterResource();

   public IMedicationOrder setEncounterResource(Encounter param);

   public String getStatus();

   public IMedicationOrder setStatus(String param);

   public IMedicationOrder setStatus(MedicationOrderStatusEnum param);

   public BoundCodeDt<MedicationOrderStatusEnum> getStatusElement();

   public IMedicationOrder setStatus(
         BoundCodeDt<MedicationOrderStatusEnum> param);

   public StringDt getNoteElement();

   public String getNote();

   public IMedicationOrder setNote(String param);

   public IMedicationOrder setNote(StringDt param);

   public DateTimeDt getDateEndedElement();

   public Date getDateEnded();

   public IMedicationOrder setDateEnded(Date param);

   public IMedicationOrder setDateEnded(DateTimeDt param);
}