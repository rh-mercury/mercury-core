// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: customer-offer-model.proto

package org.bian.protobuf.customeroffer;

/**
 * Protobuf type {@code org.bian.protobuf.customeroffer.UnderwritingInstanceRecord}
 */
public final class UnderwritingInstanceRecord extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:org.bian.protobuf.customeroffer.UnderwritingInstanceRecord)
    UnderwritingInstanceRecordOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UnderwritingInstanceRecord.newBuilder() to construct.
  private UnderwritingInstanceRecord(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UnderwritingInstanceRecord() {
    customerIncomeStatement_ = "";
    customerDebtStatement_ = "";
    customerAssetStatement_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UnderwritingInstanceRecord();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UnderwritingInstanceRecord(
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

            customerIncomeStatement_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            customerDebtStatement_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            customerAssetStatement_ = s;
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
    return org.bian.protobuf.customeroffer.CustomerOfferModel.internal_static_org_bian_protobuf_customeroffer_UnderwritingInstanceRecord_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.bian.protobuf.customeroffer.CustomerOfferModel.internal_static_org_bian_protobuf_customeroffer_UnderwritingInstanceRecord_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.bian.protobuf.customeroffer.UnderwritingInstanceRecord.class, org.bian.protobuf.customeroffer.UnderwritingInstanceRecord.Builder.class);
  }

  public static final int CUSTOMERINCOMESTATEMENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object customerIncomeStatement_;
  /**
   * <code>string customerIncomeStatement = 1;</code>
   * @return The customerIncomeStatement.
   */
  @java.lang.Override
  public java.lang.String getCustomerIncomeStatement() {
    java.lang.Object ref = customerIncomeStatement_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      customerIncomeStatement_ = s;
      return s;
    }
  }
  /**
   * <code>string customerIncomeStatement = 1;</code>
   * @return The bytes for customerIncomeStatement.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCustomerIncomeStatementBytes() {
    java.lang.Object ref = customerIncomeStatement_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      customerIncomeStatement_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CUSTOMERDEBTSTATEMENT_FIELD_NUMBER = 2;
  private volatile java.lang.Object customerDebtStatement_;
  /**
   * <code>string customerDebtStatement = 2;</code>
   * @return The customerDebtStatement.
   */
  @java.lang.Override
  public java.lang.String getCustomerDebtStatement() {
    java.lang.Object ref = customerDebtStatement_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      customerDebtStatement_ = s;
      return s;
    }
  }
  /**
   * <code>string customerDebtStatement = 2;</code>
   * @return The bytes for customerDebtStatement.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCustomerDebtStatementBytes() {
    java.lang.Object ref = customerDebtStatement_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      customerDebtStatement_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CUSTOMERASSETSTATEMENT_FIELD_NUMBER = 3;
  private volatile java.lang.Object customerAssetStatement_;
  /**
   * <code>string customerAssetStatement = 3;</code>
   * @return The customerAssetStatement.
   */
  @java.lang.Override
  public java.lang.String getCustomerAssetStatement() {
    java.lang.Object ref = customerAssetStatement_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      customerAssetStatement_ = s;
      return s;
    }
  }
  /**
   * <code>string customerAssetStatement = 3;</code>
   * @return The bytes for customerAssetStatement.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCustomerAssetStatementBytes() {
    java.lang.Object ref = customerAssetStatement_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      customerAssetStatement_ = b;
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
    if (!getCustomerIncomeStatementBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, customerIncomeStatement_);
    }
    if (!getCustomerDebtStatementBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, customerDebtStatement_);
    }
    if (!getCustomerAssetStatementBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, customerAssetStatement_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getCustomerIncomeStatementBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, customerIncomeStatement_);
    }
    if (!getCustomerDebtStatementBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, customerDebtStatement_);
    }
    if (!getCustomerAssetStatementBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, customerAssetStatement_);
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
    if (!(obj instanceof org.bian.protobuf.customeroffer.UnderwritingInstanceRecord)) {
      return super.equals(obj);
    }
    org.bian.protobuf.customeroffer.UnderwritingInstanceRecord other = (org.bian.protobuf.customeroffer.UnderwritingInstanceRecord) obj;

    if (!getCustomerIncomeStatement()
        .equals(other.getCustomerIncomeStatement())) return false;
    if (!getCustomerDebtStatement()
        .equals(other.getCustomerDebtStatement())) return false;
    if (!getCustomerAssetStatement()
        .equals(other.getCustomerAssetStatement())) return false;
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
    hash = (37 * hash) + CUSTOMERINCOMESTATEMENT_FIELD_NUMBER;
    hash = (53 * hash) + getCustomerIncomeStatement().hashCode();
    hash = (37 * hash) + CUSTOMERDEBTSTATEMENT_FIELD_NUMBER;
    hash = (53 * hash) + getCustomerDebtStatement().hashCode();
    hash = (37 * hash) + CUSTOMERASSETSTATEMENT_FIELD_NUMBER;
    hash = (53 * hash) + getCustomerAssetStatement().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.bian.protobuf.customeroffer.UnderwritingInstanceRecord parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.bian.protobuf.customeroffer.UnderwritingInstanceRecord parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.bian.protobuf.customeroffer.UnderwritingInstanceRecord parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.bian.protobuf.customeroffer.UnderwritingInstanceRecord parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.bian.protobuf.customeroffer.UnderwritingInstanceRecord parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.bian.protobuf.customeroffer.UnderwritingInstanceRecord parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.bian.protobuf.customeroffer.UnderwritingInstanceRecord parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.bian.protobuf.customeroffer.UnderwritingInstanceRecord parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.bian.protobuf.customeroffer.UnderwritingInstanceRecord parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.bian.protobuf.customeroffer.UnderwritingInstanceRecord parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.bian.protobuf.customeroffer.UnderwritingInstanceRecord parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.bian.protobuf.customeroffer.UnderwritingInstanceRecord parseFrom(
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
  public static Builder newBuilder(org.bian.protobuf.customeroffer.UnderwritingInstanceRecord prototype) {
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
   * Protobuf type {@code org.bian.protobuf.customeroffer.UnderwritingInstanceRecord}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.bian.protobuf.customeroffer.UnderwritingInstanceRecord)
      org.bian.protobuf.customeroffer.UnderwritingInstanceRecordOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.bian.protobuf.customeroffer.CustomerOfferModel.internal_static_org_bian_protobuf_customeroffer_UnderwritingInstanceRecord_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.bian.protobuf.customeroffer.CustomerOfferModel.internal_static_org_bian_protobuf_customeroffer_UnderwritingInstanceRecord_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.bian.protobuf.customeroffer.UnderwritingInstanceRecord.class, org.bian.protobuf.customeroffer.UnderwritingInstanceRecord.Builder.class);
    }

    // Construct using org.bian.protobuf.customeroffer.UnderwritingInstanceRecord.newBuilder()
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
      customerIncomeStatement_ = "";

      customerDebtStatement_ = "";

      customerAssetStatement_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.bian.protobuf.customeroffer.CustomerOfferModel.internal_static_org_bian_protobuf_customeroffer_UnderwritingInstanceRecord_descriptor;
    }

    @java.lang.Override
    public org.bian.protobuf.customeroffer.UnderwritingInstanceRecord getDefaultInstanceForType() {
      return org.bian.protobuf.customeroffer.UnderwritingInstanceRecord.getDefaultInstance();
    }

    @java.lang.Override
    public org.bian.protobuf.customeroffer.UnderwritingInstanceRecord build() {
      org.bian.protobuf.customeroffer.UnderwritingInstanceRecord result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.bian.protobuf.customeroffer.UnderwritingInstanceRecord buildPartial() {
      org.bian.protobuf.customeroffer.UnderwritingInstanceRecord result = new org.bian.protobuf.customeroffer.UnderwritingInstanceRecord(this);
      result.customerIncomeStatement_ = customerIncomeStatement_;
      result.customerDebtStatement_ = customerDebtStatement_;
      result.customerAssetStatement_ = customerAssetStatement_;
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
      if (other instanceof org.bian.protobuf.customeroffer.UnderwritingInstanceRecord) {
        return mergeFrom((org.bian.protobuf.customeroffer.UnderwritingInstanceRecord)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.bian.protobuf.customeroffer.UnderwritingInstanceRecord other) {
      if (other == org.bian.protobuf.customeroffer.UnderwritingInstanceRecord.getDefaultInstance()) return this;
      if (!other.getCustomerIncomeStatement().isEmpty()) {
        customerIncomeStatement_ = other.customerIncomeStatement_;
        onChanged();
      }
      if (!other.getCustomerDebtStatement().isEmpty()) {
        customerDebtStatement_ = other.customerDebtStatement_;
        onChanged();
      }
      if (!other.getCustomerAssetStatement().isEmpty()) {
        customerAssetStatement_ = other.customerAssetStatement_;
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
      org.bian.protobuf.customeroffer.UnderwritingInstanceRecord parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.bian.protobuf.customeroffer.UnderwritingInstanceRecord) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object customerIncomeStatement_ = "";
    /**
     * <code>string customerIncomeStatement = 1;</code>
     * @return The customerIncomeStatement.
     */
    public java.lang.String getCustomerIncomeStatement() {
      java.lang.Object ref = customerIncomeStatement_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        customerIncomeStatement_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string customerIncomeStatement = 1;</code>
     * @return The bytes for customerIncomeStatement.
     */
    public com.google.protobuf.ByteString
        getCustomerIncomeStatementBytes() {
      java.lang.Object ref = customerIncomeStatement_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        customerIncomeStatement_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string customerIncomeStatement = 1;</code>
     * @param value The customerIncomeStatement to set.
     * @return This builder for chaining.
     */
    public Builder setCustomerIncomeStatement(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      customerIncomeStatement_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string customerIncomeStatement = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCustomerIncomeStatement() {
      
      customerIncomeStatement_ = getDefaultInstance().getCustomerIncomeStatement();
      onChanged();
      return this;
    }
    /**
     * <code>string customerIncomeStatement = 1;</code>
     * @param value The bytes for customerIncomeStatement to set.
     * @return This builder for chaining.
     */
    public Builder setCustomerIncomeStatementBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      customerIncomeStatement_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object customerDebtStatement_ = "";
    /**
     * <code>string customerDebtStatement = 2;</code>
     * @return The customerDebtStatement.
     */
    public java.lang.String getCustomerDebtStatement() {
      java.lang.Object ref = customerDebtStatement_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        customerDebtStatement_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string customerDebtStatement = 2;</code>
     * @return The bytes for customerDebtStatement.
     */
    public com.google.protobuf.ByteString
        getCustomerDebtStatementBytes() {
      java.lang.Object ref = customerDebtStatement_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        customerDebtStatement_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string customerDebtStatement = 2;</code>
     * @param value The customerDebtStatement to set.
     * @return This builder for chaining.
     */
    public Builder setCustomerDebtStatement(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      customerDebtStatement_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string customerDebtStatement = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCustomerDebtStatement() {
      
      customerDebtStatement_ = getDefaultInstance().getCustomerDebtStatement();
      onChanged();
      return this;
    }
    /**
     * <code>string customerDebtStatement = 2;</code>
     * @param value The bytes for customerDebtStatement to set.
     * @return This builder for chaining.
     */
    public Builder setCustomerDebtStatementBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      customerDebtStatement_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object customerAssetStatement_ = "";
    /**
     * <code>string customerAssetStatement = 3;</code>
     * @return The customerAssetStatement.
     */
    public java.lang.String getCustomerAssetStatement() {
      java.lang.Object ref = customerAssetStatement_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        customerAssetStatement_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string customerAssetStatement = 3;</code>
     * @return The bytes for customerAssetStatement.
     */
    public com.google.protobuf.ByteString
        getCustomerAssetStatementBytes() {
      java.lang.Object ref = customerAssetStatement_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        customerAssetStatement_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string customerAssetStatement = 3;</code>
     * @param value The customerAssetStatement to set.
     * @return This builder for chaining.
     */
    public Builder setCustomerAssetStatement(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      customerAssetStatement_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string customerAssetStatement = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearCustomerAssetStatement() {
      
      customerAssetStatement_ = getDefaultInstance().getCustomerAssetStatement();
      onChanged();
      return this;
    }
    /**
     * <code>string customerAssetStatement = 3;</code>
     * @param value The bytes for customerAssetStatement to set.
     * @return This builder for chaining.
     */
    public Builder setCustomerAssetStatementBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      customerAssetStatement_ = value;
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


    // @@protoc_insertion_point(builder_scope:org.bian.protobuf.customeroffer.UnderwritingInstanceRecord)
  }

  // @@protoc_insertion_point(class_scope:org.bian.protobuf.customeroffer.UnderwritingInstanceRecord)
  private static final org.bian.protobuf.customeroffer.UnderwritingInstanceRecord DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.bian.protobuf.customeroffer.UnderwritingInstanceRecord();
  }

  public static org.bian.protobuf.customeroffer.UnderwritingInstanceRecord getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UnderwritingInstanceRecord>
      PARSER = new com.google.protobuf.AbstractParser<UnderwritingInstanceRecord>() {
    @java.lang.Override
    public UnderwritingInstanceRecord parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UnderwritingInstanceRecord(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UnderwritingInstanceRecord> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UnderwritingInstanceRecord> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.bian.protobuf.customeroffer.UnderwritingInstanceRecord getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

