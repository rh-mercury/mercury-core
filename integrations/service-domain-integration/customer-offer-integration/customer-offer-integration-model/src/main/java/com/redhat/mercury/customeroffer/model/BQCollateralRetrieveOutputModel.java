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
import com.redhat.mercury.customeroffer.model.BQCollateralRetrieveOutputModelCollateralInstanceAnalysis1;
import com.redhat.mercury.customeroffer.model.BQCollateralRetrieveOutputModelCollateralInstanceRecord1;
import com.redhat.mercury.customeroffer.model.BQCollateralRetrieveOutputModelCollateralInstanceReport1;
import com.redhat.mercury.customeroffer.model.BQCollateralRetrieveOutputModelCustomerOfferProcedureInstanceRecord1;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * BQCollateralRetrieveOutputModel
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-11-19T11:10:08.827631+01:00[Europe/Madrid]")
public class BQCollateralRetrieveOutputModel {
  @SerializedName("customerOfferProcedureInstanceRecord")
  private BQCollateralRetrieveOutputModelCustomerOfferProcedureInstanceRecord1 customerOfferProcedureInstanceRecord = null;

  @SerializedName("collateralInstanceRecord")
  private BQCollateralRetrieveOutputModelCollateralInstanceRecord1 collateralInstanceRecord = null;

  @SerializedName("collateralRetrieveActionTaskReference")
  private String collateralRetrieveActionTaskReference = null;

  @SerializedName("collateralRetrieveActionTaskRecord")
  private Object collateralRetrieveActionTaskRecord = null;

  @SerializedName("collateralRetrieveActionResponse")
  private String collateralRetrieveActionResponse = null;

  @SerializedName("collateralInstanceReport")
  private BQCollateralRetrieveOutputModelCollateralInstanceReport1 collateralInstanceReport = null;

  @SerializedName("collateralInstanceAnalysis")
  private BQCollateralRetrieveOutputModelCollateralInstanceAnalysis1 collateralInstanceAnalysis = null;

  public BQCollateralRetrieveOutputModel customerOfferProcedureInstanceRecord(BQCollateralRetrieveOutputModelCustomerOfferProcedureInstanceRecord1 customerOfferProcedureInstanceRecord) {
    this.customerOfferProcedureInstanceRecord = customerOfferProcedureInstanceRecord;
    return this;
  }

   /**
   * Get customerOfferProcedureInstanceRecord
   * @return customerOfferProcedureInstanceRecord
  **/
  @Schema(description = "")
  public BQCollateralRetrieveOutputModelCustomerOfferProcedureInstanceRecord1 getCustomerOfferProcedureInstanceRecord() {
    return customerOfferProcedureInstanceRecord;
  }

  public void setCustomerOfferProcedureInstanceRecord(BQCollateralRetrieveOutputModelCustomerOfferProcedureInstanceRecord1 customerOfferProcedureInstanceRecord) {
    this.customerOfferProcedureInstanceRecord = customerOfferProcedureInstanceRecord;
  }

  public BQCollateralRetrieveOutputModel collateralInstanceRecord(BQCollateralRetrieveOutputModelCollateralInstanceRecord1 collateralInstanceRecord) {
    this.collateralInstanceRecord = collateralInstanceRecord;
    return this;
  }

   /**
   * Get collateralInstanceRecord
   * @return collateralInstanceRecord
  **/
  @Schema(description = "")
  public BQCollateralRetrieveOutputModelCollateralInstanceRecord1 getCollateralInstanceRecord() {
    return collateralInstanceRecord;
  }

  public void setCollateralInstanceRecord(BQCollateralRetrieveOutputModelCollateralInstanceRecord1 collateralInstanceRecord) {
    this.collateralInstanceRecord = collateralInstanceRecord;
  }

  public BQCollateralRetrieveOutputModel collateralRetrieveActionTaskReference(String collateralRetrieveActionTaskReference) {
    this.collateralRetrieveActionTaskReference = collateralRetrieveActionTaskReference;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Collateral instance retrieve service call 
   * @return collateralRetrieveActionTaskReference
  **/
  @Schema(example = "CRATR777265", description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Collateral instance retrieve service call ")
  public String getCollateralRetrieveActionTaskReference() {
    return collateralRetrieveActionTaskReference;
  }

  public void setCollateralRetrieveActionTaskReference(String collateralRetrieveActionTaskReference) {
    this.collateralRetrieveActionTaskReference = collateralRetrieveActionTaskReference;
  }

  public BQCollateralRetrieveOutputModel collateralRetrieveActionTaskRecord(Object collateralRetrieveActionTaskRecord) {
    this.collateralRetrieveActionTaskRecord = collateralRetrieveActionTaskRecord;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return collateralRetrieveActionTaskRecord
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record ")
  public Object getCollateralRetrieveActionTaskRecord() {
    return collateralRetrieveActionTaskRecord;
  }

  public void setCollateralRetrieveActionTaskRecord(Object collateralRetrieveActionTaskRecord) {
    this.collateralRetrieveActionTaskRecord = collateralRetrieveActionTaskRecord;
  }

  public BQCollateralRetrieveOutputModel collateralRetrieveActionResponse(String collateralRetrieveActionResponse) {
    this.collateralRetrieveActionResponse = collateralRetrieveActionResponse;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return collateralRetrieveActionResponse
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) ")
  public String getCollateralRetrieveActionResponse() {
    return collateralRetrieveActionResponse;
  }

  public void setCollateralRetrieveActionResponse(String collateralRetrieveActionResponse) {
    this.collateralRetrieveActionResponse = collateralRetrieveActionResponse;
  }

  public BQCollateralRetrieveOutputModel collateralInstanceReport(BQCollateralRetrieveOutputModelCollateralInstanceReport1 collateralInstanceReport) {
    this.collateralInstanceReport = collateralInstanceReport;
    return this;
  }

   /**
   * Get collateralInstanceReport
   * @return collateralInstanceReport
  **/
  @Schema(description = "")
  public BQCollateralRetrieveOutputModelCollateralInstanceReport1 getCollateralInstanceReport() {
    return collateralInstanceReport;
  }

  public void setCollateralInstanceReport(BQCollateralRetrieveOutputModelCollateralInstanceReport1 collateralInstanceReport) {
    this.collateralInstanceReport = collateralInstanceReport;
  }

  public BQCollateralRetrieveOutputModel collateralInstanceAnalysis(BQCollateralRetrieveOutputModelCollateralInstanceAnalysis1 collateralInstanceAnalysis) {
    this.collateralInstanceAnalysis = collateralInstanceAnalysis;
    return this;
  }

   /**
   * Get collateralInstanceAnalysis
   * @return collateralInstanceAnalysis
  **/
  @Schema(description = "")
  public BQCollateralRetrieveOutputModelCollateralInstanceAnalysis1 getCollateralInstanceAnalysis() {
    return collateralInstanceAnalysis;
  }

  public void setCollateralInstanceAnalysis(BQCollateralRetrieveOutputModelCollateralInstanceAnalysis1 collateralInstanceAnalysis) {
    this.collateralInstanceAnalysis = collateralInstanceAnalysis;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQCollateralRetrieveOutputModel bqCollateralRetrieveOutputModel = (BQCollateralRetrieveOutputModel) o;
    return Objects.equals(this.customerOfferProcedureInstanceRecord, bqCollateralRetrieveOutputModel.customerOfferProcedureInstanceRecord) &&
        Objects.equals(this.collateralInstanceRecord, bqCollateralRetrieveOutputModel.collateralInstanceRecord) &&
        Objects.equals(this.collateralRetrieveActionTaskReference, bqCollateralRetrieveOutputModel.collateralRetrieveActionTaskReference) &&
        Objects.equals(this.collateralRetrieveActionTaskRecord, bqCollateralRetrieveOutputModel.collateralRetrieveActionTaskRecord) &&
        Objects.equals(this.collateralRetrieveActionResponse, bqCollateralRetrieveOutputModel.collateralRetrieveActionResponse) &&
        Objects.equals(this.collateralInstanceReport, bqCollateralRetrieveOutputModel.collateralInstanceReport) &&
        Objects.equals(this.collateralInstanceAnalysis, bqCollateralRetrieveOutputModel.collateralInstanceAnalysis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerOfferProcedureInstanceRecord, collateralInstanceRecord, collateralRetrieveActionTaskReference, collateralRetrieveActionTaskRecord, collateralRetrieveActionResponse, collateralInstanceReport, collateralInstanceAnalysis);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQCollateralRetrieveOutputModel {\n");
    
    sb.append("    customerOfferProcedureInstanceRecord: ").append(toIndentedString(customerOfferProcedureInstanceRecord)).append("\n");
    sb.append("    collateralInstanceRecord: ").append(toIndentedString(collateralInstanceRecord)).append("\n");
    sb.append("    collateralRetrieveActionTaskReference: ").append(toIndentedString(collateralRetrieveActionTaskReference)).append("\n");
    sb.append("    collateralRetrieveActionTaskRecord: ").append(toIndentedString(collateralRetrieveActionTaskRecord)).append("\n");
    sb.append("    collateralRetrieveActionResponse: ").append(toIndentedString(collateralRetrieveActionResponse)).append("\n");
    sb.append("    collateralInstanceReport: ").append(toIndentedString(collateralInstanceReport)).append("\n");
    sb.append("    collateralInstanceAnalysis: ").append(toIndentedString(collateralInstanceAnalysis)).append("\n");
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
