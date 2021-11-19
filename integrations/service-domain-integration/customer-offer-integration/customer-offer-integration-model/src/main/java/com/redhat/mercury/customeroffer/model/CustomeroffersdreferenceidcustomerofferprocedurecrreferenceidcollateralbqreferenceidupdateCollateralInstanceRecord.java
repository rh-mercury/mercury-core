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
 * CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidcollateralbqreferenceidupdateCollateralInstanceRecord
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-11-19T11:10:08.827631+01:00[Europe/Madrid]")
public class CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidcollateralbqreferenceidupdateCollateralInstanceRecord {
  @SerializedName("collateralRequirement")
  private String collateralRequirement = null;

  @SerializedName("collateralEarmarkReference")
  private String collateralEarmarkReference = null;

  @SerializedName("collateralAssetAllocationInstanceRecord")
  private Object collateralAssetAllocationInstanceRecord = null;

  @SerializedName("collateralAssetReference")
  private String collateralAssetReference = null;

  public CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidcollateralbqreferenceidupdateCollateralInstanceRecord collateralRequirement(String collateralRequirement) {
    this.collateralRequirement = collateralRequirement;
    return this;
  }

   /**
   * &#x60;status: Registered&#x60;  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FLlGEcTGEeChad0JzLk7QA_1826831344/elements/_FLlGE8TGEeChad0JzLk7QA_-1191802314  bian-reference: CollateralAgreement.CollateralArrangement.CollateralAmount  general-info: The required collateral amount for the offer 
   * @return collateralRequirement
  **/
  @Schema(description = "`status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FLlGEcTGEeChad0JzLk7QA_1826831344/elements/_FLlGE8TGEeChad0JzLk7QA_-1191802314  bian-reference: CollateralAgreement.CollateralArrangement.CollateralAmount  general-info: The required collateral amount for the offer ")
  public String getCollateralRequirement() {
    return collateralRequirement;
  }

  public void setCollateralRequirement(String collateralRequirement) {
    this.collateralRequirement = collateralRequirement;
  }

  public CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidcollateralbqreferenceidupdateCollateralInstanceRecord collateralEarmarkReference(String collateralEarmarkReference) {
    this.collateralEarmarkReference = collateralEarmarkReference;
    return this;
  }

   /**
   * &#x60;status: Registered&#x60;  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FLlGEcTGEeChad0JzLk7QA_1826831344  bian-reference: CollateralAgreement.CollateralArrangement.PaymentWarrantyArrangement  general-info: Reference to earmarked collateral during the offer procedure 
   * @return collateralEarmarkReference
  **/
  @Schema(example = "767541", description = "`status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FLlGEcTGEeChad0JzLk7QA_1826831344  bian-reference: CollateralAgreement.CollateralArrangement.PaymentWarrantyArrangement  general-info: Reference to earmarked collateral during the offer procedure ")
  public String getCollateralEarmarkReference() {
    return collateralEarmarkReference;
  }

  public void setCollateralEarmarkReference(String collateralEarmarkReference) {
    this.collateralEarmarkReference = collateralEarmarkReference;
  }

  public CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidcollateralbqreferenceidupdateCollateralInstanceRecord collateralAssetAllocationInstanceRecord(Object collateralAssetAllocationInstanceRecord) {
    this.collateralAssetAllocationInstanceRecord = collateralAssetAllocationInstanceRecord;
    return this;
  }

   /**
   * &#x60;status: Registered&#x60;  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FLlGEcTGEeChad0JzLk7QA_1826831345  bian-reference: CollateralAgreement.CollateralArrangement.CollateralAsset. CollateralAssetAllocation  general-info: Reference to the allocated collateral 
   * @return collateralAssetAllocationInstanceRecord
  **/
  @Schema(description = "`status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FLlGEcTGEeChad0JzLk7QA_1826831345  bian-reference: CollateralAgreement.CollateralArrangement.CollateralAsset. CollateralAssetAllocation  general-info: Reference to the allocated collateral ")
  public Object getCollateralAssetAllocationInstanceRecord() {
    return collateralAssetAllocationInstanceRecord;
  }

  public void setCollateralAssetAllocationInstanceRecord(Object collateralAssetAllocationInstanceRecord) {
    this.collateralAssetAllocationInstanceRecord = collateralAssetAllocationInstanceRecord;
  }

  public CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidcollateralbqreferenceidupdateCollateralInstanceRecord collateralAssetReference(String collateralAssetReference) {
    this.collateralAssetReference = collateralAssetReference;
    return this;
  }

   /**
   * &#x60;status: Registered&#x60;  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FLlGEcTGEeChad0JzLk7QA_1826831344/elements/_2rpAYbbpEeG8PZlPAY1QrA_1766124127  bian-reference: CollateralAgreement.CollateralArrangement.CollateralAsset  general-info: Reference to the related collateral asset (e.g. property) 
   * @return collateralAssetReference
  **/
  @Schema(example = "796658", description = "`status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FLlGEcTGEeChad0JzLk7QA_1826831344/elements/_2rpAYbbpEeG8PZlPAY1QrA_1766124127  bian-reference: CollateralAgreement.CollateralArrangement.CollateralAsset  general-info: Reference to the related collateral asset (e.g. property) ")
  public String getCollateralAssetReference() {
    return collateralAssetReference;
  }

  public void setCollateralAssetReference(String collateralAssetReference) {
    this.collateralAssetReference = collateralAssetReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidcollateralbqreferenceidupdateCollateralInstanceRecord customeroffersdreferenceidcustomerofferprocedurecrreferenceidcollateralbqreferenceidupdateCollateralInstanceRecord = (CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidcollateralbqreferenceidupdateCollateralInstanceRecord) o;
    return Objects.equals(this.collateralRequirement, customeroffersdreferenceidcustomerofferprocedurecrreferenceidcollateralbqreferenceidupdateCollateralInstanceRecord.collateralRequirement) &&
        Objects.equals(this.collateralEarmarkReference, customeroffersdreferenceidcustomerofferprocedurecrreferenceidcollateralbqreferenceidupdateCollateralInstanceRecord.collateralEarmarkReference) &&
        Objects.equals(this.collateralAssetAllocationInstanceRecord, customeroffersdreferenceidcustomerofferprocedurecrreferenceidcollateralbqreferenceidupdateCollateralInstanceRecord.collateralAssetAllocationInstanceRecord) &&
        Objects.equals(this.collateralAssetReference, customeroffersdreferenceidcustomerofferprocedurecrreferenceidcollateralbqreferenceidupdateCollateralInstanceRecord.collateralAssetReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(collateralRequirement, collateralEarmarkReference, collateralAssetAllocationInstanceRecord, collateralAssetReference);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidcollateralbqreferenceidupdateCollateralInstanceRecord {\n");
    
    sb.append("    collateralRequirement: ").append(toIndentedString(collateralRequirement)).append("\n");
    sb.append("    collateralEarmarkReference: ").append(toIndentedString(collateralEarmarkReference)).append("\n");
    sb.append("    collateralAssetAllocationInstanceRecord: ").append(toIndentedString(collateralAssetAllocationInstanceRecord)).append("\n");
    sb.append("    collateralAssetReference: ").append(toIndentedString(collateralAssetReference)).append("\n");
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
