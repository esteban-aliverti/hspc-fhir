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

import java.util.List;

import ca.uhn.fhir.model.dstu2.composite.AddressDt;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.dstu2.composite.ContactPointDt;
import ca.uhn.fhir.model.dstu2.composite.ContainedDt;
import ca.uhn.fhir.model.dstu2.composite.IdentifierDt;
import ca.uhn.fhir.model.dstu2.composite.NarrativeDt;
import ca.uhn.fhir.model.dstu2.resource.Organization;
import ca.uhn.fhir.model.primitive.BooleanDt;
import ca.uhn.fhir.model.primitive.CodeDt;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.primitive.StringDt;

public interface IOrganization {
    
    
    public Organization getAdaptee();
    
    public void setAdaptee(Organization param);
    
    public Organization getPartOfResource();
    
    public IOrganization setPartOfResource(Organization param);
    
    public IdDt getId();
    
    public IOrganization setId(IdDt param);
    
    public ContainedDt getContained();
    
    public IOrganization setContained(ContainedDt param);
    
    public List<Organization.Contact> getContact();
    
    public IOrganization setContact(List<Organization.Contact> param);
    
    public IOrganization addContact(Organization.Contact param);
    
    public Organization.Contact addContact();
    
    public Organization.Contact getContactFirstRep();
    
    public NarrativeDt getText();
    
    public IOrganization setText(NarrativeDt param);
    
    public StringDt getNameElement();
    
    public String getName();
    
    public IOrganization setName(String param);
    
    public IOrganization setName(StringDt param);
    
    public List<IdentifierDt> getIdentifier();
    
    public IOrganization setIdentifier(List<IdentifierDt> param);
    
    public IOrganization addIdentifier(IdentifierDt param);
    
    public IdentifierDt addIdentifier();
    
    public IdentifierDt getIdentifierFirstRep();
    
    public List<ContactPointDt> getTelecom();
    
    public IOrganization setTelecom(List<ContactPointDt> param);
    
    public IOrganization addTelecom(ContactPointDt param);
    
    public ContactPointDt addTelecom();
    
    public ContactPointDt getTelecomFirstRep();
    
    public CodeableConceptDt getType();
    
    public IOrganization setType(CodeableConceptDt param);
    
    public CodeDt getLanguage();
    
    public IOrganization setLanguage(CodeDt param);
    
    public List<AddressDt> getAddress();
    
    public IOrganization setAddress(List<AddressDt> param);
    
    public IOrganization addAddress(AddressDt param);
    
    public AddressDt addAddress();
    
    public AddressDt getAddressFirstRep();
    
    public BooleanDt getActiveElement();
    
    public Boolean getActive();
    
    public IOrganization setActive(Boolean param);
    
    public IOrganization setActive(BooleanDt param);
}
