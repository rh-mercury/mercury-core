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
 * BQCreditRetrieveInputModelCreditInstanceReport
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-11-19T11:10:08.827631+01:00[Europe/Madrid]")
public class BQCreditRetrieveInputModelCreditInstanceReport {
  @SerializedName("creditInstanceReportReference")
  private String creditInstanceReportReference = null;

  public BQCreditRetrieveInputModelCreditInstanceReport creditInstanceReportReference(String creditInstanceReportReference) {
    this.creditInstanceReportReference = creditInstanceReportReference;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return creditInstanceReportReference
  **/
  @Schema(example = "790862", description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report ")
  public String getCreditInstanceReportReference() {
    return creditInstanceReportReference;
  }

  public void setCreditInstanceReportReference(String creditInstanceReportReference) {
    this.creditInstanceReportReference = creditInstanceReportReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQCreditRetrieveInputModelCreditInstanceReport bqCreditRetrieveInputModelCreditInstanceReport = (BQCreditRetrieveInputModelCreditInstanceReport) o;
    return Objects.equals(this.creditInstanceReportReference, bqCreditRetrieveInputModelCreditInstanceReport.creditInstanceReportReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditInstanceReportReference);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQCreditRetrieveInputModelCreditInstanceReport {\n");
    
    sb.append("    creditInstanceReportReference: ").append(toIndentedString(creditInstanceReportReference)).append("\n");
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
