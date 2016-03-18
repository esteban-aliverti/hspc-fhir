package org.socraticgrid.fhir.generated;

import ca.uhn.fhir.model.dstu2.resource.Practitioner;
import ca.uhn.fhir.model.api.ExtensionDt;
import java.util.List;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.AddressDt;
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

public interface IPractitioner
{

   public Practitioner getAdaptee();

   public void setAdaptee(Practitioner param);

   public List<AddressDt> getAddress();

   public IPractitioner setAddress(List<AddressDt> param);

   public IPractitioner addAddress(AddressDt param);

   public AddressDt addAddress();

   public AddressDt getAddressFirstRep();

   public ContainedDt getContained();

   public IPractitioner setContained(ContainedDt param);

   public List<Practitioner.Qualification> getQualification();

   public IPractitioner setQualification(List<Practitioner.Qualification> param);

   public IPractitioner addQualification(Practitioner.Qualification param);

   public Practitioner.Qualification addQualification();

   public Practitioner.Qualification getQualificationFirstRep();

   public List<Practitioner.PractitionerRole> getPractitionerRole();

   public IPractitioner setPractitionerRole(
         List<Practitioner.PractitionerRole> param);

   public IPractitioner addPractitionerRole(Practitioner.PractitionerRole param);

   public Practitioner.PractitionerRole addPractitionerRole();

   public Practitioner.PractitionerRole getPractitionerRoleFirstRep();

   public String getGender();

   public IPractitioner setGender(String param);

   public IPractitioner setGender(AdministrativeGenderEnum param);

   public BoundCodeDt<AdministrativeGenderEnum> getGenderElement();

   public IPractitioner setGender(BoundCodeDt<AdministrativeGenderEnum> param);

   public IdDt getId();

   public IPractitioner setId(IdDt param);

   public CodeDt getLanguage();

   public IPractitioner setLanguage(CodeDt param);

   public HumanNameDt getName();

   public IPractitioner setName(HumanNameDt param);

   public List<IdentifierDt> getIdentifier();

   public IPractitioner setIdentifier(List<IdentifierDt> param);

   public IPractitioner addIdentifier(IdentifierDt param);

   public IdentifierDt addIdentifier();

   public IdentifierDt getIdentifierFirstRep();

   public List<AttachmentDt> getPhoto();

   public IPractitioner setPhoto(List<AttachmentDt> param);

   public IPractitioner addPhoto(AttachmentDt param);

   public AttachmentDt addPhoto();

   public AttachmentDt getPhotoFirstRep();

   public List<ContactPointDt> getTelecom();

   public IPractitioner setTelecom(List<ContactPointDt> param);

   public IPractitioner addTelecom(ContactPointDt param);

   public ContactPointDt addTelecom();

   public ContactPointDt getTelecomFirstRep();

   public DateDt getBirthDateElement();

   public Date getBirthDate();

   public IPractitioner setBirthDate(Date param);

   public IPractitioner setBirthDate(DateDt param);

   public BooleanDt getActiveElement();

   public Boolean getActive();

   public IPractitioner setActive(Boolean param);

   public IPractitioner setActive(BooleanDt param);

   public NarrativeDt getText();

   public IPractitioner setText(NarrativeDt param);
}