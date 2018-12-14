package de.ugoe.cs.smartshark.model;

import java.util.Map;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

import java.util.Date;
import java.util.List;


@Entity(value = "commit", noClassnameStored = true)
public class Commit {
    @Id
    @Property("_id")
    private ObjectId id;

    @Property("vcs_system_id")
    private ObjectId vcSystemId;

    @Property("revision_hash")
    private String revisionHash;

    private List<String> branches;
    private List<String> parents;

    @Property("author_id")
    private ObjectId authorId;

    @Property("author_date")
    private Date authorDate;

    @Property("author_date_offset")
    private int authorDateOffset;

    @Property("committer_id")
    private ObjectId committerId;

    @Property("committer_date")
    private Date committerDate;

    @Property("committer_date_offset")
    private int committerDateOffset;

    private String message;

    @Property("linked_issue_ids")
    private List<ObjectId> linkedIssueIds;

    private Map<String, String> labels;

    @Property("code_entity_states")
    private List<ObjectId> codeEntityStates;


    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public ObjectId getVcSystemId() {
        return vcSystemId;
    }

    public void setVcSystemId(ObjectId vcSystemId) {
        this.vcSystemId = vcSystemId;
    }

    public String getRevisionHash() {
        return revisionHash;
    }

    public void setRevisionHash(String revisionHash) {
        this.revisionHash = revisionHash;
    }

    public List<String> getParents() {
        return parents;
    }

    public void setParents(List<String> parents) {
        this.parents = parents;
    }

    public List<String> getBranches() {
        return branches;
    }

    public void setBranches(List<String> branches) {
        this.branches = branches;
    }

    public Date getAuthorDate() {
        return authorDate;
    }

    public void setAuthorDate(Date authorDate) {
        this.authorDate = authorDate;
    }

    public Date getCommitterDate() {
        return committerDate;
    }

    public void setCommitterDate(Date committerDate) {
        this.committerDate = committerDate;
    }

    public ObjectId getAuthorId() {
        return authorId;
    }

    public void setAuthorId(ObjectId authorId) {
        this.authorId = authorId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getAuthorDateOffset() {
        return authorDateOffset;
    }

    public void setAuthorDateOffset(int authorDateOffset) {
        this.authorDateOffset = authorDateOffset;
    }

    public int getCommitterDateOffset() {
        return committerDateOffset;
    }

    public void setCommitterDateOffset(int committerDateOffset) {
        this.committerDateOffset = committerDateOffset;
    }

    public ObjectId getCommitterId() {
        return committerId;
    }

    public void setCommitterId(ObjectId committerId) {
        this.committerId = committerId;
    }

    public List<ObjectId> getLinkedIssueIds() {
        return linkedIssueIds;
    }

    public void setLinkedIssueIds(List<ObjectId> linkedIssueIds) {
        this.linkedIssueIds = linkedIssueIds;
    }

    public Map<String, String> getLabels() {
        return labels;
    }

    public void setLabels(Map<String, String> labels) {
        this.labels = labels;
    }

    public List<ObjectId> getCodeEntityStates() {
        return codeEntityStates;
    }
}
