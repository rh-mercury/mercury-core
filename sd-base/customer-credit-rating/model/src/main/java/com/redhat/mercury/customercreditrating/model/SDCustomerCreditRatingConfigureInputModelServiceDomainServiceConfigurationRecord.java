/*
 * Customer Credit Rating
 * This service domain maintains and administers the bank's credit assessment for customers.
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.redhat.mercury.customercreditrating.model;

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
 * SDCustomerCreditRatingConfigureInputModelServiceDomainServiceConfigurationRecord
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-06-03T16:36:13.702891+02:00[Europe/Madrid]")
public class SDCustomerCreditRatingConfigureInputModelServiceDomainServiceConfigurationRecord {
  @SerializedName("serviceDomainServiceConfigurationSettingReference")
  private String serviceDomainServiceConfigurationSettingReference = null;

  @SerializedName("serviceDomainServiceConfigurationSettingType")
  private String serviceDomainServiceConfigurationSettingType = null;

  @SerializedName("serviceDomainServiceConfigurationSetup")
  private Object serviceDomainServiceConfigurationSetup = null;

  @SerializedName("serviceDomainServiceSubscription")
  private Object serviceDomainServiceSubscription = null;

  @SerializedName("serviceDomainServiceAgreement")
  private Object serviceDomainServiceAgreement = null;

  public SDCustomerCreditRatingConfigureInputModelServiceDomainServiceConfigurationRecord serviceDomainServiceConfigurationSettingReference(String serviceDomainServiceConfigurationSettingReference) {
    this.serviceDomainServiceConfigurationSettingReference = serviceDomainServiceConfigurationSettingReference;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Refers to the service configuration parameter for the service 
   * @return serviceDomainServiceConfigurationSettingReference
  **/
  @Schema(example = "710630", description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Refers to the service configuration parameter for the service ")
  public String getServiceDomainServiceConfigurationSettingReference() {
    return serviceDomainServiceConfigurationSettingReference;
  }

  public void setServiceDomainServiceConfigurationSettingReference(String serviceDomainServiceConfigurationSettingReference) {
    this.serviceDomainServiceConfigurationSettingReference = serviceDomainServiceConfigurationSettingReference;
  }

  public SDCustomerCreditRatingConfigureInputModelServiceDomainServiceConfigurationRecord serviceDomainServiceConfigurationSettingType(String serviceDomainServiceConfigurationSettingType) {
    this.serviceDomainServiceConfigurationSettingType = serviceDomainServiceConfigurationSettingType;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of service configuration parameter 
   * @return serviceDomainServiceConfigurationSettingType
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of service configuration parameter ")
  public String getServiceDomainServiceConfigurationSettingType() {
    return serviceDomainServiceConfigurationSettingType;
  }

  public void setServiceDomainServiceConfigurationSettingType(String serviceDomainServiceConfigurationSettingType) {
    this.serviceDomainServiceConfigurationSettingType = serviceDomainServiceConfigurationSettingType;
  }

  public SDCustomerCreditRatingConfigureInputModelServiceDomainServiceConfigurationRecord serviceDomainServiceConfigurationSetup(Object serviceDomainServiceConfigurationSetup) {
    this.serviceDomainServiceConfigurationSetup = serviceDomainServiceConfigurationSetup;
    return this;
  }

   /**
   * Get serviceDomainServiceConfigurationSetup
   * @return serviceDomainServiceConfigurationSetup
  **/
  @Schema(description = "")
  public Object getServiceDomainServiceConfigurationSetup() {
    return serviceDomainServiceConfigurationSetup;
  }

  public void setServiceDomainServiceConfigurationSetup(Object serviceDomainServiceConfigurationSetup) {
    this.serviceDomainServiceConfigurationSetup = serviceDomainServiceConfigurationSetup;
  }

  public SDCustomerCreditRatingConfigureInputModelServiceDomainServiceConfigurationRecord serviceDomainServiceSubscription(Object serviceDomainServiceSubscription) {
    this.serviceDomainServiceSubscription = serviceDomainServiceSubscription;
    return this;
  }

   /**
   * Get serviceDomainServiceSubscription
   * @return serviceDomainServiceSubscription
  **/
  @Schema(description = "")
  public Object getServiceDomainServiceSubscription() {
    return serviceDomainServiceSubscription;
  }

  public void setServiceDomainServiceSubscription(Object serviceDomainServiceSubscription) {
    this.serviceDomainServiceSubscription = serviceDomainServiceSubscription;
  }

  public SDCustomerCreditRatingConfigureInputModelServiceDomainServiceConfigurationRecord serviceDomainServiceAgreement(Object serviceDomainServiceAgreement) {
    this.serviceDomainServiceAgreement = serviceDomainServiceAgreement;
    return this;
  }

   /**
   * Get serviceDomainServiceAgreement
   * @return serviceDomainServiceAgreement
  **/
  @Schema(description = "")
  public Object getServiceDomainServiceAgreement() {
    return serviceDomainServiceAgreement;
  }

  public void setServiceDomainServiceAgreement(Object serviceDomainServiceAgreement) {
    this.serviceDomainServiceAgreement = serviceDomainServiceAgreement;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SDCustomerCreditRatingConfigureInputModelServiceDomainServiceConfigurationRecord sdCustomerCreditRatingConfigureInputModelServiceDomainServiceConfigurationRecord = (SDCustomerCreditRatingConfigureInputModelServiceDomainServiceConfigurationRecord) o;
    return Objects.equals(this.serviceDomainServiceConfigurationSettingReference, sdCustomerCreditRatingConfigureInputModelServiceDomainServiceConfigurationRecord.serviceDomainServiceConfigurationSettingReference) &&
        Objects.equals(this.serviceDomainServiceConfigurationSettingType, sdCustomerCreditRatingConfigureInputModelServiceDomainServiceConfigurationRecord.serviceDomainServiceConfigurationSettingType) &&
        Objects.equals(this.serviceDomainServiceConfigurationSetup, sdCustomerCreditRatingConfigureInputModelServiceDomainServiceConfigurationRecord.serviceDomainServiceConfigurationSetup) &&
        Objects.equals(this.serviceDomainServiceSubscription, sdCustomerCreditRatingConfigureInputModelServiceDomainServiceConfigurationRecord.serviceDomainServiceSubscription) &&
        Objects.equals(this.serviceDomainServiceAgreement, sdCustomerCreditRatingConfigureInputModelServiceDomainServiceConfigurationRecord.serviceDomainServiceAgreement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceDomainServiceConfigurationSettingReference, serviceDomainServiceConfigurationSettingType, serviceDomainServiceConfigurationSetup, serviceDomainServiceSubscription, serviceDomainServiceAgreement);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SDCustomerCreditRatingConfigureInputModelServiceDomainServiceConfigurationRecord {\n");
    
    sb.append("    serviceDomainServiceConfigurationSettingReference: ").append(toIndentedString(serviceDomainServiceConfigurationSettingReference)).append("\n");
    sb.append("    serviceDomainServiceConfigurationSettingType: ").append(toIndentedString(serviceDomainServiceConfigurationSettingType)).append("\n");
    sb.append("    serviceDomainServiceConfigurationSetup: ").append(toIndentedString(serviceDomainServiceConfigurationSetup)).append("\n");
    sb.append("    serviceDomainServiceSubscription: ").append(toIndentedString(serviceDomainServiceSubscription)).append("\n");
    sb.append("    serviceDomainServiceAgreement: ").append(toIndentedString(serviceDomainServiceAgreement)).append("\n");
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
