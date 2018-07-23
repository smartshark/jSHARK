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

import com.google.common.base.MoreObjects;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Property;

/**
 * @author Fabian Trautsch
 */
public class MutationResult {
    @Property("mutation_id")
    private ObjectId mutationId;

    @Property("num_calls")
    private Long numCalls = null;

    @Property("call_depth")
    private Long callDepth = null;

    private String result;

    public MutationResult() { }

    public MutationResult(ObjectId mutationId, String result) {
        this.mutationId = mutationId;
        this.result = result;
    }

    public MutationResult(ObjectId mutationId, String result, Long numCalls, Long callDepth) {
        this.mutationId = mutationId;
        this.result = result;
        this.numCalls = numCalls;
        this.callDepth = callDepth;
    }

    public ObjectId getMutationId() {
        return mutationId;
    }

    public void setMutationId(ObjectId mutationId) {
        this.mutationId = mutationId;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Long getNumCalls() {
        return numCalls;
    }

    public void setNumCalls(Long numCalls) {
        this.numCalls = numCalls;
    }

    public Long getCallDepth() {
        return callDepth;
    }

    public void setCallDepth(Long callDepth) {
        this.callDepth = callDepth;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof MutationResult)) {
            return false;
        }

        if(obj == this) {
            return true;
        }

        MutationResult otherNode = (MutationResult) obj;
        return new EqualsBuilder()
                .append(mutationId, otherNode.mutationId)
                .append(result, otherNode.result)
                .append(numCalls, otherNode.numCalls)
                .append(callDepth, otherNode.callDepth)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 31)
                .append(mutationId)
                .append(result)
                .append(numCalls)
                .append(callDepth)
                .toHashCode();
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("mutation_id", mutationId)
                .add("result", result)
                .add("num_calls", numCalls)
                .add("call_depth", callDepth)
                .toString();
    }
}
