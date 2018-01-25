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
@Entity("mynbou_data")
public class MynbouData {
    @Id
    @Property("_id")
    private ObjectId id;

    @Property("vcs_system_id")
    private ObjectId vcsSystemId;

    private String name;

    @Property("path_approach")
    private String pathApproach;

    @Property("bugfix_label")
    private String bugfixLabel;

    @Property("metric_approach")
    private String metricApproach;

    @Property("last_updated")
    private Date lastUpdated;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public ObjectId getVcsSystemId() {
        return vcsSystemId;
    }

    public void setVcsSystemId(ObjectId vcsSystemId) {
        this.vcsSystemId = vcsSystemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPathApproach() {
        return pathApproach;
    }

    public void setPathApproach(String pathApproach) {
        this.pathApproach = pathApproach;
    }

    public String getBugfixLabel() {
        return bugfixLabel;
    }

    public void setBugfixLabel(String bugfixLabel) {
        this.bugfixLabel = bugfixLabel;
    }

    public String getMetricApproach() {
        return metricApproach;
    }

    public void setMetricApproach(String metricApproach) {
        this.metricApproach = metricApproach;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
