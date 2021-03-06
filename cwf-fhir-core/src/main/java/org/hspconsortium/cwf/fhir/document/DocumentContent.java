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

public class DocumentContent {
    
    
    private final byte[] data;
    
    private final String contentType;
    
    public DocumentContent(byte[] data, String contentType) {
        this.data = data;
        this.contentType = contentType == null ? "" : contentType.toLowerCase();
    }
    
    public boolean hasContent() {
        return this.data != null;
    }
    
    public byte[] getData() {
        return data;
    }
    
    public String getContentType() {
        return contentType;
    }
    
    public boolean isEmpty() {
        return data == null || data.length == 0 || "text/x-error".equals(contentType);
    }
    
    @Override
    public String toString() {
        return data == null ? null : new String(data);
    }
}
