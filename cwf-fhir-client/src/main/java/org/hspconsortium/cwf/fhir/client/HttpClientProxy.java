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

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.UriPatternMatcher;

/**
 * Http client proxy to allow registration of request interceptors based on url patterns. This
 * capability allows one to create custom http clients to handle certain requests. In the absence of
 * a url match, it delegates requests to the usual http client. See {@link UriPatternMatcher} for
 * information on url patterns.
 */
@SuppressWarnings("deprecation")
public class HttpClientProxy implements HttpClient, Closeable {
    
    
    /**
     * Specialized client http request factories for servicing atypical requests.
     */
    private final UriPatternMatcher<HttpClient> patterns = new UriPatternMatcher<>();
    
    private final List<HttpClient> clients = new ArrayList<>();
    
    private final HttpClient defaultClient;
    
    public HttpClientProxy(HttpClient defaultClient) {
        this.defaultClient = defaultClient;
    }
    
    public void registerHttpClient(String pattern, HttpClient client) {
        patterns.register(pattern, client);
        clients.add(client);
    }
    
    @Override
    public ClientConnectionManager getConnectionManager() {
        return defaultClient.getConnectionManager();
    }
    
    @Override
    public HttpParams getParams() {
        return defaultClient.getParams();
    }
    
    @Override
    public void close() throws IOException {
        for (HttpClient client : clients) {
            if (client instanceof Closeable) {
                close((Closeable) client);
            }
        }
        
        clients.clear();
    }
    
    /**
     * Silently close a client.
     * 
     * @param client Client to close.
     */
    private void close(Closeable client) {
        try {
            client.close();
        } catch (IOException e) {}
    }
    
    private HttpClient getClient(HttpRequest request) {
        String uri = request.getRequestLine().getUri();
        HttpClient client = patterns.lookup(uri);
        return client != null ? client : defaultClient;
    }
    
    @Override
    public HttpResponse execute(HttpUriRequest request) throws IOException, ClientProtocolException {
        return getClient(request).execute(request);
    }
    
    @Override
    public HttpResponse execute(HttpUriRequest request, HttpContext context) throws IOException, ClientProtocolException {
        return getClient(request).execute(request, context);
    }
    
    @Override
    public HttpResponse execute(HttpHost target, HttpRequest request) throws IOException, ClientProtocolException {
        return getClient(request).execute(target, request);
    }
    
    @Override
    public HttpResponse execute(HttpHost target, HttpRequest request, HttpContext context) throws IOException,
                                                                                           ClientProtocolException {
        return getClient(request).execute(target, request, context);
    }
    
    @Override
    public <T> T execute(HttpUriRequest request, ResponseHandler<? extends T> responseHandler) throws IOException,
                                                                                               ClientProtocolException {
        return getClient(request).execute(request, responseHandler);
    }
    
    @Override
    public <T> T execute(HttpUriRequest request, ResponseHandler<? extends T> responseHandler,
                         HttpContext context) throws IOException, ClientProtocolException {
        return getClient(request).execute(request, responseHandler, context);
    }
    
    @Override
    public <T> T execute(HttpHost target, HttpRequest request,
                         ResponseHandler<? extends T> responseHandler) throws IOException, ClientProtocolException {
        return getClient(request).execute(target, request, responseHandler);
    }
    
    @Override
    public <T> T execute(HttpHost target, HttpRequest request, ResponseHandler<? extends T> responseHandler,
                         HttpContext context) throws IOException, ClientProtocolException {
        return getClient(request).execute(target, request, responseHandler, context);
    }
    
}
