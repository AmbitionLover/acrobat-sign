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


package io.swagger.client.model.agreements;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.agreements.CommonViewConfiguration;
import io.swagger.client.model.agreements.ComposeViewConfiguration;
import java.io.IOException;

/**
 * AgreementViewInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-11T15:48:52.659+05:30")
public class AgreementViewInfo {
  @SerializedName("commonViewConfiguration")
  private CommonViewConfiguration commonViewConfiguration = null;

  @SerializedName("composeViewConfiguration")
  private ComposeViewConfiguration composeViewConfiguration = null;

  /**
   * Name of the requested agreement view
   */
  @JsonAdapter(NameEnum.Adapter.class)
  public enum NameEnum {
    COMPOSE("COMPOSE"),
    
    MODIFY("MODIFY"),
    
    PREFILL("PREFILL"),
    
    AUTHORING("AUTHORING"),
    
    SEND_PROGRESS("SEND_PROGRESS"),
    
    POST_CREATE("POST_CREATE"),
    
    DOCUMENT("DOCUMENT"),
    
    MANAGE("MANAGE"),
    
    SIGNING("SIGNING"),
    
    ALL("ALL");

    private String value;

    NameEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NameEnum fromValue(String text) {
      for (NameEnum b : NameEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<NameEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NameEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NameEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return NameEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("name")
  private NameEnum name = null;

  public AgreementViewInfo commonViewConfiguration(CommonViewConfiguration commonViewConfiguration) {
    this.commonViewConfiguration = commonViewConfiguration;
    return this;
  }

   /**
   * Common view configuration for all the available views
   * @return commonViewConfiguration
  **/
  @ApiModelProperty(value = "Common view configuration for all the available views")
  public CommonViewConfiguration getCommonViewConfiguration() {
    return commonViewConfiguration;
  }

  public void setCommonViewConfiguration(CommonViewConfiguration commonViewConfiguration) {
    this.commonViewConfiguration = commonViewConfiguration;
  }

  public AgreementViewInfo composeViewConfiguration(ComposeViewConfiguration composeViewConfiguration) {
    this.composeViewConfiguration = composeViewConfiguration;
    return this;
  }

   /**
   * Compose page view configuration
   * @return composeViewConfiguration
  **/
  @ApiModelProperty(value = "Compose page view configuration")
  public ComposeViewConfiguration getComposeViewConfiguration() {
    return composeViewConfiguration;
  }

  public void setComposeViewConfiguration(ComposeViewConfiguration composeViewConfiguration) {
    this.composeViewConfiguration = composeViewConfiguration;
  }

  public AgreementViewInfo name(NameEnum name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the requested agreement view
   * @return name
  **/
  @ApiModelProperty(value = "Name of the requested agreement view")
  public NameEnum getName() {
    return name;
  }

  public void setName(NameEnum name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgreementViewInfo agreementViewInfo = (AgreementViewInfo) o;
    return Objects.equals(this.commonViewConfiguration, agreementViewInfo.commonViewConfiguration) &&
        Objects.equals(this.composeViewConfiguration, agreementViewInfo.composeViewConfiguration) &&
        Objects.equals(this.name, agreementViewInfo.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commonViewConfiguration, composeViewConfiguration, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgreementViewInfo {\n");
    
    sb.append("    commonViewConfiguration: ").append(toIndentedString(commonViewConfiguration)).append("\n");
    sb.append("    composeViewConfiguration: ").append(toIndentedString(composeViewConfiguration)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

