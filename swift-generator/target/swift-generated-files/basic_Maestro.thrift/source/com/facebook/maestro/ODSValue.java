// Generated by swift-generator from Maestro.thrift

package com.facebook.maestro;

import com.facebook.swift.codec.*;
import com.facebook.swift.codec.ThriftField.Requiredness;
import com.facebook.swift.codec.ThriftField.Recursiveness;
import java.util.*;

import static com.google.common.base.MoreObjects.toStringHelper;

@ThriftStruct("ODSValue")
public final class ODSValue
{
    @ThriftConstructor
    public ODSValue(
        @ThriftField(value=1, name="unixTime", requiredness=Requiredness.NONE) final long unixTime,
        @ThriftField(value=2, name="value", requiredness=Requiredness.NONE) final double value,
        @ThriftField(value=3, name="application", requiredness=Requiredness.NONE) final String application,
        @ThriftField(value=4, name="key", requiredness=Requiredness.NONE) final String key,
        @ThriftField(value=5, name="location", requiredness=Requiredness.NONE) final String location
    ) {
        this.unixTime = unixTime;
        this.value = value;
        this.application = application;
        this.key = key;
        this.location = location;
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
        private String application;

        public Builder setApplication(String application) {
            this.application = application;
            return this;
        }
        private String key;

        public Builder setKey(String key) {
            this.key = key;
            return this;
        }
        private String location;

        public Builder setLocation(String location) {
            this.location = location;
            return this;
        }

        public Builder() { }
        public Builder(ODSValue other) {
            this.unixTime = other.unixTime;
            this.value = other.value;
            this.application = other.application;
            this.key = other.key;
            this.location = other.location;
        }

        public ODSValue build() {
            return new ODSValue (
                this.unixTime,
                this.value,
                this.application,
                this.key,
                this.location
            );
        }
    }

    private final long unixTime;

    @ThriftField(value=1, name="unixTime", requiredness=Requiredness.NONE)
    public long getUnixTime() { return unixTime; }

    private final double value;

    @ThriftField(value=2, name="value", requiredness=Requiredness.NONE)
    public double getValue() { return value; }

    private final String application;

    @ThriftField(value=3, name="application", requiredness=Requiredness.NONE)
    public String getApplication() { return application; }

    private final String key;

    @ThriftField(value=4, name="key", requiredness=Requiredness.NONE)
    public String getKey() { return key; }

    private final String location;

    @ThriftField(value=5, name="location", requiredness=Requiredness.NONE)
    public String getLocation() { return location; }

    @Override
    public String toString()
    {
        return toStringHelper(this)
            .add("unixTime", unixTime)
            .add("value", value)
            .add("application", application)
            .add("key", key)
            .add("location", location)
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

        ODSValue other = (ODSValue)o;

        return
            Objects.equals(unixTime, other.unixTime) &&
            Objects.equals(value, other.value) &&
            Objects.equals(application, other.application) &&
            Objects.equals(key, other.key) &&
            Objects.equals(location, other.location);
    }

    @Override
    public int hashCode() {
        return Arrays.deepHashCode(new Object[] {
            unixTime,
            value,
            application,
            key,
            location
        });
    }
}