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

import ca.uhn.fhir.model.dstu2.resource.Basic;
import ca.uhn.fhir.model.api.ExtensionDt;
import java.util.List;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.CodeDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.PeriodDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.BooleanDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.StringDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.DateDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import java.util.Date;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import org.socraticgrid.fhir.generated.QICoreAdverseEventCause;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.DateTimeDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.ContainedDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt;
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
import ca.uhn.fhir.model.dstu2.resource.*;

public interface IQICoreAdverseEvent
{

   public Basic getAdaptee();

   public void setAdaptee(Basic param);

   public CodeDt getLanguage();

   public IQICoreAdverseEvent setLanguage(CodeDt param);

   public List<PeriodDt> getPeriod();

   public IQICoreAdverseEvent setPeriod(List<PeriodDt> param);

   public CodeableConceptDt getCode();

   public IQICoreAdverseEvent setCode(CodeableConceptDt param);

   public List<BooleanDt> getDidNotOccur();

   public IQICoreAdverseEvent setDidNotOccur(List<BooleanDt> param);

   public List<StringDt> getClinicalStudy();

   public IQICoreAdverseEvent setClinicalStudy(List<StringDt> param);

   public DateDt getCreatedElement();

   public Date getCreated();

   public IQICoreAdverseEvent setCreated(Date param);

   public IQICoreAdverseEvent setCreated(DateDt param);

   public List<QICoreAdverseEventCause> getCause();

   public IQICoreAdverseEvent setCause(List<QICoreAdverseEventCause> param);

   public List<DateTimeDt> getDiscoveryDateTime();

   public IQICoreAdverseEvent setDiscoveryDateTime(List<DateTimeDt> param);

   public List<CodeDt> getSeverity();

   public IQICoreAdverseEvent setSeverity(List<CodeDt> param);

   public ContainedDt getContained();

   public IQICoreAdverseEvent setContained(ContainedDt param);

   public List<ResourceReferenceDt> getReaction();

   public IQICoreAdverseEvent setReaction(List<ResourceReferenceDt> param);

   public List<IdentifierDt> getIdentifier();

   public IQICoreAdverseEvent setIdentifier(List<IdentifierDt> param);

   public IQICoreAdverseEvent addIdentifier(IdentifierDt param);

   public IdentifierDt addIdentifier();

   public IdentifierDt getIdentifierFirstRep();

   public IdDt getId();

   public IQICoreAdverseEvent setId(IdDt param);

   public NarrativeDt getText();

   public IQICoreAdverseEvent setText(NarrativeDt param);

   public List<CodeDt> getCategory();

   public IQICoreAdverseEvent setCategory(List<CodeDt> param);

   public List<CodeableConceptDt> getType();

   public IQICoreAdverseEvent setType(List<CodeableConceptDt> param);

   public QICorePatientAdapter getSubjectResource();

   public IQICoreAdverseEvent setSubjectResource(QICorePatientAdapter param);

   public List<ResourceReferenceDt> getLocation();

   public IQICoreAdverseEvent setLocation(List<ResourceReferenceDt> param);
}