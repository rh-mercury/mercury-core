/*
 * Customer Credit Rating
 * This service domain maintains and administers the bank's credit assessment for customers.
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.redhat.mercury.customercreditrating.model;

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
 * BQInternalReportingRetrieveOutputModelCustomerCreditRatingStateInstanceRecord
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-06-03T16:36:13.702891+02:00[Europe/Madrid]")
public class BQInternalReportingRetrieveOutputModelCustomerCreditRatingStateInstanceRecord {
  @SerializedName("customerReference")
  private String customerReference = null;

  public BQInternalReportingRetrieveOutputModelCustomerCreditRatingStateInstanceRecord customerReference(String customerReference) {
    this.customerReference = customerReference;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the associated customer (can currently be a person or a company) 
   * @return customerReference
  **/
  @Schema(example = "758954", description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the associated customer (can currently be a person or a company) ")
  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQInternalReportingRetrieveOutputModelCustomerCreditRatingStateInstanceRecord bqInternalReportingRetrieveOutputModelCustomerCreditRatingStateInstanceRecord = (BQInternalReportingRetrieveOutputModelCustomerCreditRatingStateInstanceRecord) o;
    return Objects.equals(this.customerReference, bqInternalReportingRetrieveOutputModelCustomerCreditRatingStateInstanceRecord.customerReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerReference);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQInternalReportingRetrieveOutputModelCustomerCreditRatingStateInstanceRecord {\n");
    
    sb.append("    customerReference: ").append(toIndentedString(customerReference)).append("\n");
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
