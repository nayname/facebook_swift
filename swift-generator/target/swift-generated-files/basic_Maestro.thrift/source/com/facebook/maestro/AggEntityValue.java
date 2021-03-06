// Generated by swift-generator from Maestro.thrift

package com.facebook.maestro;

import com.facebook.swift.codec.*;
import com.facebook.swift.codec.ThriftField.Requiredness;
import com.facebook.swift.codec.ThriftField.Recursiveness;
import java.util.*;

import static com.google.common.base.MoreObjects.toStringHelper;

@ThriftStruct("AggEntityValue")
public final class AggEntityValue
{
    @ThriftConstructor
    public AggEntityValue(
        @ThriftField(value=1, name="values", requiredness=Requiredness.NONE) final Map<String, List<TimeValue>> values,
        @ThriftField(value=2, name="entities", requiredness=Requiredness.NONE) final Set<String> entities
    ) {
        this.values = values;
        this.entities = entities;
    }

    public static class Builder {
        private Map<String, List<TimeValue>> values;

        public Builder setValues(Map<String, List<TimeValue>> values) {
            this.values = values;
            return this;
        }
        private Set<String> entities;

        public Builder setEntities(Set<String> entities) {
            this.entities = entities;
            return this;
        }

        public Builder() { }
        public Builder(AggEntityValue other) {
            this.values = other.values;
            this.entities = other.entities;
        }

        public AggEntityValue build() {
            return new AggEntityValue (
                this.values,
                this.entities
            );
        }
    }

    private final Map<String, List<TimeValue>> values;

    @ThriftField(value=1, name="values", requiredness=Requiredness.NONE)
    public Map<String, List<TimeValue>> getValues() { return values; }

    private final Set<String> entities;

    @ThriftField(value=2, name="entities", requiredness=Requiredness.NONE)
    public Set<String> getEntities() { return entities; }

    @Override
    public String toString()
    {
        return toStringHelper(this)
            .add("values", values)
            .add("entities", entities)
            .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        AggEntityValue other = (AggEntityValue)o;

        return
            Objects.equals(values, other.values) &&
            Objects.equals(entities, other.entities);
    }

    @Override
    public int hashCode() {
        return Arrays.deepHashCode(new Object[] {
            values,
            entities
        });
    }
}
