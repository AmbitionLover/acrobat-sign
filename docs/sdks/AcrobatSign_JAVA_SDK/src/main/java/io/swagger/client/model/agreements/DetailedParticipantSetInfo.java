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
import io.swagger.client.model.agreements.DetailedParticipantInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * DetailedParticipantSetInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-11T15:48:52.659+05:30")
public class DetailedParticipantSetInfo {
  @SerializedName("id")
  private String id = null;

  @SerializedName("memberInfos")
  private List<DetailedParticipantInfo> memberInfos = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("order")
  private Integer order = null;

  @SerializedName("privateMessage")
  private String privateMessage = null;

  /**
   * Role assumed by all participants in the set (signer, approver etc.). This cannot be changed as part of the PUT call.
   */
  @JsonAdapter(RoleEnum.Adapter.class)
  public enum RoleEnum {
    SIGNER("SIGNER"),
    
    SENDER("SENDER"),
    
    APPROVER("APPROVER"),
    
    ACCEPTOR("ACCEPTOR"),
    
    CERTIFIED_RECIPIENT("CERTIFIED_RECIPIENT"),
    
    FORM_FILLER("FORM_FILLER"),
    
    DELEGATE_TO_SIGNER("DELEGATE_TO_SIGNER"),
    
    DELEGATE_TO_APPROVER("DELEGATE_TO_APPROVER"),
    
    DELEGATE_TO_ACCEPTOR("DELEGATE_TO_ACCEPTOR"),
    
    DELEGATE_TO_CERTIFIED_RECIPIENT("DELEGATE_TO_CERTIFIED_RECIPIENT"),
    
    DELEGATE_TO_FORM_FILLER("DELEGATE_TO_FORM_FILLER"),
    
    SHARE("SHARE");

    private String value;

    RoleEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RoleEnum fromValue(String text) {
      for (RoleEnum b : RoleEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<RoleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RoleEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RoleEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return RoleEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("role")
  private RoleEnum role = null;

  /**
   * The agreement status with respect to the participant set. This cannot be changed as part of the PUT call.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    CANCELLED("CANCELLED"),
    
    COMPLETED("COMPLETED"),
    
    EXPIRED("EXPIRED"),
    
    NOT_YET_VISIBLE("NOT_YET_VISIBLE"),
    
    WAITING_FOR_OTHERS("WAITING_FOR_OTHERS"),
    
    WAITING_FOR_MY_APPROVAL("WAITING_FOR_MY_APPROVAL"),
    
    WAITING_FOR_AUTHORING("WAITING_FOR_AUTHORING"),
    
    WAITING_FOR_MY_ACKNOWLEDGEMENT("WAITING_FOR_MY_ACKNOWLEDGEMENT"),
    
    WAITING_FOR_MY_ACCEPTANCE("WAITING_FOR_MY_ACCEPTANCE"),
    
    WAITING_FOR_MY_FORM_FILLING("WAITING_FOR_MY_FORM_FILLING"),
    
    WAITING_FOR_MY_DELEGATION("WAITING_FOR_MY_DELEGATION"),
    
    WAITING_FOR_MY_SIGNATURE("WAITING_FOR_MY_SIGNATURE"),
    
    WAITING_FOR_MY_VERIFICATION("WAITING_FOR_MY_VERIFICATION"),
    
    WAITING_FOR_PREFILL("WAITING_FOR_PREFILL");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  public DetailedParticipantSetInfo id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique identifier of the participant set. This cannot be changed as part of the PUT call.
   * @return id
  **/
  @ApiModelProperty(value = "The unique identifier of the participant set. This cannot be changed as part of the PUT call.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DetailedParticipantSetInfo memberInfos(List<DetailedParticipantInfo> memberInfos) {
    this.memberInfos = memberInfos;
    return this;
  }

  public DetailedParticipantSetInfo addMemberInfosItem(DetailedParticipantInfo memberInfosItem) {
    if (this.memberInfos == null) {
      this.memberInfos = new ArrayList<DetailedParticipantInfo>();
    }
    this.memberInfos.add(memberInfosItem);
    return this;
  }

   /**
   * Array of ParticipantInfo objects, containing participant-specific data (e.g. email). All participants in the array belong to the same set
   * @return memberInfos
  **/
  @ApiModelProperty(value = "Array of ParticipantInfo objects, containing participant-specific data (e.g. email). All participants in the array belong to the same set")
  public List<DetailedParticipantInfo> getMemberInfos() {
    return memberInfos;
  }

  public void setMemberInfos(List<DetailedParticipantInfo> memberInfos) {
    this.memberInfos = memberInfos;
  }

  public DetailedParticipantSetInfo name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of ParticipantSet (it can be empty, but needs not to be unique in a single agreement). Maximum no of characters in participant set name is restricted to 255. This cannot be changed as part of the PUT call.
   * @return name
  **/
  @ApiModelProperty(value = "Name of ParticipantSet (it can be empty, but needs not to be unique in a single agreement). Maximum no of characters in participant set name is restricted to 255. This cannot be changed as part of the PUT call.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DetailedParticipantSetInfo order(Integer order) {
    this.order = order;
    return this;
  }

   /**
   * Index indicating sequential signing group (specified for hybrid routing). This cannot be changed as part of the PUT call.
   * @return order
  **/
  @ApiModelProperty(value = "Index indicating sequential signing group (specified for hybrid routing). This cannot be changed as part of the PUT call.")
  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }

  public DetailedParticipantSetInfo privateMessage(String privateMessage) {
    this.privateMessage = privateMessage;
    return this;
  }

   /**
   * Participant set&#39;s private message - all participants in the set will receive the same message. This cannot be changed as part of the PUT call.
   * @return privateMessage
  **/
  @ApiModelProperty(value = "Participant set's private message - all participants in the set will receive the same message. This cannot be changed as part of the PUT call.")
  public String getPrivateMessage() {
    return privateMessage;
  }

  public void setPrivateMessage(String privateMessage) {
    this.privateMessage = privateMessage;
  }

  public DetailedParticipantSetInfo role(RoleEnum role) {
    this.role = role;
    return this;
  }

   /**
   * Role assumed by all participants in the set (signer, approver etc.). This cannot be changed as part of the PUT call.
   * @return role
  **/
  @ApiModelProperty(value = "Role assumed by all participants in the set (signer, approver etc.). This cannot be changed as part of the PUT call.")
  public RoleEnum getRole() {
    return role;
  }

  public void setRole(RoleEnum role) {
    this.role = role;
  }

  public DetailedParticipantSetInfo status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The agreement status with respect to the participant set. This cannot be changed as part of the PUT call.
   * @return status
  **/
  @ApiModelProperty(value = "The agreement status with respect to the participant set. This cannot be changed as part of the PUT call.")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetailedParticipantSetInfo detailedParticipantSetInfo = (DetailedParticipantSetInfo) o;
    return Objects.equals(this.id, detailedParticipantSetInfo.id) &&
        Objects.equals(this.memberInfos, detailedParticipantSetInfo.memberInfos) &&
        Objects.equals(this.name, detailedParticipantSetInfo.name) &&
        Objects.equals(this.order, detailedParticipantSetInfo.order) &&
        Objects.equals(this.privateMessage, detailedParticipantSetInfo.privateMessage) &&
        Objects.equals(this.role, detailedParticipantSetInfo.role) &&
        Objects.equals(this.status, detailedParticipantSetInfo.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, memberInfos, name, order, privateMessage, role, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetailedParticipantSetInfo {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    memberInfos: ").append(toIndentedString(memberInfos)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    privateMessage: ").append(toIndentedString(privateMessage)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

