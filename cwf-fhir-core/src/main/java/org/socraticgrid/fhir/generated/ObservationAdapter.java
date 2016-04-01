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

import java.util.Date;
import java.util.List;

import ca.uhn.fhir.model.dstu2.composite.AttachmentDt;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.dstu2.composite.ContainedDt;
import ca.uhn.fhir.model.dstu2.composite.IdentifierDt;
import ca.uhn.fhir.model.dstu2.composite.NarrativeDt;
import ca.uhn.fhir.model.dstu2.composite.PeriodDt;
import ca.uhn.fhir.model.dstu2.composite.QuantityDt;
import ca.uhn.fhir.model.dstu2.composite.RangeDt;
import ca.uhn.fhir.model.dstu2.composite.RatioDt;
import ca.uhn.fhir.model.dstu2.composite.SampledDataDt;
import ca.uhn.fhir.model.dstu2.resource.Encounter;
import ca.uhn.fhir.model.dstu2.resource.Observation;
import ca.uhn.fhir.model.dstu2.resource.Specimen;
import ca.uhn.fhir.model.dstu2.valueset.ObservationStatusEnum;
import ca.uhn.fhir.model.primitive.BoundCodeDt;
import ca.uhn.fhir.model.primitive.CodeDt;
import ca.uhn.fhir.model.primitive.DateTimeDt;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.primitive.InstantDt;
import ca.uhn.fhir.model.primitive.StringDt;
import ca.uhn.fhir.model.primitive.TimeDt;

public class ObservationAdapter implements IObservation {
    
    
    private Observation adaptedClass = null;
    
    public ObservationAdapter() {
        this.adaptedClass = new ca.uhn.fhir.model.dstu2.resource.Observation();
    }
    
    public ObservationAdapter(Observation adaptee) {
        this.adaptedClass = adaptee;
    }
    
    @Override
    public Observation getAdaptee() {
        return adaptedClass;
    }
    
    @Override
    public void setAdaptee(Observation param) {
        this.adaptedClass = param;
    }
    
    @Override
    public CodeableConceptDt getInterpretation() {
        return adaptedClass.getInterpretation();
    }
    
    @Override
    public IObservation setInterpretation(CodeableConceptDt param) {
        adaptedClass.setInterpretation(param);
        return this;
    }
    
    @Override
    public CodeableConceptDt getCategory() {
        return adaptedClass.getCategory();
    }
    
    @Override
    public IObservation setCategory(CodeableConceptDt param) {
        adaptedClass.setCategory(param);
        return this;
    }
    
    @Override
    public NarrativeDt getText() {
        return adaptedClass.getText();
    }
    
    @Override
    public IObservation setText(NarrativeDt param) {
        adaptedClass.setText(param);
        return this;
    }
    
    @Override
    public List<Observation.ReferenceRange> getReferenceRange() {
        return adaptedClass.getReferenceRange();
    }
    
    @Override
    public IObservation setReferenceRange(List<Observation.ReferenceRange> param) {
        adaptedClass.setReferenceRange(param);
        return this;
    }
    
    @Override
    public IObservation addReferenceRange(Observation.ReferenceRange param) {
        adaptedClass.addReferenceRange(param);
        return this;
    }
    
    @Override
    public Observation.ReferenceRange addReferenceRange() {
        ca.uhn.fhir.model.dstu2.resource.Observation.ReferenceRange item = new ca.uhn.fhir.model.dstu2.resource.Observation.ReferenceRange();
        adaptedClass.addReferenceRange(item);
        return item;
    }
    
    @Override
    public Observation.ReferenceRange getReferenceRangeFirstRep() {
        return adaptedClass.getReferenceRangeFirstRep();
    }
    
    @Override
    public DateTimeDt getEffectiveDateTimeElement() {
        if (adaptedClass.getEffective() != null
                && adaptedClass.getEffective() instanceof ca.uhn.fhir.model.primitive.DateTimeDt) {
            return (ca.uhn.fhir.model.primitive.DateTimeDt) adaptedClass.getEffective();
        } else {
            return null;
        }
    }
    
    @Override
    public Date getEffectiveDateTime() {
        if (adaptedClass.getEffective() != null
                && adaptedClass.getEffective() instanceof ca.uhn.fhir.model.primitive.DateTimeDt) {
            return ((ca.uhn.fhir.model.primitive.DateTimeDt) adaptedClass.getEffective()).getValue();
        } else {
            return null;
        }
    }
    
    @Override
    public IObservation setEffectiveDateTime(DateTimeDt param) {
        adaptedClass.setEffective(param);
        return this;
    }
    
    @Override
    public IObservation setEffectiveDateTime(Date param) {
        adaptedClass.setEffective(new ca.uhn.fhir.model.primitive.DateTimeDt(param));
        return this;
    }
    
    @Override
    public PeriodDt getEffectivePeriod() {
        if (adaptedClass.getEffective() != null
                && adaptedClass.getEffective() instanceof ca.uhn.fhir.model.dstu2.composite.PeriodDt) {
            return (ca.uhn.fhir.model.dstu2.composite.PeriodDt) adaptedClass.getEffective();
        } else {
            return null;
        }
    }
    
    @Override
    public IObservation setEffectivePeriod(PeriodDt param) {
        adaptedClass.setEffective(param);
        return this;
    }
    
    @Override
    public CodeDt getLanguage() {
        return adaptedClass.getLanguage();
    }
    
    @Override
    public IObservation setLanguage(CodeDt param) {
        adaptedClass.setLanguage(param);
        return this;
    }
    
    @Override
    public CodeableConceptDt getMethod() {
        return adaptedClass.getMethod();
    }
    
    @Override
    public IObservation setMethod(CodeableConceptDt param) {
        adaptedClass.setMethod(param);
        return this;
    }
    
    @Override
    public QuantityDt getValueQuantity() {
        if (adaptedClass.getValue() != null
                && adaptedClass.getValue() instanceof ca.uhn.fhir.model.dstu2.composite.QuantityDt) {
            return (ca.uhn.fhir.model.dstu2.composite.QuantityDt) adaptedClass.getValue();
        } else {
            return null;
        }
    }
    
    @Override
    public IObservation setValueQuantity(QuantityDt param) {
        adaptedClass.setValue(param);
        return this;
    }
    
    @Override
    public CodeableConceptDt getValueCodeableConcept() {
        if (adaptedClass.getValue() != null
                && adaptedClass.getValue() instanceof ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt) {
            return (ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt) adaptedClass.getValue();
        } else {
            return null;
        }
    }
    
    @Override
    public IObservation setValueCodeableConcept(CodeableConceptDt param) {
        adaptedClass.setValue(param);
        return this;
    }
    
    @Override
    public StringDt getValueStringElement() {
        if (adaptedClass.getValue() != null && adaptedClass.getValue() instanceof ca.uhn.fhir.model.primitive.StringDt) {
            return (ca.uhn.fhir.model.primitive.StringDt) adaptedClass.getValue();
        } else {
            return null;
        }
    }
    
    @Override
    public String getValueString() {
        if (adaptedClass.getValue() != null && adaptedClass.getValue() instanceof ca.uhn.fhir.model.primitive.StringDt) {
            return ((ca.uhn.fhir.model.primitive.StringDt) adaptedClass.getValue()).getValue();
        } else {
            return null;
        }
    }
    
    @Override
    public IObservation setValueString(StringDt param) {
        adaptedClass.setValue(param);
        return this;
    }
    
    @Override
    public IObservation setValueString(String param) {
        adaptedClass.setValue(new ca.uhn.fhir.model.primitive.StringDt(param));
        return this;
    }
    
    @Override
    public RangeDt getValueRange() {
        if (adaptedClass.getValue() != null
                && adaptedClass.getValue() instanceof ca.uhn.fhir.model.dstu2.composite.RangeDt) {
            return (ca.uhn.fhir.model.dstu2.composite.RangeDt) adaptedClass.getValue();
        } else {
            return null;
        }
    }
    
    @Override
    public IObservation setValueRange(RangeDt param) {
        adaptedClass.setValue(param);
        return this;
    }
    
    @Override
    public RatioDt getValueRatio() {
        if (adaptedClass.getValue() != null
                && adaptedClass.getValue() instanceof ca.uhn.fhir.model.dstu2.composite.RatioDt) {
            return (ca.uhn.fhir.model.dstu2.composite.RatioDt) adaptedClass.getValue();
        } else {
            return null;
        }
    }
    
    @Override
    public IObservation setValueRatio(RatioDt param) {
        adaptedClass.setValue(param);
        return this;
    }
    
    @Override
    public SampledDataDt getValueSampledData() {
        if (adaptedClass.getValue() != null
                && adaptedClass.getValue() instanceof ca.uhn.fhir.model.dstu2.composite.SampledDataDt) {
            return (ca.uhn.fhir.model.dstu2.composite.SampledDataDt) adaptedClass.getValue();
        } else {
            return null;
        }
    }
    
    @Override
    public IObservation setValueSampledData(SampledDataDt param) {
        adaptedClass.setValue(param);
        return this;
    }
    
    @Override
    public AttachmentDt getValueAttachment() {
        if (adaptedClass.getValue() != null
                && adaptedClass.getValue() instanceof ca.uhn.fhir.model.dstu2.composite.AttachmentDt) {
            return (ca.uhn.fhir.model.dstu2.composite.AttachmentDt) adaptedClass.getValue();
        } else {
            return null;
        }
    }
    
    @Override
    public IObservation setValueAttachment(AttachmentDt param) {
        adaptedClass.setValue(param);
        return this;
    }
    
    @Override
    public TimeDt getValueTimeElement() {
        if (adaptedClass.getValue() != null && adaptedClass.getValue() instanceof ca.uhn.fhir.model.primitive.TimeDt) {
            return (ca.uhn.fhir.model.primitive.TimeDt) adaptedClass.getValue();
        } else {
            return null;
        }
    }
    
    @Override
    public String getValueTime() {
        if (adaptedClass.getValue() != null && adaptedClass.getValue() instanceof ca.uhn.fhir.model.primitive.TimeDt) {
            return ((ca.uhn.fhir.model.primitive.TimeDt) adaptedClass.getValue()).getValue();
        } else {
            return null;
        }
    }
    
    @Override
    public IObservation setValueTime(TimeDt param) {
        adaptedClass.setValue(param);
        return this;
    }
    
    @Override
    public IObservation setValueTime(String param) {
        adaptedClass.setValue(new ca.uhn.fhir.model.primitive.TimeDt(param));
        return this;
    }
    
    @Override
    public DateTimeDt getValueDateTimeElement() {
        if (adaptedClass.getValue() != null && adaptedClass.getValue() instanceof ca.uhn.fhir.model.primitive.DateTimeDt) {
            return (ca.uhn.fhir.model.primitive.DateTimeDt) adaptedClass.getValue();
        } else {
            return null;
        }
    }
    
    @Override
    public Date getValueDateTime() {
        if (adaptedClass.getValue() != null && adaptedClass.getValue() instanceof ca.uhn.fhir.model.primitive.DateTimeDt) {
            return ((ca.uhn.fhir.model.primitive.DateTimeDt) adaptedClass.getValue()).getValue();
        } else {
            return null;
        }
    }
    
    @Override
    public IObservation setValueDateTime(DateTimeDt param) {
        adaptedClass.setValue(param);
        return this;
    }
    
    @Override
    public IObservation setValueDateTime(Date param) {
        adaptedClass.setValue(new ca.uhn.fhir.model.primitive.DateTimeDt(param));
        return this;
    }
    
    @Override
    public PeriodDt getValuePeriod() {
        if (adaptedClass.getValue() != null
                && adaptedClass.getValue() instanceof ca.uhn.fhir.model.dstu2.composite.PeriodDt) {
            return (ca.uhn.fhir.model.dstu2.composite.PeriodDt) adaptedClass.getValue();
        } else {
            return null;
        }
    }
    
    @Override
    public IObservation setValuePeriod(PeriodDt param) {
        adaptedClass.setValue(param);
        return this;
    }
    
    @Override
    public CodeableConceptDt getDataAbsentReason() {
        return adaptedClass.getDataAbsentReason();
    }
    
    @Override
    public IObservation setDataAbsentReason(CodeableConceptDt param) {
        adaptedClass.setDataAbsentReason(param);
        return this;
    }
    
    @Override
    public List<Observation.Component> getComponent() {
        return adaptedClass.getComponent();
    }
    
    @Override
    public IObservation setComponent(List<Observation.Component> param) {
        adaptedClass.setComponent(param);
        return this;
    }
    
    @Override
    public IObservation addComponent(Observation.Component param) {
        adaptedClass.addComponent(param);
        return this;
    }
    
    @Override
    public Observation.Component addComponent() {
        ca.uhn.fhir.model.dstu2.resource.Observation.Component item = new ca.uhn.fhir.model.dstu2.resource.Observation.Component();
        adaptedClass.addComponent(item);
        return item;
    }
    
    @Override
    public Observation.Component getComponentFirstRep() {
        return adaptedClass.getComponentFirstRep();
    }
    
    @Override
    public InstantDt getIssuedElement() {
        return adaptedClass.getIssuedElement();
    }
    
    @Override
    public Date getIssued() {
        return adaptedClass.getIssued();
    }
    
    @Override
    public IObservation setIssued(Date param) {
        adaptedClass.setIssued(new ca.uhn.fhir.model.primitive.InstantDt(param));
        return this;
    }
    
    @Override
    public IObservation setIssued(InstantDt param) {
        adaptedClass.setIssued(param);
        return this;
    }
    
    @Override
    public List<Observation.Related> getRelated() {
        return adaptedClass.getRelated();
    }
    
    @Override
    public IObservation setRelated(List<Observation.Related> param) {
        adaptedClass.setRelated(param);
        return this;
    }
    
    @Override
    public IObservation addRelated(Observation.Related param) {
        adaptedClass.addRelated(param);
        return this;
    }
    
    @Override
    public Observation.Related addRelated() {
        ca.uhn.fhir.model.dstu2.resource.Observation.Related item = new ca.uhn.fhir.model.dstu2.resource.Observation.Related();
        adaptedClass.addRelated(item);
        return item;
    }
    
    @Override
    public Observation.Related getRelatedFirstRep() {
        return adaptedClass.getRelatedFirstRep();
    }
    
    @Override
    public Specimen getSpecimenResource() {
        if (adaptedClass.getSpecimen().getResource() instanceof ca.uhn.fhir.model.dstu2.resource.Specimen) {
            return (ca.uhn.fhir.model.dstu2.resource.Specimen) adaptedClass.getSpecimen().getResource();
        } else {
            return null;
        }
    }
    
    @Override
    public IObservation setSpecimenResource(Specimen param) {
        adaptedClass.getSpecimen().setResource(param);
        return this;
    }
    
    @Override
    public StringDt getCommentsElement() {
        return adaptedClass.getCommentsElement();
    }
    
    @Override
    public String getComments() {
        return adaptedClass.getComments();
    }
    
    @Override
    public IObservation setComments(String param) {
        adaptedClass.setComments(new ca.uhn.fhir.model.primitive.StringDt(param));
        return this;
    }
    
    @Override
    public IObservation setComments(StringDt param) {
        adaptedClass.setComments(param);
        return this;
    }
    
    @Override
    public CodeableConceptDt getBodySite() {
        return adaptedClass.getBodySite();
    }
    
    @Override
    public IObservation setBodySite(CodeableConceptDt param) {
        adaptedClass.setBodySite(param);
        return this;
    }
    
    @Override
    public Encounter getEncounterResource() {
        if (adaptedClass.getEncounter().getResource() instanceof ca.uhn.fhir.model.dstu2.resource.Encounter) {
            return (ca.uhn.fhir.model.dstu2.resource.Encounter) adaptedClass.getEncounter().getResource();
        } else {
            return null;
        }
    }
    
    @Override
    public IObservation setEncounterResource(Encounter param) {
        adaptedClass.getEncounter().setResource(param);
        return this;
    }
    
    @Override
    public IdDt getId() {
        return adaptedClass.getId();
    }
    
    @Override
    public IObservation setId(IdDt param) {
        adaptedClass.setId(param);
        return this;
    }
    
    @Override
    public List<IdentifierDt> getIdentifier() {
        return adaptedClass.getIdentifier();
    }
    
    @Override
    public IObservation setIdentifier(List<IdentifierDt> param) {
        adaptedClass.setIdentifier(param);
        return this;
    }
    
    @Override
    public IObservation addIdentifier(IdentifierDt param) {
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
    public String getStatus() {
        return adaptedClass.getStatus();
    }
    
    @Override
    public IObservation setStatus(String param) {
        adaptedClass.setStatus(ca.uhn.fhir.model.dstu2.valueset.ObservationStatusEnum.valueOf(param));
        return this;
    }
    
    @Override
    public IObservation setStatus(ObservationStatusEnum param) {
        adaptedClass.setStatus(param);
        return this;
    }
    
    @Override
    public BoundCodeDt<ObservationStatusEnum> getStatusElement() {
        return adaptedClass.getStatusElement();
    }
    
    @Override
    public IObservation setStatus(BoundCodeDt<ObservationStatusEnum> param) {
        adaptedClass.setStatus(param);
        return this;
    }
    
    @Override
    public ContainedDt getContained() {
        return adaptedClass.getContained();
    }
    
    @Override
    public IObservation setContained(ContainedDt param) {
        adaptedClass.setContained(param);
        return this;
    }
    
    @Override
    public CodeableConceptDt getCode() {
        return adaptedClass.getCode();
    }
    
    @Override
    public IObservation setCode(CodeableConceptDt param) {
        adaptedClass.setCode(param);
        return this;
    }
}
