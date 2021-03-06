// Generated by swift-generator from hive/metastore.thrift

package org.apache.hadoop.hive.metastore.api;

import com.facebook.swift.codec.*;
import com.facebook.swift.codec.ThriftField.Requiredness;
import com.facebook.swift.codec.ThriftField.Recursiveness;
import java.util.*;

import static com.google.common.base.MoreObjects.toStringHelper;

@ThriftStruct("PrivilegeGrantInfo")
public final class PrivilegeGrantInfo
{
    @ThriftConstructor
    public PrivilegeGrantInfo(
        @ThriftField(value=1, name="privilege", requiredness=Requiredness.NONE) final String privilege,
        @ThriftField(value=2, name="createTime", requiredness=Requiredness.NONE) final int createTime,
        @ThriftField(value=3, name="grantor", requiredness=Requiredness.NONE) final String grantor,
        @ThriftField(value=4, name="grantorType", requiredness=Requiredness.NONE) final PrincipalType grantorType,
        @ThriftField(value=5, name="grantOption", requiredness=Requiredness.NONE) final boolean grantOption
    ) {
        this.privilege = privilege;
        this.createTime = createTime;
        this.grantor = grantor;
        this.grantorType = grantorType;
        this.grantOption = grantOption;
    }

    public static class Builder {
        private String privilege;

        public Builder setPrivilege(String privilege) {
            this.privilege = privilege;
            return this;
        }
        private int createTime;

        public Builder setCreateTime(int createTime) {
            this.createTime = createTime;
            return this;
        }
        private String grantor;

        public Builder setGrantor(String grantor) {
            this.grantor = grantor;
            return this;
        }
        private PrincipalType grantorType;

        public Builder setGrantorType(PrincipalType grantorType) {
            this.grantorType = grantorType;
            return this;
        }
        private boolean grantOption;

        public Builder setGrantOption(boolean grantOption) {
            this.grantOption = grantOption;
            return this;
        }

        public Builder() { }
        public Builder(PrivilegeGrantInfo other) {
            this.privilege = other.privilege;
            this.createTime = other.createTime;
            this.grantor = other.grantor;
            this.grantorType = other.grantorType;
            this.grantOption = other.grantOption;
        }

        public PrivilegeGrantInfo build() {
            return new PrivilegeGrantInfo (
                this.privilege,
                this.createTime,
                this.grantor,
                this.grantorType,
                this.grantOption
            );
        }
    }

    private final String privilege;

    @ThriftField(value=1, name="privilege", requiredness=Requiredness.NONE)
    public String getPrivilege() { return privilege; }

    private final int createTime;

    @ThriftField(value=2, name="createTime", requiredness=Requiredness.NONE)
    public int getCreateTime() { return createTime; }

    private final String grantor;

    @ThriftField(value=3, name="grantor", requiredness=Requiredness.NONE)
    public String getGrantor() { return grantor; }

    private final PrincipalType grantorType;

    @ThriftField(value=4, name="grantorType", requiredness=Requiredness.NONE)
    public PrincipalType getGrantorType() { return grantorType; }

    private final boolean grantOption;

    @ThriftField(value=5, name="grantOption", requiredness=Requiredness.NONE)
    public boolean isGrantOption() { return grantOption; }

    @Override
    public String toString()
    {
        return toStringHelper(this)
            .add("privilege", privilege)
            .add("createTime", createTime)
            .add("grantor", grantor)
            .add("grantorType", grantorType)
            .add("grantOption", grantOption)
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

        PrivilegeGrantInfo other = (PrivilegeGrantInfo)o;

        return
            Objects.equals(privilege, other.privilege) &&
            Objects.equals(createTime, other.createTime) &&
            Objects.equals(grantor, other.grantor) &&
            Objects.equals(grantorType, other.grantorType) &&
            Objects.equals(grantOption, other.grantOption);
    }

    @Override
    public int hashCode() {
        return Arrays.deepHashCode(new Object[] {
            privilege,
            createTime,
            grantor,
            grantorType,
            grantOption
        });
    }
}
