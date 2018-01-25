package de.ugoe.cs.smartshark.model;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

import java.util.List;
import java.util.Map;

@Entity("code_entity_state")
public class CodeEntityState {
    @Id
    @Property("_id")
    private ObjectId id;

    @Property("s_key")
    private String sKey;

    @Property("long_name")
    private String longName;

    @Property("commit_id")
    private ObjectId commitId;

    @Property("file_id")
    private ObjectId fileId;

    private List<Map<String, String>> linter;

    @Property("test_type")
    private Map<String, String> testType;

    @Property("ce_parent_id")
    private ObjectId ceParentId;

    @Property("cg_ids")
    private List<ObjectId> cgIds;

    @Property("ce_type")
    private String ceType;

    private List<String> imports;

    @Property("start_line")
    private int startLine;

    @Property("end_line")
    private int endLine;

    @Property("start_column")
    private int startColumn;

    @Property("end_column")
    private int endColumn;

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

    public ObjectId getFileId() {
        return fileId;
    }

    public void setFileId(ObjectId fileId) {
        this.fileId = fileId;
    }

    public String getLongName() {
        return longName;
    }

    public void setLongName(String longName) {
        this.longName = longName;
    }

    public Map<String, Double> getMetrics() {
        return metrics;
    }

    public void setMetrics(Map<String, Double> metrics) {
        this.metrics = metrics;
    }

    public ObjectId getCommitId() {
        return commitId;
    }

    public void setCommitId(ObjectId commitId) {
        this.commitId = commitId;
    }

    public int getStartColumn() {
        return startColumn;
    }

    public void setStartColumn(int startColumn) {
        this.startColumn = startColumn;
    }

    public int getEndColumn() {
        return endColumn;
    }

    public void setEndColumn(int endColumn) {
        this.endColumn = endColumn;
    }

    public int getStartLine() {
        return startLine;
    }

    public void setStartLine(int startLine) {
        this.startLine = startLine;
    }

    public int getEndLine() {
        return endLine;
    }

    public void setEndLine(int endLine) {
        this.endLine = endLine;
    }

    public String getCeType() {
        return ceType;
    }

    public void setCeType(String ceType) {
        this.ceType = ceType;
    }

    public ObjectId getCeParentId() {
        return ceParentId;
    }

    public void setCeParentId(ObjectId ceParentId) {
        this.ceParentId = ceParentId;
    }

    public List<ObjectId> getCgIds() {
        return cgIds;
    }

    public void setCgIds(List<ObjectId> cgIds) {
        this.cgIds = cgIds;
    }

    public List<Map<String, String>> getLinter() {
        return linter;
    }

    public void setLinter(List<Map<String, String>> linter) {
        this.linter = linter;
    }

    public Map<String, String> getTestType() {
        return testType;
    }

    public void setTestType(Map<String, String> testType) {
        this.testType = testType;
    }

    public List<String> getImports() {
        return imports;
    }

    public void setImports(List<String> imports) {
        this.imports = imports;
    }
}
