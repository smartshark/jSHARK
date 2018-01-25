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
import java.util.List;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

/**
 * @author Fabian Trautsch
 */
@Entity("travis_build")
public class TravisBuild {
    @Id
    @Property("_id")
    private ObjectId id;

    @Property("tr_id")
    private Integer travisId;

    @Property("vcs_system_id")
    private ObjectId vcsSystemId;

    @Property("commit_id")
    private ObjectId commitId;

    private Integer number;
    private String state;
    private Long duration;

    @Property("event_type")
    private String eventType;

    @Property("pr_number")
    private Integer pullReqNumber;

    @Property("started_at")
    private Date startedAt;

    @Property("finished_at")
    private Date finishedAt;

    private List<String> stages;

    @Embedded("jobs")
    private List<TravisJob> jobs;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public Integer getTravisId() {
        return travisId;
    }

    public void setTravisId(Integer travisId) {
        this.travisId = travisId;
    }

    public ObjectId getVcsSystemId() {
        return vcsSystemId;
    }

    public void setVcsSystemId(ObjectId vcsSystemId) {
        this.vcsSystemId = vcsSystemId;
    }

    public ObjectId getCommitId() {
        return commitId;
    }

    public void setCommitId(ObjectId commitId) {
        this.commitId = commitId;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public Integer getPullReqNumber() {
        return pullReqNumber;
    }

    public void setPullReqNumber(Integer pullReqNumber) {
        this.pullReqNumber = pullReqNumber;
    }

    public Date getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(Date startedAt) {
        this.startedAt = startedAt;
    }

    public Date getFinishedAt() {
        return finishedAt;
    }

    public void setFinishedAt(Date finishedAt) {
        this.finishedAt = finishedAt;
    }

    public List<String> getStages() {
        return stages;
    }

    public void setStages(List<String> stages) {
        this.stages = stages;
    }

    public List<TravisJob> getJobs() {
        return jobs;
    }

    public void setJobs(List<TravisJob> jobs) {
        this.jobs = jobs;
    }
}
