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

import org.hl7.fhir.dstu3.model.Bundle;
import org.hl7.fhir.dstu3.model.Patient;
import org.junit.Test;

import ca.uhn.fhir.context.FhirVersionEnum;
import ca.uhn.fhir.rest.client.GenericClient;
import ca.uhn.fhir.rest.client.interceptor.BasicAuthInterceptor;

public class ClientTest {
    
    
    private static final String FHIR_EP = "http://fhirtest.uhn.ca/baseDstu3";
    
    private static final String PATIENT_ID = "21561";
    
    @Test
    public void testClient() throws Throwable {
        FhirContext ctx = new FhirContext(FhirVersionEnum.DSTU3);
        GenericClient client = (GenericClient) ctx.newRestfulGenericClient(FHIR_EP);
        client.registerInterceptor(new BasicAuthInterceptor("user123", "user321$"));
        client.setDontValidateConformance(true);
        Patient patient1 = client.read(Patient.class, "Patient/" + PATIENT_ID);
        assertEquals(PATIENT_ID, patient1.getIdElement().getIdPart());
        Bundle bundle = client.search().byUrl("Patient?_id=" + PATIENT_ID).returnBundle(Bundle.class).execute();
        assertEquals(1, bundle.getEntry().size());
        Patient patient2 = (Patient) bundle.getEntry().get(0).getResource();
        assertEquals(PATIENT_ID, patient2.getIdElement().getIdPart());
    }
    
}
