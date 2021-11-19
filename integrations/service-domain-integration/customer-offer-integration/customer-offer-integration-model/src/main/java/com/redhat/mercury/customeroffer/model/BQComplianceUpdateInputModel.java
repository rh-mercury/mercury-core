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
import com.redhat.mercury.customeroffer.model.CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidcompliancebqreferenceidupdateComplianceInstanceRecord;
import com.redhat.mercury.customeroffer.model.CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidcompliancebqreferenceidupdateCustomerOfferProcedureInstanceRecord;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * BQComplianceUpdateInputModel
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-11-19T11:10:08.827631+01:00[Europe/Madrid]")
public class BQComplianceUpdateInputModel {
  @SerializedName("customerOfferProcedureInstanceRecord")
  private CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidcompliancebqreferenceidupdateCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord = null;

  @SerializedName("customerOfferProcedureInstanceReference")
  private String customerOfferProcedureInstanceReference = null;

  @SerializedName("complianceInstanceReference")
  private String complianceInstanceReference = null;

  @SerializedName("complianceInstanceRecord")
  private CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidcompliancebqreferenceidupdateComplianceInstanceRecord complianceInstanceRecord = null;

  @SerializedName("complianceUpdateActionTaskRecord")
  private Object complianceUpdateActionTaskRecord = null;

  @SerializedName("complianceUpdateActionRequest")
  private String complianceUpdateActionRequest = null;

  public BQComplianceUpdateInputModel customerOfferProcedureInstanceRecord(CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidcompliancebqreferenceidupdateCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord) {
    this.customerOfferProcedureInstanceRecord = customerOfferProcedureInstanceRecord;
    return this;
  }

   /**
   * Get customerOfferProcedureInstanceRecord
   * @return customerOfferProcedureInstanceRecord
  **/
  @Schema(description = "")
  public CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidcompliancebqreferenceidupdateCustomerOfferProcedureInstanceRecord getCustomerOfferProcedureInstanceRecord() {
    return customerOfferProcedureInstanceRecord;
  }

  public void setCustomerOfferProcedureInstanceRecord(CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidcompliancebqreferenceidupdateCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord) {
    this.customerOfferProcedureInstanceRecord = customerOfferProcedureInstanceRecord;
  }

  public BQComplianceUpdateInputModel customerOfferProcedureInstanceReference(String customerOfferProcedureInstanceReference) {
    this.customerOfferProcedureInstanceReference = customerOfferProcedureInstanceReference;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Customer Offer Procedure instance 
   * @return customerOfferProcedureInstanceReference
  **/
  @Schema(example = "COPIR714236", description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Customer Offer Procedure instance ")
  public String getCustomerOfferProcedureInstanceReference() {
    return customerOfferProcedureInstanceReference;
  }

  public void setCustomerOfferProcedureInstanceReference(String customerOfferProcedureInstanceReference) {
    this.customerOfferProcedureInstanceReference = customerOfferProcedureInstanceReference;
  }

  public BQComplianceUpdateInputModel complianceInstanceReference(String complianceInstanceReference) {
    this.complianceInstanceReference = complianceInstanceReference;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Compliance instance 
   * @return complianceInstanceReference
  **/
  @Schema(example = "CIR784347", description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Compliance instance ")
  public String getComplianceInstanceReference() {
    return complianceInstanceReference;
  }

  public void setComplianceInstanceReference(String complianceInstanceReference) {
    this.complianceInstanceReference = complianceInstanceReference;
  }

  public BQComplianceUpdateInputModel complianceInstanceRecord(CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidcompliancebqreferenceidupdateComplianceInstanceRecord complianceInstanceRecord) {
    this.complianceInstanceRecord = complianceInstanceRecord;
    return this;
  }

   /**
   * Get complianceInstanceRecord
   * @return complianceInstanceRecord
  **/
  @Schema(description = "")
  public CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidcompliancebqreferenceidupdateComplianceInstanceRecord getComplianceInstanceRecord() {
    return complianceInstanceRecord;
  }

  public void setComplianceInstanceRecord(CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidcompliancebqreferenceidupdateComplianceInstanceRecord complianceInstanceRecord) {
    this.complianceInstanceRecord = complianceInstanceRecord;
  }

  public BQComplianceUpdateInputModel complianceUpdateActionTaskRecord(Object complianceUpdateActionTaskRecord) {
    this.complianceUpdateActionTaskRecord = complianceUpdateActionTaskRecord;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return complianceUpdateActionTaskRecord
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record ")
  public Object getComplianceUpdateActionTaskRecord() {
    return complianceUpdateActionTaskRecord;
  }

  public void setComplianceUpdateActionTaskRecord(Object complianceUpdateActionTaskRecord) {
    this.complianceUpdateActionTaskRecord = complianceUpdateActionTaskRecord;
  }

  public BQComplianceUpdateInputModel complianceUpdateActionRequest(String complianceUpdateActionRequest) {
    this.complianceUpdateActionRequest = complianceUpdateActionRequest;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return complianceUpdateActionRequest
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request ")
  public String getComplianceUpdateActionRequest() {
    return complianceUpdateActionRequest;
  }

  public void setComplianceUpdateActionRequest(String complianceUpdateActionRequest) {
    this.complianceUpdateActionRequest = complianceUpdateActionRequest;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQComplianceUpdateInputModel bqComplianceUpdateInputModel = (BQComplianceUpdateInputModel) o;
    return Objects.equals(this.customerOfferProcedureInstanceRecord, bqComplianceUpdateInputModel.customerOfferProcedureInstanceRecord) &&
        Objects.equals(this.customerOfferProcedureInstanceReference, bqComplianceUpdateInputModel.customerOfferProcedureInstanceReference) &&
        Objects.equals(this.complianceInstanceReference, bqComplianceUpdateInputModel.complianceInstanceReference) &&
        Objects.equals(this.complianceInstanceRecord, bqComplianceUpdateInputModel.complianceInstanceRecord) &&
        Objects.equals(this.complianceUpdateActionTaskRecord, bqComplianceUpdateInputModel.complianceUpdateActionTaskRecord) &&
        Objects.equals(this.complianceUpdateActionRequest, bqComplianceUpdateInputModel.complianceUpdateActionRequest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerOfferProcedureInstanceRecord, customerOfferProcedureInstanceReference, complianceInstanceReference, complianceInstanceRecord, complianceUpdateActionTaskRecord, complianceUpdateActionRequest);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQComplianceUpdateInputModel {\n");
    
    sb.append("    customerOfferProcedureInstanceRecord: ").append(toIndentedString(customerOfferProcedureInstanceRecord)).append("\n");
    sb.append("    customerOfferProcedureInstanceReference: ").append(toIndentedString(customerOfferProcedureInstanceReference)).append("\n");
    sb.append("    complianceInstanceReference: ").append(toIndentedString(complianceInstanceReference)).append("\n");
    sb.append("    complianceInstanceRecord: ").append(toIndentedString(complianceInstanceRecord)).append("\n");
    sb.append("    complianceUpdateActionTaskRecord: ").append(toIndentedString(complianceUpdateActionTaskRecord)).append("\n");
    sb.append("    complianceUpdateActionRequest: ").append(toIndentedString(complianceUpdateActionRequest)).append("\n");
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
