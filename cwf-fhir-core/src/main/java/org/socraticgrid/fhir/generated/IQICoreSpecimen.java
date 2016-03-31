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

import ca.uhn.fhir.model.dstu2.resource.Specimen;
import ca.uhn.fhir.model.api.ExtensionDt;
import java.util.List;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import org.socraticgrid.fhir.generated.QICoreSpecimenContainer;
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
import ca.uhn.fhir.model.dstu2.composite.NarrativeDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.DateTimeDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import java.util.Date;
import ca.uhn.fhir.model.dstu2.resource.*;
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
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.valueset.SpecimenStatusEnum;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.BoundCodeDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.ContainedDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.CodeDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;

public interface IQICoreSpecimen
{

   public Specimen getAdaptee();

   public void setAdaptee(Specimen param);

   public List<QICoreSpecimenContainer> getWrappedContainer();

   public IQICoreSpecimen setWrappedContainer(
         List<QICoreSpecimenContainer> param);

   public IQICoreSpecimen addWrappedContainer(QICoreSpecimenContainer param);

   public QICoreSpecimenContainer addWrappedContainer();

   public QICoreSpecimenContainer getWrappedContainerFirstRep();

   public List<Specimen.Container> getContainer();

   public IQICoreSpecimen setContainer(List<Specimen.Container> param);

   public IQICoreSpecimen addContainer(Specimen.Container param);

   public Specimen.Container addContainer();

   public Specimen.Container getContainerFirstRep();

   public NarrativeDt getText();

   public IQICoreSpecimen setText(NarrativeDt param);

   public CodeableConceptDt getType();

   public IQICoreSpecimen setType(CodeableConceptDt param);

   public DateTimeDt getReceivedTimeElement();

   public Date getReceivedTime();

   public IQICoreSpecimen setReceivedTime(Date param);

   public IQICoreSpecimen setReceivedTime(DateTimeDt param);

   public IdentifierDt getAccessionIdentifier();

   public IQICoreSpecimen setAccessionIdentifier(IdentifierDt param);

   public List<IdentifierDt> getIdentifier();

   public IQICoreSpecimen setIdentifier(List<IdentifierDt> param);

   public IQICoreSpecimen addIdentifier(IdentifierDt param);

   public IdentifierDt addIdentifier();

   public IdentifierDt getIdentifierFirstRep();

   public IdDt getId();

   public IQICoreSpecimen setId(IdDt param);

   public List<Specimen.Treatment> getTreatment();

   public IQICoreSpecimen setTreatment(List<Specimen.Treatment> param);

   public IQICoreSpecimen addTreatment(Specimen.Treatment param);

   public Specimen.Treatment addTreatment();

   public Specimen.Treatment getTreatmentFirstRep();

   public Specimen.Collection getCollection();

   public IQICoreSpecimen setCollection(Specimen.Collection param);

   public String getStatus();

   public IQICoreSpecimen setStatus(String param);

   public IQICoreSpecimen setStatus(SpecimenStatusEnum param);

   public BoundCodeDt<SpecimenStatusEnum> getStatusElement();

   public IQICoreSpecimen setStatus(BoundCodeDt<SpecimenStatusEnum> param);

   public ContainedDt getContained();

   public IQICoreSpecimen setContained(ContainedDt param);

   public CodeDt getLanguage();

   public IQICoreSpecimen setLanguage(CodeDt param);
}