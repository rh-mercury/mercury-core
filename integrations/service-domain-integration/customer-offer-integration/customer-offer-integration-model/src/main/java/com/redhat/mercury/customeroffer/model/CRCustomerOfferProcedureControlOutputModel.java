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
 * CRCustomerOfferProcedureControlOutputModel
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-11-19T11:10:08.827631+01:00[Europe/Madrid]")
public class CRCustomerOfferProcedureControlOutputModel {
  @SerializedName("customerOfferProcedureControlActionTaskReference")
  private String customerOfferProcedureControlActionTaskReference = null;

  @SerializedName("customerOfferProcedureControlActionTaskRecord")
  private Object customerOfferProcedureControlActionTaskRecord = null;

  @SerializedName("customerOfferProcedureControlActionResponse")
  private String customerOfferProcedureControlActionResponse = null;

  public CRCustomerOfferProcedureControlOutputModel customerOfferProcedureControlActionTaskReference(String customerOfferProcedureControlActionTaskReference) {
    this.customerOfferProcedureControlActionTaskReference = customerOfferProcedureControlActionTaskReference;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Offer Procedure instance control processing service call 
   * @return customerOfferProcedureControlActionTaskReference
  **/
  @Schema(example = "COPCATR736217", description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Offer Procedure instance control processing service call ")
  public String getCustomerOfferProcedureControlActionTaskReference() {
    return customerOfferProcedureControlActionTaskReference;
  }

  public void setCustomerOfferProcedureControlActionTaskReference(String customerOfferProcedureControlActionTaskReference) {
    this.customerOfferProcedureControlActionTaskReference = customerOfferProcedureControlActionTaskReference;
  }

  public CRCustomerOfferProcedureControlOutputModel customerOfferProcedureControlActionTaskRecord(Object customerOfferProcedureControlActionTaskRecord) {
    this.customerOfferProcedureControlActionTaskRecord = customerOfferProcedureControlActionTaskRecord;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return customerOfferProcedureControlActionTaskRecord
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record ")
  public Object getCustomerOfferProcedureControlActionTaskRecord() {
    return customerOfferProcedureControlActionTaskRecord;
  }

  public void setCustomerOfferProcedureControlActionTaskRecord(Object customerOfferProcedureControlActionTaskRecord) {
    this.customerOfferProcedureControlActionTaskRecord = customerOfferProcedureControlActionTaskRecord;
  }

  public CRCustomerOfferProcedureControlOutputModel customerOfferProcedureControlActionResponse(String customerOfferProcedureControlActionResponse) {
    this.customerOfferProcedureControlActionResponse = customerOfferProcedureControlActionResponse;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return customerOfferProcedureControlActionResponse
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response ")
  public String getCustomerOfferProcedureControlActionResponse() {
    return customerOfferProcedureControlActionResponse;
  }

  public void setCustomerOfferProcedureControlActionResponse(String customerOfferProcedureControlActionResponse) {
    this.customerOfferProcedureControlActionResponse = customerOfferProcedureControlActionResponse;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CRCustomerOfferProcedureControlOutputModel crCustomerOfferProcedureControlOutputModel = (CRCustomerOfferProcedureControlOutputModel) o;
    return Objects.equals(this.customerOfferProcedureControlActionTaskReference, crCustomerOfferProcedureControlOutputModel.customerOfferProcedureControlActionTaskReference) &&
        Objects.equals(this.customerOfferProcedureControlActionTaskRecord, crCustomerOfferProcedureControlOutputModel.customerOfferProcedureControlActionTaskRecord) &&
        Objects.equals(this.customerOfferProcedureControlActionResponse, crCustomerOfferProcedureControlOutputModel.customerOfferProcedureControlActionResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerOfferProcedureControlActionTaskReference, customerOfferProcedureControlActionTaskRecord, customerOfferProcedureControlActionResponse);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CRCustomerOfferProcedureControlOutputModel {\n");
    
    sb.append("    customerOfferProcedureControlActionTaskReference: ").append(toIndentedString(customerOfferProcedureControlActionTaskReference)).append("\n");
    sb.append("    customerOfferProcedureControlActionTaskRecord: ").append(toIndentedString(customerOfferProcedureControlActionTaskRecord)).append("\n");
    sb.append("    customerOfferProcedureControlActionResponse: ").append(toIndentedString(customerOfferProcedureControlActionResponse)).append("\n");
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
