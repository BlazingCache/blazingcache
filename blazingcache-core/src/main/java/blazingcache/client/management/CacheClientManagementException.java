/*
 * Copyright 2016 Diennea S.R.L..
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
package blazingcache.client.management;

/**
 * Used to model a (runtime) error on initializing MBeanServer neeed to publish
 * Blazing cache statistics and status MBeans.
 *
 * @author matteo.casadei
 * @since 1.4.2
 *
 */
public class CacheClientManagementException extends RuntimeException {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public CacheClientManagementException(final String message) {
        super(message);
    }

    public CacheClientManagementException(final Throwable cause) {
        super(cause);
    }

    public CacheClientManagementException(final String message, final Throwable cause) {
        super(message, cause);
    }
}
