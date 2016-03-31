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

import org.socraticgrid.fhir.generated.IQICoreSubstance;
import ca.uhn.fhir.model.dstu2.resource.Substance;
import java.util.List;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.primitive.CodeDt;
import ca.uhn.fhir.model.primitive.StringDt;
import ca.uhn.fhir.model.dstu2.composite.IdentifierDt;
import ca.uhn.fhir.model.dstu2.composite.ContainedDt;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.dstu2.composite.NarrativeDt;
import ca.uhn.fhir.model.api.ExtensionDt;
import ca.uhn.fhir.model.dstu2.resource.*;

public class QICoreSubstanceAdapter implements IQICoreSubstance
{

   private Substance adaptedClass = null;

   public QICoreSubstanceAdapter()
   {
      this.adaptedClass = new ca.uhn.fhir.model.dstu2.resource.Substance();
   }

   public QICoreSubstanceAdapter(Substance adaptee)
   {
      this.adaptedClass = adaptee;
   }

   public Substance getAdaptee()
   {
      return adaptedClass;
   }

   public void setAdaptee(Substance param)
   {
      this.adaptedClass = param;
   }

   public List<Substance.Instance> getInstance()
   {
      return adaptedClass.getInstance();
   }

   public IQICoreSubstance setInstance(List<Substance.Instance> param)
   {
      adaptedClass.setInstance(param);
      return this;
   }

   public IQICoreSubstance addInstance(Substance.Instance param)
   {
      adaptedClass.addInstance(param);
      return this;
   }

   public Substance.Instance addInstance()
   {
      ca.uhn.fhir.model.dstu2.resource.Substance.Instance item = new ca.uhn.fhir.model.dstu2.resource.Substance.Instance();
      adaptedClass.addInstance(item);
      return item;
   }

   public Substance.Instance getInstanceFirstRep()
   {
      return adaptedClass.getInstanceFirstRep();
   }

   public IdDt getId()
   {
      return adaptedClass.getId();
   }

   public IQICoreSubstance setId(IdDt param)
   {
      adaptedClass.setId(param);
      return this;
   }

   public CodeDt getLanguage()
   {
      return adaptedClass.getLanguage();
   }

   public IQICoreSubstance setLanguage(CodeDt param)
   {
      adaptedClass.setLanguage(param);
      return this;
   }

   public StringDt getDescriptionElement()
   {
      return adaptedClass.getDescriptionElement();
   }

   public String getDescription()
   {
      return adaptedClass.getDescription();
   }

   public IQICoreSubstance setDescription(String param)
   {
      adaptedClass.setDescription(new ca.uhn.fhir.model.primitive.StringDt(
            param));
      return this;
   }

   public IQICoreSubstance setDescription(StringDt param)
   {
      adaptedClass.setDescription(param);
      return this;
   }

   public List<Substance.Ingredient> getIngredient()
   {
      return adaptedClass.getIngredient();
   }

   public IQICoreSubstance setIngredient(List<Substance.Ingredient> param)
   {
      adaptedClass.setIngredient(param);
      return this;
   }

   public IQICoreSubstance addIngredient(Substance.Ingredient param)
   {
      adaptedClass.addIngredient(param);
      return this;
   }

   public Substance.Ingredient addIngredient()
   {
      ca.uhn.fhir.model.dstu2.resource.Substance.Ingredient item = new ca.uhn.fhir.model.dstu2.resource.Substance.Ingredient();
      adaptedClass.addIngredient(item);
      return item;
   }

   public Substance.Ingredient getIngredientFirstRep()
   {
      return adaptedClass.getIngredientFirstRep();
   }

   public List<IdentifierDt> getIdentifier()
   {
      return adaptedClass.getIdentifier();
   }

   public IQICoreSubstance setIdentifier(List<IdentifierDt> param)
   {
      adaptedClass.setIdentifier(param);
      return this;
   }

   public IQICoreSubstance addIdentifier(IdentifierDt param)
   {
      adaptedClass.addIdentifier(param);
      return this;
   }

   public IdentifierDt addIdentifier()
   {
      ca.uhn.fhir.model.dstu2.composite.IdentifierDt item = new ca.uhn.fhir.model.dstu2.composite.IdentifierDt();
      adaptedClass.addIdentifier(item);
      return item;
   }

   public IdentifierDt getIdentifierFirstRep()
   {
      return adaptedClass.getIdentifierFirstRep();
   }

   public ContainedDt getContained()
   {
      return adaptedClass.getContained();
   }

   public IQICoreSubstance setContained(ContainedDt param)
   {
      adaptedClass.setContained(param);
      return this;
   }

   public CodeableConceptDt getCode()
   {
      return adaptedClass.getCode();
   }

   public IQICoreSubstance setCode(CodeableConceptDt param)
   {
      adaptedClass.setCode(param);
      return this;
   }

   public NarrativeDt getText()
   {
      return adaptedClass.getText();
   }

   public IQICoreSubstance setText(NarrativeDt param)
   {
      adaptedClass.setText(param);
      return this;
   }
}