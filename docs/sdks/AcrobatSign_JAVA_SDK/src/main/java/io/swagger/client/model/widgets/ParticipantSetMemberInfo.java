/**
*  Copyright 2019 Adobe Systems Incorporated. All rights reserved.
*  This file is licensed to you under the Apache License, Version 2.0 (the "License");
*  you may not use this file except in compliance with the License. You may obtain a copy
*  of the License at http://www.apache.org/licenses/LICENSE-2.0
*
*  Unless required by applicable law or agreed to in writing, software distributed under
*  the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR REPRESENTATIONS
*  OF ANY KIND, either express or implied. See the License for the specific language
*  governing permissions and limitations under the License.
*
*
**/


/*
 * 
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 6.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model.widgets;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.widgets.ParticipantSecurityOption;
import java.io.IOException;

/**
 * ParticipantSetMemberInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-11T15:50:01.583+05:30")
public class ParticipantSetMemberInfo {
  @SerializedName("email")
  private String email = null;

  @SerializedName("securityOption")
  private ParticipantSecurityOption securityOption = null;

  public ParticipantSetMemberInfo email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Email of the participant
   * @return email
  **/
  @ApiModelProperty(value = "Email of the participant")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public ParticipantSetMemberInfo securityOption(ParticipantSecurityOption securityOption) {
    this.securityOption = securityOption;
    return this;
  }

   /**
   * Security options that apply to the participant
   * @return securityOption
  **/
  @ApiModelProperty(value = "Security options that apply to the participant")
  public ParticipantSecurityOption getSecurityOption() {
    return securityOption;
  }

  public void setSecurityOption(ParticipantSecurityOption securityOption) {
    this.securityOption = securityOption;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParticipantSetMemberInfo participantSetMemberInfo = (ParticipantSetMemberInfo) o;
    return Objects.equals(this.email, participantSetMemberInfo.email) &&
        Objects.equals(this.securityOption, participantSetMemberInfo.securityOption);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, securityOption);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParticipantSetMemberInfo {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    securityOption: ").append(toIndentedString(securityOption)).append("\n");
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

