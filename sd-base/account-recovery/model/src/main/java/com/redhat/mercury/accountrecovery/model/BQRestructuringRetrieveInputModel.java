/*
 * Account Recovery
 * This service domain handles the restructuring of a distressed account (loan) after standard recovery
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.redhat.mercury.accountrecovery.model;

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
 * BQRestructuringRetrieveInputModel
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-06-07T18:27:41.474305+02:00[Europe/Madrid]")
public class BQRestructuringRetrieveInputModel {
  @SerializedName("restructuringRetrieveActionTaskRecord")
  private Object restructuringRetrieveActionTaskRecord = null;

  @SerializedName("restructuringRetrieveActionRequest")
  private String restructuringRetrieveActionRequest = null;

  @SerializedName("restructuringInstanceReport")
  private Object restructuringInstanceReport = null;

  @SerializedName("restructuringInstanceAnalysis")
  private Object restructuringInstanceAnalysis = null;

  public BQRestructuringRetrieveInputModel restructuringRetrieveActionTaskRecord(Object restructuringRetrieveActionTaskRecord) {
    this.restructuringRetrieveActionTaskRecord = restructuringRetrieveActionTaskRecord;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return restructuringRetrieveActionTaskRecord
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record ")
  public Object getRestructuringRetrieveActionTaskRecord() {
    return restructuringRetrieveActionTaskRecord;
  }

  public void setRestructuringRetrieveActionTaskRecord(Object restructuringRetrieveActionTaskRecord) {
    this.restructuringRetrieveActionTaskRecord = restructuringRetrieveActionTaskRecord;
  }

  public BQRestructuringRetrieveInputModel restructuringRetrieveActionRequest(String restructuringRetrieveActionRequest) {
    this.restructuringRetrieveActionRequest = restructuringRetrieveActionRequest;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return restructuringRetrieveActionRequest
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) ")
  public String getRestructuringRetrieveActionRequest() {
    return restructuringRetrieveActionRequest;
  }

  public void setRestructuringRetrieveActionRequest(String restructuringRetrieveActionRequest) {
    this.restructuringRetrieveActionRequest = restructuringRetrieveActionRequest;
  }

  public BQRestructuringRetrieveInputModel restructuringInstanceReport(Object restructuringInstanceReport) {
    this.restructuringInstanceReport = restructuringInstanceReport;
    return this;
  }

   /**
   * Get restructuringInstanceReport
   * @return restructuringInstanceReport
  **/
  @Schema(description = "")
  public Object getRestructuringInstanceReport() {
    return restructuringInstanceReport;
  }

  public void setRestructuringInstanceReport(Object restructuringInstanceReport) {
    this.restructuringInstanceReport = restructuringInstanceReport;
  }

  public BQRestructuringRetrieveInputModel restructuringInstanceAnalysis(Object restructuringInstanceAnalysis) {
    this.restructuringInstanceAnalysis = restructuringInstanceAnalysis;
    return this;
  }

   /**
   * Get restructuringInstanceAnalysis
   * @return restructuringInstanceAnalysis
  **/
  @Schema(description = "")
  public Object getRestructuringInstanceAnalysis() {
    return restructuringInstanceAnalysis;
  }

  public void setRestructuringInstanceAnalysis(Object restructuringInstanceAnalysis) {
    this.restructuringInstanceAnalysis = restructuringInstanceAnalysis;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQRestructuringRetrieveInputModel bqRestructuringRetrieveInputModel = (BQRestructuringRetrieveInputModel) o;
    return Objects.equals(this.restructuringRetrieveActionTaskRecord, bqRestructuringRetrieveInputModel.restructuringRetrieveActionTaskRecord) &&
        Objects.equals(this.restructuringRetrieveActionRequest, bqRestructuringRetrieveInputModel.restructuringRetrieveActionRequest) &&
        Objects.equals(this.restructuringInstanceReport, bqRestructuringRetrieveInputModel.restructuringInstanceReport) &&
        Objects.equals(this.restructuringInstanceAnalysis, bqRestructuringRetrieveInputModel.restructuringInstanceAnalysis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(restructuringRetrieveActionTaskRecord, restructuringRetrieveActionRequest, restructuringInstanceReport, restructuringInstanceAnalysis);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQRestructuringRetrieveInputModel {\n");
    
    sb.append("    restructuringRetrieveActionTaskRecord: ").append(toIndentedString(restructuringRetrieveActionTaskRecord)).append("\n");
    sb.append("    restructuringRetrieveActionRequest: ").append(toIndentedString(restructuringRetrieveActionRequest)).append("\n");
    sb.append("    restructuringInstanceReport: ").append(toIndentedString(restructuringInstanceReport)).append("\n");
    sb.append("    restructuringInstanceAnalysis: ").append(toIndentedString(restructuringInstanceAnalysis)).append("\n");
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
