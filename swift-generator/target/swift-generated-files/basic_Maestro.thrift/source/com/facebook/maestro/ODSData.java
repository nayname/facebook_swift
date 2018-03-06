// Generated by swift-generator from Maestro.thrift

package com.facebook.maestro;

import com.facebook.swift.codec.*;
import com.facebook.swift.codec.ThriftField.Requiredness;
import com.facebook.swift.codec.ThriftField.Recursiveness;
import java.util.*;

import static com.google.common.base.MoreObjects.toStringHelper;

@ThriftStruct("ODSData")
public final class ODSData
{
    @ThriftConstructor
    public ODSData(
        @ThriftField(value=1, name="unixTime", requiredness=Requiredness.NONE) final long unixTime,
        @ThriftField(value=2, name="value", requiredness=Requiredness.NONE) final String value,
        @ThriftField(value=3, name="entity", requiredness=Requiredness.NONE) final String entity,
        @ThriftField(value=4, name="key", requiredness=Requiredness.NONE) final String key,
        @ThriftField(value=5, name="dataType", requiredness=Requiredness.NONE) final OdsDataType dataType
    ) {
        this.unixTime = unixTime;
        this.value = value;
        this.entity = entity;
        this.key = key;
        this.dataType = dataType;
    }

    public static class Builder {
        private long unixTime;

        public Builder setUnixTime(long unixTime) {
            this.unixTime = unixTime;
            return this;
        }
        private String value;

        public Builder setValue(String value) {
            this.value = value;
            return this;
        }
        private String entity;

        public Builder setEntity(String entity) {
            this.entity = entity;
            return this;
        }
        private String key;

        public Builder setKey(String key) {
            this.key = key;
            return this;
        }
        private OdsDataType dataType;

        public Builder setDataType(OdsDataType dataType) {
            this.dataType = dataType;
            return this;
        }

        public Builder() { }
        public Builder(ODSData other) {
            this.unixTime = other.unixTime;
            this.value = other.value;
            this.entity = other.entity;
            this.key = other.key;
            this.dataType = other.dataType;
        }

        public ODSData build() {
            return new ODSData (
                this.unixTime,
                this.value,
                this.entity,
                this.key,
                this.dataType
            );
        }
    }

    private final long unixTime;

    @ThriftField(value=1, name="unixTime", requiredness=Requiredness.NONE)
    public long getUnixTime() { return unixTime; }

    private final String value;

    @ThriftField(value=2, name="value", requiredness=Requiredness.NONE)
    public String getValue() { return value; }

    private final String entity;

    @ThriftField(value=3, name="entity", requiredness=Requiredness.NONE)
    public String getEntity() { return entity; }

    private final String key;

    @ThriftField(value=4, name="key", requiredness=Requiredness.NONE)
    public String getKey() { return key; }

    private final OdsDataType dataType;

    @ThriftField(value=5, name="dataType", requiredness=Requiredness.NONE)
    public OdsDataType getDataType() { return dataType; }

    @Override
    public String toString()
    {
        return toStringHelper(this)
            .add("unixTime", unixTime)
            .add("value", value)
            .add("entity", entity)
            .add("key", key)
            .add("dataType", dataType)
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

        ODSData other = (ODSData)o;

        return
            Objects.equals(unixTime, other.unixTime) &&
            Objects.equals(value, other.value) &&
            Objects.equals(entity, other.entity) &&
            Objects.equals(key, other.key) &&
            Objects.equals(dataType, other.dataType);
    }

    @Override
    public int hashCode() {
        return Arrays.deepHashCode(new Object[] {
            unixTime,
            value,
            entity,
            key,
            dataType
        });
    }
}