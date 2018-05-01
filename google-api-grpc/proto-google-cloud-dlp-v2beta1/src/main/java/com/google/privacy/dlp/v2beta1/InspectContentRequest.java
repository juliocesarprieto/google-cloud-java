// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2beta1/dlp.proto

package com.google.privacy.dlp.v2beta1;

/**
 * <pre>
 * Request to search for potentially sensitive info in a list of items.
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2beta1.InspectContentRequest}
 */
public  final class InspectContentRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2beta1.InspectContentRequest)
    InspectContentRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InspectContentRequest.newBuilder() to construct.
  private InspectContentRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InspectContentRequest() {
    items_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private InspectContentRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            com.google.privacy.dlp.v2beta1.InspectConfig.Builder subBuilder = null;
            if (inspectConfig_ != null) {
              subBuilder = inspectConfig_.toBuilder();
            }
            inspectConfig_ = input.readMessage(com.google.privacy.dlp.v2beta1.InspectConfig.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(inspectConfig_);
              inspectConfig_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              items_ = new java.util.ArrayList<com.google.privacy.dlp.v2beta1.ContentItem>();
              mutable_bitField0_ |= 0x00000002;
            }
            items_.add(
                input.readMessage(com.google.privacy.dlp.v2beta1.ContentItem.parser(), extensionRegistry));
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        items_ = java.util.Collections.unmodifiableList(items_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.privacy.dlp.v2beta1.DlpProto.internal_static_google_privacy_dlp_v2beta1_InspectContentRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2beta1.DlpProto.internal_static_google_privacy_dlp_v2beta1_InspectContentRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2beta1.InspectContentRequest.class, com.google.privacy.dlp.v2beta1.InspectContentRequest.Builder.class);
  }

  private int bitField0_;
  public static final int INSPECT_CONFIG_FIELD_NUMBER = 1;
  private com.google.privacy.dlp.v2beta1.InspectConfig inspectConfig_;
  /**
   * <pre>
   * Configuration for the inspector.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta1.InspectConfig inspect_config = 1;</code>
   */
  public boolean hasInspectConfig() {
    return inspectConfig_ != null;
  }
  /**
   * <pre>
   * Configuration for the inspector.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta1.InspectConfig inspect_config = 1;</code>
   */
  public com.google.privacy.dlp.v2beta1.InspectConfig getInspectConfig() {
    return inspectConfig_ == null ? com.google.privacy.dlp.v2beta1.InspectConfig.getDefaultInstance() : inspectConfig_;
  }
  /**
   * <pre>
   * Configuration for the inspector.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta1.InspectConfig inspect_config = 1;</code>
   */
  public com.google.privacy.dlp.v2beta1.InspectConfigOrBuilder getInspectConfigOrBuilder() {
    return getInspectConfig();
  }

  public static final int ITEMS_FIELD_NUMBER = 2;
  private java.util.List<com.google.privacy.dlp.v2beta1.ContentItem> items_;
  /**
   * <pre>
   * The list of items to inspect. Items in a single request are
   * considered "related" unless inspect_config.independent_inputs is true.
   * Up to 100 are allowed per request.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2beta1.ContentItem items = 2;</code>
   */
  public java.util.List<com.google.privacy.dlp.v2beta1.ContentItem> getItemsList() {
    return items_;
  }
  /**
   * <pre>
   * The list of items to inspect. Items in a single request are
   * considered "related" unless inspect_config.independent_inputs is true.
   * Up to 100 are allowed per request.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2beta1.ContentItem items = 2;</code>
   */
  public java.util.List<? extends com.google.privacy.dlp.v2beta1.ContentItemOrBuilder> 
      getItemsOrBuilderList() {
    return items_;
  }
  /**
   * <pre>
   * The list of items to inspect. Items in a single request are
   * considered "related" unless inspect_config.independent_inputs is true.
   * Up to 100 are allowed per request.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2beta1.ContentItem items = 2;</code>
   */
  public int getItemsCount() {
    return items_.size();
  }
  /**
   * <pre>
   * The list of items to inspect. Items in a single request are
   * considered "related" unless inspect_config.independent_inputs is true.
   * Up to 100 are allowed per request.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2beta1.ContentItem items = 2;</code>
   */
  public com.google.privacy.dlp.v2beta1.ContentItem getItems(int index) {
    return items_.get(index);
  }
  /**
   * <pre>
   * The list of items to inspect. Items in a single request are
   * considered "related" unless inspect_config.independent_inputs is true.
   * Up to 100 are allowed per request.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2beta1.ContentItem items = 2;</code>
   */
  public com.google.privacy.dlp.v2beta1.ContentItemOrBuilder getItemsOrBuilder(
      int index) {
    return items_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (inspectConfig_ != null) {
      output.writeMessage(1, getInspectConfig());
    }
    for (int i = 0; i < items_.size(); i++) {
      output.writeMessage(2, items_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (inspectConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getInspectConfig());
    }
    for (int i = 0; i < items_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, items_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.privacy.dlp.v2beta1.InspectContentRequest)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2beta1.InspectContentRequest other = (com.google.privacy.dlp.v2beta1.InspectContentRequest) obj;

    boolean result = true;
    result = result && (hasInspectConfig() == other.hasInspectConfig());
    if (hasInspectConfig()) {
      result = result && getInspectConfig()
          .equals(other.getInspectConfig());
    }
    result = result && getItemsList()
        .equals(other.getItemsList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasInspectConfig()) {
      hash = (37 * hash) + INSPECT_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getInspectConfig().hashCode();
    }
    if (getItemsCount() > 0) {
      hash = (37 * hash) + ITEMS_FIELD_NUMBER;
      hash = (53 * hash) + getItemsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2beta1.InspectContentRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2beta1.InspectContentRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta1.InspectContentRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2beta1.InspectContentRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta1.InspectContentRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2beta1.InspectContentRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta1.InspectContentRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2beta1.InspectContentRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta1.InspectContentRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2beta1.InspectContentRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta1.InspectContentRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2beta1.InspectContentRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.privacy.dlp.v2beta1.InspectContentRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Request to search for potentially sensitive info in a list of items.
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2beta1.InspectContentRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2beta1.InspectContentRequest)
      com.google.privacy.dlp.v2beta1.InspectContentRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.privacy.dlp.v2beta1.DlpProto.internal_static_google_privacy_dlp_v2beta1_InspectContentRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2beta1.DlpProto.internal_static_google_privacy_dlp_v2beta1_InspectContentRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2beta1.InspectContentRequest.class, com.google.privacy.dlp.v2beta1.InspectContentRequest.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2beta1.InspectContentRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getItemsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (inspectConfigBuilder_ == null) {
        inspectConfig_ = null;
      } else {
        inspectConfig_ = null;
        inspectConfigBuilder_ = null;
      }
      if (itemsBuilder_ == null) {
        items_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        itemsBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.privacy.dlp.v2beta1.DlpProto.internal_static_google_privacy_dlp_v2beta1_InspectContentRequest_descriptor;
    }

    public com.google.privacy.dlp.v2beta1.InspectContentRequest getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2beta1.InspectContentRequest.getDefaultInstance();
    }

    public com.google.privacy.dlp.v2beta1.InspectContentRequest build() {
      com.google.privacy.dlp.v2beta1.InspectContentRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.privacy.dlp.v2beta1.InspectContentRequest buildPartial() {
      com.google.privacy.dlp.v2beta1.InspectContentRequest result = new com.google.privacy.dlp.v2beta1.InspectContentRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (inspectConfigBuilder_ == null) {
        result.inspectConfig_ = inspectConfig_;
      } else {
        result.inspectConfig_ = inspectConfigBuilder_.build();
      }
      if (itemsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          items_ = java.util.Collections.unmodifiableList(items_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.items_ = items_;
      } else {
        result.items_ = itemsBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.privacy.dlp.v2beta1.InspectContentRequest) {
        return mergeFrom((com.google.privacy.dlp.v2beta1.InspectContentRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2beta1.InspectContentRequest other) {
      if (other == com.google.privacy.dlp.v2beta1.InspectContentRequest.getDefaultInstance()) return this;
      if (other.hasInspectConfig()) {
        mergeInspectConfig(other.getInspectConfig());
      }
      if (itemsBuilder_ == null) {
        if (!other.items_.isEmpty()) {
          if (items_.isEmpty()) {
            items_ = other.items_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureItemsIsMutable();
            items_.addAll(other.items_);
          }
          onChanged();
        }
      } else {
        if (!other.items_.isEmpty()) {
          if (itemsBuilder_.isEmpty()) {
            itemsBuilder_.dispose();
            itemsBuilder_ = null;
            items_ = other.items_;
            bitField0_ = (bitField0_ & ~0x00000002);
            itemsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getItemsFieldBuilder() : null;
          } else {
            itemsBuilder_.addAllMessages(other.items_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.privacy.dlp.v2beta1.InspectContentRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.privacy.dlp.v2beta1.InspectContentRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.privacy.dlp.v2beta1.InspectConfig inspectConfig_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.privacy.dlp.v2beta1.InspectConfig, com.google.privacy.dlp.v2beta1.InspectConfig.Builder, com.google.privacy.dlp.v2beta1.InspectConfigOrBuilder> inspectConfigBuilder_;
    /**
     * <pre>
     * Configuration for the inspector.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta1.InspectConfig inspect_config = 1;</code>
     */
    public boolean hasInspectConfig() {
      return inspectConfigBuilder_ != null || inspectConfig_ != null;
    }
    /**
     * <pre>
     * Configuration for the inspector.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta1.InspectConfig inspect_config = 1;</code>
     */
    public com.google.privacy.dlp.v2beta1.InspectConfig getInspectConfig() {
      if (inspectConfigBuilder_ == null) {
        return inspectConfig_ == null ? com.google.privacy.dlp.v2beta1.InspectConfig.getDefaultInstance() : inspectConfig_;
      } else {
        return inspectConfigBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Configuration for the inspector.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta1.InspectConfig inspect_config = 1;</code>
     */
    public Builder setInspectConfig(com.google.privacy.dlp.v2beta1.InspectConfig value) {
      if (inspectConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        inspectConfig_ = value;
        onChanged();
      } else {
        inspectConfigBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Configuration for the inspector.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta1.InspectConfig inspect_config = 1;</code>
     */
    public Builder setInspectConfig(
        com.google.privacy.dlp.v2beta1.InspectConfig.Builder builderForValue) {
      if (inspectConfigBuilder_ == null) {
        inspectConfig_ = builderForValue.build();
        onChanged();
      } else {
        inspectConfigBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Configuration for the inspector.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta1.InspectConfig inspect_config = 1;</code>
     */
    public Builder mergeInspectConfig(com.google.privacy.dlp.v2beta1.InspectConfig value) {
      if (inspectConfigBuilder_ == null) {
        if (inspectConfig_ != null) {
          inspectConfig_ =
            com.google.privacy.dlp.v2beta1.InspectConfig.newBuilder(inspectConfig_).mergeFrom(value).buildPartial();
        } else {
          inspectConfig_ = value;
        }
        onChanged();
      } else {
        inspectConfigBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Configuration for the inspector.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta1.InspectConfig inspect_config = 1;</code>
     */
    public Builder clearInspectConfig() {
      if (inspectConfigBuilder_ == null) {
        inspectConfig_ = null;
        onChanged();
      } else {
        inspectConfig_ = null;
        inspectConfigBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Configuration for the inspector.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta1.InspectConfig inspect_config = 1;</code>
     */
    public com.google.privacy.dlp.v2beta1.InspectConfig.Builder getInspectConfigBuilder() {
      
      onChanged();
      return getInspectConfigFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Configuration for the inspector.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta1.InspectConfig inspect_config = 1;</code>
     */
    public com.google.privacy.dlp.v2beta1.InspectConfigOrBuilder getInspectConfigOrBuilder() {
      if (inspectConfigBuilder_ != null) {
        return inspectConfigBuilder_.getMessageOrBuilder();
      } else {
        return inspectConfig_ == null ?
            com.google.privacy.dlp.v2beta1.InspectConfig.getDefaultInstance() : inspectConfig_;
      }
    }
    /**
     * <pre>
     * Configuration for the inspector.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta1.InspectConfig inspect_config = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.privacy.dlp.v2beta1.InspectConfig, com.google.privacy.dlp.v2beta1.InspectConfig.Builder, com.google.privacy.dlp.v2beta1.InspectConfigOrBuilder> 
        getInspectConfigFieldBuilder() {
      if (inspectConfigBuilder_ == null) {
        inspectConfigBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2beta1.InspectConfig, com.google.privacy.dlp.v2beta1.InspectConfig.Builder, com.google.privacy.dlp.v2beta1.InspectConfigOrBuilder>(
                getInspectConfig(),
                getParentForChildren(),
                isClean());
        inspectConfig_ = null;
      }
      return inspectConfigBuilder_;
    }

    private java.util.List<com.google.privacy.dlp.v2beta1.ContentItem> items_ =
      java.util.Collections.emptyList();
    private void ensureItemsIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        items_ = new java.util.ArrayList<com.google.privacy.dlp.v2beta1.ContentItem>(items_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.privacy.dlp.v2beta1.ContentItem, com.google.privacy.dlp.v2beta1.ContentItem.Builder, com.google.privacy.dlp.v2beta1.ContentItemOrBuilder> itemsBuilder_;

    /**
     * <pre>
     * The list of items to inspect. Items in a single request are
     * considered "related" unless inspect_config.independent_inputs is true.
     * Up to 100 are allowed per request.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta1.ContentItem items = 2;</code>
     */
    public java.util.List<com.google.privacy.dlp.v2beta1.ContentItem> getItemsList() {
      if (itemsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(items_);
      } else {
        return itemsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The list of items to inspect. Items in a single request are
     * considered "related" unless inspect_config.independent_inputs is true.
     * Up to 100 are allowed per request.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta1.ContentItem items = 2;</code>
     */
    public int getItemsCount() {
      if (itemsBuilder_ == null) {
        return items_.size();
      } else {
        return itemsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The list of items to inspect. Items in a single request are
     * considered "related" unless inspect_config.independent_inputs is true.
     * Up to 100 are allowed per request.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta1.ContentItem items = 2;</code>
     */
    public com.google.privacy.dlp.v2beta1.ContentItem getItems(int index) {
      if (itemsBuilder_ == null) {
        return items_.get(index);
      } else {
        return itemsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The list of items to inspect. Items in a single request are
     * considered "related" unless inspect_config.independent_inputs is true.
     * Up to 100 are allowed per request.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta1.ContentItem items = 2;</code>
     */
    public Builder setItems(
        int index, com.google.privacy.dlp.v2beta1.ContentItem value) {
      if (itemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureItemsIsMutable();
        items_.set(index, value);
        onChanged();
      } else {
        itemsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of items to inspect. Items in a single request are
     * considered "related" unless inspect_config.independent_inputs is true.
     * Up to 100 are allowed per request.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta1.ContentItem items = 2;</code>
     */
    public Builder setItems(
        int index, com.google.privacy.dlp.v2beta1.ContentItem.Builder builderForValue) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        items_.set(index, builderForValue.build());
        onChanged();
      } else {
        itemsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of items to inspect. Items in a single request are
     * considered "related" unless inspect_config.independent_inputs is true.
     * Up to 100 are allowed per request.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta1.ContentItem items = 2;</code>
     */
    public Builder addItems(com.google.privacy.dlp.v2beta1.ContentItem value) {
      if (itemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureItemsIsMutable();
        items_.add(value);
        onChanged();
      } else {
        itemsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of items to inspect. Items in a single request are
     * considered "related" unless inspect_config.independent_inputs is true.
     * Up to 100 are allowed per request.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta1.ContentItem items = 2;</code>
     */
    public Builder addItems(
        int index, com.google.privacy.dlp.v2beta1.ContentItem value) {
      if (itemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureItemsIsMutable();
        items_.add(index, value);
        onChanged();
      } else {
        itemsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of items to inspect. Items in a single request are
     * considered "related" unless inspect_config.independent_inputs is true.
     * Up to 100 are allowed per request.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta1.ContentItem items = 2;</code>
     */
    public Builder addItems(
        com.google.privacy.dlp.v2beta1.ContentItem.Builder builderForValue) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        items_.add(builderForValue.build());
        onChanged();
      } else {
        itemsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of items to inspect. Items in a single request are
     * considered "related" unless inspect_config.independent_inputs is true.
     * Up to 100 are allowed per request.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta1.ContentItem items = 2;</code>
     */
    public Builder addItems(
        int index, com.google.privacy.dlp.v2beta1.ContentItem.Builder builderForValue) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        items_.add(index, builderForValue.build());
        onChanged();
      } else {
        itemsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of items to inspect. Items in a single request are
     * considered "related" unless inspect_config.independent_inputs is true.
     * Up to 100 are allowed per request.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta1.ContentItem items = 2;</code>
     */
    public Builder addAllItems(
        java.lang.Iterable<? extends com.google.privacy.dlp.v2beta1.ContentItem> values) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, items_);
        onChanged();
      } else {
        itemsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The list of items to inspect. Items in a single request are
     * considered "related" unless inspect_config.independent_inputs is true.
     * Up to 100 are allowed per request.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta1.ContentItem items = 2;</code>
     */
    public Builder clearItems() {
      if (itemsBuilder_ == null) {
        items_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        itemsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The list of items to inspect. Items in a single request are
     * considered "related" unless inspect_config.independent_inputs is true.
     * Up to 100 are allowed per request.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta1.ContentItem items = 2;</code>
     */
    public Builder removeItems(int index) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        items_.remove(index);
        onChanged();
      } else {
        itemsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The list of items to inspect. Items in a single request are
     * considered "related" unless inspect_config.independent_inputs is true.
     * Up to 100 are allowed per request.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta1.ContentItem items = 2;</code>
     */
    public com.google.privacy.dlp.v2beta1.ContentItem.Builder getItemsBuilder(
        int index) {
      return getItemsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The list of items to inspect. Items in a single request are
     * considered "related" unless inspect_config.independent_inputs is true.
     * Up to 100 are allowed per request.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta1.ContentItem items = 2;</code>
     */
    public com.google.privacy.dlp.v2beta1.ContentItemOrBuilder getItemsOrBuilder(
        int index) {
      if (itemsBuilder_ == null) {
        return items_.get(index);  } else {
        return itemsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The list of items to inspect. Items in a single request are
     * considered "related" unless inspect_config.independent_inputs is true.
     * Up to 100 are allowed per request.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta1.ContentItem items = 2;</code>
     */
    public java.util.List<? extends com.google.privacy.dlp.v2beta1.ContentItemOrBuilder> 
         getItemsOrBuilderList() {
      if (itemsBuilder_ != null) {
        return itemsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(items_);
      }
    }
    /**
     * <pre>
     * The list of items to inspect. Items in a single request are
     * considered "related" unless inspect_config.independent_inputs is true.
     * Up to 100 are allowed per request.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta1.ContentItem items = 2;</code>
     */
    public com.google.privacy.dlp.v2beta1.ContentItem.Builder addItemsBuilder() {
      return getItemsFieldBuilder().addBuilder(
          com.google.privacy.dlp.v2beta1.ContentItem.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of items to inspect. Items in a single request are
     * considered "related" unless inspect_config.independent_inputs is true.
     * Up to 100 are allowed per request.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta1.ContentItem items = 2;</code>
     */
    public com.google.privacy.dlp.v2beta1.ContentItem.Builder addItemsBuilder(
        int index) {
      return getItemsFieldBuilder().addBuilder(
          index, com.google.privacy.dlp.v2beta1.ContentItem.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of items to inspect. Items in a single request are
     * considered "related" unless inspect_config.independent_inputs is true.
     * Up to 100 are allowed per request.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta1.ContentItem items = 2;</code>
     */
    public java.util.List<com.google.privacy.dlp.v2beta1.ContentItem.Builder> 
         getItemsBuilderList() {
      return getItemsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.privacy.dlp.v2beta1.ContentItem, com.google.privacy.dlp.v2beta1.ContentItem.Builder, com.google.privacy.dlp.v2beta1.ContentItemOrBuilder> 
        getItemsFieldBuilder() {
      if (itemsBuilder_ == null) {
        itemsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.privacy.dlp.v2beta1.ContentItem, com.google.privacy.dlp.v2beta1.ContentItem.Builder, com.google.privacy.dlp.v2beta1.ContentItemOrBuilder>(
                items_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        items_ = null;
      }
      return itemsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2beta1.InspectContentRequest)
  }

  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2beta1.InspectContentRequest)
  private static final com.google.privacy.dlp.v2beta1.InspectContentRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2beta1.InspectContentRequest();
  }

  public static com.google.privacy.dlp.v2beta1.InspectContentRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InspectContentRequest>
      PARSER = new com.google.protobuf.AbstractParser<InspectContentRequest>() {
    public InspectContentRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new InspectContentRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<InspectContentRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InspectContentRequest> getParserForType() {
    return PARSER;
  }

  public com.google.privacy.dlp.v2beta1.InspectContentRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
