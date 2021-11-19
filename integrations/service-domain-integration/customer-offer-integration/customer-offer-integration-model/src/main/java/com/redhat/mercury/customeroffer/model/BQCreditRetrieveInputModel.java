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
import com.redhat.mercury.customeroffer.model.BQCreditRetrieveInputModelCreditInstanceAnalysis1;
import com.redhat.mercury.customeroffer.model.BQCreditRetrieveInputModelCreditInstanceReport1;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * BQCreditRetrieveInputModel
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-11-19T11:10:08.827631+01:00[Europe/Madrid]")
public class BQCreditRetrieveInputModel {
  @SerializedName("creditRetrieveActionTaskRecord")
  private Object creditRetrieveActionTaskRecord = null;

  @SerializedName("creditRetrieveActionRequest")
  private String creditRetrieveActionRequest = null;

  @SerializedName("creditInstanceReport")
  private BQCreditRetrieveInputModelCreditInstanceReport1 creditInstanceReport = null;

  @SerializedName("creditInstanceAnalysis")
  private BQCreditRetrieveInputModelCreditInstanceAnalysis1 creditInstanceAnalysis = null;

  public BQCreditRetrieveInputModel creditRetrieveActionTaskRecord(Object creditRetrieveActionTaskRecord) {
    this.creditRetrieveActionTaskRecord = creditRetrieveActionTaskRecord;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return creditRetrieveActionTaskRecord
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record ")
  public Object getCreditRetrieveActionTaskRecord() {
    return creditRetrieveActionTaskRecord;
  }

  public void setCreditRetrieveActionTaskRecord(Object creditRetrieveActionTaskRecord) {
    this.creditRetrieveActionTaskRecord = creditRetrieveActionTaskRecord;
  }

  public BQCreditRetrieveInputModel creditRetrieveActionRequest(String creditRetrieveActionRequest) {
    this.creditRetrieveActionRequest = creditRetrieveActionRequest;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return creditRetrieveActionRequest
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) ")
  public String getCreditRetrieveActionRequest() {
    return creditRetrieveActionRequest;
  }

  public void setCreditRetrieveActionRequest(String creditRetrieveActionRequest) {
    this.creditRetrieveActionRequest = creditRetrieveActionRequest;
  }

  public BQCreditRetrieveInputModel creditInstanceReport(BQCreditRetrieveInputModelCreditInstanceReport1 creditInstanceReport) {
    this.creditInstanceReport = creditInstanceReport;
    return this;
  }

   /**
   * Get creditInstanceReport
   * @return creditInstanceReport
  **/
  @Schema(description = "")
  public BQCreditRetrieveInputModelCreditInstanceReport1 getCreditInstanceReport() {
    return creditInstanceReport;
  }

  public void setCreditInstanceReport(BQCreditRetrieveInputModelCreditInstanceReport1 creditInstanceReport) {
    this.creditInstanceReport = creditInstanceReport;
  }

  public BQCreditRetrieveInputModel creditInstanceAnalysis(BQCreditRetrieveInputModelCreditInstanceAnalysis1 creditInstanceAnalysis) {
    this.creditInstanceAnalysis = creditInstanceAnalysis;
    return this;
  }

   /**
   * Get creditInstanceAnalysis
   * @return creditInstanceAnalysis
  **/
  @Schema(description = "")
  public BQCreditRetrieveInputModelCreditInstanceAnalysis1 getCreditInstanceAnalysis() {
    return creditInstanceAnalysis;
  }

  public void setCreditInstanceAnalysis(BQCreditRetrieveInputModelCreditInstanceAnalysis1 creditInstanceAnalysis) {
    this.creditInstanceAnalysis = creditInstanceAnalysis;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQCreditRetrieveInputModel bqCreditRetrieveInputModel = (BQCreditRetrieveInputModel) o;
    return Objects.equals(this.creditRetrieveActionTaskRecord, bqCreditRetrieveInputModel.creditRetrieveActionTaskRecord) &&
        Objects.equals(this.creditRetrieveActionRequest, bqCreditRetrieveInputModel.creditRetrieveActionRequest) &&
        Objects.equals(this.creditInstanceReport, bqCreditRetrieveInputModel.creditInstanceReport) &&
        Objects.equals(this.creditInstanceAnalysis, bqCreditRetrieveInputModel.creditInstanceAnalysis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditRetrieveActionTaskRecord, creditRetrieveActionRequest, creditInstanceReport, creditInstanceAnalysis);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQCreditRetrieveInputModel {\n");
    
    sb.append("    creditRetrieveActionTaskRecord: ").append(toIndentedString(creditRetrieveActionTaskRecord)).append("\n");
    sb.append("    creditRetrieveActionRequest: ").append(toIndentedString(creditRetrieveActionRequest)).append("\n");
    sb.append("    creditInstanceReport: ").append(toIndentedString(creditInstanceReport)).append("\n");
    sb.append("    creditInstanceAnalysis: ").append(toIndentedString(creditInstanceAnalysis)).append("\n");
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
