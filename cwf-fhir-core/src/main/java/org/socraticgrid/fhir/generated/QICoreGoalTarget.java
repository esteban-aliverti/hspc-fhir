package org.socraticgrid.fhir.generated;

import ca.uhn.fhir.model.api.ExtensionDt;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.dstu2.resource.BaseResource;
import java.util.List;
import ca.uhn.fhir.model.dstu2.resource.*;

public class QICoreGoalTarget
{

   private ExtensionDt adaptedClass = null;
   public static final String uri = "http://hl7.org/fhir/StructureDefinition/goal-target";
   private ExtensionDt rootObjectExtension = new ExtensionDt(false, uri);

   public QICoreGoalTarget()
   {
      this.adaptedClass = new ca.uhn.fhir.model.api.ExtensionDt();
   }

   public QICoreGoalTarget(ExtensionDt adaptee)
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

   public CodeableConceptDt getMeasure()
   {
      ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt returnValue;
      java.util.List<ExtensionDt> extensions = rootObjectExtension
            .getUndeclaredExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/goal-target#measure");
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

   public QICoreGoalTarget setMeasure(CodeableConceptDt param)
   {
      java.util.List<ExtensionDt> extensions = rootObjectExtension
            .getUndeclaredExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/goal-target#measure");
      if (extensions.size() == 1)
      {
         extensions.get(0).setValue(param);
      }
      else if (extensions.size() == 0)
      {
         ExtensionDt newExtension = new ExtensionDt(
               false,
               "http://hl7.org/fhir/StructureDefinition/goal-target#measure",
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

   public void getDetail()
   {
      throw new UnsupportedOperationException("Not yet implemented");
   }

   public QICoreGoalTarget setDetail()
   {
      throw new UnsupportedOperationException("Not yet implemented");
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