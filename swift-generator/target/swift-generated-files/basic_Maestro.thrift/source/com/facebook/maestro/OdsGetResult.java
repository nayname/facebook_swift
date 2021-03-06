// Generated by swift-generator from Maestro.thrift

package com.facebook.maestro;

import com.facebook.swift.codec.*;
import com.facebook.swift.codec.ThriftField.Requiredness;
import com.facebook.swift.codec.ThriftField.Recursiveness;
import java.util.*;

import static com.google.common.base.MoreObjects.toStringHelper;

@ThriftStruct("OdsGetResult")
public final class OdsGetResult
{
    @ThriftConstructor
    public OdsGetResult(
        @ThriftField(value=1, name="result", requiredness=Requiredness.NONE) final Map<String, Map<String, List<TimeValue>>> result
    ) {
        this.result = result;
    }

    public static class Builder {
        private Map<String, Map<String, List<TimeValue>>> result;

        public Builder setResult(Map<String, Map<String, List<TimeValue>>> result) {
            this.result = result;
            return this;
        }

        public Builder() { }
        public Builder(OdsGetResult other) {
            this.result = other.result;
        }

        public OdsGetResult build() {
            return new OdsGetResult (
                this.result
            );
        }
    }

    private final Map<String, Map<String, List<TimeValue>>> result;

    @ThriftField(value=1, name="result", requiredness=Requiredness.NONE)
    public Map<String, Map<String, List<TimeValue>>> getResult() { return result; }

    @Override
    public String toString()
    {
        return toStringHelper(this)
            .add("result", result)
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

        OdsGetResult other = (OdsGetResult)o;

        return
            Objects.equals(result, other.result);
    }

    @Override
    public int hashCode() {
        return Arrays.deepHashCode(new Object[] {
            result
        });
    }
}
