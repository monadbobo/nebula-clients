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
public class Zone implements TBase, java.io.Serializable, Cloneable, Comparable<Zone> {
  private static final TStruct STRUCT_DESC = new TStruct("Zone");
  private static final TField ZONE_NAME_FIELD_DESC = new TField("zone_name", TType.STRING, (short)1);
  private static final TField NODES_FIELD_DESC = new TField("nodes", TType.LIST, (short)2);

  public byte[] zone_name;
  public List<com.vesoft.nebula.HostAddr> nodes;
  public static final int ZONE_NAME = 1;
  public static final int NODES = 2;
  public static boolean DEFAULT_PRETTY_PRINT = true;

  // isset id assignments

  public static final Map<Integer, FieldMetaData> metaDataMap;
  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(ZONE_NAME, new FieldMetaData("zone_name", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMetaDataMap.put(NODES, new FieldMetaData("nodes", TFieldRequirementType.DEFAULT, 
        new ListMetaData(TType.LIST, 
            new StructMetaData(TType.STRUCT, com.vesoft.nebula.HostAddr.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(Zone.class, metaDataMap);
  }

  public Zone() {
  }

  public Zone(
    byte[] zone_name,
    List<com.vesoft.nebula.HostAddr> nodes)
  {
    this();
    this.zone_name = zone_name;
    this.nodes = nodes;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Zone(Zone other) {
    if (other.isSetZone_name()) {
      this.zone_name = TBaseHelper.deepCopy(other.zone_name);
    }
    if (other.isSetNodes()) {
      this.nodes = TBaseHelper.deepCopy(other.nodes);
    }
  }

  public Zone deepCopy() {
    return new Zone(this);
  }

  @Deprecated
  public Zone clone() {
    return new Zone(this);
  }

  public byte[]  getZone_name() {
    return this.zone_name;
  }

  public Zone setZone_name(byte[] zone_name) {
    this.zone_name = zone_name;
    return this;
  }

  public void unsetZone_name() {
    this.zone_name = null;
  }

  // Returns true if field zone_name is set (has been assigned a value) and false otherwise
  public boolean isSetZone_name() {
    return this.zone_name != null;
  }

  public void setZone_nameIsSet(boolean value) {
    if (!value) {
      this.zone_name = null;
    }
  }

  public List<com.vesoft.nebula.HostAddr>  getNodes() {
    return this.nodes;
  }

  public Zone setNodes(List<com.vesoft.nebula.HostAddr> nodes) {
    this.nodes = nodes;
    return this;
  }

  public void unsetNodes() {
    this.nodes = null;
  }

  // Returns true if field nodes is set (has been assigned a value) and false otherwise
  public boolean isSetNodes() {
    return this.nodes != null;
  }

  public void setNodesIsSet(boolean value) {
    if (!value) {
      this.nodes = null;
    }
  }

  @SuppressWarnings("unchecked")
  public void setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
    case ZONE_NAME:
      if (value == null) {
        unsetZone_name();
      } else {
        setZone_name((byte[])value);
      }
      break;

    case NODES:
      if (value == null) {
        unsetNodes();
      } else {
        setNodes((List<com.vesoft.nebula.HostAddr>)value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case ZONE_NAME:
      return getZone_name();

    case NODES:
      return getNodes();

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public boolean isSet(int fieldID) {
    switch (fieldID) {
    case ZONE_NAME:
      return isSetZone_name();
    case NODES:
      return isSetNodes();
    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Zone)
      return this.equals((Zone)that);
    return false;
  }

  public boolean equals(Zone that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_zone_name = true && this.isSetZone_name();
    boolean that_present_zone_name = true && that.isSetZone_name();
    if (this_present_zone_name || that_present_zone_name) {
      if (!(this_present_zone_name && that_present_zone_name))
        return false;
      if (!TBaseHelper.equalsSlow(this.zone_name, that.zone_name))
        return false;
    }

    boolean this_present_nodes = true && this.isSetNodes();
    boolean that_present_nodes = true && that.isSetNodes();
    if (this_present_nodes || that_present_nodes) {
      if (!(this_present_nodes && that_present_nodes))
        return false;
      if (!TBaseHelper.equalsNobinary(this.nodes, that.nodes))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_zone_name = true && (isSetZone_name());
    builder.append(present_zone_name);
    if (present_zone_name)
      builder.append(zone_name);

    boolean present_nodes = true && (isSetNodes());
    builder.append(present_nodes);
    if (present_nodes)
      builder.append(nodes);

    return builder.toHashCode();
  }

  @Override
  public int compareTo(Zone other) {
    if (other == null) {
      // See java.lang.Comparable docs
      throw new NullPointerException();
    }

    if (other == this) {
      return 0;
    }
    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetZone_name()).compareTo(other.isSetZone_name());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(zone_name, other.zone_name);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetNodes()).compareTo(other.isSetNodes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(nodes, other.nodes);
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
        case ZONE_NAME:
          if (field.type == TType.STRING) {
            this.zone_name = iprot.readBinary();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case NODES:
          if (field.type == TType.LIST) {
            {
              TList _list169 = iprot.readListBegin();
              this.nodes = new ArrayList<com.vesoft.nebula.HostAddr>(Math.max(0, _list169.size));
              for (int _i170 = 0; 
                   (_list169.size < 0) ? iprot.peekList() : (_i170 < _list169.size); 
                   ++_i170)
              {
                com.vesoft.nebula.HostAddr _elem171;
                _elem171 = new com.vesoft.nebula.HostAddr();
                _elem171.read(iprot);
                this.nodes.add(_elem171);
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
    if (this.zone_name != null) {
      oprot.writeFieldBegin(ZONE_NAME_FIELD_DESC);
      oprot.writeBinary(this.zone_name);
      oprot.writeFieldEnd();
    }
    if (this.nodes != null) {
      oprot.writeFieldBegin(NODES_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRUCT, this.nodes.size()));
        for (com.vesoft.nebula.HostAddr _iter172 : this.nodes)        {
          _iter172.write(oprot);
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
    StringBuilder sb = new StringBuilder("Zone");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("zone_name");
    sb.append(space);
    sb.append(":").append(space);
    if (this. getZone_name() == null) {
      sb.append("null");
    } else {
        int __zone_name_size = Math.min(this. getZone_name().length, 128);
        for (int i = 0; i < __zone_name_size; i++) {
          if (i != 0) sb.append(" ");
          sb.append(Integer.toHexString(this. getZone_name()[i]).length() > 1 ? Integer.toHexString(this. getZone_name()[i]).substring(Integer.toHexString(this. getZone_name()[i]).length() - 2).toUpperCase() : "0" + Integer.toHexString(this. getZone_name()[i]).toUpperCase());
        }
        if (this. getZone_name().length > 128) sb.append(" ...");
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("nodes");
    sb.append(space);
    sb.append(":").append(space);
    if (this. getNodes() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this. getNodes(), indent + 1, prettyPrint));
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

