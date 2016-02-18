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

import ca.uhn.fhir.rest.client.IClientInterceptor;

/**
 * Specialized client interceptor for different authentication / authorization mechanisms.
 */
public interface IAuthInterceptor extends IClientInterceptor {
    
    /**
     * Implementation will return the user credentials.
     * 
     * @return The user credentials suitable for inclusion in the Authorization header.
     */
    String getCredentials();
}
