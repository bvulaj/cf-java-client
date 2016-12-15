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

package org.cloudfoundry.reactor.util;

import java.io.InputStream;

final class JsonParsingException extends RuntimeException {

    private static final long serialVersionUID = 689280281752742553L;

    private final String payload;

    JsonParsingException(String message, Throwable cause, String payload) {
        super(message, cause);
        this.payload = payload;
    }

    public String getPayload() {
        return this.payload;
    }

}
