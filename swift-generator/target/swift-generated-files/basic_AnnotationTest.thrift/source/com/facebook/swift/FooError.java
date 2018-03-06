// Generated by swift-generator from AnnotationTest.thrift

package com.facebook.swift;

import com.facebook.swift.codec.*;
import com.facebook.swift.codec.ThriftField.Requiredness;
import com.facebook.swift.codec.ThriftField.Recursiveness;
import java.util.*;

@ThriftStruct("foo_error")
public final class FooError extends RuntimeException
{
    private static final long serialVersionUID = 1L;

    @ThriftConstructor
    public FooError(
        @ThriftField(value=1, name="error_code", requiredness=Requiredness.NONE, idlAnnotations = { @ThriftIdlAnnotation(key = "foo", value = "bar") }) final int errorCode,
        @ThriftField(value=2, name="error_msg", requiredness=Requiredness.NONE) final String errorMsg
    ) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public static class Builder {
        private int errorCode;

        public Builder setErrorCode(int errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        private String errorMsg;

        public Builder setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        public Builder() { }
        public Builder(FooError other) {
            this.errorCode = other.errorCode;
            this.errorMsg = other.errorMsg;
        }

        public FooError build() {
            return new FooError (
                this.errorCode,
                this.errorMsg
            );
        }
    }

    private final int errorCode;

    @ThriftField(value=1, name="error_code", requiredness=Requiredness.NONE, idlAnnotations = { @ThriftIdlAnnotation(key = "foo", value = "bar") })
    public int getErrorCode() { return errorCode; }

    private final String errorMsg;

    @ThriftField(value=2, name="error_msg", requiredness=Requiredness.NONE)
    public String getErrorMsg() { return errorMsg; }
}