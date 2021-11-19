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
 * BQComplianceRetrieveOutputModelComplianceInstanceAnalysis
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-11-19T11:10:08.827631+01:00[Europe/Madrid]")
public class BQComplianceRetrieveOutputModelComplianceInstanceAnalysis {
  @SerializedName("complianceInstanceAnalysisRecord")
  private Object complianceInstanceAnalysisRecord = null;

  @SerializedName("complianceInstanceAnalysisReportType")
  private String complianceInstanceAnalysisReportType = null;

  @SerializedName("complianceInstanceAnalysisParameters")
  private String complianceInstanceAnalysisParameters = null;

  @SerializedName("complianceInstanceAnalysisReport")
  private Object complianceInstanceAnalysisReport = null;

  public BQComplianceRetrieveOutputModelComplianceInstanceAnalysis complianceInstanceAnalysisRecord(Object complianceInstanceAnalysisRecord) {
    this.complianceInstanceAnalysisRecord = complianceInstanceAnalysisRecord;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return complianceInstanceAnalysisRecord
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected ")
  public Object getComplianceInstanceAnalysisRecord() {
    return complianceInstanceAnalysisRecord;
  }

  public void setComplianceInstanceAnalysisRecord(Object complianceInstanceAnalysisRecord) {
    this.complianceInstanceAnalysisRecord = complianceInstanceAnalysisRecord;
  }

  public BQComplianceRetrieveOutputModelComplianceInstanceAnalysis complianceInstanceAnalysisReportType(String complianceInstanceAnalysisReportType) {
    this.complianceInstanceAnalysisReportType = complianceInstanceAnalysisReportType;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return complianceInstanceAnalysisReportType
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available ")
  public String getComplianceInstanceAnalysisReportType() {
    return complianceInstanceAnalysisReportType;
  }

  public void setComplianceInstanceAnalysisReportType(String complianceInstanceAnalysisReportType) {
    this.complianceInstanceAnalysisReportType = complianceInstanceAnalysisReportType;
  }

  public BQComplianceRetrieveOutputModelComplianceInstanceAnalysis complianceInstanceAnalysisParameters(String complianceInstanceAnalysisParameters) {
    this.complianceInstanceAnalysisParameters = complianceInstanceAnalysisParameters;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return complianceInstanceAnalysisParameters
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) ")
  public String getComplianceInstanceAnalysisParameters() {
    return complianceInstanceAnalysisParameters;
  }

  public void setComplianceInstanceAnalysisParameters(String complianceInstanceAnalysisParameters) {
    this.complianceInstanceAnalysisParameters = complianceInstanceAnalysisParameters;
  }

  public BQComplianceRetrieveOutputModelComplianceInstanceAnalysis complianceInstanceAnalysisReport(Object complianceInstanceAnalysisReport) {
    this.complianceInstanceAnalysisReport = complianceInstanceAnalysisReport;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return complianceInstanceAnalysisReport
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate ")
  public Object getComplianceInstanceAnalysisReport() {
    return complianceInstanceAnalysisReport;
  }

  public void setComplianceInstanceAnalysisReport(Object complianceInstanceAnalysisReport) {
    this.complianceInstanceAnalysisReport = complianceInstanceAnalysisReport;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQComplianceRetrieveOutputModelComplianceInstanceAnalysis bqComplianceRetrieveOutputModelComplianceInstanceAnalysis = (BQComplianceRetrieveOutputModelComplianceInstanceAnalysis) o;
    return Objects.equals(this.complianceInstanceAnalysisRecord, bqComplianceRetrieveOutputModelComplianceInstanceAnalysis.complianceInstanceAnalysisRecord) &&
        Objects.equals(this.complianceInstanceAnalysisReportType, bqComplianceRetrieveOutputModelComplianceInstanceAnalysis.complianceInstanceAnalysisReportType) &&
        Objects.equals(this.complianceInstanceAnalysisParameters, bqComplianceRetrieveOutputModelComplianceInstanceAnalysis.complianceInstanceAnalysisParameters) &&
        Objects.equals(this.complianceInstanceAnalysisReport, bqComplianceRetrieveOutputModelComplianceInstanceAnalysis.complianceInstanceAnalysisReport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(complianceInstanceAnalysisRecord, complianceInstanceAnalysisReportType, complianceInstanceAnalysisParameters, complianceInstanceAnalysisReport);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQComplianceRetrieveOutputModelComplianceInstanceAnalysis {\n");
    
    sb.append("    complianceInstanceAnalysisRecord: ").append(toIndentedString(complianceInstanceAnalysisRecord)).append("\n");
    sb.append("    complianceInstanceAnalysisReportType: ").append(toIndentedString(complianceInstanceAnalysisReportType)).append("\n");
    sb.append("    complianceInstanceAnalysisParameters: ").append(toIndentedString(complianceInstanceAnalysisParameters)).append("\n");
    sb.append("    complianceInstanceAnalysisReport: ").append(toIndentedString(complianceInstanceAnalysisReport)).append("\n");
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
