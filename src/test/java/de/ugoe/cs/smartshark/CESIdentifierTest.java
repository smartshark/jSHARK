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

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.bson.types.ObjectId;

import de.ugoe.cs.smartshark.model.CodeEntityState;


public class CESIdentifierTest {

    @Test
    public void identifierTest() throws java.security.NoSuchAlgorithmException {
        // this is just a small test to check if we get the same result from Java as we get from Python code
        String cesHex = CodeEntityState.calculateIdentifier(new String("commons-rdf-api/src/main/java/org/apache/commons/rdf/api/Dataset.java"), new ObjectId("5bef24dc83ad2f56ca1ca7cd"), new ObjectId("5bef24dd83ad2f56ca1ca7d0"));
        assertEquals("8ae30dcf8703611b447e07cc7867da623090d1a5", cesHex);
    }
}
