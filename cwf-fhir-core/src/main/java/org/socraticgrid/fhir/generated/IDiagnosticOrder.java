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

import ca.uhn.fhir.model.dstu2.resource.DiagnosticOrder;
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
import ca.uhn.fhir.model.dstu2.resource.Encounter;
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
import ca.uhn.fhir.model.primitive.CodeDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.Practitioner;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.valueset.DiagnosticOrderStatusEnum;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.BoundCodeDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.valueset.DiagnosticOrderPriorityEnum;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;

public interface IDiagnosticOrder
{

   public DiagnosticOrder getAdaptee();

   public void setAdaptee(DiagnosticOrder param);

   public List<DiagnosticOrder.Item> getItem();

   public IDiagnosticOrder setItem(List<DiagnosticOrder.Item> param);

   public IDiagnosticOrder addItem(DiagnosticOrder.Item param);

   public DiagnosticOrder.Item addItem();

   public DiagnosticOrder.Item getItemFirstRep();

   public List<DiagnosticOrder.Event> getEvent();

   public IDiagnosticOrder setEvent(List<DiagnosticOrder.Event> param);

   public IDiagnosticOrder addEvent(DiagnosticOrder.Event param);

   public DiagnosticOrder.Event addEvent();

   public DiagnosticOrder.Event getEventFirstRep();

   public ContainedDt getContained();

   public IDiagnosticOrder setContained(ContainedDt param);

   public List<IdentifierDt> getIdentifier();

   public IDiagnosticOrder setIdentifier(List<IdentifierDt> param);

   public IDiagnosticOrder addIdentifier(IdentifierDt param);

   public IdentifierDt addIdentifier();

   public IdentifierDt getIdentifierFirstRep();

   public NarrativeDt getText();

   public IDiagnosticOrder setText(NarrativeDt param);

   public Encounter getEncounterResource();

   public IDiagnosticOrder setEncounterResource(Encounter param);

   public List<AnnotationDt> getNote();

   public IDiagnosticOrder setNote(List<AnnotationDt> param);

   public IDiagnosticOrder addNote(AnnotationDt param);

   public AnnotationDt addNote();

   public AnnotationDt getNoteFirstRep();

   public IdDt getId();

   public IDiagnosticOrder setId(IdDt param);

   public CodeDt getLanguage();

   public IDiagnosticOrder setLanguage(CodeDt param);

   public Practitioner getOrdererResource();

   public IDiagnosticOrder setOrdererResource(Practitioner param);

   public String getStatus();

   public IDiagnosticOrder setStatus(String param);

   public IDiagnosticOrder setStatus(DiagnosticOrderStatusEnum param);

   public BoundCodeDt<DiagnosticOrderStatusEnum> getStatusElement();

   public IDiagnosticOrder setStatus(
         BoundCodeDt<DiagnosticOrderStatusEnum> param);

   public String getPriority();

   public IDiagnosticOrder setPriority(String param);

   public IDiagnosticOrder setPriority(DiagnosticOrderPriorityEnum param);

   public BoundCodeDt<DiagnosticOrderPriorityEnum> getPriorityElement();

   public IDiagnosticOrder setPriority(
         BoundCodeDt<DiagnosticOrderPriorityEnum> param);
}