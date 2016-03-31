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

import ca.uhn.fhir.model.dstu2.resource.Procedure;
import ca.uhn.fhir.model.api.ExtensionDt;
import java.util.List;
import ca.uhn.fhir.model.dstu2.resource.*;
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
import ca.uhn.fhir.model.dstu2.composite.PeriodDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.Encounter;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.AnnotationDt;
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
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.BooleanDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.Location;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.ContainedDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.IdentifierDt;
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
import ca.uhn.fhir.model.dstu2.valueset.ProcedureStatusEnum;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.BoundCodeDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;

public interface IProcedure
{

   public Procedure getAdaptee();

   public void setAdaptee(Procedure param);

   public List<Procedure.Performer> getPerformer();

   public IProcedure setPerformer(List<Procedure.Performer> param);

   public IProcedure addPerformer(Procedure.Performer param);

   public Procedure.Performer addPerformer();

   public Procedure.Performer getPerformerFirstRep();

   public DateTimeDt getPerformedDateTimeElement();

   public Date getPerformedDateTime();

   public IProcedure setPerformedDateTime(DateTimeDt param);

   public IProcedure setPerformedDateTime(Date param);

   public PeriodDt getPerformedPeriod();

   public IProcedure setPerformedPeriod(PeriodDt param);

   public Encounter getEncounterResource();

   public IProcedure setEncounterResource(Encounter param);

   public CodeableConceptDt getCategory();

   public IProcedure setCategory(CodeableConceptDt param);

   public List<AnnotationDt> getNotes();

   public IProcedure setNotes(List<AnnotationDt> param);

   public IProcedure addNotes(AnnotationDt param);

   public AnnotationDt addNotes();

   public AnnotationDt getNotesFirstRep();

   public List<Procedure.FocalDevice> getFocalDevice();

   public IProcedure setFocalDevice(List<Procedure.FocalDevice> param);

   public IProcedure addFocalDevice(Procedure.FocalDevice param);

   public Procedure.FocalDevice addFocalDevice();

   public Procedure.FocalDevice getFocalDeviceFirstRep();

   public IdDt getId();

   public IProcedure setId(IdDt param);

   public BooleanDt getNotPerformedElement();

   public Boolean getNotPerformed();

   public IProcedure setNotPerformed(Boolean param);

   public IProcedure setNotPerformed(BooleanDt param);

   public Location getLocationResource();

   public IProcedure setLocationResource(Location param);

   public ContainedDt getContained();

   public IProcedure setContained(ContainedDt param);

   public List<IdentifierDt> getIdentifier();

   public IProcedure setIdentifier(List<IdentifierDt> param);

   public IProcedure addIdentifier(IdentifierDt param);

   public IdentifierDt addIdentifier();

   public IdentifierDt getIdentifierFirstRep();

   public NarrativeDt getText();

   public IProcedure setText(NarrativeDt param);

   public CodeDt getLanguage();

   public IProcedure setLanguage(CodeDt param);

   public CodeableConceptDt getOutcome();

   public IProcedure setOutcome(CodeableConceptDt param);

   public String getStatus();

   public IProcedure setStatus(String param);

   public IProcedure setStatus(ProcedureStatusEnum param);

   public BoundCodeDt<ProcedureStatusEnum> getStatusElement();

   public IProcedure setStatus(BoundCodeDt<ProcedureStatusEnum> param);

   public CodeableConceptDt getReasonCodeableConcept();

   public IProcedure setReasonCodeableConcept(CodeableConceptDt param);

   public ResourceReferenceDt getReasonReference();

   public IProcedure setReasonReference(ResourceReferenceDt param);

   public CodeableConceptDt getCode();

   public IProcedure setCode(CodeableConceptDt param);
}