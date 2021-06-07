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
 * BQPlanningUpdateInputModelPlanningInstanceRecord
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-06-07T18:27:41.474305+02:00[Europe/Madrid]")
public class BQPlanningUpdateInputModelPlanningInstanceRecord {
  @SerializedName("accountRecoveryPlan")
  private String accountRecoveryPlan = null;

  @SerializedName("accountRecoveryCasePlanningTaskRecord")
  private Object accountRecoveryCasePlanningTaskRecord = null;

  public BQPlanningUpdateInputModelPlanningInstanceRecord accountRecoveryPlan(String accountRecoveryPlan) {
    this.accountRecoveryPlan = accountRecoveryPlan;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Recovery tasks and targets added to the Account Recovery Case Resolution Schedule 
   * @return accountRecoveryPlan
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Recovery tasks and targets added to the Account Recovery Case Resolution Schedule ")
  public String getAccountRecoveryPlan() {
    return accountRecoveryPlan;
  }

  public void setAccountRecoveryPlan(String accountRecoveryPlan) {
    this.accountRecoveryPlan = accountRecoveryPlan;
  }

  public BQPlanningUpdateInputModelPlanningInstanceRecord accountRecoveryCasePlanningTaskRecord(Object accountRecoveryCasePlanningTaskRecord) {
    this.accountRecoveryCasePlanningTaskRecord = accountRecoveryCasePlanningTaskRecord;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Processing record for the planning task within the account recovery process 
   * @return accountRecoveryCasePlanningTaskRecord
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Processing record for the planning task within the account recovery process ")
  public Object getAccountRecoveryCasePlanningTaskRecord() {
    return accountRecoveryCasePlanningTaskRecord;
  }

  public void setAccountRecoveryCasePlanningTaskRecord(Object accountRecoveryCasePlanningTaskRecord) {
    this.accountRecoveryCasePlanningTaskRecord = accountRecoveryCasePlanningTaskRecord;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQPlanningUpdateInputModelPlanningInstanceRecord bqPlanningUpdateInputModelPlanningInstanceRecord = (BQPlanningUpdateInputModelPlanningInstanceRecord) o;
    return Objects.equals(this.accountRecoveryPlan, bqPlanningUpdateInputModelPlanningInstanceRecord.accountRecoveryPlan) &&
        Objects.equals(this.accountRecoveryCasePlanningTaskRecord, bqPlanningUpdateInputModelPlanningInstanceRecord.accountRecoveryCasePlanningTaskRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountRecoveryPlan, accountRecoveryCasePlanningTaskRecord);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQPlanningUpdateInputModelPlanningInstanceRecord {\n");
    
    sb.append("    accountRecoveryPlan: ").append(toIndentedString(accountRecoveryPlan)).append("\n");
    sb.append("    accountRecoveryCasePlanningTaskRecord: ").append(toIndentedString(accountRecoveryCasePlanningTaskRecord)).append("\n");
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
