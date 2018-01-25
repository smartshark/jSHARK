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

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

/**
 * @author Fabian Trautsch
 */
@Entity("hunk")
public class Hunk {
    @Id
    @Property("_id")
    private ObjectId id;

    @Property("file_action_id")
    private ObjectId fileActionId;

    @Property("new_start")
    private Integer newStart;

    @Property("new_lines")
    private Integer newLines;

    @Property("old_start")
    private Integer oldStart;

    @Property("old_lines")
    private Integer oldLines;

    private String content;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public ObjectId getFileActionId() {
        return fileActionId;
    }

    public void setFileActionId(ObjectId fileActionId) {
        this.fileActionId = fileActionId;
    }

    public Integer getNewStart() {
        return newStart;
    }

    public void setNewStart(Integer newStart) {
        this.newStart = newStart;
    }

    public Integer getNewLines() {
        return newLines;
    }

    public void setNewLines(Integer newLines) {
        this.newLines = newLines;
    }

    public Integer getOldStart() {
        return oldStart;
    }

    public void setOldStart(Integer oldStart) {
        this.oldStart = oldStart;
    }

    public Integer getOldLines() {
        return oldLines;
    }

    public void setOldLines(Integer oldLines) {
        this.oldLines = oldLines;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
