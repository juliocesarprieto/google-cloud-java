// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/spanner/v1/type.proto

package com.google.spanner.v1;

/**
 * <pre>
 * `TypeCode` is used as part of [Type][google.spanner.v1.Type] to
 * indicate the type of a Cloud Spanner value.
 * Each legal value of a type can be encoded to or decoded from a JSON
 * value, using the encodings described below. All Cloud Spanner values can
 * be `null`, regardless of type; `null`s are always encoded as a JSON
 * `null`.
 * </pre>
 *
 * Protobuf enum {@code google.spanner.v1.TypeCode}
 */
public enum TypeCode
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Not specified.
   * </pre>
   *
   * <code>TYPE_CODE_UNSPECIFIED = 0;</code>
   */
  TYPE_CODE_UNSPECIFIED(0),
  /**
   * <pre>
   * Encoded as JSON `true` or `false`.
   * </pre>
   *
   * <code>BOOL = 1;</code>
   */
  BOOL(1),
  /**
   * <pre>
   * Encoded as `string`, in decimal format.
   * </pre>
   *
   * <code>INT64 = 2;</code>
   */
  INT64(2),
  /**
   * <pre>
   * Encoded as `number`, or the strings `"NaN"`, `"Infinity"`, or
   * `"-Infinity"`.
   * </pre>
   *
   * <code>FLOAT64 = 3;</code>
   */
  FLOAT64(3),
  /**
   * <pre>
   * Encoded as `string` in RFC 3339 timestamp format. The time zone
   * must be present, and must be `"Z"`.
   * If the schema has the column option
   * `allow_commit_timestamp=true`, the placeholder string
   * `"spanner.commit_timestamp()"` can be used to instruct the system
   * to insert the commit timestamp associated with the transaction
   * commit.
   * </pre>
   *
   * <code>TIMESTAMP = 4;</code>
   */
  TIMESTAMP(4),
  /**
   * <pre>
   * Encoded as `string` in RFC 3339 date format.
   * </pre>
   *
   * <code>DATE = 5;</code>
   */
  DATE(5),
  /**
   * <pre>
   * Encoded as `string`.
   * </pre>
   *
   * <code>STRING = 6;</code>
   */
  STRING(6),
  /**
   * <pre>
   * Encoded as a base64-encoded `string`, as described in RFC 4648,
   * section 4.
   * </pre>
   *
   * <code>BYTES = 7;</code>
   */
  BYTES(7),
  /**
   * <pre>
   * Encoded as `list`, where the list elements are represented
   * according to [array_element_type][google.spanner.v1.Type.array_element_type].
   * </pre>
   *
   * <code>ARRAY = 8;</code>
   */
  ARRAY(8),
  /**
   * <pre>
   * Encoded as `list`, where list element `i` is represented according
   * to [struct_type.fields[i]][google.spanner.v1.StructType.fields].
   * </pre>
   *
   * <code>STRUCT = 9;</code>
   */
  STRUCT(9),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Not specified.
   * </pre>
   *
   * <code>TYPE_CODE_UNSPECIFIED = 0;</code>
   */
  public static final int TYPE_CODE_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * Encoded as JSON `true` or `false`.
   * </pre>
   *
   * <code>BOOL = 1;</code>
   */
  public static final int BOOL_VALUE = 1;
  /**
   * <pre>
   * Encoded as `string`, in decimal format.
   * </pre>
   *
   * <code>INT64 = 2;</code>
   */
  public static final int INT64_VALUE = 2;
  /**
   * <pre>
   * Encoded as `number`, or the strings `"NaN"`, `"Infinity"`, or
   * `"-Infinity"`.
   * </pre>
   *
   * <code>FLOAT64 = 3;</code>
   */
  public static final int FLOAT64_VALUE = 3;
  /**
   * <pre>
   * Encoded as `string` in RFC 3339 timestamp format. The time zone
   * must be present, and must be `"Z"`.
   * If the schema has the column option
   * `allow_commit_timestamp=true`, the placeholder string
   * `"spanner.commit_timestamp()"` can be used to instruct the system
   * to insert the commit timestamp associated with the transaction
   * commit.
   * </pre>
   *
   * <code>TIMESTAMP = 4;</code>
   */
  public static final int TIMESTAMP_VALUE = 4;
  /**
   * <pre>
   * Encoded as `string` in RFC 3339 date format.
   * </pre>
   *
   * <code>DATE = 5;</code>
   */
  public static final int DATE_VALUE = 5;
  /**
   * <pre>
   * Encoded as `string`.
   * </pre>
   *
   * <code>STRING = 6;</code>
   */
  public static final int STRING_VALUE = 6;
  /**
   * <pre>
   * Encoded as a base64-encoded `string`, as described in RFC 4648,
   * section 4.
   * </pre>
   *
   * <code>BYTES = 7;</code>
   */
  public static final int BYTES_VALUE = 7;
  /**
   * <pre>
   * Encoded as `list`, where the list elements are represented
   * according to [array_element_type][google.spanner.v1.Type.array_element_type].
   * </pre>
   *
   * <code>ARRAY = 8;</code>
   */
  public static final int ARRAY_VALUE = 8;
  /**
   * <pre>
   * Encoded as `list`, where list element `i` is represented according
   * to [struct_type.fields[i]][google.spanner.v1.StructType.fields].
   * </pre>
   *
   * <code>STRUCT = 9;</code>
   */
  public static final int STRUCT_VALUE = 9;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static TypeCode valueOf(int value) {
    return forNumber(value);
  }

  public static TypeCode forNumber(int value) {
    switch (value) {
      case 0: return TYPE_CODE_UNSPECIFIED;
      case 1: return BOOL;
      case 2: return INT64;
      case 3: return FLOAT64;
      case 4: return TIMESTAMP;
      case 5: return DATE;
      case 6: return STRING;
      case 7: return BYTES;
      case 8: return ARRAY;
      case 9: return STRUCT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<TypeCode>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      TypeCode> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<TypeCode>() {
          public TypeCode findValueByNumber(int number) {
            return TypeCode.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.google.spanner.v1.TypeProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final TypeCode[] VALUES = values();

  public static TypeCode valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private TypeCode(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.spanner.v1.TypeCode)
}

