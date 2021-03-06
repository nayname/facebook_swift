// Generated by swift-generator from ConstantsDemo.thrift

package com.facebook.swift;

import com.facebook.swift.codec.*;
import com.facebook.swift.codec.ThriftField.Requiredness;
import com.facebook.swift.codec.ThriftField.Recursiveness;
import java.util.*;

import static com.google.common.base.MoreObjects.toStringHelper;

@ThriftStruct("thing2")
public final class Thing2
{
    @ThriftConstructor
    public Thing2(
        @ThriftField(value=1, name="val", requiredness=Requiredness.NONE) final Enumconstants val
    ) {
        this.val = val;
    }

    public static class Builder {
        private Enumconstants val;

        public Builder setVal(Enumconstants val) {
            this.val = val;
            return this;
        }

        public Builder() { }
        public Builder(Thing2 other) {
            this.val = other.val;
        }

        public Thing2 build() {
            return new Thing2 (
                this.val
            );
        }
    }

    private final Enumconstants val;

    @ThriftField(value=1, name="val", requiredness=Requiredness.NONE)
    public Enumconstants getVal() { return val; }

    @Override
    public String toString()
    {
        return toStringHelper(this)
            .add("val", val)
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

        Thing2 other = (Thing2)o;

        return
            Objects.equals(val, other.val);
    }

    @Override
    public int hashCode() {
        return Arrays.deepHashCode(new Object[] {
            val
        });
    }
}
