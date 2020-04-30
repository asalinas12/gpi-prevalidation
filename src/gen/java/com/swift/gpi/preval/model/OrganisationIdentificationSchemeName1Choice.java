/*
 * Beneficiary account pre-validation for SDK consumers
 * Move your app forward with the account pre-validation API.
 *
 * OpenAPI spec version: 1.0.7-oas3-sdk
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.swift.gpi.preval.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import javax.validation.constraints.*;

/**
 * Sets of elements to identify a name of the organisation identification scheme.
 */
@Schema(description = "Sets of elements to identify a name of the organisation identification scheme.")
public class OrganisationIdentificationSchemeName1Choice   {
  @JsonProperty("code")
  private String code = null;

  @JsonProperty("proprietary")
  private String proprietary = null;

  public OrganisationIdentificationSchemeName1Choice code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
   **/
  @JsonProperty("code")
  @Schema(description = "")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public OrganisationIdentificationSchemeName1Choice proprietary(String proprietary) {
    this.proprietary = proprietary;
    return this;
  }

  /**
   * Get proprietary
   * @return proprietary
   **/
  @JsonProperty("proprietary")
  @Schema(description = "")
 @Size(min=1,max=35)  public String getProprietary() {
    return proprietary;
  }

  public void setProprietary(String proprietary) {
    this.proprietary = proprietary;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganisationIdentificationSchemeName1Choice organisationIdentificationSchemeName1Choice = (OrganisationIdentificationSchemeName1Choice) o;
    return Objects.equals(this.code, organisationIdentificationSchemeName1Choice.code) &&
        Objects.equals(this.proprietary, organisationIdentificationSchemeName1Choice.proprietary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, proprietary);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganisationIdentificationSchemeName1Choice {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    proprietary: ").append(toIndentedString(proprietary)).append("\n");
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
