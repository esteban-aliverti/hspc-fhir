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

import org.socraticgrid.fhir.generated.IMedication;
import ca.uhn.fhir.model.dstu2.resource.Medication;
import ca.uhn.fhir.model.primitive.BooleanDt;
import ca.uhn.fhir.model.dstu2.composite.ContainedDt;
import ca.uhn.fhir.model.dstu2.resource.Organization;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.primitive.CodeDt;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.dstu2.composite.NarrativeDt;
import ca.uhn.fhir.model.api.ExtensionDt;
import java.util.List;
import ca.uhn.fhir.model.dstu2.resource.*;

public class MedicationAdapter implements IMedication
{

   private Medication adaptedClass = null;

   public MedicationAdapter()
   {
      this.adaptedClass = new ca.uhn.fhir.model.dstu2.resource.Medication();
   }

   public MedicationAdapter(Medication adaptee)
   {
      this.adaptedClass = adaptee;
   }

   public Medication getAdaptee()
   {
      return adaptedClass;
   }

   public void setAdaptee(Medication param)
   {
      this.adaptedClass = param;
   }

   public Medication.Product getProduct()
   {
      return adaptedClass.getProduct();
   }

   public IMedication setProduct(Medication.Product param)
   {
      adaptedClass.setProduct(param);
      return this;
   }

   public Medication.Package getPackage()
   {
      return adaptedClass.getPackage();
   }

   public IMedication setPackage(Medication.Package param)
   {
      adaptedClass.setPackage(param);
      return this;
   }

   public BooleanDt getIsBrandElement()
   {
      return adaptedClass.getIsBrandElement();
   }

   public Boolean getIsBrand()
   {
      return adaptedClass.getIsBrand();
   }

   public IMedication setIsBrand(Boolean param)
   {
      adaptedClass
            .setIsBrand(new ca.uhn.fhir.model.primitive.BooleanDt(param));
      return this;
   }

   public IMedication setIsBrand(BooleanDt param)
   {
      adaptedClass.setIsBrand(param);
      return this;
   }

   public ContainedDt getContained()
   {
      return adaptedClass.getContained();
   }

   public IMedication setContained(ContainedDt param)
   {
      adaptedClass.setContained(param);
      return this;
   }

   public Organization getManufacturerResource()
   {
      if (adaptedClass.getManufacturer().getResource() instanceof ca.uhn.fhir.model.dstu2.resource.Organization)
      {
         return (ca.uhn.fhir.model.dstu2.resource.Organization) adaptedClass
               .getManufacturer().getResource();
      }
      else
      {
         return null;
      }
   }

   public IMedication setManufacturerResource(Organization param)
   {
      adaptedClass.getManufacturer().setResource(param);
      return this;
   }

   public IdDt getId()
   {
      return adaptedClass.getId();
   }

   public IMedication setId(IdDt param)
   {
      adaptedClass.setId(param);
      return this;
   }

   public CodeDt getLanguage()
   {
      return adaptedClass.getLanguage();
   }

   public IMedication setLanguage(CodeDt param)
   {
      adaptedClass.setLanguage(param);
      return this;
   }

   public CodeableConceptDt getCode()
   {
      return adaptedClass.getCode();
   }

   public IMedication setCode(CodeableConceptDt param)
   {
      adaptedClass.setCode(param);
      return this;
   }

   public NarrativeDt getText()
   {
      return adaptedClass.getText();
   }

   public IMedication setText(NarrativeDt param)
   {
      adaptedClass.setText(param);
      return this;
   }
}