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
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

/**
 * @author Fabian Trautsch
 */
@Entity(value = "message", noClassnameStored = true)
public class Message {
    @Id
    @Property("_id")
    private ObjectId id;

    @Property("message_id")
    private String messageId;

    @Property("mailing_list_id")
    private ObjectId mailingListId;

    @Property("reference_ids")
    private List<ObjectId> referenceIds;

    @Property("in_reply_to_id")
    private ObjectId inReplyToId;

    @Property("from_id")
    private ObjectId fromId;

    @Property("to_ids")
    private List<ObjectId> toIds;

    @Property("cc_ids")
    private List<ObjectId> ccIds;

    private String subject;
    private String body;
    private Date date;
    private List<String> patches;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public ObjectId getMailingListId() {
        return mailingListId;
    }

    public void setMailingListId(ObjectId mailingListId) {
        this.mailingListId = mailingListId;
    }

    public List<ObjectId> getReferenceIds() {
        return referenceIds;
    }

    public void setReferenceIds(List<ObjectId> referenceIds) {
        this.referenceIds = referenceIds;
    }

    public ObjectId getInReplyToId() {
        return inReplyToId;
    }

    public void setInReplyToId(ObjectId inReplyToId) {
        this.inReplyToId = inReplyToId;
    }

    public ObjectId getFromId() {
        return fromId;
    }

    public void setFromId(ObjectId fromId) {
        this.fromId = fromId;
    }

    public List<ObjectId> getToIds() {
        return toIds;
    }

    public void setToIds(List<ObjectId> toIds) {
        this.toIds = toIds;
    }

    public List<ObjectId> getCcIds() {
        return ccIds;
    }

    public void setCcIds(List<ObjectId> ccIds) {
        this.ccIds = ccIds;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<String> getPatches() {
        return patches;
    }

    public void setPatches(List<String> patches) {
        this.patches = patches;
    }
}
