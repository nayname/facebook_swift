// Generated by swift-generator from Maestro.thrift

package com.facebook.maestro;

import com.facebook.swift.codec.*;
import com.facebook.swift.codec.ThriftField.Requiredness;
import com.facebook.swift.codec.ThriftField.Recursiveness;
import java.util.*;

import static com.google.common.base.MoreObjects.toStringHelper;

@ThriftStruct("GetTimeSeriesParams")
public final class GetTimeSeriesParams
{
    @ThriftConstructor
    public GetTimeSeriesParams(
        @ThriftField(value=1, name="entities", requiredness=Requiredness.NONE) final List<String> entities,
        @ThriftField(value=2, name="keys", requiredness=Requiredness.NONE) final List<String> keys,
        @ThriftField(value=3, name="startTime", requiredness=Requiredness.NONE) final long startTime,
        @ThriftField(value=4, name="endTime", requiredness=Requiredness.NONE) final long endTime,
        @ThriftField(value=5, name="table", requiredness=Requiredness.NONE) final OdsDataTable table,
        @ThriftField(value=6, name="window", requiredness=Requiredness.NONE) final int window,
        @ThriftField(value=7, name="aggregationType", requiredness=Requiredness.NONE) final OdsAggregationType aggregationType,
        @ThriftField(value=8, name="traceData", requiredness=Requiredness.NONE) final String traceData
    ) {
        this.entities = entities;
        this.keys = keys;
        this.startTime = startTime;
        this.endTime = endTime;
        this.table = table;
        this.window = window;
        this.aggregationType = aggregationType;
        this.traceData = traceData;
    }

    public static class Builder {
        private List<String> entities;

        public Builder setEntities(List<String> entities) {
            this.entities = entities;
            return this;
        }
        private List<String> keys;

        public Builder setKeys(List<String> keys) {
            this.keys = keys;
            return this;
        }
        private long startTime;

        public Builder setStartTime(long startTime) {
            this.startTime = startTime;
            return this;
        }
        private long endTime;

        public Builder setEndTime(long endTime) {
            this.endTime = endTime;
            return this;
        }
        private OdsDataTable table;

        public Builder setTable(OdsDataTable table) {
            this.table = table;
            return this;
        }
        private int window;

        public Builder setWindow(int window) {
            this.window = window;
            return this;
        }
        private OdsAggregationType aggregationType;

        public Builder setAggregationType(OdsAggregationType aggregationType) {
            this.aggregationType = aggregationType;
            return this;
        }
        private String traceData;

        public Builder setTraceData(String traceData) {
            this.traceData = traceData;
            return this;
        }

        public Builder() { }
        public Builder(GetTimeSeriesParams other) {
            this.entities = other.entities;
            this.keys = other.keys;
            this.startTime = other.startTime;
            this.endTime = other.endTime;
            this.table = other.table;
            this.window = other.window;
            this.aggregationType = other.aggregationType;
            this.traceData = other.traceData;
        }

        public GetTimeSeriesParams build() {
            return new GetTimeSeriesParams (
                this.entities,
                this.keys,
                this.startTime,
                this.endTime,
                this.table,
                this.window,
                this.aggregationType,
                this.traceData
            );
        }
    }

    private final List<String> entities;

    @ThriftField(value=1, name="entities", requiredness=Requiredness.NONE)
    public List<String> getEntities() { return entities; }

    private final List<String> keys;

    @ThriftField(value=2, name="keys", requiredness=Requiredness.NONE)
    public List<String> getKeys() { return keys; }

    private final long startTime;

    @ThriftField(value=3, name="startTime", requiredness=Requiredness.NONE)
    public long getStartTime() { return startTime; }

    private final long endTime;

    @ThriftField(value=4, name="endTime", requiredness=Requiredness.NONE)
    public long getEndTime() { return endTime; }

    private final OdsDataTable table;

    @ThriftField(value=5, name="table", requiredness=Requiredness.NONE)
    public OdsDataTable getTable() { return table; }

    private final int window;

    @ThriftField(value=6, name="window", requiredness=Requiredness.NONE)
    public int getWindow() { return window; }

    private final OdsAggregationType aggregationType;

    @ThriftField(value=7, name="aggregationType", requiredness=Requiredness.NONE)
    public OdsAggregationType getAggregationType() { return aggregationType; }

    private final String traceData;

    @ThriftField(value=8, name="traceData", requiredness=Requiredness.NONE)
    public String getTraceData() { return traceData; }

    @Override
    public String toString()
    {
        return toStringHelper(this)
            .add("entities", entities)
            .add("keys", keys)
            .add("startTime", startTime)
            .add("endTime", endTime)
            .add("table", table)
            .add("window", window)
            .add("aggregationType", aggregationType)
            .add("traceData", traceData)
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

        GetTimeSeriesParams other = (GetTimeSeriesParams)o;

        return
            Objects.equals(entities, other.entities) &&
            Objects.equals(keys, other.keys) &&
            Objects.equals(startTime, other.startTime) &&
            Objects.equals(endTime, other.endTime) &&
            Objects.equals(table, other.table) &&
            Objects.equals(window, other.window) &&
            Objects.equals(aggregationType, other.aggregationType) &&
            Objects.equals(traceData, other.traceData);
    }

    @Override
    public int hashCode() {
        return Arrays.deepHashCode(new Object[] {
            entities,
            keys,
            startTime,
            endTime,
            table,
            window,
            aggregationType,
            traceData
        });
    }
}
