/*
 * #%L
 * cwf-fhir-client
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
package org.hspconsortium.cwf.fhir.client;

import static org.junit.Assert.assertEquals;
import ca.uhn.fhir.model.api.Bundle;
import ca.uhn.fhir.model.dstu2.resource.Patient;
import ca.uhn.fhir.model.primitive.UriDt;
import ca.uhn.fhir.rest.client.GenericClient;
import ca.uhn.fhir.rest.client.interceptor.BasicAuthInterceptor;

import org.junit.Test;

public class ClientTest {
    
    @Test
    public void testClient() throws Throwable {
        FhirContext ctx = new FhirContext();
        GenericClient client = (GenericClient) ctx
                .newRestfulGenericClient("http://vista-fhir1.carewebframework.net:9080/DSTU2");
        client.registerInterceptor(new BasicAuthInterceptor("user123", "user321$"));
        client.setDontValidateConformance(true);
        Patient patient1 = client.read(Patient.class, new UriDt("Patient/1"));
        assertEquals("1", patient1.getId().getIdPart());
        Bundle bundle = client.search(new UriDt("Patient?_id=1"));
        assertEquals(1, bundle.getEntries().size());
        Patient patient2 = (Patient) bundle.getEntries().get(0).getResource();
        assertEquals("1", patient2.getId().getIdPart());
    }
    
}
