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

public interface IQICoreOrganization {
    
    
    public Organization getAdaptee();
    
    public void setAdaptee(Organization param);
    
    public QICoreOrganizationAdapter getPartOfResource();
    
    public IQICoreOrganization setPartOfResource(QICoreOrganizationAdapter param);
    
    public List<Organization.Contact> getContact();
    
    public IQICoreOrganization setContact(List<Organization.Contact> param);
    
    public IQICoreOrganization addContact(Organization.Contact param);
    
    public Organization.Contact addContact();
    
    public Organization.Contact getContactFirstRep();
    
    public List<AddressDt> getAddress();
    
    public IQICoreOrganization setAddress(List<AddressDt> param);
    
    public IQICoreOrganization addAddress(AddressDt param);
    
    public AddressDt addAddress();
    
    public AddressDt getAddressFirstRep();
    
    public StringDt getNameElement();
    
    public String getName();
    
    public IQICoreOrganization setName(String param);
    
    public IQICoreOrganization setName(StringDt param);
    
    public NarrativeDt getText();
    
    public IQICoreOrganization setText(NarrativeDt param);
    
    public List<ContactPointDt> getTelecom();
    
    public IQICoreOrganization setTelecom(List<ContactPointDt> param);
    
    public IQICoreOrganization addTelecom(ContactPointDt param);
    
    public ContactPointDt addTelecom();
    
    public ContactPointDt getTelecomFirstRep();
    
    public CodeableConceptDt getType();
    
    public IQICoreOrganization setType(CodeableConceptDt param);
    
    public CodeDt getLanguage();
    
    public IQICoreOrganization setLanguage(CodeDt param);
    
    public IdDt getId();
    
    public IQICoreOrganization setId(IdDt param);
    
    public ContainedDt getContained();
    
    public IQICoreOrganization setContained(ContainedDt param);
    
    public List<IdentifierDt> getIdentifier();
    
    public IQICoreOrganization setIdentifier(List<IdentifierDt> param);
    
    public IQICoreOrganization addIdentifier(IdentifierDt param);
    
    public IdentifierDt addIdentifier();
    
    public IdentifierDt getIdentifierFirstRep();
    
    public BooleanDt getActiveElement();
    
    public Boolean getActive();
    
    public IQICoreOrganization setActive(Boolean param);
    
    public IQICoreOrganization setActive(BooleanDt param);
}
