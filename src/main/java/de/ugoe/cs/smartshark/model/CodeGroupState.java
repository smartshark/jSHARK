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

import java.util.List;
import java.util.Map;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

/**
 * @author Fabian Trautsch
 */
@Entity(value = "code_group_state", noClassnameStored = true)
public class CodeGroupState {
    @Id
    @Property("_id")
    private ObjectId id;

    @Property("s_key")
    private String sKey;

    @Property("long_name")
    private String longName;

    @Property("commit_id")
    private ObjectId commitId;

    @Property("cg_parent_ids")
    private List<ObjectId> cgParentIds;

    @Property("cg_type")
    private String cgType;

    private Map<String, Double> metrics;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getsKey() {
        return sKey;
    }

    public void setsKey(String sKey) {
        this.sKey = sKey;
    }

    public String getLongName() {
        return longName;
    }

    public void setLongName(String longName) {
        this.longName = longName;
    }

    public ObjectId getCommitId() {
        return commitId;
    }

    public void setCommitId(ObjectId commitId) {
        this.commitId = commitId;
    }

    public List<ObjectId> getCgParentIds() {
        return cgParentIds;
    }

    public void setCgParentIds(List<ObjectId> cgParentIds) {
        this.cgParentIds = cgParentIds;
    }

    public String getCgType() {
        return cgType;
    }

    public void setCgType(String cgType) {
        this.cgType = cgType;
    }

    public Map<String, Double> getMetrics() {
        return metrics;
    }

    public void setMetrics(Map<String, Double> metrics) {
        this.metrics = metrics;
    }
}
