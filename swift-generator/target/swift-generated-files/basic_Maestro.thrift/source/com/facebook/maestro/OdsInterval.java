// Generated by swift-generator from Maestro.thrift

package com.facebook.maestro;

import com.facebook.swift.codec.*;

public enum OdsInterval
{
    ODS_ROLLUP_INTERVAL(240);

    private final int value;

    OdsInterval(int value)
    {
        this.value = value;
    }

    @ThriftEnumValue
    public int getValue()
    {
        return value;
    }
}
