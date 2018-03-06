// Generated by swift-generator from Maestro.thrift

package com.facebook.maestro;

import com.facebook.swift.codec.*;
import com.facebook.swift.codec.ThriftField.Requiredness;
import com.facebook.swift.codec.ThriftField.Recursiveness;
import java.util.*;

import static com.google.common.base.MoreObjects.toStringHelper;

@ThriftStruct("ODSAppValue")
public final class ODSAppValue
{
    @ThriftConstructor
    public ODSAppValue(
        @ThriftField(value=1, name="unixTime", requiredness=Requiredness.NONE) final long unixTime,
        @ThriftField(value=2, name="value", requiredness=Requiredness.NONE) final double value,
        @ThriftField(value=3, name="entity", requiredness=Requiredness.NONE) final String entity,
        @ThriftField(value=4, name="key", requiredness=Requiredness.NONE) final String key,
        @ThriftField(value=5, name="interval", requiredness=Requiredness.NONE) final int interval,
        @ThriftField(value=6, name="category_id", requiredness=Requiredness.NONE) final int categoryId
    ) {
        this.unixTime = unixTime;
        this.value = value;
        this.entity = entity;
        this.key = key;
        this.interval = interval;
        this.categoryId = categoryId;
    }

    public static class Builder {
        private long unixTime;

        public Builder setUnixTime(long unixTime) {
            this.unixTime = unixTime;
            return this;
        }
        private double value;

        public Builder setValue(double value) {
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
        private int interval;

        public Builder setInterval(int interval) {
            this.interval = interval;
            return this;
        }
        private int categoryId;

        public Builder setCategoryId(int categoryId) {
            this.categoryId = categoryId;
            return this;
        }

        public Builder() { }
        public Builder(ODSAppValue other) {
            this.unixTime = other.unixTime;
            this.value = other.value;
            this.entity = other.entity;
            this.key = other.key;
            this.interval = other.interval;
            this.categoryId = other.categoryId;
        }

        public ODSAppValue build() {
            return new ODSAppValue (
                this.unixTime,
                this.value,
                this.entity,
                this.key,
                this.interval,
                this.categoryId
            );
        }
    }

    private final long unixTime;

    @ThriftField(value=1, name="unixTime", requiredness=Requiredness.NONE)
    public long getUnixTime() { return unixTime; }

    private final double value;

    @ThriftField(value=2, name="value", requiredness=Requiredness.NONE)
    public double getValue() { return value; }

    private final String entity;

    @ThriftField(value=3, name="entity", requiredness=Requiredness.NONE)
    public String getEntity() { return entity; }

    private final String key;

    @ThriftField(value=4, name="key", requiredness=Requiredness.NONE)
    public String getKey() { return key; }

    private final int interval;

    @ThriftField(value=5, name="interval", requiredness=Requiredness.NONE)
    public int getInterval() { return interval; }

    private final int categoryId;

    @ThriftField(value=6, name="category_id", requiredness=Requiredness.NONE)
    public int getCategoryId() { return categoryId; }

    @Override
    public String toString()
    {
        return toStringHelper(this)
            .add("unixTime", unixTime)
            .add("value", value)
            .add("entity", entity)
            .add("key", key)
            .add("interval", interval)
            .add("categoryId", categoryId)
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

        ODSAppValue other = (ODSAppValue)o;

        return
            Objects.equals(unixTime, other.unixTime) &&
            Objects.equals(value, other.value) &&
            Objects.equals(entity, other.entity) &&
            Objects.equals(key, other.key) &&
            Objects.equals(interval, other.interval) &&
            Objects.equals(categoryId, other.categoryId);
    }

    @Override
    public int hashCode() {
        return Arrays.deepHashCode(new Object[] {
            unixTime,
            value,
            entity,
            key,
            interval,
            categoryId
        });
    }
}
