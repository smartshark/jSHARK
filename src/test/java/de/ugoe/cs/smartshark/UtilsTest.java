/*
 * Copyright (C) 2017 University of Goettingen, Germany
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.ugoe.cs.smartshark;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Fabian Trautsch
 */
public class UtilsTest {

    @Test(expected = NullPointerException.class)
    public void noHostTest() {
        Utils.createMongoDBURI("user", "password", null, "27017", "db", true);
    }

    @Test(expected = NullPointerException.class)
    public void noPortTest() {
        Utils.createMongoDBURI("user", "password", "host", null, "db", true);
    }

    @Test(expected = NullPointerException.class)
    public void noSSLEnabledTest() {
        Utils.createMongoDBURI("user", "password", "host", "27017", "db", null);
    }

    @Test
    public void noUserTest() {
        String connection = Utils.createMongoDBURI(null, "password", "host", "27017", "db", false);
        assertEquals("mongodb://host:27017", connection);
    }

    @Test
    public void noPasswordTest() {
        String connection = Utils.createMongoDBURI("user", null, "host", "27017", "db", false);
        assertEquals("mongodb://host:27017", connection);
    }

    @Test
    public void noAuthenticationDBTest() {
        String connection = Utils.createMongoDBURI("user", "password", "host", "27017", null, false);
        assertEquals("mongodb://user:password@host:27017", connection);
    }

    @Test
    public void sslEnabledTest() {
        String connection = Utils.createMongoDBURI("user", "password", "host", "27017", null, true);
        assertEquals("mongodb://user:password@host:27017/?ssl=true&ssl_cert_reqs=CERT_NONE", connection);
    }

    @Test
    public void authenticationEnabledTest() {
        String connection = Utils.createMongoDBURI("user", "password", "host", "27017", "admin", false);
        assertEquals("mongodb://user:password@host:27017/?authSource=admin", connection);
    }

    @Test
    public void authenticationAndSSLEnabledTest() {
        String connection = Utils.createMongoDBURI("user", "password", "host", "27017", "admin", true);
        assertEquals("mongodb://user:password@host:27017/?authSource=admin&ssl=true&ssl_cert_reqs=CERT_NONE", connection);
    }
}
