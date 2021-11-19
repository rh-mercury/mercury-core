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
import com.redhat.mercury.customeroffer.model.BQAuditRetrieveOutputModelCustomerOfferProcedureInstanceRecord1CustomerOfferProcessingTask;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * BQAuditRetrieveOutputModelCustomerOfferProcedureInstanceRecord
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-11-19T11:10:08.827631+01:00[Europe/Madrid]")
public class BQAuditRetrieveOutputModelCustomerOfferProcedureInstanceRecord {
  @SerializedName("customerReference")
  private String customerReference = null;

  @SerializedName("partyReference")
  private String partyReference = null;

  @SerializedName("productServiceType")
  private String productServiceType = null;

  @SerializedName("customerOfferProcessingSchedule")
  private String customerOfferProcessingSchedule = null;

  @SerializedName("customerOfferProcessingTask")
  private BQAuditRetrieveOutputModelCustomerOfferProcedureInstanceRecord1CustomerOfferProcessingTask customerOfferProcessingTask = null;

  public BQAuditRetrieveOutputModelCustomerOfferProcedureInstanceRecord customerReference(String customerReference) {
    this.customerReference = customerReference;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the associated customer (can currently be a person or a company) 
   * @return customerReference
  **/
  @Schema(example = "753821", description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the associated customer (can currently be a person or a company) ")
  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }

  public BQAuditRetrieveOutputModelCustomerOfferProcedureInstanceRecord partyReference(String partyReference) {
    this.partyReference = partyReference;
    return this;
  }

   /**
   * &#x60;status: Registered&#x60;  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FNqJt8TGEeChad0JzLk7QA_-1317971633  bian-reference: Party  general-info: Reference to the legal entity (typically the customer) 
   * @return partyReference
  **/
  @Schema(example = "793767", description = "`status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FNqJt8TGEeChad0JzLk7QA_-1317971633  bian-reference: Party  general-info: Reference to the legal entity (typically the customer) ")
  public String getPartyReference() {
    return partyReference;
  }

  public void setPartyReference(String partyReference) {
    this.partyReference = partyReference;
  }

  public BQAuditRetrieveOutputModelCustomerOfferProcedureInstanceRecord productServiceType(String productServiceType) {
    this.productServiceType = productServiceType;
    return this;
  }

   /**
   * &#x60;status: Registered&#x60;  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FY1e9cTGEeChad0JzLk7QA_-1288627304  bian-reference: BankingProduct  general-info: The type of product or service that is being offered 
   * @return productServiceType
  **/
  @Schema(description = "`status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FY1e9cTGEeChad0JzLk7QA_-1288627304  bian-reference: BankingProduct  general-info: The type of product or service that is being offered ")
  public String getProductServiceType() {
    return productServiceType;
  }

  public void setProductServiceType(String productServiceType) {
    this.productServiceType = productServiceType;
  }

  public BQAuditRetrieveOutputModelCustomerOfferProcedureInstanceRecord customerOfferProcessingSchedule(String customerOfferProcessingSchedule) {
    this.customerOfferProcessingSchedule = customerOfferProcessingSchedule;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines scheduled update/review tasks covering all tracked properties 
   * @return customerOfferProcessingSchedule
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines scheduled update/review tasks covering all tracked properties ")
  public String getCustomerOfferProcessingSchedule() {
    return customerOfferProcessingSchedule;
  }

  public void setCustomerOfferProcessingSchedule(String customerOfferProcessingSchedule) {
    this.customerOfferProcessingSchedule = customerOfferProcessingSchedule;
  }

  public BQAuditRetrieveOutputModelCustomerOfferProcedureInstanceRecord customerOfferProcessingTask(BQAuditRetrieveOutputModelCustomerOfferProcedureInstanceRecord1CustomerOfferProcessingTask customerOfferProcessingTask) {
    this.customerOfferProcessingTask = customerOfferProcessingTask;
    return this;
  }

   /**
   * Get customerOfferProcessingTask
   * @return customerOfferProcessingTask
  **/
  @Schema(description = "")
  public BQAuditRetrieveOutputModelCustomerOfferProcedureInstanceRecord1CustomerOfferProcessingTask getCustomerOfferProcessingTask() {
    return customerOfferProcessingTask;
  }

  public void setCustomerOfferProcessingTask(BQAuditRetrieveOutputModelCustomerOfferProcedureInstanceRecord1CustomerOfferProcessingTask customerOfferProcessingTask) {
    this.customerOfferProcessingTask = customerOfferProcessingTask;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQAuditRetrieveOutputModelCustomerOfferProcedureInstanceRecord bqAuditRetrieveOutputModelCustomerOfferProcedureInstanceRecord = (BQAuditRetrieveOutputModelCustomerOfferProcedureInstanceRecord) o;
    return Objects.equals(this.customerReference, bqAuditRetrieveOutputModelCustomerOfferProcedureInstanceRecord.customerReference) &&
        Objects.equals(this.partyReference, bqAuditRetrieveOutputModelCustomerOfferProcedureInstanceRecord.partyReference) &&
        Objects.equals(this.productServiceType, bqAuditRetrieveOutputModelCustomerOfferProcedureInstanceRecord.productServiceType) &&
        Objects.equals(this.customerOfferProcessingSchedule, bqAuditRetrieveOutputModelCustomerOfferProcedureInstanceRecord.customerOfferProcessingSchedule) &&
        Objects.equals(this.customerOfferProcessingTask, bqAuditRetrieveOutputModelCustomerOfferProcedureInstanceRecord.customerOfferProcessingTask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerReference, partyReference, productServiceType, customerOfferProcessingSchedule, customerOfferProcessingTask);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQAuditRetrieveOutputModelCustomerOfferProcedureInstanceRecord {\n");
    
    sb.append("    customerReference: ").append(toIndentedString(customerReference)).append("\n");
    sb.append("    partyReference: ").append(toIndentedString(partyReference)).append("\n");
    sb.append("    productServiceType: ").append(toIndentedString(productServiceType)).append("\n");
    sb.append("    customerOfferProcessingSchedule: ").append(toIndentedString(customerOfferProcessingSchedule)).append("\n");
    sb.append("    customerOfferProcessingTask: ").append(toIndentedString(customerOfferProcessingTask)).append("\n");
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
