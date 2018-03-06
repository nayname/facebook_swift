// Generated by swift-generator from hive/metastore.thrift

package org.apache.hadoop.hive.metastore.api;

import com.facebook.swift.codec.*;
import com.facebook.swift.codec.ThriftField.Requiredness;
import com.facebook.swift.codec.ThriftField.Recursiveness;
import java.util.*;

@ThriftStruct("UnknownTableException")
public final class UnknownTableException extends RuntimeException
{
    private static final long serialVersionUID = 1L;

    @ThriftConstructor
    public UnknownTableException(
        @ThriftField(value=1, name="message", requiredness=Requiredness.NONE) final String message
    ) {
        this.message = message;
    }

    public static class Builder {
        private String message;

        public Builder setMessage(String message) {
            this.message = message;
            return this;
        }

        public Builder() { }
        public Builder(UnknownTableException other) {
            this.message = other.message;
        }

        public UnknownTableException build() {
            return new UnknownTableException (
                this.message
            );
        }
    }

    private final String message;

    @ThriftField(value=1, name="message", requiredness=Requiredness.NONE)
    public String getMessage() { return message; }
}