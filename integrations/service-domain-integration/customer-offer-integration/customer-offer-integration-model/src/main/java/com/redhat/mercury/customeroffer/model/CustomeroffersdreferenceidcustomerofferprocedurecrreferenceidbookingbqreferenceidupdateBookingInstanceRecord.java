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
 * CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidbookingbqreferenceidupdateBookingInstanceRecord
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-11-19T11:10:08.827631+01:00[Europe/Madrid]")
public class CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidbookingbqreferenceidupdateBookingInstanceRecord {
  @SerializedName("businessUnitReference")
  private String businessUnitReference = null;

  @SerializedName("assetLiabilityType")
  private String assetLiabilityType = null;

  @SerializedName("amount")
  private String amount = null;

  public CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidbookingbqreferenceidupdateBookingInstanceRecord businessUnitReference(String businessUnitReference) {
    this.businessUnitReference = businessUnitReference;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Defines the booking entity 
   * @return businessUnitReference
  **/
  @Schema(example = "757280", description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Defines the booking entity ")
  public String getBusinessUnitReference() {
    return businessUnitReference;
  }

  public void setBusinessUnitReference(String businessUnitReference) {
    this.businessUnitReference = businessUnitReference;
  }

  public CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidbookingbqreferenceidupdateBookingInstanceRecord assetLiabilityType(String assetLiabilityType) {
    this.assetLiabilityType = assetLiabilityType;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines the booking rules (e.g. booking value ratios) 
   * @return assetLiabilityType
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines the booking rules (e.g. booking value ratios) ")
  public String getAssetLiabilityType() {
    return assetLiabilityType;
  }

  public void setAssetLiabilityType(String assetLiabilityType) {
    this.assetLiabilityType = assetLiabilityType;
  }

  public CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidbookingbqreferenceidupdateBookingInstanceRecord amount(String amount) {
    this.amount = amount;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount  general-info: The principle amount for booking 
   * @return amount
  **/
  @Schema(example = "USD 250", description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount  general-info: The principle amount for booking ")
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidbookingbqreferenceidupdateBookingInstanceRecord customeroffersdreferenceidcustomerofferprocedurecrreferenceidbookingbqreferenceidupdateBookingInstanceRecord = (CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidbookingbqreferenceidupdateBookingInstanceRecord) o;
    return Objects.equals(this.businessUnitReference, customeroffersdreferenceidcustomerofferprocedurecrreferenceidbookingbqreferenceidupdateBookingInstanceRecord.businessUnitReference) &&
        Objects.equals(this.assetLiabilityType, customeroffersdreferenceidcustomerofferprocedurecrreferenceidbookingbqreferenceidupdateBookingInstanceRecord.assetLiabilityType) &&
        Objects.equals(this.amount, customeroffersdreferenceidcustomerofferprocedurecrreferenceidbookingbqreferenceidupdateBookingInstanceRecord.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessUnitReference, assetLiabilityType, amount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidbookingbqreferenceidupdateBookingInstanceRecord {\n");
    
    sb.append("    businessUnitReference: ").append(toIndentedString(businessUnitReference)).append("\n");
    sb.append("    assetLiabilityType: ").append(toIndentedString(assetLiabilityType)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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
