/*
 * #%L
 * cwf-fhir-core
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
package org.hspconsortium.cwf.fhir.document;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.hl7.fhir.dstu3.model.CodeableConcept;
import org.hl7.fhir.dstu3.model.Coding;
import org.hl7.fhir.dstu3.model.DocumentReference;
import org.hl7.fhir.dstu3.model.DocumentReference.DocumentReferenceContextComponent;
import org.hl7.fhir.dstu3.model.Practitioner;
import org.hl7.fhir.dstu3.model.Reference;
import org.hspconsortium.cwf.fhir.common.FhirUtil;

/**
 * Model object wrapping a document reference and its contents (lazily loaded).
 */
public class Document implements Comparable<Document> {
    
    
    private DocumentReference documentReference;
    
    private Set<String> types;
    
    private List<DocumentContent> content;
    
    public Document(DocumentReference reference) {
        this.documentReference = reference;
    }
    
    public Document(DocumentReference reference, DocumentContent content) {
        this(reference);
        this.content = new ArrayList<>();
        this.content.add(content);
    }
    
    public DocumentReference getReference() {
        return documentReference;
    }
    
    protected void setReference(DocumentReference documentReference) {
        this.documentReference = documentReference;
    }
    
    public String getTitle() {
        String title = documentReference.getDescription();
        
        if (title == null) {
            Coding coding = FhirUtil.getFirst(documentReference.getType().getCoding());
            title = coding == null ? null : coding.getDisplay();
        }
        
        return title == null ? "" : title;
    }
    
    public Date getDateTime() {
        return documentReference.getCreated();
    }
    
    public String getLocationName() {
        DocumentReferenceContextComponent ctx = documentReference.getContext();
        CodeableConcept facilityType = ctx == null ? null : ctx.getFacilityType();
        Coding coding = facilityType == null ? null : FhirUtil.getFirst(facilityType.getCoding());
        return coding == null ? "" : coding.getDisplay().toString();
    }
    
    public String getAuthorName() {
        Reference reference = documentReference.hasAuthor() ? FhirUtil.getFirst(documentReference.getAuthor()) : null;
        Practitioner author = DocumentService.getInstance().getResource(reference, Practitioner.class);
        return author == null ? "" : FhirUtil.formatName(author.getName());
    }
    
    public String getStatus() {
        return FhirUtil.getDisplayValue(documentReference.getDocStatus());
    }
    
    public Collection<String> getTypes() {
        if (types == null) {
            types = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
            CodeableConcept dt = documentReference.getType();
            List<Coding> codings = dt == null ? null : dt.getCoding();
            
            if (codings != null) {
                for (Coding coding : codings) {
                    String type = coding.getDisplay().toString();
                    
                    if (type != null && !type.isEmpty()) {
                        types.add(type);
                    }
                }
                
            }
        }
        
        return types;
    }
    
    public boolean hasType(String type) {
        return getTypes().contains(type);
    }
    
    public String getContentType() {
        return FhirUtil.getFirst(getContent()).getContentType();
    }
    
    public List<DocumentContent> getContent() {
        if (content == null) {
            content = DocumentService.getInstance().getContent(documentReference);
        }
        
        return content;
    }
    
    @Override
    public int compareTo(Document document) {
        return getTitle().compareToIgnoreCase(document.getTitle());
    }
}
