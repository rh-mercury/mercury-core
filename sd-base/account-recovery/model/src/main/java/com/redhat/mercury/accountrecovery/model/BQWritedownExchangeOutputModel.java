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
 * BQWritedownExchangeOutputModel
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-06-07T18:27:41.474305+02:00[Europe/Madrid]")
public class BQWritedownExchangeOutputModel {
  @SerializedName("writedownExchangeActionTaskReference")
  private String writedownExchangeActionTaskReference = null;

  @SerializedName("writedownExchangeActionTaskRecord")
  private Object writedownExchangeActionTaskRecord = null;

  @SerializedName("writedownExchangeActionResponse")
  private String writedownExchangeActionResponse = null;

  @SerializedName("writedownInstanceStatus")
  private String writedownInstanceStatus = null;

  public BQWritedownExchangeOutputModel writedownExchangeActionTaskReference(String writedownExchangeActionTaskReference) {
    this.writedownExchangeActionTaskReference = writedownExchangeActionTaskReference;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Writedown instance exchange service call 
   * @return writedownExchangeActionTaskReference
  **/
  @Schema(example = "WEATR707642", description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Writedown instance exchange service call ")
  public String getWritedownExchangeActionTaskReference() {
    return writedownExchangeActionTaskReference;
  }

  public void setWritedownExchangeActionTaskReference(String writedownExchangeActionTaskReference) {
    this.writedownExchangeActionTaskReference = writedownExchangeActionTaskReference;
  }

  public BQWritedownExchangeOutputModel writedownExchangeActionTaskRecord(Object writedownExchangeActionTaskRecord) {
    this.writedownExchangeActionTaskRecord = writedownExchangeActionTaskRecord;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return writedownExchangeActionTaskRecord
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record ")
  public Object getWritedownExchangeActionTaskRecord() {
    return writedownExchangeActionTaskRecord;
  }

  public void setWritedownExchangeActionTaskRecord(Object writedownExchangeActionTaskRecord) {
    this.writedownExchangeActionTaskRecord = writedownExchangeActionTaskRecord;
  }

  public BQWritedownExchangeOutputModel writedownExchangeActionResponse(String writedownExchangeActionResponse) {
    this.writedownExchangeActionResponse = writedownExchangeActionResponse;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return writedownExchangeActionResponse
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response ")
  public String getWritedownExchangeActionResponse() {
    return writedownExchangeActionResponse;
  }

  public void setWritedownExchangeActionResponse(String writedownExchangeActionResponse) {
    this.writedownExchangeActionResponse = writedownExchangeActionResponse;
  }

  public BQWritedownExchangeOutputModel writedownInstanceStatus(String writedownInstanceStatus) {
    this.writedownInstanceStatus = writedownInstanceStatus;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Writedown instance (e.g. accepted, rejected, verified) 
   * @return writedownInstanceStatus
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Writedown instance (e.g. accepted, rejected, verified) ")
  public String getWritedownInstanceStatus() {
    return writedownInstanceStatus;
  }

  public void setWritedownInstanceStatus(String writedownInstanceStatus) {
    this.writedownInstanceStatus = writedownInstanceStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQWritedownExchangeOutputModel bqWritedownExchangeOutputModel = (BQWritedownExchangeOutputModel) o;
    return Objects.equals(this.writedownExchangeActionTaskReference, bqWritedownExchangeOutputModel.writedownExchangeActionTaskReference) &&
        Objects.equals(this.writedownExchangeActionTaskRecord, bqWritedownExchangeOutputModel.writedownExchangeActionTaskRecord) &&
        Objects.equals(this.writedownExchangeActionResponse, bqWritedownExchangeOutputModel.writedownExchangeActionResponse) &&
        Objects.equals(this.writedownInstanceStatus, bqWritedownExchangeOutputModel.writedownInstanceStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(writedownExchangeActionTaskReference, writedownExchangeActionTaskRecord, writedownExchangeActionResponse, writedownInstanceStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQWritedownExchangeOutputModel {\n");
    
    sb.append("    writedownExchangeActionTaskReference: ").append(toIndentedString(writedownExchangeActionTaskReference)).append("\n");
    sb.append("    writedownExchangeActionTaskRecord: ").append(toIndentedString(writedownExchangeActionTaskRecord)).append("\n");
    sb.append("    writedownExchangeActionResponse: ").append(toIndentedString(writedownExchangeActionResponse)).append("\n");
    sb.append("    writedownInstanceStatus: ").append(toIndentedString(writedownInstanceStatus)).append("\n");
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
