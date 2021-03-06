// Generated by swift-generator from Maestro.thrift

package com.facebook.maestro;

import com.facebook.swift.codec.*;
import com.facebook.swift.codec.ThriftField.Requiredness;
import com.facebook.swift.codec.ThriftField.Recursiveness;
import java.util.*;

import static com.google.common.base.MoreObjects.toStringHelper;

@ThriftStruct("GetTimeSeriesResults")
public final class GetTimeSeriesResults
{
    @ThriftConstructor
    public GetTimeSeriesResults(
        @ThriftField(value=1, name="data", requiredness=Requiredness.NONE) final Map<String, Map<String, List<TimeValue>>> data
    ) {
        this.data = data;
    }

    public static class Builder {
        private Map<String, Map<String, List<TimeValue>>> data;

        public Builder setData(Map<String, Map<String, List<TimeValue>>> data) {
            this.data = data;
            return this;
        }

        public Builder() { }
        public Builder(GetTimeSeriesResults other) {
            this.data = other.data;
        }

        public GetTimeSeriesResults build() {
            return new GetTimeSeriesResults (
                this.data
            );
        }
    }

    private final Map<String, Map<String, List<TimeValue>>> data;

    @ThriftField(value=1, name="data", requiredness=Requiredness.NONE)
    public Map<String, Map<String, List<TimeValue>>> getData() { return data; }

    @Override
    public String toString()
    {
        return toStringHelper(this)
            .add("data", data)
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

        GetTimeSeriesResults other = (GetTimeSeriesResults)o;

        return
            Objects.equals(data, other.data);
    }

    @Override
    public int hashCode() {
        return Arrays.deepHashCode(new Object[] {
            data
        });
    }
}
