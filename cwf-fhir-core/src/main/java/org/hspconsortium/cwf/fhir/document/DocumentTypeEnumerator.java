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

import java.util.Iterator;

/**
 * Provides an iterable interface for document types.
 *
 * @author dmartin
 */
public class DocumentTypeEnumerator implements Iterable<String> {
    
    
    private final DocumentService service;
    
    public DocumentTypeEnumerator(DocumentService service) {
        this.service = service;
    }
    
    @Override
    public Iterator<String> iterator() {
        return service.getTypes().iterator();
    }
    
}
