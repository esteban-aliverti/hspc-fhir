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

import ca.uhn.fhir.model.dstu2.resource.Practitioner;
import ca.uhn.fhir.model.api.ExtensionDt;
import java.util.List;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.AddressDt;
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
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.valueset.AdministrativeGenderEnum;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.BoundCodeDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.CodeDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.HumanNameDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.IdentifierDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.AttachmentDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.ContactPointDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.DateDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import java.util.Date;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.BooleanDt;
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

public interface IQICorePractitioner
{

   public Practitioner getAdaptee();

   public void setAdaptee(Practitioner param);

   public List<Practitioner.PractitionerRole> getPractitionerRole();

   public IQICorePractitioner setPractitionerRole(
         List<Practitioner.PractitionerRole> param);

   public IQICorePractitioner addPractitionerRole(
         Practitioner.PractitionerRole param);

   public Practitioner.PractitionerRole addPractitionerRole();

   public Practitioner.PractitionerRole getPractitionerRoleFirstRep();

   public List<AddressDt> getAddress();

   public IQICorePractitioner setAddress(List<AddressDt> param);

   public IQICorePractitioner addAddress(AddressDt param);

   public AddressDt addAddress();

   public AddressDt getAddressFirstRep();

   public List<Practitioner.Qualification> getQualification();

   public IQICorePractitioner setQualification(
         List<Practitioner.Qualification> param);

   public IQICorePractitioner addQualification(Practitioner.Qualification param);

   public Practitioner.Qualification addQualification();

   public Practitioner.Qualification getQualificationFirstRep();

   public ContainedDt getContained();

   public IQICorePractitioner setContained(ContainedDt param);

   public String getGender();

   public IQICorePractitioner setGender(String param);

   public IQICorePractitioner setGender(AdministrativeGenderEnum param);

   public BoundCodeDt<AdministrativeGenderEnum> getGenderElement();

   public IQICorePractitioner setGender(
         BoundCodeDt<AdministrativeGenderEnum> param);

   public IdDt getId();

   public IQICorePractitioner setId(IdDt param);

   public CodeDt getLanguage();

   public IQICorePractitioner setLanguage(CodeDt param);

   public HumanNameDt getName();

   public IQICorePractitioner setName(HumanNameDt param);

   public List<IdentifierDt> getIdentifier();

   public IQICorePractitioner setIdentifier(List<IdentifierDt> param);

   public IQICorePractitioner addIdentifier(IdentifierDt param);

   public IdentifierDt addIdentifier();

   public IdentifierDt getIdentifierFirstRep();

   public List<AttachmentDt> getPhoto();

   public IQICorePractitioner setPhoto(List<AttachmentDt> param);

   public IQICorePractitioner addPhoto(AttachmentDt param);

   public AttachmentDt addPhoto();

   public AttachmentDt getPhotoFirstRep();

   public List<ContactPointDt> getTelecom();

   public IQICorePractitioner setTelecom(List<ContactPointDt> param);

   public IQICorePractitioner addTelecom(ContactPointDt param);

   public ContactPointDt addTelecom();

   public ContactPointDt getTelecomFirstRep();

   public DateDt getBirthDateElement();

   public Date getBirthDate();

   public IQICorePractitioner setBirthDate(Date param);

   public IQICorePractitioner setBirthDate(DateDt param);

   public BooleanDt getActiveElement();

   public Boolean getActive();

   public IQICorePractitioner setActive(Boolean param);

   public IQICorePractitioner setActive(BooleanDt param);

   public NarrativeDt getText();

   public IQICorePractitioner setText(NarrativeDt param);

   public CodeableConceptDt getClassification();

   public IQICorePractitioner setClassification(CodeableConceptDt param);
}