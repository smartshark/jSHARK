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


import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

/**
 * @author Philip Makedonski
 */
@Entity(value = "cfa_state", noClassnameStored = true)
public class CFAState {
    @Id
    @Property("_id")
    private ObjectId id;

    @Property("type")
    private String type;

    @Property("entity_id")
    private ObjectId entityId;

    @Property("parent_id")
    private ObjectId parentId;

    @Property("children_ids")
    private List<ObjectId> childrenIds = new ArrayList<>();

    @Property("causes_ids")
    private Set<ObjectId> causesIds = new HashSet<>();

    @Property("fixes_ids")
    private Set<ObjectId> fixesIds = new HashSet<>();

    @Property("factors")
    private Map<String, ObjectId> factors = new LinkedHashMap<>();

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public ObjectId getEntityId() {
		return entityId;
	}

	public void setEntityId(ObjectId entityId) {
		this.entityId = entityId;
	}

	public ObjectId getParentId() {
		return parentId;
	}

	public void setParentId(ObjectId parentId) {
		this.parentId = parentId;
	}

	public List<ObjectId> getChildrenIds() {
		return childrenIds;
	}

	public void setChildrenIds(List<ObjectId> childrenIds) {
		this.childrenIds = childrenIds;
	}

	public Set<ObjectId> getCausesIds() {
		return causesIds;
	}

	public void setCausesIds(Set<ObjectId> causesIds) {
		this.causesIds = causesIds;
	}

	public Set<ObjectId> getFixesIds() {
		return fixesIds;
	}

	public void setFixesIds(Set<ObjectId> fixesIds) {
		this.fixesIds = fixesIds;
	}

	public Map<String, ObjectId> getFactors() {
		return factors;
	}

	public void setFactors(Map<String, ObjectId> factors) {
		this.factors = factors;
	}

    
}
