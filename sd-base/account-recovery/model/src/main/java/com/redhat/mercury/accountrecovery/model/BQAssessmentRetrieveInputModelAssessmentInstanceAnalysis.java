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
 * BQAssessmentRetrieveInputModelAssessmentInstanceAnalysis
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-06-07T18:27:41.474305+02:00[Europe/Madrid]")
public class BQAssessmentRetrieveInputModelAssessmentInstanceAnalysis {
  @SerializedName("assessmentInstanceAnalysisReference")
  private String assessmentInstanceAnalysisReference = null;

  public BQAssessmentRetrieveInputModelAssessmentInstanceAnalysis assessmentInstanceAnalysisReference(String assessmentInstanceAnalysisReference) {
    this.assessmentInstanceAnalysisReference = assessmentInstanceAnalysisReference;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return assessmentInstanceAnalysisReference
  **/
  @Schema(example = "787850", description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view ")
  public String getAssessmentInstanceAnalysisReference() {
    return assessmentInstanceAnalysisReference;
  }

  public void setAssessmentInstanceAnalysisReference(String assessmentInstanceAnalysisReference) {
    this.assessmentInstanceAnalysisReference = assessmentInstanceAnalysisReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQAssessmentRetrieveInputModelAssessmentInstanceAnalysis bqAssessmentRetrieveInputModelAssessmentInstanceAnalysis = (BQAssessmentRetrieveInputModelAssessmentInstanceAnalysis) o;
    return Objects.equals(this.assessmentInstanceAnalysisReference, bqAssessmentRetrieveInputModelAssessmentInstanceAnalysis.assessmentInstanceAnalysisReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assessmentInstanceAnalysisReference);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQAssessmentRetrieveInputModelAssessmentInstanceAnalysis {\n");
    
    sb.append("    assessmentInstanceAnalysisReference: ").append(toIndentedString(assessmentInstanceAnalysisReference)).append("\n");
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
