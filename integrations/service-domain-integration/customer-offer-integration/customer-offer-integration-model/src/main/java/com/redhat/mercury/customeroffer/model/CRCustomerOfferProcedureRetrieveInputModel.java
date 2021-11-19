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
import com.redhat.mercury.customeroffer.model.CRCustomerOfferProcedureRetrieveInputModelCustomerOfferProcedureInstanceAnalysis1;
import com.redhat.mercury.customeroffer.model.CRCustomerOfferProcedureRetrieveInputModelCustomerOfferProcedureInstanceReportRecord1;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * CRCustomerOfferProcedureRetrieveInputModel
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-11-19T11:10:08.827631+01:00[Europe/Madrid]")
public class CRCustomerOfferProcedureRetrieveInputModel {
  @SerializedName("customerOfferProcedureRetrieveActionTaskRecord")
  private Object customerOfferProcedureRetrieveActionTaskRecord = null;

  @SerializedName("customerOfferProcedureRetrieveActionRequest")
  private String customerOfferProcedureRetrieveActionRequest = null;

  @SerializedName("customerOfferProcedureInstanceReportRecord")
  private CRCustomerOfferProcedureRetrieveInputModelCustomerOfferProcedureInstanceReportRecord1 customerOfferProcedureInstanceReportRecord = null;

  @SerializedName("customerOfferProcedureInstanceAnalysis")
  private CRCustomerOfferProcedureRetrieveInputModelCustomerOfferProcedureInstanceAnalysis1 customerOfferProcedureInstanceAnalysis = null;

  public CRCustomerOfferProcedureRetrieveInputModel customerOfferProcedureRetrieveActionTaskRecord(Object customerOfferProcedureRetrieveActionTaskRecord) {
    this.customerOfferProcedureRetrieveActionTaskRecord = customerOfferProcedureRetrieveActionTaskRecord;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return customerOfferProcedureRetrieveActionTaskRecord
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record ")
  public Object getCustomerOfferProcedureRetrieveActionTaskRecord() {
    return customerOfferProcedureRetrieveActionTaskRecord;
  }

  public void setCustomerOfferProcedureRetrieveActionTaskRecord(Object customerOfferProcedureRetrieveActionTaskRecord) {
    this.customerOfferProcedureRetrieveActionTaskRecord = customerOfferProcedureRetrieveActionTaskRecord;
  }

  public CRCustomerOfferProcedureRetrieveInputModel customerOfferProcedureRetrieveActionRequest(String customerOfferProcedureRetrieveActionRequest) {
    this.customerOfferProcedureRetrieveActionRequest = customerOfferProcedureRetrieveActionRequest;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return customerOfferProcedureRetrieveActionRequest
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) ")
  public String getCustomerOfferProcedureRetrieveActionRequest() {
    return customerOfferProcedureRetrieveActionRequest;
  }

  public void setCustomerOfferProcedureRetrieveActionRequest(String customerOfferProcedureRetrieveActionRequest) {
    this.customerOfferProcedureRetrieveActionRequest = customerOfferProcedureRetrieveActionRequest;
  }

  public CRCustomerOfferProcedureRetrieveInputModel customerOfferProcedureInstanceReportRecord(CRCustomerOfferProcedureRetrieveInputModelCustomerOfferProcedureInstanceReportRecord1 customerOfferProcedureInstanceReportRecord) {
    this.customerOfferProcedureInstanceReportRecord = customerOfferProcedureInstanceReportRecord;
    return this;
  }

   /**
   * Get customerOfferProcedureInstanceReportRecord
   * @return customerOfferProcedureInstanceReportRecord
  **/
  @Schema(description = "")
  public CRCustomerOfferProcedureRetrieveInputModelCustomerOfferProcedureInstanceReportRecord1 getCustomerOfferProcedureInstanceReportRecord() {
    return customerOfferProcedureInstanceReportRecord;
  }

  public void setCustomerOfferProcedureInstanceReportRecord(CRCustomerOfferProcedureRetrieveInputModelCustomerOfferProcedureInstanceReportRecord1 customerOfferProcedureInstanceReportRecord) {
    this.customerOfferProcedureInstanceReportRecord = customerOfferProcedureInstanceReportRecord;
  }

  public CRCustomerOfferProcedureRetrieveInputModel customerOfferProcedureInstanceAnalysis(CRCustomerOfferProcedureRetrieveInputModelCustomerOfferProcedureInstanceAnalysis1 customerOfferProcedureInstanceAnalysis) {
    this.customerOfferProcedureInstanceAnalysis = customerOfferProcedureInstanceAnalysis;
    return this;
  }

   /**
   * Get customerOfferProcedureInstanceAnalysis
   * @return customerOfferProcedureInstanceAnalysis
  **/
  @Schema(description = "")
  public CRCustomerOfferProcedureRetrieveInputModelCustomerOfferProcedureInstanceAnalysis1 getCustomerOfferProcedureInstanceAnalysis() {
    return customerOfferProcedureInstanceAnalysis;
  }

  public void setCustomerOfferProcedureInstanceAnalysis(CRCustomerOfferProcedureRetrieveInputModelCustomerOfferProcedureInstanceAnalysis1 customerOfferProcedureInstanceAnalysis) {
    this.customerOfferProcedureInstanceAnalysis = customerOfferProcedureInstanceAnalysis;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CRCustomerOfferProcedureRetrieveInputModel crCustomerOfferProcedureRetrieveInputModel = (CRCustomerOfferProcedureRetrieveInputModel) o;
    return Objects.equals(this.customerOfferProcedureRetrieveActionTaskRecord, crCustomerOfferProcedureRetrieveInputModel.customerOfferProcedureRetrieveActionTaskRecord) &&
        Objects.equals(this.customerOfferProcedureRetrieveActionRequest, crCustomerOfferProcedureRetrieveInputModel.customerOfferProcedureRetrieveActionRequest) &&
        Objects.equals(this.customerOfferProcedureInstanceReportRecord, crCustomerOfferProcedureRetrieveInputModel.customerOfferProcedureInstanceReportRecord) &&
        Objects.equals(this.customerOfferProcedureInstanceAnalysis, crCustomerOfferProcedureRetrieveInputModel.customerOfferProcedureInstanceAnalysis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerOfferProcedureRetrieveActionTaskRecord, customerOfferProcedureRetrieveActionRequest, customerOfferProcedureInstanceReportRecord, customerOfferProcedureInstanceAnalysis);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CRCustomerOfferProcedureRetrieveInputModel {\n");
    
    sb.append("    customerOfferProcedureRetrieveActionTaskRecord: ").append(toIndentedString(customerOfferProcedureRetrieveActionTaskRecord)).append("\n");
    sb.append("    customerOfferProcedureRetrieveActionRequest: ").append(toIndentedString(customerOfferProcedureRetrieveActionRequest)).append("\n");
    sb.append("    customerOfferProcedureInstanceReportRecord: ").append(toIndentedString(customerOfferProcedureInstanceReportRecord)).append("\n");
    sb.append("    customerOfferProcedureInstanceAnalysis: ").append(toIndentedString(customerOfferProcedureInstanceAnalysis)).append("\n");
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
