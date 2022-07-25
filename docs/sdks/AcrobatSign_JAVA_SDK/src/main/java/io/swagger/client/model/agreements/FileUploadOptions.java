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
import java.io.IOException;

/**
 * FileUploadOptions
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-11T15:48:52.659+05:30")
public class FileUploadOptions {
  @SerializedName("libraryDocument")
  private Boolean libraryDocument = null;

  @SerializedName("localFile")
  private Boolean localFile = null;

  @SerializedName("webConnectors")
  private Boolean webConnectors = null;

  public FileUploadOptions libraryDocument(Boolean libraryDocument) {
    this.libraryDocument = libraryDocument;
    return this;
  }

   /**
   * Whether library documents link should appear or not. Default value is taken as true
   * @return libraryDocument
  **/
  @ApiModelProperty(value = "Whether library documents link should appear or not. Default value is taken as true")
  public Boolean isLibraryDocument() {
    return libraryDocument;
  }

  public void setLibraryDocument(Boolean libraryDocument) {
    this.libraryDocument = libraryDocument;
  }

  public FileUploadOptions localFile(Boolean localFile) {
    this.localFile = localFile;
    return this;
  }

   /**
   * Whether local file upload button should appear or not. Default value is taken as true
   * @return localFile
  **/
  @ApiModelProperty(value = "Whether local file upload button should appear or not. Default value is taken as true")
  public Boolean isLocalFile() {
    return localFile;
  }

  public void setLocalFile(Boolean localFile) {
    this.localFile = localFile;
  }

  public FileUploadOptions webConnectors(Boolean webConnectors) {
    this.webConnectors = webConnectors;
    return this;
  }

   /**
   * Whether link to attach documents from web sources like Dropbox should appear or not. Default value is taken as true
   * @return webConnectors
  **/
  @ApiModelProperty(value = "Whether link to attach documents from web sources like Dropbox should appear or not. Default value is taken as true")
  public Boolean isWebConnectors() {
    return webConnectors;
  }

  public void setWebConnectors(Boolean webConnectors) {
    this.webConnectors = webConnectors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileUploadOptions fileUploadOptions = (FileUploadOptions) o;
    return Objects.equals(this.libraryDocument, fileUploadOptions.libraryDocument) &&
        Objects.equals(this.localFile, fileUploadOptions.localFile) &&
        Objects.equals(this.webConnectors, fileUploadOptions.webConnectors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(libraryDocument, localFile, webConnectors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileUploadOptions {\n");
    
    sb.append("    libraryDocument: ").append(toIndentedString(libraryDocument)).append("\n");
    sb.append("    localFile: ").append(toIndentedString(localFile)).append("\n");
    sb.append("    webConnectors: ").append(toIndentedString(webConnectors)).append("\n");
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

