// Generated by swift-generator from Maestro.thrift

package com.facebook.maestro;

import com.facebook.swift.codec.*;
import com.facebook.swift.codec.ThriftField.Requiredness;
import com.facebook.swift.codec.ThriftField.Recursiveness;
import java.util.*;

import static com.google.common.base.MoreObjects.toStringHelper;

@ThriftStruct("ODSFbagentDataWithTagsList")
public final class ODSFbagentDataWithTagsList
{
    @ThriftConstructor
    public ODSFbagentDataWithTagsList(
        @ThriftField(value=1, name="datapoints", requiredness=Requiredness.NONE) final List<ODSFbagentDataWithTags> datapoints
    ) {
        this.datapoints = datapoints;
    }

    public static class Builder {
        private List<ODSFbagentDataWithTags> datapoints;

        public Builder setDatapoints(List<ODSFbagentDataWithTags> datapoints) {
            this.datapoints = datapoints;
            return this;
        }

        public Builder() { }
        public Builder(ODSFbagentDataWithTagsList other) {
            this.datapoints = other.datapoints;
        }

        public ODSFbagentDataWithTagsList build() {
            return new ODSFbagentDataWithTagsList (
                this.datapoints
            );
        }
    }

    private final List<ODSFbagentDataWithTags> datapoints;

    @ThriftField(value=1, name="datapoints", requiredness=Requiredness.NONE)
    public List<ODSFbagentDataWithTags> getDatapoints() { return datapoints; }

    @Override
    public String toString()
    {
        return toStringHelper(this)
            .add("datapoints", datapoints)
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

        ODSFbagentDataWithTagsList other = (ODSFbagentDataWithTagsList)o;

        return
            Objects.equals(datapoints, other.datapoints);
    }

    @Override
    public int hashCode() {
        return Arrays.deepHashCode(new Object[] {
            datapoints
        });
    }
}