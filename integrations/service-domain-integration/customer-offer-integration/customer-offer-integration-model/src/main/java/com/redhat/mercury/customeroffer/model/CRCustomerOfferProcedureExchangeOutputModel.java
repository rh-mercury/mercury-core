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
 * CRCustomerOfferProcedureExchangeOutputModel
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-11-19T11:10:08.827631+01:00[Europe/Madrid]")
public class CRCustomerOfferProcedureExchangeOutputModel {
  @SerializedName("customerOfferProcedureExchangeActionTaskReference")
  private String customerOfferProcedureExchangeActionTaskReference = null;

  @SerializedName("customerOfferProcedureExchangeActionTaskRecord")
  private Object customerOfferProcedureExchangeActionTaskRecord = null;

  @SerializedName("customerOfferProcedureExchangeActionResponse")
  private String customerOfferProcedureExchangeActionResponse = null;

  public CRCustomerOfferProcedureExchangeOutputModel customerOfferProcedureExchangeActionTaskReference(String customerOfferProcedureExchangeActionTaskReference) {
    this.customerOfferProcedureExchangeActionTaskReference = customerOfferProcedureExchangeActionTaskReference;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Offer Procedure instance exchange service call 
   * @return customerOfferProcedureExchangeActionTaskReference
  **/
  @Schema(example = "COPEATR713254", description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Offer Procedure instance exchange service call ")
  public String getCustomerOfferProcedureExchangeActionTaskReference() {
    return customerOfferProcedureExchangeActionTaskReference;
  }

  public void setCustomerOfferProcedureExchangeActionTaskReference(String customerOfferProcedureExchangeActionTaskReference) {
    this.customerOfferProcedureExchangeActionTaskReference = customerOfferProcedureExchangeActionTaskReference;
  }

  public CRCustomerOfferProcedureExchangeOutputModel customerOfferProcedureExchangeActionTaskRecord(Object customerOfferProcedureExchangeActionTaskRecord) {
    this.customerOfferProcedureExchangeActionTaskRecord = customerOfferProcedureExchangeActionTaskRecord;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return customerOfferProcedureExchangeActionTaskRecord
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record ")
  public Object getCustomerOfferProcedureExchangeActionTaskRecord() {
    return customerOfferProcedureExchangeActionTaskRecord;
  }

  public void setCustomerOfferProcedureExchangeActionTaskRecord(Object customerOfferProcedureExchangeActionTaskRecord) {
    this.customerOfferProcedureExchangeActionTaskRecord = customerOfferProcedureExchangeActionTaskRecord;
  }

  public CRCustomerOfferProcedureExchangeOutputModel customerOfferProcedureExchangeActionResponse(String customerOfferProcedureExchangeActionResponse) {
    this.customerOfferProcedureExchangeActionResponse = customerOfferProcedureExchangeActionResponse;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return customerOfferProcedureExchangeActionResponse
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response ")
  public String getCustomerOfferProcedureExchangeActionResponse() {
    return customerOfferProcedureExchangeActionResponse;
  }

  public void setCustomerOfferProcedureExchangeActionResponse(String customerOfferProcedureExchangeActionResponse) {
    this.customerOfferProcedureExchangeActionResponse = customerOfferProcedureExchangeActionResponse;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CRCustomerOfferProcedureExchangeOutputModel crCustomerOfferProcedureExchangeOutputModel = (CRCustomerOfferProcedureExchangeOutputModel) o;
    return Objects.equals(this.customerOfferProcedureExchangeActionTaskReference, crCustomerOfferProcedureExchangeOutputModel.customerOfferProcedureExchangeActionTaskReference) &&
        Objects.equals(this.customerOfferProcedureExchangeActionTaskRecord, crCustomerOfferProcedureExchangeOutputModel.customerOfferProcedureExchangeActionTaskRecord) &&
        Objects.equals(this.customerOfferProcedureExchangeActionResponse, crCustomerOfferProcedureExchangeOutputModel.customerOfferProcedureExchangeActionResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerOfferProcedureExchangeActionTaskReference, customerOfferProcedureExchangeActionTaskRecord, customerOfferProcedureExchangeActionResponse);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CRCustomerOfferProcedureExchangeOutputModel {\n");
    
    sb.append("    customerOfferProcedureExchangeActionTaskReference: ").append(toIndentedString(customerOfferProcedureExchangeActionTaskReference)).append("\n");
    sb.append("    customerOfferProcedureExchangeActionTaskRecord: ").append(toIndentedString(customerOfferProcedureExchangeActionTaskRecord)).append("\n");
    sb.append("    customerOfferProcedureExchangeActionResponse: ").append(toIndentedString(customerOfferProcedureExchangeActionResponse)).append("\n");
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
