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
import com.redhat.mercury.customeroffer.model.BQDisclosuresRetrieveOutputModelCustomerOfferProcedureInstanceRecord1;
import com.redhat.mercury.customeroffer.model.BQDisclosuresRetrieveOutputModelDisclosuresInstanceAnalysis1;
import com.redhat.mercury.customeroffer.model.BQDisclosuresRetrieveOutputModelDisclosuresInstanceRecord1;
import com.redhat.mercury.customeroffer.model.BQDisclosuresRetrieveOutputModelDisclosuresInstanceReport1;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * BQDisclosuresRetrieveOutputModel
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-11-19T11:10:08.827631+01:00[Europe/Madrid]")
public class BQDisclosuresRetrieveOutputModel {
  @SerializedName("customerOfferProcedureInstanceRecord")
  private BQDisclosuresRetrieveOutputModelCustomerOfferProcedureInstanceRecord1 customerOfferProcedureInstanceRecord = null;

  @SerializedName("disclosuresInstanceRecord")
  private BQDisclosuresRetrieveOutputModelDisclosuresInstanceRecord1 disclosuresInstanceRecord = null;

  @SerializedName("disclosuresRetrieveActionTaskReference")
  private String disclosuresRetrieveActionTaskReference = null;

  @SerializedName("disclosuresRetrieveActionTaskRecord")
  private Object disclosuresRetrieveActionTaskRecord = null;

  @SerializedName("disclosuresRetrieveActionResponse")
  private String disclosuresRetrieveActionResponse = null;

  @SerializedName("disclosuresInstanceReport")
  private BQDisclosuresRetrieveOutputModelDisclosuresInstanceReport1 disclosuresInstanceReport = null;

  @SerializedName("disclosuresInstanceAnalysis")
  private BQDisclosuresRetrieveOutputModelDisclosuresInstanceAnalysis1 disclosuresInstanceAnalysis = null;

  public BQDisclosuresRetrieveOutputModel customerOfferProcedureInstanceRecord(BQDisclosuresRetrieveOutputModelCustomerOfferProcedureInstanceRecord1 customerOfferProcedureInstanceRecord) {
    this.customerOfferProcedureInstanceRecord = customerOfferProcedureInstanceRecord;
    return this;
  }

   /**
   * Get customerOfferProcedureInstanceRecord
   * @return customerOfferProcedureInstanceRecord
  **/
  @Schema(description = "")
  public BQDisclosuresRetrieveOutputModelCustomerOfferProcedureInstanceRecord1 getCustomerOfferProcedureInstanceRecord() {
    return customerOfferProcedureInstanceRecord;
  }

  public void setCustomerOfferProcedureInstanceRecord(BQDisclosuresRetrieveOutputModelCustomerOfferProcedureInstanceRecord1 customerOfferProcedureInstanceRecord) {
    this.customerOfferProcedureInstanceRecord = customerOfferProcedureInstanceRecord;
  }

  public BQDisclosuresRetrieveOutputModel disclosuresInstanceRecord(BQDisclosuresRetrieveOutputModelDisclosuresInstanceRecord1 disclosuresInstanceRecord) {
    this.disclosuresInstanceRecord = disclosuresInstanceRecord;
    return this;
  }

   /**
   * Get disclosuresInstanceRecord
   * @return disclosuresInstanceRecord
  **/
  @Schema(description = "")
  public BQDisclosuresRetrieveOutputModelDisclosuresInstanceRecord1 getDisclosuresInstanceRecord() {
    return disclosuresInstanceRecord;
  }

  public void setDisclosuresInstanceRecord(BQDisclosuresRetrieveOutputModelDisclosuresInstanceRecord1 disclosuresInstanceRecord) {
    this.disclosuresInstanceRecord = disclosuresInstanceRecord;
  }

  public BQDisclosuresRetrieveOutputModel disclosuresRetrieveActionTaskReference(String disclosuresRetrieveActionTaskReference) {
    this.disclosuresRetrieveActionTaskReference = disclosuresRetrieveActionTaskReference;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Disclosures instance retrieve service call 
   * @return disclosuresRetrieveActionTaskReference
  **/
  @Schema(example = "DRATR735013", description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Disclosures instance retrieve service call ")
  public String getDisclosuresRetrieveActionTaskReference() {
    return disclosuresRetrieveActionTaskReference;
  }

  public void setDisclosuresRetrieveActionTaskReference(String disclosuresRetrieveActionTaskReference) {
    this.disclosuresRetrieveActionTaskReference = disclosuresRetrieveActionTaskReference;
  }

  public BQDisclosuresRetrieveOutputModel disclosuresRetrieveActionTaskRecord(Object disclosuresRetrieveActionTaskRecord) {
    this.disclosuresRetrieveActionTaskRecord = disclosuresRetrieveActionTaskRecord;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return disclosuresRetrieveActionTaskRecord
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record ")
  public Object getDisclosuresRetrieveActionTaskRecord() {
    return disclosuresRetrieveActionTaskRecord;
  }

  public void setDisclosuresRetrieveActionTaskRecord(Object disclosuresRetrieveActionTaskRecord) {
    this.disclosuresRetrieveActionTaskRecord = disclosuresRetrieveActionTaskRecord;
  }

  public BQDisclosuresRetrieveOutputModel disclosuresRetrieveActionResponse(String disclosuresRetrieveActionResponse) {
    this.disclosuresRetrieveActionResponse = disclosuresRetrieveActionResponse;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return disclosuresRetrieveActionResponse
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) ")
  public String getDisclosuresRetrieveActionResponse() {
    return disclosuresRetrieveActionResponse;
  }

  public void setDisclosuresRetrieveActionResponse(String disclosuresRetrieveActionResponse) {
    this.disclosuresRetrieveActionResponse = disclosuresRetrieveActionResponse;
  }

  public BQDisclosuresRetrieveOutputModel disclosuresInstanceReport(BQDisclosuresRetrieveOutputModelDisclosuresInstanceReport1 disclosuresInstanceReport) {
    this.disclosuresInstanceReport = disclosuresInstanceReport;
    return this;
  }

   /**
   * Get disclosuresInstanceReport
   * @return disclosuresInstanceReport
  **/
  @Schema(description = "")
  public BQDisclosuresRetrieveOutputModelDisclosuresInstanceReport1 getDisclosuresInstanceReport() {
    return disclosuresInstanceReport;
  }

  public void setDisclosuresInstanceReport(BQDisclosuresRetrieveOutputModelDisclosuresInstanceReport1 disclosuresInstanceReport) {
    this.disclosuresInstanceReport = disclosuresInstanceReport;
  }

  public BQDisclosuresRetrieveOutputModel disclosuresInstanceAnalysis(BQDisclosuresRetrieveOutputModelDisclosuresInstanceAnalysis1 disclosuresInstanceAnalysis) {
    this.disclosuresInstanceAnalysis = disclosuresInstanceAnalysis;
    return this;
  }

   /**
   * Get disclosuresInstanceAnalysis
   * @return disclosuresInstanceAnalysis
  **/
  @Schema(description = "")
  public BQDisclosuresRetrieveOutputModelDisclosuresInstanceAnalysis1 getDisclosuresInstanceAnalysis() {
    return disclosuresInstanceAnalysis;
  }

  public void setDisclosuresInstanceAnalysis(BQDisclosuresRetrieveOutputModelDisclosuresInstanceAnalysis1 disclosuresInstanceAnalysis) {
    this.disclosuresInstanceAnalysis = disclosuresInstanceAnalysis;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQDisclosuresRetrieveOutputModel bqDisclosuresRetrieveOutputModel = (BQDisclosuresRetrieveOutputModel) o;
    return Objects.equals(this.customerOfferProcedureInstanceRecord, bqDisclosuresRetrieveOutputModel.customerOfferProcedureInstanceRecord) &&
        Objects.equals(this.disclosuresInstanceRecord, bqDisclosuresRetrieveOutputModel.disclosuresInstanceRecord) &&
        Objects.equals(this.disclosuresRetrieveActionTaskReference, bqDisclosuresRetrieveOutputModel.disclosuresRetrieveActionTaskReference) &&
        Objects.equals(this.disclosuresRetrieveActionTaskRecord, bqDisclosuresRetrieveOutputModel.disclosuresRetrieveActionTaskRecord) &&
        Objects.equals(this.disclosuresRetrieveActionResponse, bqDisclosuresRetrieveOutputModel.disclosuresRetrieveActionResponse) &&
        Objects.equals(this.disclosuresInstanceReport, bqDisclosuresRetrieveOutputModel.disclosuresInstanceReport) &&
        Objects.equals(this.disclosuresInstanceAnalysis, bqDisclosuresRetrieveOutputModel.disclosuresInstanceAnalysis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerOfferProcedureInstanceRecord, disclosuresInstanceRecord, disclosuresRetrieveActionTaskReference, disclosuresRetrieveActionTaskRecord, disclosuresRetrieveActionResponse, disclosuresInstanceReport, disclosuresInstanceAnalysis);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQDisclosuresRetrieveOutputModel {\n");
    
    sb.append("    customerOfferProcedureInstanceRecord: ").append(toIndentedString(customerOfferProcedureInstanceRecord)).append("\n");
    sb.append("    disclosuresInstanceRecord: ").append(toIndentedString(disclosuresInstanceRecord)).append("\n");
    sb.append("    disclosuresRetrieveActionTaskReference: ").append(toIndentedString(disclosuresRetrieveActionTaskReference)).append("\n");
    sb.append("    disclosuresRetrieveActionTaskRecord: ").append(toIndentedString(disclosuresRetrieveActionTaskRecord)).append("\n");
    sb.append("    disclosuresRetrieveActionResponse: ").append(toIndentedString(disclosuresRetrieveActionResponse)).append("\n");
    sb.append("    disclosuresInstanceReport: ").append(toIndentedString(disclosuresInstanceReport)).append("\n");
    sb.append("    disclosuresInstanceAnalysis: ").append(toIndentedString(disclosuresInstanceAnalysis)).append("\n");
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
