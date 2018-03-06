// Generated by swift-generator from test_basic.thrift

package com.facebook.swift;

import com.facebook.swift.codec.*;
import com.facebook.swift.codec.ThriftField.Requiredness;
import com.facebook.swift.codec.ThriftField.Recursiveness;
import java.util.*;

import static com.google.common.base.MoreObjects.toStringHelper;

@ThriftStruct("Dummy")
public final class Dummy
{
    @ThriftConstructor
    public Dummy() {
    }

    public static class Builder {

        public Builder() { }
        public Builder(Dummy other) {
        }

        public Dummy build() {
            return new Dummy (
            );
        }
    }



    @Override
    public String toString()
    {
        return toStringHelper(this)
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

        Dummy other = (Dummy)o;

        return
            true;
    }

    @Override
    public int hashCode() {
        return Arrays.deepHashCode(new Object[] {
        });
    }
}
