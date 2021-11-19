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
import com.redhat.mercury.customeroffer.model.BQAgreementRetrieveInputModelAgreementInstanceAnalysis1;
import com.redhat.mercury.customeroffer.model.BQAgreementRetrieveInputModelAgreementInstanceReport1;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * BQAgreementRetrieveInputModel
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-11-19T11:10:08.827631+01:00[Europe/Madrid]")
public class BQAgreementRetrieveInputModel {
  @SerializedName("agreementRetrieveActionTaskRecord")
  private Object agreementRetrieveActionTaskRecord = null;

  @SerializedName("agreementRetrieveActionRequest")
  private String agreementRetrieveActionRequest = null;

  @SerializedName("agreementInstanceReport")
  private BQAgreementRetrieveInputModelAgreementInstanceReport1 agreementInstanceReport = null;

  @SerializedName("agreementInstanceAnalysis")
  private BQAgreementRetrieveInputModelAgreementInstanceAnalysis1 agreementInstanceAnalysis = null;

  public BQAgreementRetrieveInputModel agreementRetrieveActionTaskRecord(Object agreementRetrieveActionTaskRecord) {
    this.agreementRetrieveActionTaskRecord = agreementRetrieveActionTaskRecord;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return agreementRetrieveActionTaskRecord
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record ")
  public Object getAgreementRetrieveActionTaskRecord() {
    return agreementRetrieveActionTaskRecord;
  }

  public void setAgreementRetrieveActionTaskRecord(Object agreementRetrieveActionTaskRecord) {
    this.agreementRetrieveActionTaskRecord = agreementRetrieveActionTaskRecord;
  }

  public BQAgreementRetrieveInputModel agreementRetrieveActionRequest(String agreementRetrieveActionRequest) {
    this.agreementRetrieveActionRequest = agreementRetrieveActionRequest;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return agreementRetrieveActionRequest
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) ")
  public String getAgreementRetrieveActionRequest() {
    return agreementRetrieveActionRequest;
  }

  public void setAgreementRetrieveActionRequest(String agreementRetrieveActionRequest) {
    this.agreementRetrieveActionRequest = agreementRetrieveActionRequest;
  }

  public BQAgreementRetrieveInputModel agreementInstanceReport(BQAgreementRetrieveInputModelAgreementInstanceReport1 agreementInstanceReport) {
    this.agreementInstanceReport = agreementInstanceReport;
    return this;
  }

   /**
   * Get agreementInstanceReport
   * @return agreementInstanceReport
  **/
  @Schema(description = "")
  public BQAgreementRetrieveInputModelAgreementInstanceReport1 getAgreementInstanceReport() {
    return agreementInstanceReport;
  }

  public void setAgreementInstanceReport(BQAgreementRetrieveInputModelAgreementInstanceReport1 agreementInstanceReport) {
    this.agreementInstanceReport = agreementInstanceReport;
  }

  public BQAgreementRetrieveInputModel agreementInstanceAnalysis(BQAgreementRetrieveInputModelAgreementInstanceAnalysis1 agreementInstanceAnalysis) {
    this.agreementInstanceAnalysis = agreementInstanceAnalysis;
    return this;
  }

   /**
   * Get agreementInstanceAnalysis
   * @return agreementInstanceAnalysis
  **/
  @Schema(description = "")
  public BQAgreementRetrieveInputModelAgreementInstanceAnalysis1 getAgreementInstanceAnalysis() {
    return agreementInstanceAnalysis;
  }

  public void setAgreementInstanceAnalysis(BQAgreementRetrieveInputModelAgreementInstanceAnalysis1 agreementInstanceAnalysis) {
    this.agreementInstanceAnalysis = agreementInstanceAnalysis;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQAgreementRetrieveInputModel bqAgreementRetrieveInputModel = (BQAgreementRetrieveInputModel) o;
    return Objects.equals(this.agreementRetrieveActionTaskRecord, bqAgreementRetrieveInputModel.agreementRetrieveActionTaskRecord) &&
        Objects.equals(this.agreementRetrieveActionRequest, bqAgreementRetrieveInputModel.agreementRetrieveActionRequest) &&
        Objects.equals(this.agreementInstanceReport, bqAgreementRetrieveInputModel.agreementInstanceReport) &&
        Objects.equals(this.agreementInstanceAnalysis, bqAgreementRetrieveInputModel.agreementInstanceAnalysis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agreementRetrieveActionTaskRecord, agreementRetrieveActionRequest, agreementInstanceReport, agreementInstanceAnalysis);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQAgreementRetrieveInputModel {\n");
    
    sb.append("    agreementRetrieveActionTaskRecord: ").append(toIndentedString(agreementRetrieveActionTaskRecord)).append("\n");
    sb.append("    agreementRetrieveActionRequest: ").append(toIndentedString(agreementRetrieveActionRequest)).append("\n");
    sb.append("    agreementInstanceReport: ").append(toIndentedString(agreementInstanceReport)).append("\n");
    sb.append("    agreementInstanceAnalysis: ").append(toIndentedString(agreementInstanceAnalysis)).append("\n");
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
