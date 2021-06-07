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
 * BQNegotiationUpdateOutputModel
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-06-07T18:27:41.474305+02:00[Europe/Madrid]")
public class BQNegotiationUpdateOutputModel {
  @SerializedName("negotiationInstanceRecord")
  private Object negotiationInstanceRecord = null;

  @SerializedName("negotiationUpdateActionTaskReference")
  private String negotiationUpdateActionTaskReference = null;

  @SerializedName("negotiationUpdateActionTaskRecord")
  private Object negotiationUpdateActionTaskRecord = null;

  @SerializedName("updateResponseRecord")
  private Object updateResponseRecord = null;

  public BQNegotiationUpdateOutputModel negotiationInstanceRecord(Object negotiationInstanceRecord) {
    this.negotiationInstanceRecord = negotiationInstanceRecord;
    return this;
  }

   /**
   * Get negotiationInstanceRecord
   * @return negotiationInstanceRecord
  **/
  @Schema(description = "")
  public Object getNegotiationInstanceRecord() {
    return negotiationInstanceRecord;
  }

  public void setNegotiationInstanceRecord(Object negotiationInstanceRecord) {
    this.negotiationInstanceRecord = negotiationInstanceRecord;
  }

  public BQNegotiationUpdateOutputModel negotiationUpdateActionTaskReference(String negotiationUpdateActionTaskReference) {
    this.negotiationUpdateActionTaskReference = negotiationUpdateActionTaskReference;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return negotiationUpdateActionTaskReference
  **/
  @Schema(example = "NUATR791287", description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call ")
  public String getNegotiationUpdateActionTaskReference() {
    return negotiationUpdateActionTaskReference;
  }

  public void setNegotiationUpdateActionTaskReference(String negotiationUpdateActionTaskReference) {
    this.negotiationUpdateActionTaskReference = negotiationUpdateActionTaskReference;
  }

  public BQNegotiationUpdateOutputModel negotiationUpdateActionTaskRecord(Object negotiationUpdateActionTaskRecord) {
    this.negotiationUpdateActionTaskRecord = negotiationUpdateActionTaskRecord;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return negotiationUpdateActionTaskRecord
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record ")
  public Object getNegotiationUpdateActionTaskRecord() {
    return negotiationUpdateActionTaskRecord;
  }

  public void setNegotiationUpdateActionTaskRecord(Object negotiationUpdateActionTaskRecord) {
    this.negotiationUpdateActionTaskRecord = negotiationUpdateActionTaskRecord;
  }

  public BQNegotiationUpdateOutputModel updateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response ")
  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQNegotiationUpdateOutputModel bqNegotiationUpdateOutputModel = (BQNegotiationUpdateOutputModel) o;
    return Objects.equals(this.negotiationInstanceRecord, bqNegotiationUpdateOutputModel.negotiationInstanceRecord) &&
        Objects.equals(this.negotiationUpdateActionTaskReference, bqNegotiationUpdateOutputModel.negotiationUpdateActionTaskReference) &&
        Objects.equals(this.negotiationUpdateActionTaskRecord, bqNegotiationUpdateOutputModel.negotiationUpdateActionTaskRecord) &&
        Objects.equals(this.updateResponseRecord, bqNegotiationUpdateOutputModel.updateResponseRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(negotiationInstanceRecord, negotiationUpdateActionTaskReference, negotiationUpdateActionTaskRecord, updateResponseRecord);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQNegotiationUpdateOutputModel {\n");
    
    sb.append("    negotiationInstanceRecord: ").append(toIndentedString(negotiationInstanceRecord)).append("\n");
    sb.append("    negotiationUpdateActionTaskReference: ").append(toIndentedString(negotiationUpdateActionTaskReference)).append("\n");
    sb.append("    negotiationUpdateActionTaskRecord: ").append(toIndentedString(negotiationUpdateActionTaskRecord)).append("\n");
    sb.append("    updateResponseRecord: ").append(toIndentedString(updateResponseRecord)).append("\n");
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
