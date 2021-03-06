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
public class DropUserReq implements TBase, java.io.Serializable, Cloneable, Comparable<DropUserReq> {
  private static final TStruct STRUCT_DESC = new TStruct("DropUserReq");
  private static final TField ACCOUNT_FIELD_DESC = new TField("account", TType.STRING, (short)1);
  private static final TField IF_EXISTS_FIELD_DESC = new TField("if_exists", TType.BOOL, (short)2);

  public byte[] account;
  public boolean if_exists;
  public static final int ACCOUNT = 1;
  public static final int IF_EXISTS = 2;
  public static boolean DEFAULT_PRETTY_PRINT = true;

  // isset id assignments
  private static final int __IF_EXISTS_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);

  public static final Map<Integer, FieldMetaData> metaDataMap;
  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(ACCOUNT, new FieldMetaData("account", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMetaDataMap.put(IF_EXISTS, new FieldMetaData("if_exists", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(DropUserReq.class, metaDataMap);
  }

  public DropUserReq() {
  }

  public DropUserReq(
    byte[] account,
    boolean if_exists)
  {
    this();
    this.account = account;
    this.if_exists = if_exists;
    setIf_existsIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DropUserReq(DropUserReq other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetAccount()) {
      this.account = TBaseHelper.deepCopy(other.account);
    }
    this.if_exists = TBaseHelper.deepCopy(other.if_exists);
  }

  public DropUserReq deepCopy() {
    return new DropUserReq(this);
  }

  @Deprecated
  public DropUserReq clone() {
    return new DropUserReq(this);
  }

  public byte[]  getAccount() {
    return this.account;
  }

  public DropUserReq setAccount(byte[] account) {
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

  public boolean  isIf_exists() {
    return this.if_exists;
  }

  public DropUserReq setIf_exists(boolean if_exists) {
    this.if_exists = if_exists;
    setIf_existsIsSet(true);
    return this;
  }

  public void unsetIf_exists() {
    __isset_bit_vector.clear(__IF_EXISTS_ISSET_ID);
  }

  // Returns true if field if_exists is set (has been assigned a value) and false otherwise
  public boolean isSetIf_exists() {
    return __isset_bit_vector.get(__IF_EXISTS_ISSET_ID);
  }

  public void setIf_existsIsSet(boolean value) {
    __isset_bit_vector.set(__IF_EXISTS_ISSET_ID, value);
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

    case IF_EXISTS:
      if (value == null) {
        unsetIf_exists();
      } else {
        setIf_exists((Boolean)value);
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

    case IF_EXISTS:
      return new Boolean(isIf_exists());

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public boolean isSet(int fieldID) {
    switch (fieldID) {
    case ACCOUNT:
      return isSetAccount();
    case IF_EXISTS:
      return isSetIf_exists();
    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof DropUserReq)
      return this.equals((DropUserReq)that);
    return false;
  }

  public boolean equals(DropUserReq that) {
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

    boolean this_present_if_exists = true;
    boolean that_present_if_exists = true;
    if (this_present_if_exists || that_present_if_exists) {
      if (!(this_present_if_exists && that_present_if_exists))
        return false;
      if (!TBaseHelper.equalsNobinary(this.if_exists, that.if_exists))
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

    boolean present_if_exists = true;
    builder.append(present_if_exists);
    if (present_if_exists)
      builder.append(if_exists);

    return builder.toHashCode();
  }

  @Override
  public int compareTo(DropUserReq other) {
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
    lastComparison = Boolean.valueOf(isSetIf_exists()).compareTo(other.isSetIf_exists());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(if_exists, other.if_exists);
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
        case IF_EXISTS:
          if (field.type == TType.BOOL) {
            this.if_exists = iprot.readBool();
            setIf_existsIsSet(true);
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
    oprot.writeFieldBegin(IF_EXISTS_FIELD_DESC);
    oprot.writeBool(this.if_exists);
    oprot.writeFieldEnd();
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
    StringBuilder sb = new StringBuilder("DropUserReq");
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
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("if_exists");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this. isIf_exists(), indent + 1, prettyPrint));
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

