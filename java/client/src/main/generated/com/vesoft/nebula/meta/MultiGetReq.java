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
public class MultiGetReq implements TBase, java.io.Serializable, Cloneable, Comparable<MultiGetReq> {
  private static final TStruct STRUCT_DESC = new TStruct("MultiGetReq");
  private static final TField SEGMENT_FIELD_DESC = new TField("segment", TType.STRING, (short)1);
  private static final TField KEYS_FIELD_DESC = new TField("keys", TType.LIST, (short)2);

  public byte[] segment;
  public List<byte[]> keys;
  public static final int SEGMENT = 1;
  public static final int KEYS = 2;
  public static boolean DEFAULT_PRETTY_PRINT = true;

  // isset id assignments

  public static final Map<Integer, FieldMetaData> metaDataMap;
  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(SEGMENT, new FieldMetaData("segment", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMetaDataMap.put(KEYS, new FieldMetaData("keys", TFieldRequirementType.DEFAULT, 
        new ListMetaData(TType.LIST, 
            new FieldValueMetaData(TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(MultiGetReq.class, metaDataMap);
  }

  public MultiGetReq() {
  }

  public MultiGetReq(
    byte[] segment,
    List<byte[]> keys)
  {
    this();
    this.segment = segment;
    this.keys = keys;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MultiGetReq(MultiGetReq other) {
    if (other.isSetSegment()) {
      this.segment = TBaseHelper.deepCopy(other.segment);
    }
    if (other.isSetKeys()) {
      this.keys = TBaseHelper.deepCopy(other.keys);
    }
  }

  public MultiGetReq deepCopy() {
    return new MultiGetReq(this);
  }

  @Deprecated
  public MultiGetReq clone() {
    return new MultiGetReq(this);
  }

  public byte[]  getSegment() {
    return this.segment;
  }

  public MultiGetReq setSegment(byte[] segment) {
    this.segment = segment;
    return this;
  }

  public void unsetSegment() {
    this.segment = null;
  }

  // Returns true if field segment is set (has been assigned a value) and false otherwise
  public boolean isSetSegment() {
    return this.segment != null;
  }

  public void setSegmentIsSet(boolean value) {
    if (!value) {
      this.segment = null;
    }
  }

  public List<byte[]>  getKeys() {
    return this.keys;
  }

  public MultiGetReq setKeys(List<byte[]> keys) {
    this.keys = keys;
    return this;
  }

  public void unsetKeys() {
    this.keys = null;
  }

  // Returns true if field keys is set (has been assigned a value) and false otherwise
  public boolean isSetKeys() {
    return this.keys != null;
  }

  public void setKeysIsSet(boolean value) {
    if (!value) {
      this.keys = null;
    }
  }

  @SuppressWarnings("unchecked")
  public void setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
    case SEGMENT:
      if (value == null) {
        unsetSegment();
      } else {
        setSegment((byte[])value);
      }
      break;

    case KEYS:
      if (value == null) {
        unsetKeys();
      } else {
        setKeys((List<byte[]>)value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case SEGMENT:
      return getSegment();

    case KEYS:
      return getKeys();

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public boolean isSet(int fieldID) {
    switch (fieldID) {
    case SEGMENT:
      return isSetSegment();
    case KEYS:
      return isSetKeys();
    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof MultiGetReq)
      return this.equals((MultiGetReq)that);
    return false;
  }

  public boolean equals(MultiGetReq that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_segment = true && this.isSetSegment();
    boolean that_present_segment = true && that.isSetSegment();
    if (this_present_segment || that_present_segment) {
      if (!(this_present_segment && that_present_segment))
        return false;
      if (!TBaseHelper.equalsSlow(this.segment, that.segment))
        return false;
    }

    boolean this_present_keys = true && this.isSetKeys();
    boolean that_present_keys = true && that.isSetKeys();
    if (this_present_keys || that_present_keys) {
      if (!(this_present_keys && that_present_keys))
        return false;
      if (!TBaseHelper.equalsSlow(this.keys, that.keys))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_segment = true && (isSetSegment());
    builder.append(present_segment);
    if (present_segment)
      builder.append(segment);

    boolean present_keys = true && (isSetKeys());
    builder.append(present_keys);
    if (present_keys)
      builder.append(keys);

    return builder.toHashCode();
  }

  @Override
  public int compareTo(MultiGetReq other) {
    if (other == null) {
      // See java.lang.Comparable docs
      throw new NullPointerException();
    }

    if (other == this) {
      return 0;
    }
    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetSegment()).compareTo(other.isSetSegment());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(segment, other.segment);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetKeys()).compareTo(other.isSetKeys());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(keys, other.keys);
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
        case SEGMENT:
          if (field.type == TType.STRING) {
            this.segment = iprot.readBinary();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case KEYS:
          if (field.type == TType.LIST) {
            {
              TList _list95 = iprot.readListBegin();
              this.keys = new ArrayList<byte[]>(Math.max(0, _list95.size));
              for (int _i96 = 0; 
                   (_list95.size < 0) ? iprot.peekList() : (_i96 < _list95.size); 
                   ++_i96)
              {
                byte[] _elem97;
                _elem97 = iprot.readBinary();
                this.keys.add(_elem97);
              }
              iprot.readListEnd();
            }
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
    if (this.segment != null) {
      oprot.writeFieldBegin(SEGMENT_FIELD_DESC);
      oprot.writeBinary(this.segment);
      oprot.writeFieldEnd();
    }
    if (this.keys != null) {
      oprot.writeFieldBegin(KEYS_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRING, this.keys.size()));
        for (byte[] _iter98 : this.keys)        {
          oprot.writeBinary(_iter98);
        }
        oprot.writeListEnd();
      }
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
    StringBuilder sb = new StringBuilder("MultiGetReq");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("segment");
    sb.append(space);
    sb.append(":").append(space);
    if (this. getSegment() == null) {
      sb.append("null");
    } else {
        int __segment_size = Math.min(this. getSegment().length, 128);
        for (int i = 0; i < __segment_size; i++) {
          if (i != 0) sb.append(" ");
          sb.append(Integer.toHexString(this. getSegment()[i]).length() > 1 ? Integer.toHexString(this. getSegment()[i]).substring(Integer.toHexString(this. getSegment()[i]).length() - 2).toUpperCase() : "0" + Integer.toHexString(this. getSegment()[i]).toUpperCase());
        }
        if (this. getSegment().length > 128) sb.append(" ...");
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("keys");
    sb.append(space);
    sb.append(":").append(space);
    if (this. getKeys() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this. getKeys(), indent + 1, prettyPrint));
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
