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

package de.ugoe.cs.smartshark.model;

import java.util.Map;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

/**
 * @author Fabian Trautsch
 */
@Entity("clone_instance")
public class CloneInstance {
    @Id
    @Property("_id")
    private ObjectId id;

    private String name;

    @Property("commit_id")
    private ObjectId commitId;

    @Property("file_id")
    private ObjectId fileId;

    @Property("start_line")
    private int startLine;

    @Property("end_line")
    private int endLine;

    @Property("start_column")
    private int startColumn;

    @Property("end_column")
    private int endColumn;

    @Property("clone_instance_metrics")
    private Map<String, Double> cloneInstanceMetrics;

    @Property("clone_class")
    private String cloneClass;

    @Property("clone_class_metrics")
    private Map<String, Double> cloneClassMetrics;
}
