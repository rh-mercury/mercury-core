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
 * CRAccountRecoveryProcedureRetrieveOutputModelAccountRecoveryProcedureInstanceAnalysis
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-06-07T18:27:41.474305+02:00[Europe/Madrid]")
public class CRAccountRecoveryProcedureRetrieveOutputModelAccountRecoveryProcedureInstanceAnalysis {
  @SerializedName("accountRecoveryProcedureInstanceAnalysisData")
  private String accountRecoveryProcedureInstanceAnalysisData = null;

  @SerializedName("accountRecoveryProcedureInstanceAnalysisReportType")
  private String accountRecoveryProcedureInstanceAnalysisReportType = null;

  @SerializedName("accountRecoveryProcedureInstanceAnalysisReport")
  private Object accountRecoveryProcedureInstanceAnalysisReport = null;

  public CRAccountRecoveryProcedureRetrieveOutputModelAccountRecoveryProcedureInstanceAnalysis accountRecoveryProcedureInstanceAnalysisData(String accountRecoveryProcedureInstanceAnalysisData) {
    this.accountRecoveryProcedureInstanceAnalysisData = accountRecoveryProcedureInstanceAnalysisData;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return accountRecoveryProcedureInstanceAnalysisData
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected ")
  public String getAccountRecoveryProcedureInstanceAnalysisData() {
    return accountRecoveryProcedureInstanceAnalysisData;
  }

  public void setAccountRecoveryProcedureInstanceAnalysisData(String accountRecoveryProcedureInstanceAnalysisData) {
    this.accountRecoveryProcedureInstanceAnalysisData = accountRecoveryProcedureInstanceAnalysisData;
  }

  public CRAccountRecoveryProcedureRetrieveOutputModelAccountRecoveryProcedureInstanceAnalysis accountRecoveryProcedureInstanceAnalysisReportType(String accountRecoveryProcedureInstanceAnalysisReportType) {
    this.accountRecoveryProcedureInstanceAnalysisReportType = accountRecoveryProcedureInstanceAnalysisReportType;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return accountRecoveryProcedureInstanceAnalysisReportType
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available ")
  public String getAccountRecoveryProcedureInstanceAnalysisReportType() {
    return accountRecoveryProcedureInstanceAnalysisReportType;
  }

  public void setAccountRecoveryProcedureInstanceAnalysisReportType(String accountRecoveryProcedureInstanceAnalysisReportType) {
    this.accountRecoveryProcedureInstanceAnalysisReportType = accountRecoveryProcedureInstanceAnalysisReportType;
  }

  public CRAccountRecoveryProcedureRetrieveOutputModelAccountRecoveryProcedureInstanceAnalysis accountRecoveryProcedureInstanceAnalysisReport(Object accountRecoveryProcedureInstanceAnalysisReport) {
    this.accountRecoveryProcedureInstanceAnalysisReport = accountRecoveryProcedureInstanceAnalysisReport;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return accountRecoveryProcedureInstanceAnalysisReport
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate ")
  public Object getAccountRecoveryProcedureInstanceAnalysisReport() {
    return accountRecoveryProcedureInstanceAnalysisReport;
  }

  public void setAccountRecoveryProcedureInstanceAnalysisReport(Object accountRecoveryProcedureInstanceAnalysisReport) {
    this.accountRecoveryProcedureInstanceAnalysisReport = accountRecoveryProcedureInstanceAnalysisReport;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CRAccountRecoveryProcedureRetrieveOutputModelAccountRecoveryProcedureInstanceAnalysis crAccountRecoveryProcedureRetrieveOutputModelAccountRecoveryProcedureInstanceAnalysis = (CRAccountRecoveryProcedureRetrieveOutputModelAccountRecoveryProcedureInstanceAnalysis) o;
    return Objects.equals(this.accountRecoveryProcedureInstanceAnalysisData, crAccountRecoveryProcedureRetrieveOutputModelAccountRecoveryProcedureInstanceAnalysis.accountRecoveryProcedureInstanceAnalysisData) &&
        Objects.equals(this.accountRecoveryProcedureInstanceAnalysisReportType, crAccountRecoveryProcedureRetrieveOutputModelAccountRecoveryProcedureInstanceAnalysis.accountRecoveryProcedureInstanceAnalysisReportType) &&
        Objects.equals(this.accountRecoveryProcedureInstanceAnalysisReport, crAccountRecoveryProcedureRetrieveOutputModelAccountRecoveryProcedureInstanceAnalysis.accountRecoveryProcedureInstanceAnalysisReport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountRecoveryProcedureInstanceAnalysisData, accountRecoveryProcedureInstanceAnalysisReportType, accountRecoveryProcedureInstanceAnalysisReport);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CRAccountRecoveryProcedureRetrieveOutputModelAccountRecoveryProcedureInstanceAnalysis {\n");
    
    sb.append("    accountRecoveryProcedureInstanceAnalysisData: ").append(toIndentedString(accountRecoveryProcedureInstanceAnalysisData)).append("\n");
    sb.append("    accountRecoveryProcedureInstanceAnalysisReportType: ").append(toIndentedString(accountRecoveryProcedureInstanceAnalysisReportType)).append("\n");
    sb.append("    accountRecoveryProcedureInstanceAnalysisReport: ").append(toIndentedString(accountRecoveryProcedureInstanceAnalysisReport)).append("\n");
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
