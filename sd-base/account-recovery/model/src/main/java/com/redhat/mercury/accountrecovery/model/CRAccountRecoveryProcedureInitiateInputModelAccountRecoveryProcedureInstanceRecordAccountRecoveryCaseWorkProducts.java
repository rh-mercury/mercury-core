/*
 * Account Recovery
 * This service domain handles the restructuring of a distressed account (loan) after standard recovery
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.redhat.mercury.accountrecovery.model;

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
 * CRAccountRecoveryProcedureInitiateInputModelAccountRecoveryProcedureInstanceRecordAccountRecoveryCaseWorkProducts
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-06-07T18:27:41.474305+02:00[Europe/Madrid]")
public class CRAccountRecoveryProcedureInitiateInputModelAccountRecoveryProcedureInstanceRecordAccountRecoveryCaseWorkProducts {
  @SerializedName("documentReference")
  private String documentReference = null;

  @SerializedName("customerCommentary")
  private String customerCommentary = null;

  public CRAccountRecoveryProcedureInitiateInputModelAccountRecoveryProcedureInstanceRecordAccountRecoveryCaseWorkProducts documentReference(String documentReference) {
    this.documentReference = documentReference;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to documents referenced and generated through the case 
   * @return documentReference
  **/
  @Schema(example = "735748", description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to documents referenced and generated through the case ")
  public String getDocumentReference() {
    return documentReference;
  }

  public void setDocumentReference(String documentReference) {
    this.documentReference = documentReference;
  }

  public CRAccountRecoveryProcedureInitiateInputModelAccountRecoveryProcedureInstanceRecordAccountRecoveryCaseWorkProducts customerCommentary(String customerCommentary) {
    this.customerCommentary = customerCommentary;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Record of customer correspondence/feedback associated with the account recovery process 
   * @return customerCommentary
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Record of customer correspondence/feedback associated with the account recovery process ")
  public String getCustomerCommentary() {
    return customerCommentary;
  }

  public void setCustomerCommentary(String customerCommentary) {
    this.customerCommentary = customerCommentary;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CRAccountRecoveryProcedureInitiateInputModelAccountRecoveryProcedureInstanceRecordAccountRecoveryCaseWorkProducts crAccountRecoveryProcedureInitiateInputModelAccountRecoveryProcedureInstanceRecordAccountRecoveryCaseWorkProducts = (CRAccountRecoveryProcedureInitiateInputModelAccountRecoveryProcedureInstanceRecordAccountRecoveryCaseWorkProducts) o;
    return Objects.equals(this.documentReference, crAccountRecoveryProcedureInitiateInputModelAccountRecoveryProcedureInstanceRecordAccountRecoveryCaseWorkProducts.documentReference) &&
        Objects.equals(this.customerCommentary, crAccountRecoveryProcedureInitiateInputModelAccountRecoveryProcedureInstanceRecordAccountRecoveryCaseWorkProducts.customerCommentary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentReference, customerCommentary);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CRAccountRecoveryProcedureInitiateInputModelAccountRecoveryProcedureInstanceRecordAccountRecoveryCaseWorkProducts {\n");
    
    sb.append("    documentReference: ").append(toIndentedString(documentReference)).append("\n");
    sb.append("    customerCommentary: ").append(toIndentedString(customerCommentary)).append("\n");
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
