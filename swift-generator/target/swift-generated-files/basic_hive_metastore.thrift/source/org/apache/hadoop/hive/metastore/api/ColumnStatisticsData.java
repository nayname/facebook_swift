// Generated by swift-generator from hive/metastore.thrift

package org.apache.hadoop.hive.metastore.api;

import com.facebook.swift.codec.*;
import com.facebook.swift.codec.ThriftField.Requiredness;
import com.facebook.swift.codec.ThriftField.Recursiveness;
import java.util.*;

import static com.google.common.base.MoreObjects.toStringHelper;

@ThriftUnion("ColumnStatisticsData")
public final class ColumnStatisticsData
{
    private Object value;
    private short id = -1;
    private String name;

    @ThriftConstructor
    public ColumnStatisticsData() {
    }

    @ThriftConstructor
    public ColumnStatisticsData(final BooleanColumnStatsData booleanStats) {
        this.value = booleanStats;
        this.id = 1;
        this.name = "booleanStats";
    }

    @ThriftConstructor
    public ColumnStatisticsData(final LongColumnStatsData longStats) {
        this.value = longStats;
        this.id = 2;
        this.name = "longStats";
    }

    @ThriftConstructor
    public ColumnStatisticsData(final DoubleColumnStatsData doubleStats) {
        this.value = doubleStats;
        this.id = 3;
        this.name = "doubleStats";
    }

    @ThriftConstructor
    public ColumnStatisticsData(final StringColumnStatsData stringStats) {
        this.value = stringStats;
        this.id = 4;
        this.name = "stringStats";
    }

    @ThriftConstructor
    public ColumnStatisticsData(final BinaryColumnStatsData binaryStats) {
        this.value = binaryStats;
        this.id = 5;
        this.name = "binaryStats";
    }




    @ThriftField(value=1, name="booleanStats", requiredness=Requiredness.NONE)
    public BooleanColumnStatsData getBooleanStats() {
        if (this.id != 1) {
            throw new IllegalStateException("Not a booleanStats element!");
        }
        return (BooleanColumnStatsData) value;
    }

    public boolean isSetBooleanStats() {
        return this.id == 1;
    }

    @ThriftField(value=2, name="longStats", requiredness=Requiredness.NONE)
    public LongColumnStatsData getLongStats() {
        if (this.id != 2) {
            throw new IllegalStateException("Not a longStats element!");
        }
        return (LongColumnStatsData) value;
    }

    public boolean isSetLongStats() {
        return this.id == 2;
    }

    @ThriftField(value=3, name="doubleStats", requiredness=Requiredness.NONE)
    public DoubleColumnStatsData getDoubleStats() {
        if (this.id != 3) {
            throw new IllegalStateException("Not a doubleStats element!");
        }
        return (DoubleColumnStatsData) value;
    }

    public boolean isSetDoubleStats() {
        return this.id == 3;
    }

    @ThriftField(value=4, name="stringStats", requiredness=Requiredness.NONE)
    public StringColumnStatsData getStringStats() {
        if (this.id != 4) {
            throw new IllegalStateException("Not a stringStats element!");
        }
        return (StringColumnStatsData) value;
    }

    public boolean isSetStringStats() {
        return this.id == 4;
    }

    @ThriftField(value=5, name="binaryStats", requiredness=Requiredness.NONE)
    public BinaryColumnStatsData getBinaryStats() {
        if (this.id != 5) {
            throw new IllegalStateException("Not a binaryStats element!");
        }
        return (BinaryColumnStatsData) value;
    }

    public boolean isSetBinaryStats() {
        return this.id == 5;
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

        ColumnStatisticsData other = (ColumnStatisticsData)o;

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
