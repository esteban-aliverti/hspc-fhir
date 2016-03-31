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

import org.socraticgrid.fhir.generated.IQICoreCommunication;
import ca.uhn.fhir.model.dstu2.resource.Communication;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import java.util.List;
import ca.uhn.fhir.model.primitive.CodeDt;
import ca.uhn.fhir.model.primitive.DateTimeDt;
import java.util.Date;
import ca.uhn.fhir.model.dstu2.composite.NarrativeDt;
import ca.uhn.fhir.model.dstu2.composite.ContainedDt;
import ca.uhn.fhir.model.dstu2.composite.IdentifierDt;
import ca.uhn.fhir.model.dstu2.resource.CommunicationRequest;
import ca.uhn.fhir.model.dstu2.valueset.CommunicationStatusEnum;
import ca.uhn.fhir.model.primitive.BoundCodeDt;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.api.ExtensionDt;
import ca.uhn.fhir.model.dstu2.resource.*;

public class QICoreCommunicationAdapter implements IQICoreCommunication
{

   private Communication adaptedClass = null;

   public QICoreCommunicationAdapter()
   {
      this.adaptedClass = new ca.uhn.fhir.model.dstu2.resource.Communication();
   }

   public QICoreCommunicationAdapter(Communication adaptee)
   {
      this.adaptedClass = adaptee;
   }

   public Communication getAdaptee()
   {
      return adaptedClass;
   }

   public void setAdaptee(Communication param)
   {
      this.adaptedClass = param;
   }

   public CodeableConceptDt getReasonNotPerformed()
   {
      List<ca.uhn.fhir.model.api.ExtensionDt> extensions = adaptedClass
            .getUndeclaredExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/communication-reasonNotPerformed");
      if (extensions == null || extensions.size() <= 0)
      {
         return null;
      }
      else if (extensions.size() == 1)
      {
         return (ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt) extensions
               .get(0).getValue();
      }
      else
      {
         throw new RuntimeException(
               "More than one extension exists for reasonNotPerformed");
      }
   }

   public IQICoreCommunication setReasonNotPerformed(CodeableConceptDt param)
   {
      adaptedClass
            .addUndeclaredExtension(
                  false,
                  "http://hl7.org/fhir/StructureDefinition/communication-reasonNotPerformed",
                  param);
      return this;
   }

   public List<Communication.Payload> getPayload()
   {
      return adaptedClass.getPayload();
   }

   public IQICoreCommunication setPayload(List<Communication.Payload> param)
   {
      adaptedClass.setPayload(param);
      return this;
   }

   public IQICoreCommunication addPayload(Communication.Payload param)
   {
      adaptedClass.addPayload(param);
      return this;
   }

   public Communication.Payload addPayload()
   {
      ca.uhn.fhir.model.dstu2.resource.Communication.Payload item = new ca.uhn.fhir.model.dstu2.resource.Communication.Payload();
      adaptedClass.addPayload(item);
      return item;
   }

   public Communication.Payload getPayloadFirstRep()
   {
      return adaptedClass.getPayloadFirstRep();
   }

   public CodeDt getLanguage()
   {
      return adaptedClass.getLanguage();
   }

   public IQICoreCommunication setLanguage(CodeDt param)
   {
      adaptedClass.setLanguage(param);
      return this;
   }

   public QICoreEncounterAdapter getEncounterResource()
   {
      if (adaptedClass.getEncounter().getResource() instanceof ca.uhn.fhir.model.dstu2.resource.Encounter)
      {
         org.socraticgrid.fhir.generated.QICoreEncounterAdapter profiledType = new org.socraticgrid.fhir.generated.QICoreEncounterAdapter();
         profiledType
               .setAdaptee((ca.uhn.fhir.model.dstu2.resource.Encounter) adaptedClass
                     .getEncounter().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public IQICoreCommunication setEncounterResource(
         QICoreEncounterAdapter param)
   {
      adaptedClass.getEncounter().setResource(param.getAdaptee());
      return this;
   }

   public QICorePatientAdapter getSubjectResource()
   {
      if (adaptedClass.getSubject().getResource() instanceof ca.uhn.fhir.model.dstu2.resource.Patient)
      {
         org.socraticgrid.fhir.generated.QICorePatientAdapter profiledType = new org.socraticgrid.fhir.generated.QICorePatientAdapter();
         profiledType
               .setAdaptee((ca.uhn.fhir.model.dstu2.resource.Patient) adaptedClass
                     .getSubject().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public IQICoreCommunication setSubjectResource(QICorePatientAdapter param)
   {
      adaptedClass.getSubject().setResource(param.getAdaptee());
      return this;
   }

   public DateTimeDt getReceivedElement()
   {
      return adaptedClass.getReceivedElement();
   }

   public Date getReceived()
   {
      return adaptedClass.getReceived();
   }

   public IQICoreCommunication setReceived(Date param)
   {
      adaptedClass.setReceived(new ca.uhn.fhir.model.primitive.DateTimeDt(
            param));
      return this;
   }

   public IQICoreCommunication setReceived(DateTimeDt param)
   {
      adaptedClass.setReceived(param);
      return this;
   }

   public NarrativeDt getText()
   {
      return adaptedClass.getText();
   }

   public IQICoreCommunication setText(NarrativeDt param)
   {
      adaptedClass.setText(param);
      return this;
   }

   public ContainedDt getContained()
   {
      return adaptedClass.getContained();
   }

   public IQICoreCommunication setContained(ContainedDt param)
   {
      adaptedClass.setContained(param);
      return this;
   }

   public DateTimeDt getSentElement()
   {
      return adaptedClass.getSentElement();
   }

   public Date getSent()
   {
      return adaptedClass.getSent();
   }

   public IQICoreCommunication setSent(Date param)
   {
      adaptedClass.setSent(new ca.uhn.fhir.model.primitive.DateTimeDt(param));
      return this;
   }

   public IQICoreCommunication setSent(DateTimeDt param)
   {
      adaptedClass.setSent(param);
      return this;
   }

   public CodeableConceptDt getCategory()
   {
      return adaptedClass.getCategory();
   }

   public IQICoreCommunication setCategory(CodeableConceptDt param)
   {
      adaptedClass.setCategory(param);
      return this;
   }

   public List<IdentifierDt> getIdentifier()
   {
      return adaptedClass.getIdentifier();
   }

   public IQICoreCommunication setIdentifier(List<IdentifierDt> param)
   {
      adaptedClass.setIdentifier(param);
      return this;
   }

   public IQICoreCommunication addIdentifier(IdentifierDt param)
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

   public CommunicationRequest getRequestDetailResource()
   {
      if (adaptedClass.getRequestDetail().getResource() instanceof ca.uhn.fhir.model.dstu2.resource.CommunicationRequest)
      {
         return (ca.uhn.fhir.model.dstu2.resource.CommunicationRequest) adaptedClass
               .getRequestDetail().getResource();
      }
      else
      {
         return null;
      }
   }

   public IQICoreCommunication setRequestDetailResource(
         CommunicationRequest param)
   {
      adaptedClass.getRequestDetail().setResource(param);
      return this;
   }

   public String getStatus()
   {
      return adaptedClass.getStatus();
   }

   public IQICoreCommunication setStatus(String param)
   {
      adaptedClass
            .setStatus(ca.uhn.fhir.model.dstu2.valueset.CommunicationStatusEnum
                  .valueOf(param));
      return this;
   }

   public IQICoreCommunication setStatus(CommunicationStatusEnum param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public BoundCodeDt<CommunicationStatusEnum> getStatusElement()
   {
      return adaptedClass.getStatusElement();
   }

   public IQICoreCommunication setStatus(
         BoundCodeDt<CommunicationStatusEnum> param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public IdDt getId()
   {
      return adaptedClass.getId();
   }

   public IQICoreCommunication setId(IdDt param)
   {
      adaptedClass.setId(param);
      return this;
   }
}