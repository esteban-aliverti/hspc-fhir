/*
 * #%L
 * cwf-api-documents
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
import java.util.TreeSet;

import org.hl7.fhir.dstu3.model.Binary;
import org.hl7.fhir.dstu3.model.Bundle;
import org.hl7.fhir.dstu3.model.CodeSystem;
import org.hl7.fhir.dstu3.model.CodeSystem.ConceptDefinitionComponent;
import org.hl7.fhir.dstu3.model.DocumentReference;
import org.hl7.fhir.dstu3.model.Patient;
import org.hspconsortium.cwf.fhir.common.BaseService;
import org.hspconsortium.cwf.fhir.common.FhirUtil;

import ca.uhn.fhir.rest.client.IGenericClient;
import ca.uhn.fhir.rest.gclient.IQuery;
import ca.uhn.fhir.rest.gclient.ReferenceClientParam;

/**
 * This is the documents api implementation.
 */
public class DocumentService extends BaseService {
    
    
    private static final byte[] EMPTY_CONTENT = {};
    
    private static DocumentService instance;
    
    public static DocumentService getInstance() {
        return instance;
    }
    
    public DocumentService(IGenericClient client) {
        super(client);
        instance = this;
    }
    
    /**
     * Retrieves document content, regardless of type.
     * 
     * @param documentReference A document reference.
     * @return Byte content, never null.
     */
    public byte[] getContent(DocumentReference documentReference) {
        byte[] content = FhirUtil.getFirst(documentReference.getContent()).getAttachment().getData();
        
        if (content == null || content.length == 0) {
            Binary binary = getClient().read(Binary.class,
                FhirUtil.getFirst(documentReference.getContent()).getAttachment().getUrl());
            content = binary.getContent();
        }
        
        if (content == null) {
            content = EMPTY_CONTENT;
        }
        
        return content;
    }
    
    /**
     * Retrieves document references for a given patient.
     * 
     * @param patient Patient whose documents are to be retrieved.
     * @param startDate Start date for retrieval.
     * @param endDate End date for retrieval.
     * @param type Document type.
     * @return List of matching documents.
     */
    public List<Document> retrieveReferences(Patient patient, Date startDate, Date endDate, String type) {
        ReferenceClientParam subject = new ReferenceClientParam(DocumentReference.SP_SUBJECT + ":Patient");
        
        IQuery<?> query = getClient().search().forResource(DocumentReference.class)
                .where(subject.hasId(patient.getIdElement().getIdPart()));
        //.forResource("Patient/" + patient.getId().getIdPart() + "/DocumentReference");
        
        if (startDate != null) {
            query.where(DocumentReference.PERIOD.afterOrEquals().day(startDate));
        }
        
        if (endDate != null) {
            query.where(DocumentReference.PERIOD.beforeOrEquals().day(endDate));
        }
        
        if (type != null) {
            query.where(DocumentReference.TYPE.exactly().code(type));
            
        }
        
        Bundle bundle = query.returnBundle(Bundle.class).execute();
        List<DocumentReference> list = FhirUtil.getEntries(bundle, DocumentReference.class);
        List<Document> results = new ArrayList<>(list.size());
        
        for (DocumentReference ref : list) {
            Document doc = new Document(ref);
            results.add(doc);
        }
        return results;
    }
    
    public Collection<String> getTypes() {
        TreeSet<String> results = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        
        try {
            Bundle bundle = getClient().search().forResource(CodeSystem.class)
                    .where(CodeSystem.NAME.matchesExactly().value("DocumentType")).returnBundle(Bundle.class).execute();
            
            for (CodeSystem cs : FhirUtil.getEntries(bundle, CodeSystem.class)) {
                for (ConceptDefinitionComponent concept : cs.getConcept()) {
                    results.add(concept.getDisplay().toString());
                }
            }
            
        } catch (Exception e) {}
        
        return results;
    }
}
