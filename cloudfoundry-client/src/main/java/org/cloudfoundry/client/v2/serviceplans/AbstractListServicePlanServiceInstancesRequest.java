/*
 * Copyright 2013-2016 the original author or authors.
 *
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
 */

package org.cloudfoundry.client.v2.serviceplans;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.cloudfoundry.Nullable;
import org.cloudfoundry.client.v2.InFilterParameter;
import org.cloudfoundry.client.v2.PaginatedRequest;
import org.immutables.value.Value;

import java.util.List;

/**
 * The request payload for the List all Service Instances for the Service Plan operation
 */
@Value.Immutable
abstract class AbstractListServicePlanServiceInstancesRequest extends PaginatedRequest {

    /**
     * The gateway names
     */
    @InFilterParameter("gateway_name")
    @Nullable
    abstract List<String> getGatewayNames();

    /**
     * The names of the service instances
     */
    @InFilterParameter("names")
    @Nullable
    abstract List<String> getNames();

    /**
     * The service binding ids
     */
    @InFilterParameter("service_binding_guid")
    @Nullable
    abstract List<String> getServiceBindingIds();

    /**
     * The service key ids
     */
    @InFilterParameter("service_key_guid")
    @Nullable
    abstract List<String> getServiceKeyIds();

    /**
     * The service plan id
     */
    @JsonIgnore
    abstract String getServicePlanId();

    /**
     * The space ids
     */
    @InFilterParameter("space_guid")
    @Nullable
    abstract List<String> getSpaceIds();

}