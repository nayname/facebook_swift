// Generated by swift-generator from hive/metastore.thrift

package org.apache.hadoop.hive.metastore.api;

import com.facebook.swift.codec.*;
import com.facebook.swift.codec.ThriftField.Requiredness;
import com.facebook.swift.codec.ThriftField.Recursiveness;
import java.util.*;

import static com.google.common.base.MoreObjects.toStringHelper;

@ThriftStruct("Type")
public final class Type
{
    @ThriftConstructor
    public Type(
        @ThriftField(value=1, name="name", requiredness=Requiredness.NONE) final String name,
        @ThriftField(value=2, name="type1", requiredness=Requiredness.OPTIONAL) final String type1,
        @ThriftField(value=3, name="type2", requiredness=Requiredness.OPTIONAL) final String type2,
        @ThriftField(value=4, name="fields", requiredness=Requiredness.OPTIONAL) final List<FieldSchema> fields
    ) {
        this.name = name;
        this.type1 = type1;
        this.type2 = type2;
        this.fields = fields;
    }

    public static class Builder {
        private String name;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }
        private String type1;

        public Builder setType1(String type1) {
            this.type1 = type1;
            return this;
        }
        private String type2;

        public Builder setType2(String type2) {
            this.type2 = type2;
            return this;
        }
        private List<FieldSchema> fields;

        public Builder setFields(List<FieldSchema> fields) {
            this.fields = fields;
            return this;
        }

        public Builder() { }
        public Builder(Type other) {
            this.name = other.name;
            this.type1 = other.type1;
            this.type2 = other.type2;
            this.fields = other.fields;
        }

        public Type build() {
            return new Type (
                this.name,
                this.type1,
                this.type2,
                this.fields
            );
        }
    }

    private final String name;

    @ThriftField(value=1, name="name", requiredness=Requiredness.NONE)
    public String getName() { return name; }

    private final String type1;

    @ThriftField(value=2, name="type1", requiredness=Requiredness.OPTIONAL)
    public String getType1() { return type1; }

    private final String type2;

    @ThriftField(value=3, name="type2", requiredness=Requiredness.OPTIONAL)
    public String getType2() { return type2; }

    private final List<FieldSchema> fields;

    @ThriftField(value=4, name="fields", requiredness=Requiredness.OPTIONAL)
    public List<FieldSchema> getFields() { return fields; }

    @Override
    public String toString()
    {
        return toStringHelper(this)
            .add("name", name)
            .add("type1", type1)
            .add("type2", type2)
            .add("fields", fields)
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

        Type other = (Type)o;

        return
            Objects.equals(name, other.name) &&
            Objects.equals(type1, other.type1) &&
            Objects.equals(type2, other.type2) &&
            Objects.equals(fields, other.fields);
    }

    @Override
    public int hashCode() {
        return Arrays.deepHashCode(new Object[] {
            name,
            type1,
            type2,
            fields
        });
    }
}
