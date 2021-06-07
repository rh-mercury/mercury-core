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
 * CRAccountRecoveryProcedureRetrieveOutputModelAccountRecoveryProcedureInstanceReportRecord
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-06-07T18:27:41.474305+02:00[Europe/Madrid]")
public class CRAccountRecoveryProcedureRetrieveOutputModelAccountRecoveryProcedureInstanceReportRecord {
  @SerializedName("accountRecoveryProcedureInstanceReportData")
  private String accountRecoveryProcedureInstanceReportData = null;

  @SerializedName("accountRecoveryProcedureInstanceReportType")
  private String accountRecoveryProcedureInstanceReportType = null;

  @SerializedName("accountRecoveryProcedureInstanceReport")
  private Object accountRecoveryProcedureInstanceReport = null;

  public CRAccountRecoveryProcedureRetrieveOutputModelAccountRecoveryProcedureInstanceReportRecord accountRecoveryProcedureInstanceReportData(String accountRecoveryProcedureInstanceReportData) {
    this.accountRecoveryProcedureInstanceReportData = accountRecoveryProcedureInstanceReportData;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return accountRecoveryProcedureInstanceReportData
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected ")
  public String getAccountRecoveryProcedureInstanceReportData() {
    return accountRecoveryProcedureInstanceReportData;
  }

  public void setAccountRecoveryProcedureInstanceReportData(String accountRecoveryProcedureInstanceReportData) {
    this.accountRecoveryProcedureInstanceReportData = accountRecoveryProcedureInstanceReportData;
  }

  public CRAccountRecoveryProcedureRetrieveOutputModelAccountRecoveryProcedureInstanceReportRecord accountRecoveryProcedureInstanceReportType(String accountRecoveryProcedureInstanceReportType) {
    this.accountRecoveryProcedureInstanceReportType = accountRecoveryProcedureInstanceReportType;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return accountRecoveryProcedureInstanceReportType
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available ")
  public String getAccountRecoveryProcedureInstanceReportType() {
    return accountRecoveryProcedureInstanceReportType;
  }

  public void setAccountRecoveryProcedureInstanceReportType(String accountRecoveryProcedureInstanceReportType) {
    this.accountRecoveryProcedureInstanceReportType = accountRecoveryProcedureInstanceReportType;
  }

  public CRAccountRecoveryProcedureRetrieveOutputModelAccountRecoveryProcedureInstanceReportRecord accountRecoveryProcedureInstanceReport(Object accountRecoveryProcedureInstanceReport) {
    this.accountRecoveryProcedureInstanceReport = accountRecoveryProcedureInstanceReport;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return accountRecoveryProcedureInstanceReport
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate ")
  public Object getAccountRecoveryProcedureInstanceReport() {
    return accountRecoveryProcedureInstanceReport;
  }

  public void setAccountRecoveryProcedureInstanceReport(Object accountRecoveryProcedureInstanceReport) {
    this.accountRecoveryProcedureInstanceReport = accountRecoveryProcedureInstanceReport;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CRAccountRecoveryProcedureRetrieveOutputModelAccountRecoveryProcedureInstanceReportRecord crAccountRecoveryProcedureRetrieveOutputModelAccountRecoveryProcedureInstanceReportRecord = (CRAccountRecoveryProcedureRetrieveOutputModelAccountRecoveryProcedureInstanceReportRecord) o;
    return Objects.equals(this.accountRecoveryProcedureInstanceReportData, crAccountRecoveryProcedureRetrieveOutputModelAccountRecoveryProcedureInstanceReportRecord.accountRecoveryProcedureInstanceReportData) &&
        Objects.equals(this.accountRecoveryProcedureInstanceReportType, crAccountRecoveryProcedureRetrieveOutputModelAccountRecoveryProcedureInstanceReportRecord.accountRecoveryProcedureInstanceReportType) &&
        Objects.equals(this.accountRecoveryProcedureInstanceReport, crAccountRecoveryProcedureRetrieveOutputModelAccountRecoveryProcedureInstanceReportRecord.accountRecoveryProcedureInstanceReport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountRecoveryProcedureInstanceReportData, accountRecoveryProcedureInstanceReportType, accountRecoveryProcedureInstanceReport);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CRAccountRecoveryProcedureRetrieveOutputModelAccountRecoveryProcedureInstanceReportRecord {\n");
    
    sb.append("    accountRecoveryProcedureInstanceReportData: ").append(toIndentedString(accountRecoveryProcedureInstanceReportData)).append("\n");
    sb.append("    accountRecoveryProcedureInstanceReportType: ").append(toIndentedString(accountRecoveryProcedureInstanceReportType)).append("\n");
    sb.append("    accountRecoveryProcedureInstanceReport: ").append(toIndentedString(accountRecoveryProcedureInstanceReport)).append("\n");
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
