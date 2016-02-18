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

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.UriPatternMatcher;

/**
 * Http client proxy to allow registration of custom clients based on url patterns.
 */
@SuppressWarnings("deprecation")
public class HttpClientProxy extends CloseableHttpClient {
    
    /**
     * Specialized client http request factories for servicing atypical requests.
     */
    private final UriPatternMatcher<CloseableHttpClient> patterns = new UriPatternMatcher<CloseableHttpClient>();
    
    private final List<CloseableHttpClient> clients = new ArrayList<CloseableHttpClient>();
    
    public HttpClientProxy(CloseableHttpClient defaultClient) {
        super();
        clients.add(defaultClient);
    }
    
    public void registerHttpClient(String pattern, CloseableHttpClient client) {
        patterns.register(pattern, client);
        clients.add(client);
    }
    
    @Override
    public ClientConnectionManager getConnectionManager() {
        return getDefaultClient().getConnectionManager();
    }
    
    @Override
    public HttpParams getParams() {
        return getDefaultClient().getParams();
    }
    
    @Override
    public void close() throws IOException {
        for (CloseableHttpClient client : clients) {
            close(client);
        }
        
        clients.clear();
    }
    
    /**
     * Returns the default client.
     * 
     * @return The default client.
     */
    private CloseableHttpClient getDefaultClient() {
        return clients.get(0);
    }
    
    /**
     * Silently close a client.
     * 
     * @param client Client to close.
     */
    private void close(CloseableHttpClient client) {
        try {
            client.close();
        } catch (IOException e) {}
    }
    
    @Override
    protected CloseableHttpResponse doExecute(HttpHost host, HttpRequest request, HttpContext context)
                                                                                                      throws ClientProtocolException,
                                                                                                      IOException {
        String uri = request.getRequestLine().getUri();
        CloseableHttpClient client = patterns.lookup(uri);
        return (client != null ? client : getDefaultClient()).execute(host, request, context);
    }
    
}
