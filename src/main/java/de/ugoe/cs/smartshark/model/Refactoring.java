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

import com.google.common.collect.Lists;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.*;

import java.util.List;

@Entity(noClassnameStored = true, value="refactoring")
public class Refactoring {
    @Id
    @Property("_id")
    private ObjectId id;
    @Property("commit_id")
    private ObjectId commitId;
    private String type;
    private String description;
    @Embedded("ce_state")
    private RefactoringState state;
    @Embedded("parent_commit_ce_states")
    private List<RefactoringState> parentStates;
    private String detection_tool;

    public Refactoring() {
        parentStates = Lists.newArrayList();
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public ObjectId getCommitId() {
        return commitId;
    }

    public void setCommitId(ObjectId commitId) {
        this.commitId = commitId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public RefactoringState getState() {
        return state;
    }

    public void setState(RefactoringState state) {
        this.state = state;
    }

    public List<RefactoringState> getParentStates() {
        return parentStates;
    }

    public void setParentStates(List<RefactoringState> parentStates) {
        this.parentStates = parentStates;
    }

    public String getDetectionTool() {
        return this.detection_tool;
    }

    public void setDetectionTool(String detectionTool) {
        this.detection_tool = detectionTool;
    }
}

