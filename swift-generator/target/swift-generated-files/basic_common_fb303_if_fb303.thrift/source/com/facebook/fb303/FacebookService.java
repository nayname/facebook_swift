// Generated by swift-generator from common/fb303/if/fb303.thrift

package com.facebook.fb303;

import com.facebook.swift.codec.*;
import com.facebook.swift.codec.ThriftField.Requiredness;
import com.facebook.swift.service.*;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.*;
import java.util.*;


@ThriftService("FacebookService")
public interface FacebookService extends Closeable
{
    @ThriftService("FacebookService")
    public interface Async extends Closeable
    {
        void close();

        @ThriftMethod(value = "getName")
        ListenableFuture<String> getName();

        @ThriftMethod(value = "getVersion")
        ListenableFuture<String> getVersion();

        @ThriftMethod(value = "getStatus")
        ListenableFuture<FbStatus> getStatus();

        @ThriftMethod(value = "getStatusDetails")
        ListenableFuture<String> getStatusDetails();

        @ThriftMethod(value = "getCounters")
        ListenableFuture<Map<String, Long>> getCounters();

        @ThriftMethod(value = "getCounter")
        ListenableFuture<Long> getCounter(
            @ThriftField(value=1, name="key", requiredness=Requiredness.NONE) final String key
        );

        @ThriftMethod(value = "setOption")
        ListenableFuture<Void> setOption(
            @ThriftField(value=1, name="key", requiredness=Requiredness.NONE) final String key,
            @ThriftField(value=2, name="value", requiredness=Requiredness.NONE) final String value
        );

        @ThriftMethod(value = "getOption")
        ListenableFuture<String> getOption(
            @ThriftField(value=1, name="key", requiredness=Requiredness.NONE) final String key
        );

        @ThriftMethod(value = "getOptions")
        ListenableFuture<Map<String, String>> getOptions();

        @ThriftMethod(value = "getCpuProfile")
        ListenableFuture<String> getCpuProfile(
            @ThriftField(value=1, name="profileDurationInSec", requiredness=Requiredness.NONE) final int profileDurationInSec
        );

        @ThriftMethod(value = "aliveSince")
        ListenableFuture<Long> aliveSince();

        @ThriftMethod(value = "reinitialize",
                      oneway = true)
        ListenableFuture<Void> reinitialize();

        @ThriftMethod(value = "shutdown",
                      oneway = true)
        ListenableFuture<Void> shutdown();
    }
    void close();


    @ThriftMethod(value = "getName")
    String getName() throws org.apache.thrift.TException;

    @ThriftMethod(value = "getVersion")
    String getVersion() throws org.apache.thrift.TException;

    @ThriftMethod(value = "getStatus")
    FbStatus getStatus() throws org.apache.thrift.TException;

    @ThriftMethod(value = "getStatusDetails")
    String getStatusDetails() throws org.apache.thrift.TException;

    @ThriftMethod(value = "getCounters")
    Map<String, Long> getCounters() throws org.apache.thrift.TException;

    @ThriftMethod(value = "getCounter")
    long getCounter(
        @ThriftField(value=1, name="key", requiredness=Requiredness.NONE) final String key
    ) throws org.apache.thrift.TException;

    @ThriftMethod(value = "setOption")
    void setOption(
        @ThriftField(value=1, name="key", requiredness=Requiredness.NONE) final String key,
        @ThriftField(value=2, name="value", requiredness=Requiredness.NONE) final String value
    ) throws org.apache.thrift.TException;

    @ThriftMethod(value = "getOption")
    String getOption(
        @ThriftField(value=1, name="key", requiredness=Requiredness.NONE) final String key
    ) throws org.apache.thrift.TException;

    @ThriftMethod(value = "getOptions")
    Map<String, String> getOptions() throws org.apache.thrift.TException;

    @ThriftMethod(value = "getCpuProfile")
    String getCpuProfile(
        @ThriftField(value=1, name="profileDurationInSec", requiredness=Requiredness.NONE) final int profileDurationInSec
    ) throws org.apache.thrift.TException;

    @ThriftMethod(value = "aliveSince")
    long aliveSince() throws org.apache.thrift.TException;

    @ThriftMethod(value = "reinitialize",
                  oneway = true)
    void reinitialize() throws org.apache.thrift.TException;

    @ThriftMethod(value = "shutdown",
                  oneway = true)
    void shutdown() throws org.apache.thrift.TException;
}