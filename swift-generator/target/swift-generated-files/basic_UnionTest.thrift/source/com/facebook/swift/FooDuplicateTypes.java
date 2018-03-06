// Generated by swift-generator from UnionTest.thrift

package com.facebook.swift;

import com.facebook.swift.codec.*;
import com.facebook.swift.codec.ThriftField.Requiredness;
import com.facebook.swift.codec.ThriftField.Recursiveness;
import java.util.*;

import static com.google.common.base.MoreObjects.toStringHelper;

@ThriftUnion("foo_duplicate_types")
public final class FooDuplicateTypes
{
    private Object value;
    private short id = -1;
    private String name;

    @ThriftConstructor
    public FooDuplicateTypes() {
    }



    @ThriftField
    public void setBar(final int bar) {
        this.value = bar;
        this.id = 1;
        this.name = "bar";
    }

    @ThriftField
    public void setBaz(final int baz) {
        this.value = baz;
        this.id = 2;
        this.name = "baz";
    }


    @ThriftField(value=1, name="bar", requiredness=Requiredness.NONE)
    public int getBar() {
        if (this.id != 1) {
            throw new IllegalStateException("Not a bar element!");
        }
        return (int) value;
    }

    public boolean isSetBar() {
        return this.id == 1;
    }

    @ThriftField(value=2, name="baz", requiredness=Requiredness.NONE)
    public int getBaz() {
        if (this.id != 2) {
            throw new IllegalStateException("Not a baz element!");
        }
        return (int) value;
    }

    public boolean isSetBaz() {
        return this.id == 2;
    }

    @ThriftUnionId
    public short getThriftId()
    {
        return this.id;
    }

    public String getThriftName()
    {
        return this.name;
    }

    @Override
    public String toString()
    {
        return toStringHelper(this)
            .add("value", value)
            .add("id", id)
            .add("name", name)
            .add("type", value == null ? "<null>" : value.getClass().getSimpleName())
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

        FooDuplicateTypes other = (FooDuplicateTypes)o;

        return Objects.equals(this.id, other.id)
                && Objects.equals(this.value, other.value)
                && Objects.equals(this.name, other.name);
    }

    @Override
    public int hashCode() {
        return Arrays.deepHashCode(new Object[] {
            id,
            value,
            name
        });
    }
}