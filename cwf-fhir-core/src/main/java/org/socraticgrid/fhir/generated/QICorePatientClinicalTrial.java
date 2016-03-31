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

import ca.uhn.fhir.model.api.ExtensionDt;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.dstu2.composite.PeriodDt;
import ca.uhn.fhir.model.primitive.StringDt;
import ca.uhn.fhir.model.dstu2.resource.BaseResource;
import java.util.List;
import ca.uhn.fhir.model.dstu2.resource.*;

public class QICorePatientClinicalTrial
{

   private ExtensionDt adaptedClass = null;
   public static final String uri = "http://hl7.org/fhir/StructureDefinition/patient-clinicalTrial";
   private ExtensionDt rootObjectExtension = new ExtensionDt(false, uri);

   public QICorePatientClinicalTrial()
   {
      this.adaptedClass = new ca.uhn.fhir.model.api.ExtensionDt();
   }

   public QICorePatientClinicalTrial(ExtensionDt adaptee)
   {
      this.adaptedClass = adaptee;
   }

   public ExtensionDt getAdaptee()
   {
      return adaptedClass;
   }

   public void setAdaptee(ExtensionDt param)
   {
      this.adaptedClass = param;
   }

   public CodeableConceptDt getReason()
   {
      ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt returnValue;
      java.util.List<ExtensionDt> extensions = rootObjectExtension
            .getUndeclaredExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/patient-clinicalTrial#reason");
      if (extensions.size() == 1)
      {
         returnValue = (ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt) extensions
               .get(0).getValue();
      }
      else if (extensions.size() == 0)
      {
         returnValue = null;
      }
      else
      {
         throw new IllegalStateException(
               "More than one extension specified for this object.");
      }
      return returnValue;
   }

   public QICorePatientClinicalTrial setReason(CodeableConceptDt param)
   {
      java.util.List<ExtensionDt> extensions = rootObjectExtension
            .getUndeclaredExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/patient-clinicalTrial#reason");
      if (extensions.size() == 1)
      {
         extensions.get(0).setValue(param);
      }
      else if (extensions.size() == 0)
      {
         ExtensionDt newExtension = new ExtensionDt(
               false,
               "http://hl7.org/fhir/StructureDefinition/patient-clinicalTrial#reason",
               param);
         rootObjectExtension.addUndeclaredExtension(newExtension);
      }
      else
      {
         throw new IllegalStateException(
               "More than one extension specified for this object.");
      }
      return this;
   }

   public PeriodDt getPeriod()
   {
      ca.uhn.fhir.model.dstu2.composite.PeriodDt returnValue;
      java.util.List<ExtensionDt> extensions = rootObjectExtension
            .getUndeclaredExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/patient-clinicalTrial#period");
      if (extensions.size() == 1)
      {
         returnValue = (ca.uhn.fhir.model.dstu2.composite.PeriodDt) extensions
               .get(0).getValue();
      }
      else if (extensions.size() == 0)
      {
         returnValue = null;
      }
      else
      {
         throw new IllegalStateException(
               "More than one extension specified for this object.");
      }
      return returnValue;
   }

   public QICorePatientClinicalTrial setPeriod(PeriodDt param)
   {
      java.util.List<ExtensionDt> extensions = rootObjectExtension
            .getUndeclaredExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/patient-clinicalTrial#period");
      if (extensions.size() == 1)
      {
         extensions.get(0).setValue(param);
      }
      else if (extensions.size() == 0)
      {
         ExtensionDt newExtension = new ExtensionDt(
               false,
               "http://hl7.org/fhir/StructureDefinition/patient-clinicalTrial#period",
               param);
         rootObjectExtension.addUndeclaredExtension(newExtension);
      }
      else
      {
         throw new IllegalStateException(
               "More than one extension specified for this object.");
      }
      return this;
   }

   public StringDt getNCT()
   {
      ca.uhn.fhir.model.primitive.StringDt returnValue;
      java.util.List<ExtensionDt> extensions = rootObjectExtension
            .getUndeclaredExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/patient-clinicalTrial#NCT");
      if (extensions.size() == 1)
      {
         returnValue = (ca.uhn.fhir.model.primitive.StringDt) extensions
               .get(0).getValue();
      }
      else if (extensions.size() == 0)
      {
         returnValue = null;
      }
      else
      {
         throw new IllegalStateException(
               "More than one extension specified for this object.");
      }
      return returnValue;
   }

   public QICorePatientClinicalTrial setNCT(StringDt param)
   {
      java.util.List<ExtensionDt> extensions = rootObjectExtension
            .getUndeclaredExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/patient-clinicalTrial#NCT");
      if (extensions.size() == 1)
      {
         extensions.get(0).setValue(param);
      }
      else if (extensions.size() == 0)
      {
         ExtensionDt newExtension = new ExtensionDt(
               false,
               "http://hl7.org/fhir/StructureDefinition/patient-clinicalTrial#NCT",
               param);
         rootObjectExtension.addUndeclaredExtension(newExtension);
      }
      else
      {
         throw new IllegalStateException(
               "More than one extension specified for this object.");
      }
      return this;
   }

   public ExtensionDt getRootObjectExtension()
   {
      return rootObjectExtension;
   }

   public void setRootObjectExtension(ExtensionDt rootObjectExtension)
   {
      this.rootObjectExtension = rootObjectExtension;
   }

   public ExtensionDt bindTemplateToParent(BaseResource containingResource)
   {
      rootObjectExtension = new ExtensionDt(false, uri);
      containingResource.addUndeclaredExtension(rootObjectExtension);
      return rootObjectExtension;
   }
}