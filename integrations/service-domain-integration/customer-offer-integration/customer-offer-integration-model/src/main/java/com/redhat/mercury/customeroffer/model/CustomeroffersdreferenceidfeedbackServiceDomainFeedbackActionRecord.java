/*
 * Customer Offer
 * This service domain orchestrates the processing of a product offer for a new/established  customer.
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.redhat.mercury.customeroffer.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * CustomeroffersdreferenceidfeedbackServiceDomainFeedbackActionRecord
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-11-19T11:10:08.827631+01:00[Europe/Madrid]")
public class CustomeroffersdreferenceidfeedbackServiceDomainFeedbackActionRecord {
  @SerializedName("serviceDomainServicingSessionReference")
  private String serviceDomainServicingSessionReference = null;

  @SerializedName("controlRecordInstanceReference")
  private String controlRecordInstanceReference = null;

  @SerializedName("behaviorQualifierInstanceReference")
  private String behaviorQualifierInstanceReference = null;

  @SerializedName("feedbackRecordType")
  private String feedbackRecordType = null;

  @SerializedName("feedbackRecord")
  private Object feedbackRecord = null;

  public CustomeroffersdreferenceidfeedbackServiceDomainFeedbackActionRecord serviceDomainServicingSessionReference(String serviceDomainServicingSessionReference) {
    this.serviceDomainServicingSessionReference = serviceDomainServicingSessionReference;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return serviceDomainServicingSessionReference
  **/
  @Schema(example = "796678", description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session ")
  public String getServiceDomainServicingSessionReference() {
    return serviceDomainServicingSessionReference;
  }

  public void setServiceDomainServicingSessionReference(String serviceDomainServicingSessionReference) {
    this.serviceDomainServicingSessionReference = serviceDomainServicingSessionReference;
  }

  public CustomeroffersdreferenceidfeedbackServiceDomainFeedbackActionRecord controlRecordInstanceReference(String controlRecordInstanceReference) {
    this.controlRecordInstanceReference = controlRecordInstanceReference;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance if appropriate 
   * @return controlRecordInstanceReference
  **/
  @Schema(example = "724385", description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance if appropriate ")
  public String getControlRecordInstanceReference() {
    return controlRecordInstanceReference;
  }

  public void setControlRecordInstanceReference(String controlRecordInstanceReference) {
    this.controlRecordInstanceReference = controlRecordInstanceReference;
  }

  public CustomeroffersdreferenceidfeedbackServiceDomainFeedbackActionRecord behaviorQualifierInstanceReference(String behaviorQualifierInstanceReference) {
    this.behaviorQualifierInstanceReference = behaviorQualifierInstanceReference;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the behavior qualifier instance if appropriate 
   * @return behaviorQualifierInstanceReference
  **/
  @Schema(example = "789747", description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the behavior qualifier instance if appropriate ")
  public String getBehaviorQualifierInstanceReference() {
    return behaviorQualifierInstanceReference;
  }

  public void setBehaviorQualifierInstanceReference(String behaviorQualifierInstanceReference) {
    this.behaviorQualifierInstanceReference = behaviorQualifierInstanceReference;
  }

  public CustomeroffersdreferenceidfeedbackServiceDomainFeedbackActionRecord feedbackRecordType(String feedbackRecordType) {
    this.feedbackRecordType = feedbackRecordType;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The layout/type of the feedback provided 
   * @return feedbackRecordType
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The layout/type of the feedback provided ")
  public String getFeedbackRecordType() {
    return feedbackRecordType;
  }

  public void setFeedbackRecordType(String feedbackRecordType) {
    this.feedbackRecordType = feedbackRecordType;
  }

  public CustomeroffersdreferenceidfeedbackServiceDomainFeedbackActionRecord feedbackRecord(Object feedbackRecord) {
    this.feedbackRecord = feedbackRecord;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The content of the feedback in any suitable format and media 
   * @return feedbackRecord
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The content of the feedback in any suitable format and media ")
  public Object getFeedbackRecord() {
    return feedbackRecord;
  }

  public void setFeedbackRecord(Object feedbackRecord) {
    this.feedbackRecord = feedbackRecord;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomeroffersdreferenceidfeedbackServiceDomainFeedbackActionRecord customeroffersdreferenceidfeedbackServiceDomainFeedbackActionRecord = (CustomeroffersdreferenceidfeedbackServiceDomainFeedbackActionRecord) o;
    return Objects.equals(this.serviceDomainServicingSessionReference, customeroffersdreferenceidfeedbackServiceDomainFeedbackActionRecord.serviceDomainServicingSessionReference) &&
        Objects.equals(this.controlRecordInstanceReference, customeroffersdreferenceidfeedbackServiceDomainFeedbackActionRecord.controlRecordInstanceReference) &&
        Objects.equals(this.behaviorQualifierInstanceReference, customeroffersdreferenceidfeedbackServiceDomainFeedbackActionRecord.behaviorQualifierInstanceReference) &&
        Objects.equals(this.feedbackRecordType, customeroffersdreferenceidfeedbackServiceDomainFeedbackActionRecord.feedbackRecordType) &&
        Objects.equals(this.feedbackRecord, customeroffersdreferenceidfeedbackServiceDomainFeedbackActionRecord.feedbackRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceDomainServicingSessionReference, controlRecordInstanceReference, behaviorQualifierInstanceReference, feedbackRecordType, feedbackRecord);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomeroffersdreferenceidfeedbackServiceDomainFeedbackActionRecord {\n");
    
    sb.append("    serviceDomainServicingSessionReference: ").append(toIndentedString(serviceDomainServicingSessionReference)).append("\n");
    sb.append("    controlRecordInstanceReference: ").append(toIndentedString(controlRecordInstanceReference)).append("\n");
    sb.append("    behaviorQualifierInstanceReference: ").append(toIndentedString(behaviorQualifierInstanceReference)).append("\n");
    sb.append("    feedbackRecordType: ").append(toIndentedString(feedbackRecordType)).append("\n");
    sb.append("    feedbackRecord: ").append(toIndentedString(feedbackRecord)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
