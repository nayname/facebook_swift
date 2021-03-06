// Generated by swift-generator from Maestro.thrift

package com.facebook.maestro;

import com.facebook.swift.codec.*;
import com.facebook.swift.codec.ThriftField.Requiredness;
import com.facebook.swift.codec.ThriftField.Recursiveness;
import java.util.*;

import static com.google.common.base.MoreObjects.toStringHelper;

@ThriftStruct("RecentEntitiesOrKeys")
public final class RecentEntitiesOrKeys
{
    @ThriftConstructor
    public RecentEntitiesOrKeys(
        @ThriftField(value=1, name="highest_id", requiredness=Requiredness.NONE) final int highestId,
        @ThriftField(value=2, name="names", requiredness=Requiredness.NONE) final List<String> names
    ) {
        this.highestId = highestId;
        this.names = names;
    }

    public static class Builder {
        private int highestId;

        public Builder setHighestId(int highestId) {
            this.highestId = highestId;
            return this;
        }
        private List<String> names;

        public Builder setNames(List<String> names) {
            this.names = names;
            return this;
        }

        public Builder() { }
        public Builder(RecentEntitiesOrKeys other) {
            this.highestId = other.highestId;
            this.names = other.names;
        }

        public RecentEntitiesOrKeys build() {
            return new RecentEntitiesOrKeys (
                this.highestId,
                this.names
            );
        }
    }

    private final int highestId;

    @ThriftField(value=1, name="highest_id", requiredness=Requiredness.NONE)
    public int getHighestId() { return highestId; }

    private final List<String> names;

    @ThriftField(value=2, name="names", requiredness=Requiredness.NONE)
    public List<String> getNames() { return names; }

    @Override
    public String toString()
    {
        return toStringHelper(this)
            .add("highestId", highestId)
            .add("names", names)
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

        RecentEntitiesOrKeys other = (RecentEntitiesOrKeys)o;

        return
            Objects.equals(highestId, other.highestId) &&
            Objects.equals(names, other.names);
    }

    @Override
    public int hashCode() {
        return Arrays.deepHashCode(new Object[] {
            highestId,
            names
        });
    }
}
