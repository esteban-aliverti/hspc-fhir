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

import ca.uhn.fhir.model.dstu2.resource.Location;
import ca.uhn.fhir.model.api.ExtensionDt;
import java.util.List;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.AddressDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.ContactPointDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.ContainedDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.StringDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.valueset.LocationModeEnum;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.BoundCodeDt;
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
import ca.uhn.fhir.model.dstu2.composite.IdentifierDt;
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
import ca.uhn.fhir.model.dstu2.valueset.LocationTypeEnum;
import ca.uhn.fhir.model.dstu2.composite.BoundCodeableConceptDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.CodeDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.valueset.LocationStatusEnum;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;

public interface IQICoreLocation
{

   public Location getAdaptee();

   public void setAdaptee(Location param);

   public Location.Position getPosition();

   public IQICoreLocation setPosition(Location.Position param);

   public AddressDt getAddress();

   public IQICoreLocation setAddress(AddressDt param);

   public List<ContactPointDt> getTelecom();

   public IQICoreLocation setTelecom(List<ContactPointDt> param);

   public IQICoreLocation addTelecom(ContactPointDt param);

   public ContactPointDt addTelecom();

   public ContactPointDt getTelecomFirstRep();

   public ContainedDt getContained();

   public IQICoreLocation setContained(ContainedDt param);

   public CodeableConceptDt getPhysicalType();

   public IQICoreLocation setPhysicalType(CodeableConceptDt param);

   public StringDt getDescriptionElement();

   public String getDescription();

   public IQICoreLocation setDescription(String param);

   public IQICoreLocation setDescription(StringDt param);

   public String getMode();

   public IQICoreLocation setMode(String param);

   public IQICoreLocation setMode(LocationModeEnum param);

   public BoundCodeDt<LocationModeEnum> getModeElement();

   public IQICoreLocation setMode(BoundCodeDt<LocationModeEnum> param);

   public QICoreLocationAdapter getPartOfResource();

   public IQICoreLocation setPartOfResource(QICoreLocationAdapter param);

   public IdDt getId();

   public IQICoreLocation setId(IdDt param);

   public StringDt getNameElement();

   public String getName();

   public IQICoreLocation setName(String param);

   public IQICoreLocation setName(StringDt param);

   public List<IdentifierDt> getIdentifier();

   public IQICoreLocation setIdentifier(List<IdentifierDt> param);

   public IQICoreLocation addIdentifier(IdentifierDt param);

   public IdentifierDt addIdentifier();

   public IdentifierDt getIdentifierFirstRep();

   public QICoreOrganizationAdapter getManagingOrganizationResource();

   public IQICoreLocation setManagingOrganizationResource(
         QICoreOrganizationAdapter param);

   public NarrativeDt getText();

   public IQICoreLocation setText(NarrativeDt param);

   public BoundCodeableConceptDt<LocationTypeEnum> getType();

   public IQICoreLocation setType(
         BoundCodeableConceptDt<LocationTypeEnum> param);

   public CodeDt getLanguage();

   public IQICoreLocation setLanguage(CodeDt param);

   public String getStatus();

   public IQICoreLocation setStatus(String param);

   public IQICoreLocation setStatus(LocationStatusEnum param);

   public BoundCodeDt<LocationStatusEnum> getStatusElement();

   public IQICoreLocation setStatus(BoundCodeDt<LocationStatusEnum> param);
}