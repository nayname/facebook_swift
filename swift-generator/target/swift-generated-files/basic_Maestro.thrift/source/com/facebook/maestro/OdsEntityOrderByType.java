// Generated by swift-generator from Maestro.thrift

package com.facebook.maestro;

import com.facebook.swift.codec.*;

public enum OdsEntityOrderByType
{
    ODS_ENTITY_BY_NAME(0), ODS_ENTITY_NONE(1);

    private final int value;

    OdsEntityOrderByType(int value)
    {
        this.value = value;
    }

    @ThriftEnumValue
    public int getValue()
    {
        return value;
    }
}