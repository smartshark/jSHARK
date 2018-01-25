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
import org.mongodb.morphia.annotations.Property;


public class RefactoringState {
    @Property("parent_ce_before")
    private ObjectId parentCeBefore;
    @Property("parent_ce_after")
    private ObjectId parentCeAfter;
    @Property("ce_before")
    private ObjectId ceBefore;
    @Property("ce_after")
    private ObjectId ceAfter;

    public ObjectId getParentCeBefore() {
        return parentCeBefore;
    }

    public void setParentCeBefore(ObjectId parentCeBefore) {
        this.parentCeBefore = parentCeBefore;
    }

    public ObjectId getParentCeAfter() {
        return parentCeAfter;
    }

    public void setParentCeAfter(ObjectId parentCeAfter) {
        this.parentCeAfter = parentCeAfter;
    }

    public ObjectId getCeBefore() {
        return ceBefore;
    }

    public void setCeBefore(ObjectId ceBefore) {
        this.ceBefore = ceBefore;
    }

    public ObjectId getCeAfter() {
        return ceAfter;
    }

    public void setCeAfter(ObjectId ceAfter) {
        this.ceAfter = ceAfter;
    }
}