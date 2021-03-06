/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.vesoft.nebula.meta;

import org.apache.commons.lang.builder.HashCodeBuilder;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.BitSet;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.facebook.thrift.*;
import com.facebook.thrift.async.*;
import com.facebook.thrift.meta_data.*;
import com.facebook.thrift.server.*;
import com.facebook.thrift.transport.*;
import com.facebook.thrift.protocol.*;

@SuppressWarnings({ "unused", "serial" })
public class GetUserRolesReq implements TBase, java.io.Serializable, Cloneable, Comparable<GetUserRolesReq> {
  private static final TStruct STRUCT_DESC = new TStruct("GetUserRolesReq");
  private static final TField ACCOUNT_FIELD_DESC = new TField("account", TType.STRING, (short)1);

  public byte[] account;
  public static final int ACCOUNT = 1;
  public static boolean DEFAULT_PRETTY_PRINT = true;

  // isset id assignments

  public static final Map<Integer, FieldMetaData> metaDataMap;
  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(ACCOUNT, new FieldMetaData("account", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(GetUserRolesReq.class, metaDataMap);
  }

  public GetUserRolesReq() {
  }

  public GetUserRolesReq(
    byte[] account)
  {
    this();
    this.account = account;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetUserRolesReq(GetUserRolesReq other) {
    if (other.isSetAccount()) {
      this.account = TBaseHelper.deepCopy(other.account);
    }
  }

  public GetUserRolesReq deepCopy() {
    return new GetUserRolesReq(this);
  }

  @Deprecated
  public GetUserRolesReq clone() {
    return new GetUserRolesReq(this);
  }

  public byte[]  getAccount() {
    return this.account;
  }

  public GetUserRolesReq setAccount(byte[] account) {
    this.account = account;
    return this;
  }

  public void unsetAccount() {
    this.account = null;
  }

  // Returns true if field account is set (has been assigned a value) and false otherwise
  public boolean isSetAccount() {
    return this.account != null;
  }

  public void setAccountIsSet(boolean value) {
    if (!value) {
      this.account = null;
    }
  }

  public void setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
    case ACCOUNT:
      if (value == null) {
        unsetAccount();
      } else {
        setAccount((byte[])value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case ACCOUNT:
      return getAccount();

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public boolean isSet(int fieldID) {
    switch (fieldID) {
    case ACCOUNT:
      return isSetAccount();
    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GetUserRolesReq)
      return this.equals((GetUserRolesReq)that);
    return false;
  }

  public boolean equals(GetUserRolesReq that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_account = true && this.isSetAccount();
    boolean that_present_account = true && that.isSetAccount();
    if (this_present_account || that_present_account) {
      if (!(this_present_account && that_present_account))
        return false;
      if (!TBaseHelper.equalsSlow(this.account, that.account))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_account = true && (isSetAccount());
    builder.append(present_account);
    if (present_account)
      builder.append(account);

    return builder.toHashCode();
  }

  @Override
  public int compareTo(GetUserRolesReq other) {
    if (other == null) {
      // See java.lang.Comparable docs
      throw new NullPointerException();
    }

    if (other == this) {
      return 0;
    }
    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetAccount()).compareTo(other.isSetAccount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(account, other.account);
    if (lastComparison != 0) {
      return lastComparison;
    }
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin(metaDataMap);
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id)
      {
        case ACCOUNT:
          if (field.type == TType.STRING) {
            this.account = iprot.readBinary();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();


    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.account != null) {
      oprot.writeFieldBegin(ACCOUNT_FIELD_DESC);
      oprot.writeBinary(this.account);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    return toString(DEFAULT_PRETTY_PRINT);
  }

  @Override
  public String toString(boolean prettyPrint) {
    return toString(1, prettyPrint);
  }

  @Override
  public String toString(int indent, boolean prettyPrint) {
    String indentStr = prettyPrint ? TBaseHelper.getIndentedString(indent) : "";
    String newLine = prettyPrint ? "\n" : "";
String space = prettyPrint ? " " : "";
    StringBuilder sb = new StringBuilder("GetUserRolesReq");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("account");
    sb.append(space);
    sb.append(":").append(space);
    if (this. getAccount() == null) {
      sb.append("null");
    } else {
        int __account_size = Math.min(this. getAccount().length, 128);
        for (int i = 0; i < __account_size; i++) {
          if (i != 0) sb.append(" ");
          sb.append(Integer.toHexString(this. getAccount()[i]).length() > 1 ? Integer.toHexString(this. getAccount()[i]).substring(Integer.toHexString(this. getAccount()[i]).length() - 2).toUpperCase() : "0" + Integer.toHexString(this. getAccount()[i]).toUpperCase());
        }
        if (this. getAccount().length > 128) sb.append(" ...");
    }
    first = false;
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

