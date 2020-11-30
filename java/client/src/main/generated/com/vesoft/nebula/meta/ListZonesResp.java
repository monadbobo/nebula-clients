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
public class ListZonesResp implements TBase, java.io.Serializable, Cloneable, Comparable<ListZonesResp> {
  private static final TStruct STRUCT_DESC = new TStruct("ListZonesResp");
  private static final TField CODE_FIELD_DESC = new TField("code", TType.I32, (short)1);
  private static final TField LEADER_FIELD_DESC = new TField("leader", TType.STRUCT, (short)2);
  private static final TField ZONES_FIELD_DESC = new TField("zones", TType.LIST, (short)3);

  /**
   * 
   * @see ErrorCode
   */
  public int code;
  public com.vesoft.nebula.HostAddr leader;
  public List<Zone> zones;
  public static final int CODE = 1;
  public static final int LEADER = 2;
  public static final int ZONES = 3;
  public static boolean DEFAULT_PRETTY_PRINT = true;

  // isset id assignments
  private static final int __CODE_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);

  public static final Map<Integer, FieldMetaData> metaDataMap;
  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(CODE, new FieldMetaData("code", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    tmpMetaDataMap.put(LEADER, new FieldMetaData("leader", TFieldRequirementType.DEFAULT, 
        new StructMetaData(TType.STRUCT, com.vesoft.nebula.HostAddr.class)));
    tmpMetaDataMap.put(ZONES, new FieldMetaData("zones", TFieldRequirementType.DEFAULT, 
        new ListMetaData(TType.LIST, 
            new StructMetaData(TType.STRUCT, Zone.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(ListZonesResp.class, metaDataMap);
  }

  public ListZonesResp() {
  }

  public ListZonesResp(
    int code,
    com.vesoft.nebula.HostAddr leader,
    List<Zone> zones)
  {
    this();
    this.code = code;
    setCodeIsSet(true);
    this.leader = leader;
    this.zones = zones;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ListZonesResp(ListZonesResp other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.code = TBaseHelper.deepCopy(other.code);
    if (other.isSetLeader()) {
      this.leader = TBaseHelper.deepCopy(other.leader);
    }
    if (other.isSetZones()) {
      this.zones = TBaseHelper.deepCopy(other.zones);
    }
  }

  public ListZonesResp deepCopy() {
    return new ListZonesResp(this);
  }

  @Deprecated
  public ListZonesResp clone() {
    return new ListZonesResp(this);
  }

  /**
   * 
   * @see ErrorCode
   */
  public int  getCode() {
    return this.code;
  }

  /**
   * 
   * @see ErrorCode
   */
  public ListZonesResp setCode(int code) {
    this.code = code;
    setCodeIsSet(true);
    return this;
  }

  public void unsetCode() {
    __isset_bit_vector.clear(__CODE_ISSET_ID);
  }

  // Returns true if field code is set (has been assigned a value) and false otherwise
  public boolean isSetCode() {
    return __isset_bit_vector.get(__CODE_ISSET_ID);
  }

  public void setCodeIsSet(boolean value) {
    __isset_bit_vector.set(__CODE_ISSET_ID, value);
  }

  public com.vesoft.nebula.HostAddr  getLeader() {
    return this.leader;
  }

  public ListZonesResp setLeader(com.vesoft.nebula.HostAddr leader) {
    this.leader = leader;
    return this;
  }

  public void unsetLeader() {
    this.leader = null;
  }

  // Returns true if field leader is set (has been assigned a value) and false otherwise
  public boolean isSetLeader() {
    return this.leader != null;
  }

  public void setLeaderIsSet(boolean value) {
    if (!value) {
      this.leader = null;
    }
  }

  public List<Zone>  getZones() {
    return this.zones;
  }

  public ListZonesResp setZones(List<Zone> zones) {
    this.zones = zones;
    return this;
  }

  public void unsetZones() {
    this.zones = null;
  }

  // Returns true if field zones is set (has been assigned a value) and false otherwise
  public boolean isSetZones() {
    return this.zones != null;
  }

  public void setZonesIsSet(boolean value) {
    if (!value) {
      this.zones = null;
    }
  }

  @SuppressWarnings("unchecked")
  public void setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
    case CODE:
      if (value == null) {
        unsetCode();
      } else {
        setCode((Integer)value);
      }
      break;

    case LEADER:
      if (value == null) {
        unsetLeader();
      } else {
        setLeader((com.vesoft.nebula.HostAddr)value);
      }
      break;

    case ZONES:
      if (value == null) {
        unsetZones();
      } else {
        setZones((List<Zone>)value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case CODE:
      return getCode();

    case LEADER:
      return getLeader();

    case ZONES:
      return getZones();

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public boolean isSet(int fieldID) {
    switch (fieldID) {
    case CODE:
      return isSetCode();
    case LEADER:
      return isSetLeader();
    case ZONES:
      return isSetZones();
    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ListZonesResp)
      return this.equals((ListZonesResp)that);
    return false;
  }

  public boolean equals(ListZonesResp that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_code = true;
    boolean that_present_code = true;
    if (this_present_code || that_present_code) {
      if (!(this_present_code && that_present_code))
        return false;
      if (!TBaseHelper.equalsNobinary(this.code, that.code))
        return false;
    }

    boolean this_present_leader = true && this.isSetLeader();
    boolean that_present_leader = true && that.isSetLeader();
    if (this_present_leader || that_present_leader) {
      if (!(this_present_leader && that_present_leader))
        return false;
      if (!TBaseHelper.equalsNobinary(this.leader, that.leader))
        return false;
    }

    boolean this_present_zones = true && this.isSetZones();
    boolean that_present_zones = true && that.isSetZones();
    if (this_present_zones || that_present_zones) {
      if (!(this_present_zones && that_present_zones))
        return false;
      if (!TBaseHelper.equalsNobinary(this.zones, that.zones))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_code = true;
    builder.append(present_code);
    if (present_code)
      builder.append(code);

    boolean present_leader = true && (isSetLeader());
    builder.append(present_leader);
    if (present_leader)
      builder.append(leader);

    boolean present_zones = true && (isSetZones());
    builder.append(present_zones);
    if (present_zones)
      builder.append(zones);

    return builder.toHashCode();
  }

  @Override
  public int compareTo(ListZonesResp other) {
    if (other == null) {
      // See java.lang.Comparable docs
      throw new NullPointerException();
    }

    if (other == this) {
      return 0;
    }
    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetCode()).compareTo(other.isSetCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(code, other.code);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetLeader()).compareTo(other.isSetLeader());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(leader, other.leader);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetZones()).compareTo(other.isSetZones());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(zones, other.zones);
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
        case CODE:
          if (field.type == TType.I32) {
            this.code = iprot.readI32();
            setCodeIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case LEADER:
          if (field.type == TType.STRUCT) {
            this.leader = new com.vesoft.nebula.HostAddr();
            this.leader.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case ZONES:
          if (field.type == TType.LIST) {
            {
              TList _list181 = iprot.readListBegin();
              this.zones = new ArrayList<Zone>(Math.max(0, _list181.size));
              for (int _i182 = 0; 
                   (_list181.size < 0) ? iprot.peekList() : (_i182 < _list181.size); 
                   ++_i182)
              {
                Zone _elem183;
                _elem183 = new Zone();
                _elem183.read(iprot);
                this.zones.add(_elem183);
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
    oprot.writeFieldBegin(CODE_FIELD_DESC);
    oprot.writeI32(this.code);
    oprot.writeFieldEnd();
    if (this.leader != null) {
      oprot.writeFieldBegin(LEADER_FIELD_DESC);
      this.leader.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.zones != null) {
      oprot.writeFieldBegin(ZONES_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRUCT, this.zones.size()));
        for (Zone _iter184 : this.zones)        {
          _iter184.write(oprot);
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
    StringBuilder sb = new StringBuilder("ListZonesResp");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("code");
    sb.append(space);
    sb.append(":").append(space);
    String code_name = ErrorCode.VALUES_TO_NAMES.get(this. getCode());
    if (code_name != null) {
      sb.append(code_name);
      sb.append(" (");
    }
    sb.append(this. getCode());
    if (code_name != null) {
      sb.append(")");
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("leader");
    sb.append(space);
    sb.append(":").append(space);
    if (this. getLeader() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this. getLeader(), indent + 1, prettyPrint));
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("zones");
    sb.append(space);
    sb.append(":").append(space);
    if (this. getZones() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this. getZones(), indent + 1, prettyPrint));
    }
    first = false;
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    // check that fields of type enum have valid values
    if (isSetCode() && !ErrorCode.VALID_VALUES.contains(code)){
      throw new TProtocolException("The field 'code' has been assigned the invalid value " + code);
    }
  }

}
