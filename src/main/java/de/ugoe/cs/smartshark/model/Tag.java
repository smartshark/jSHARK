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

import java.util.Date;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

/**
 * @author Fabian Trautsch
 */
@Entity(value = "tag", noClassnameStored = true)
public class Tag {
    @Id
    @Property("_id")
    private ObjectId id;

    private String name;

    @Property("commit_id")
    private ObjectId commitId;

    @Property("vcs_system_id")
    private ObjectId vcsSystemId;

    private String message;

    @Property("tagger_id")
    private ObjectId taggerId;

    private Date date;

    @Property("date_offset")
    private Integer dateOffset;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ObjectId getCommitId() {
        return commitId;
    }

    public void setCommitId(ObjectId commitId) {
        this.commitId = commitId;
    }

    public ObjectId getVcsSystemId() {
        return vcsSystemId;
    }

    public void setVcsSystemId(ObjectId vcsSystemId) {
        this.vcsSystemId = vcsSystemId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ObjectId getTaggerId() {
        return taggerId;
    }

    public void setTaggerId(ObjectId taggerId) {
        this.taggerId = taggerId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getDateOffset() {
        return dateOffset;
    }

    public void setDateOffset(Integer dateOffset) {
        this.dateOffset = dateOffset;
    }
}
