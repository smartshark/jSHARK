/*
 * Copyright (C) 2018 University of Goettingen, Germany
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
 * @author Philip Makedonski
 */
@Entity(value = "hunk_blame_line", noClassnameStored = true)
public class HunkBlameLine {
    @Id
    @Property("_id")
    private ObjectId id;

    @Property("hunk_id")
    private ObjectId hunkId;

    @Property("blamed_commit_id")
    private ObjectId blamedCommitId;

    @Property("hunk_line")
    private Integer hunkLine;

    @Property("line_count")
    private Integer lineCount = 1;
    
    @Property("source_line")
    private Integer sourceLine;

    @Property("source_path")
    private String sourcePath;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

	public ObjectId getHunkId() {
		return hunkId;
	}

	public void setHunkId(ObjectId hunkId) {
		this.hunkId = hunkId;
	}

	public ObjectId getBlamedCommitId() {
		return blamedCommitId;
	}

	public void setBlamedCommitId(ObjectId blamedCommitId) {
		this.blamedCommitId = blamedCommitId;
	}

	public Integer getHunkLine() {
		return hunkLine;
	}

	public void setHunkLine(Integer hunkLine) {
		this.hunkLine = hunkLine;
	}

	public Integer getSourceLine() {
		return sourceLine;
	}

	public void setSourceLine(Integer sourceLine) {
		this.sourceLine = sourceLine;
	}

	public Integer getLineCount() {
		return lineCount;
	}

	public void setLineCount(Integer lineCount) {
		this.lineCount = lineCount;
	}

	public String getSourcePath() {
		return sourcePath;
	}

	public void setSourcePath(String sourcePath) {
		this.sourcePath = sourcePath;
	}

}
