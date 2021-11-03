// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: party-routing-profile-model.proto

package org.bian.protobuf.partyroutingprofile;

/**
 * Protobuf type {@code org.bian.protobuf.partyroutingprofile.PartyRoutingState}
 */
public final class PartyRoutingState extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:org.bian.protobuf.partyroutingprofile.PartyRoutingState)
    PartyRoutingStateOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PartyRoutingState.newBuilder() to construct.
  private PartyRoutingState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PartyRoutingState() {
    customerOfferStatus_ = "";
    processId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PartyRoutingState();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PartyRoutingState(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            customerOfferStatus_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            processId_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.bian.protobuf.partyroutingprofile.PartyRoutingProfileModel.internal_static_org_bian_protobuf_partyroutingprofile_PartyRoutingState_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.bian.protobuf.partyroutingprofile.PartyRoutingProfileModel.internal_static_org_bian_protobuf_partyroutingprofile_PartyRoutingState_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.bian.protobuf.partyroutingprofile.PartyRoutingState.class, org.bian.protobuf.partyroutingprofile.PartyRoutingState.Builder.class);
  }

  public static final int CUSTOMEROFFERSTATUS_FIELD_NUMBER = 1;
  private volatile java.lang.Object customerOfferStatus_;
  /**
   * <code>string customerOfferStatus = 1;</code>
   * @return The customerOfferStatus.
   */
  @java.lang.Override
  public java.lang.String getCustomerOfferStatus() {
    java.lang.Object ref = customerOfferStatus_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      customerOfferStatus_ = s;
      return s;
    }
  }
  /**
   * <code>string customerOfferStatus = 1;</code>
   * @return The bytes for customerOfferStatus.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCustomerOfferStatusBytes() {
    java.lang.Object ref = customerOfferStatus_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      customerOfferStatus_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PROCESSID_FIELD_NUMBER = 2;
  private volatile java.lang.Object processId_;
  /**
   * <code>string processId = 2;</code>
   * @return The processId.
   */
  @java.lang.Override
  public java.lang.String getProcessId() {
    java.lang.Object ref = processId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      processId_ = s;
      return s;
    }
  }
  /**
   * <code>string processId = 2;</code>
   * @return The bytes for processId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getProcessIdBytes() {
    java.lang.Object ref = processId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      processId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getCustomerOfferStatusBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, customerOfferStatus_);
    }
    if (!getProcessIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, processId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getCustomerOfferStatusBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, customerOfferStatus_);
    }
    if (!getProcessIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, processId_);
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
    if (!(obj instanceof org.bian.protobuf.partyroutingprofile.PartyRoutingState)) {
      return super.equals(obj);
    }
    org.bian.protobuf.partyroutingprofile.PartyRoutingState other = (org.bian.protobuf.partyroutingprofile.PartyRoutingState) obj;

    if (!getCustomerOfferStatus()
        .equals(other.getCustomerOfferStatus())) return false;
    if (!getProcessId()
        .equals(other.getProcessId())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + CUSTOMEROFFERSTATUS_FIELD_NUMBER;
    hash = (53 * hash) + getCustomerOfferStatus().hashCode();
    hash = (37 * hash) + PROCESSID_FIELD_NUMBER;
    hash = (53 * hash) + getProcessId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.bian.protobuf.partyroutingprofile.PartyRoutingState parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.bian.protobuf.partyroutingprofile.PartyRoutingState parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.bian.protobuf.partyroutingprofile.PartyRoutingState parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.bian.protobuf.partyroutingprofile.PartyRoutingState parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.bian.protobuf.partyroutingprofile.PartyRoutingState parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.bian.protobuf.partyroutingprofile.PartyRoutingState parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.bian.protobuf.partyroutingprofile.PartyRoutingState parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.bian.protobuf.partyroutingprofile.PartyRoutingState parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.bian.protobuf.partyroutingprofile.PartyRoutingState parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.bian.protobuf.partyroutingprofile.PartyRoutingState parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.bian.protobuf.partyroutingprofile.PartyRoutingState parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.bian.protobuf.partyroutingprofile.PartyRoutingState parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.bian.protobuf.partyroutingprofile.PartyRoutingState prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Protobuf type {@code org.bian.protobuf.partyroutingprofile.PartyRoutingState}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.bian.protobuf.partyroutingprofile.PartyRoutingState)
      org.bian.protobuf.partyroutingprofile.PartyRoutingStateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.bian.protobuf.partyroutingprofile.PartyRoutingProfileModel.internal_static_org_bian_protobuf_partyroutingprofile_PartyRoutingState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.bian.protobuf.partyroutingprofile.PartyRoutingProfileModel.internal_static_org_bian_protobuf_partyroutingprofile_PartyRoutingState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.bian.protobuf.partyroutingprofile.PartyRoutingState.class, org.bian.protobuf.partyroutingprofile.PartyRoutingState.Builder.class);
    }

    // Construct using org.bian.protobuf.partyroutingprofile.PartyRoutingState.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      customerOfferStatus_ = "";

      processId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.bian.protobuf.partyroutingprofile.PartyRoutingProfileModel.internal_static_org_bian_protobuf_partyroutingprofile_PartyRoutingState_descriptor;
    }

    @java.lang.Override
    public org.bian.protobuf.partyroutingprofile.PartyRoutingState getDefaultInstanceForType() {
      return org.bian.protobuf.partyroutingprofile.PartyRoutingState.getDefaultInstance();
    }

    @java.lang.Override
    public org.bian.protobuf.partyroutingprofile.PartyRoutingState build() {
      org.bian.protobuf.partyroutingprofile.PartyRoutingState result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.bian.protobuf.partyroutingprofile.PartyRoutingState buildPartial() {
      org.bian.protobuf.partyroutingprofile.PartyRoutingState result = new org.bian.protobuf.partyroutingprofile.PartyRoutingState(this);
      result.customerOfferStatus_ = customerOfferStatus_;
      result.processId_ = processId_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.bian.protobuf.partyroutingprofile.PartyRoutingState) {
        return mergeFrom((org.bian.protobuf.partyroutingprofile.PartyRoutingState)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.bian.protobuf.partyroutingprofile.PartyRoutingState other) {
      if (other == org.bian.protobuf.partyroutingprofile.PartyRoutingState.getDefaultInstance()) return this;
      if (!other.getCustomerOfferStatus().isEmpty()) {
        customerOfferStatus_ = other.customerOfferStatus_;
        onChanged();
      }
      if (!other.getProcessId().isEmpty()) {
        processId_ = other.processId_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.bian.protobuf.partyroutingprofile.PartyRoutingState parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.bian.protobuf.partyroutingprofile.PartyRoutingState) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object customerOfferStatus_ = "";
    /**
     * <code>string customerOfferStatus = 1;</code>
     * @return The customerOfferStatus.
     */
    public java.lang.String getCustomerOfferStatus() {
      java.lang.Object ref = customerOfferStatus_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        customerOfferStatus_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string customerOfferStatus = 1;</code>
     * @return The bytes for customerOfferStatus.
     */
    public com.google.protobuf.ByteString
        getCustomerOfferStatusBytes() {
      java.lang.Object ref = customerOfferStatus_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        customerOfferStatus_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string customerOfferStatus = 1;</code>
     * @param value The customerOfferStatus to set.
     * @return This builder for chaining.
     */
    public Builder setCustomerOfferStatus(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      customerOfferStatus_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string customerOfferStatus = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCustomerOfferStatus() {
      
      customerOfferStatus_ = getDefaultInstance().getCustomerOfferStatus();
      onChanged();
      return this;
    }
    /**
     * <code>string customerOfferStatus = 1;</code>
     * @param value The bytes for customerOfferStatus to set.
     * @return This builder for chaining.
     */
    public Builder setCustomerOfferStatusBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      customerOfferStatus_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object processId_ = "";
    /**
     * <code>string processId = 2;</code>
     * @return The processId.
     */
    public java.lang.String getProcessId() {
      java.lang.Object ref = processId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        processId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string processId = 2;</code>
     * @return The bytes for processId.
     */
    public com.google.protobuf.ByteString
        getProcessIdBytes() {
      java.lang.Object ref = processId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        processId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string processId = 2;</code>
     * @param value The processId to set.
     * @return This builder for chaining.
     */
    public Builder setProcessId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      processId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string processId = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearProcessId() {
      
      processId_ = getDefaultInstance().getProcessId();
      onChanged();
      return this;
    }
    /**
     * <code>string processId = 2;</code>
     * @param value The bytes for processId to set.
     * @return This builder for chaining.
     */
    public Builder setProcessIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      processId_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:org.bian.protobuf.partyroutingprofile.PartyRoutingState)
  }

  // @@protoc_insertion_point(class_scope:org.bian.protobuf.partyroutingprofile.PartyRoutingState)
  private static final org.bian.protobuf.partyroutingprofile.PartyRoutingState DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.bian.protobuf.partyroutingprofile.PartyRoutingState();
  }

  public static org.bian.protobuf.partyroutingprofile.PartyRoutingState getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PartyRoutingState>
      PARSER = new com.google.protobuf.AbstractParser<PartyRoutingState>() {
    @java.lang.Override
    public PartyRoutingState parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PartyRoutingState(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PartyRoutingState> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PartyRoutingState> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.bian.protobuf.partyroutingprofile.PartyRoutingState getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

