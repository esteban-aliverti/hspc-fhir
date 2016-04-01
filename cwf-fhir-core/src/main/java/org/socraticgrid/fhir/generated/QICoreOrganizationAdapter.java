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

public class QICoreOrganizationAdapter implements IQICoreOrganization {
    
    
    private Organization adaptedClass = null;
    
    public QICoreOrganizationAdapter() {
        this.adaptedClass = new ca.uhn.fhir.model.dstu2.resource.Organization();
    }
    
    public QICoreOrganizationAdapter(Organization adaptee) {
        this.adaptedClass = adaptee;
    }
    
    @Override
    public Organization getAdaptee() {
        return adaptedClass;
    }
    
    @Override
    public void setAdaptee(Organization param) {
        this.adaptedClass = param;
    }
    
    @Override
    public QICoreOrganizationAdapter getPartOfResource() {
        if (adaptedClass.getPartOf().getResource() instanceof ca.uhn.fhir.model.dstu2.resource.Organization) {
            org.socraticgrid.fhir.generated.QICoreOrganizationAdapter profiledType = new org.socraticgrid.fhir.generated.QICoreOrganizationAdapter();
            profiledType.setAdaptee((ca.uhn.fhir.model.dstu2.resource.Organization) adaptedClass.getPartOf().getResource());
            return profiledType;
        } else {
            return null;
        }
    }
    
    @Override
    public IQICoreOrganization setPartOfResource(QICoreOrganizationAdapter param) {
        adaptedClass.getPartOf().setResource(param.getAdaptee());
        return this;
    }
    
    @Override
    public List<Organization.Contact> getContact() {
        return adaptedClass.getContact();
    }
    
    @Override
    public IQICoreOrganization setContact(List<Organization.Contact> param) {
        adaptedClass.setContact(param);
        return this;
    }
    
    @Override
    public IQICoreOrganization addContact(Organization.Contact param) {
        adaptedClass.addContact(param);
        return this;
    }
    
    @Override
    public Organization.Contact addContact() {
        ca.uhn.fhir.model.dstu2.resource.Organization.Contact item = new ca.uhn.fhir.model.dstu2.resource.Organization.Contact();
        adaptedClass.addContact(item);
        return item;
    }
    
    @Override
    public Organization.Contact getContactFirstRep() {
        return adaptedClass.getContactFirstRep();
    }
    
    @Override
    public List<AddressDt> getAddress() {
        return adaptedClass.getAddress();
    }
    
    @Override
    public IQICoreOrganization setAddress(List<AddressDt> param) {
        adaptedClass.setAddress(param);
        return this;
    }
    
    @Override
    public IQICoreOrganization addAddress(AddressDt param) {
        adaptedClass.addAddress(param);
        return this;
    }
    
    @Override
    public AddressDt addAddress() {
        ca.uhn.fhir.model.dstu2.composite.AddressDt item = new ca.uhn.fhir.model.dstu2.composite.AddressDt();
        adaptedClass.addAddress(item);
        return item;
    }
    
    @Override
    public AddressDt getAddressFirstRep() {
        return adaptedClass.getAddressFirstRep();
    }
    
    @Override
    public StringDt getNameElement() {
        return adaptedClass.getNameElement();
    }
    
    @Override
    public String getName() {
        return adaptedClass.getName();
    }
    
    @Override
    public IQICoreOrganization setName(String param) {
        adaptedClass.setName(new ca.uhn.fhir.model.primitive.StringDt(param));
        return this;
    }
    
    @Override
    public IQICoreOrganization setName(StringDt param) {
        adaptedClass.setName(param);
        return this;
    }
    
    @Override
    public NarrativeDt getText() {
        return adaptedClass.getText();
    }
    
    @Override
    public IQICoreOrganization setText(NarrativeDt param) {
        adaptedClass.setText(param);
        return this;
    }
    
    @Override
    public List<ContactPointDt> getTelecom() {
        return adaptedClass.getTelecom();
    }
    
    @Override
    public IQICoreOrganization setTelecom(List<ContactPointDt> param) {
        adaptedClass.setTelecom(param);
        return this;
    }
    
    @Override
    public IQICoreOrganization addTelecom(ContactPointDt param) {
        adaptedClass.addTelecom(param);
        return this;
    }
    
    @Override
    public ContactPointDt addTelecom() {
        ca.uhn.fhir.model.dstu2.composite.ContactPointDt item = new ca.uhn.fhir.model.dstu2.composite.ContactPointDt();
        adaptedClass.addTelecom(item);
        return item;
    }
    
    @Override
    public ContactPointDt getTelecomFirstRep() {
        return adaptedClass.getTelecomFirstRep();
    }
    
    @Override
    public CodeableConceptDt getType() {
        return adaptedClass.getType();
    }
    
    @Override
    public IQICoreOrganization setType(CodeableConceptDt param) {
        adaptedClass.setType(param);
        return this;
    }
    
    @Override
    public CodeDt getLanguage() {
        return adaptedClass.getLanguage();
    }
    
    @Override
    public IQICoreOrganization setLanguage(CodeDt param) {
        adaptedClass.setLanguage(param);
        return this;
    }
    
    @Override
    public IdDt getId() {
        return adaptedClass.getId();
    }
    
    @Override
    public IQICoreOrganization setId(IdDt param) {
        adaptedClass.setId(param);
        return this;
    }
    
    @Override
    public ContainedDt getContained() {
        return adaptedClass.getContained();
    }
    
    @Override
    public IQICoreOrganization setContained(ContainedDt param) {
        adaptedClass.setContained(param);
        return this;
    }
    
    @Override
    public List<IdentifierDt> getIdentifier() {
        return adaptedClass.getIdentifier();
    }
    
    @Override
    public IQICoreOrganization setIdentifier(List<IdentifierDt> param) {
        adaptedClass.setIdentifier(param);
        return this;
    }
    
    @Override
    public IQICoreOrganization addIdentifier(IdentifierDt param) {
        adaptedClass.addIdentifier(param);
        return this;
    }
    
    @Override
    public IdentifierDt addIdentifier() {
        ca.uhn.fhir.model.dstu2.composite.IdentifierDt item = new ca.uhn.fhir.model.dstu2.composite.IdentifierDt();
        adaptedClass.addIdentifier(item);
        return item;
    }
    
    @Override
    public IdentifierDt getIdentifierFirstRep() {
        return adaptedClass.getIdentifierFirstRep();
    }
    
    @Override
    public BooleanDt getActiveElement() {
        return adaptedClass.getActiveElement();
    }
    
    @Override
    public Boolean getActive() {
        return adaptedClass.getActive();
    }
    
    @Override
    public IQICoreOrganization setActive(Boolean param) {
        adaptedClass.setActive(new ca.uhn.fhir.model.primitive.BooleanDt(param));
        return this;
    }
    
    @Override
    public IQICoreOrganization setActive(BooleanDt param) {
        adaptedClass.setActive(param);
        return this;
    }
}
