// Generated by swift-generator from ConstantsDemo.thrift

package com.facebook.swift;

import com.facebook.swift.codec.*;
import com.facebook.swift.codec.ThriftField.Requiredness;
import com.facebook.swift.codec.ThriftField.Recursiveness;
import java.util.*;

@ThriftStruct("Blah")
public final class Blah extends RuntimeException
{
    private static final long serialVersionUID = 1L;

    @ThriftConstructor
    public Blah(
        @ThriftField(value=1, name="bing", requiredness=Requiredness.NONE) final int bing
    ) {
        this.bing = bing;
    }

    public static class Builder {
        private int bing;

        public Builder setBing(int bing) {
            this.bing = bing;
            return this;
        }

        public Builder() { }
        public Builder(Blah other) {
            this.bing = other.bing;
        }

        public Blah build() {
            return new Blah (
                this.bing
            );
        }
    }

    private final int bing;

    @ThriftField(value=1, name="bing", requiredness=Requiredness.NONE)
    public int getBing() { return bing; }
}