/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2016 Red Hat, Inc., and individual contributors
 * as indicated by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.keycloak.authorization.permission;

import org.keycloak.authorization.model.Resource;
import org.keycloak.authorization.model.ResourceServer;
import org.keycloak.authorization.model.Scope;

import java.util.Collections;
import java.util.List;

/**
 * Represents a permission for a given resource.
 *
 * @author <a href="mailto:psilva@redhat.com">Pedro Igor</a>
 */
public class ResourcePermission {

    private final Resource resource;
    private final List<Scope> scopes;
    private ResourceServer resourceServer;

    public ResourcePermission(Resource resource, List<Scope> scopes, ResourceServer resourceServer) {
        this.resource = resource;
        this.scopes = scopes;
        this.resourceServer = resourceServer;
    }

    /**
     * Returns the resource to which this permission applies.
     *
     * @return the resource to which this permission applies
     */
    public Resource getResource() {
        return this.resource;
    }

    /**
     * Returns a list of permitted scopes associated with the resource
     *
     * @return a lit of permitted scopes
     */
    public List<Scope> getScopes() {
        return Collections.unmodifiableList(this.scopes);
    }

    /**
     * Returns the resource server associated with this permission.
     *
     * @return the resource server
     */
    public ResourceServer getResourceServer() {
        return this.resourceServer;
    }
}
