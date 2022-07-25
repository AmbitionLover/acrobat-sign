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
import io.swagger.client.model.agreements.AgreementCcInfo;
import io.swagger.client.model.agreements.EmailOption;
import io.swagger.client.model.agreements.ExternalId;
import io.swagger.client.model.agreements.FileInfo;
import io.swagger.client.model.agreements.MergefieldInfo;
import io.swagger.client.model.agreements.OfflineDeviceInfo;
import io.swagger.client.model.agreements.ParticipantSetInfo;
import io.swagger.client.model.agreements.PostSignOption;
import io.swagger.client.model.agreements.SecurityOption;
import io.swagger.client.model.agreements.VaultingInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * AgreementInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-11T15:48:52.659+05:30")
public class AgreementInfo {
  @SerializedName("ccs")
  private List<AgreementCcInfo> ccs = null;

  @SerializedName("createdDate")
  private Date createdDate = null;

  @SerializedName("deviceInfo")
  private OfflineDeviceInfo deviceInfo = null;

  @SerializedName("documentVisibilityEnabled")
  private Boolean documentVisibilityEnabled = null;

  @SerializedName("emailOption")
  private EmailOption emailOption = null;

  @SerializedName("expirationTime")
  private Date expirationTime = null;

  @SerializedName("externalId")
  private ExternalId externalId = null;

  @SerializedName("fileInfos")
  private List<FileInfo> fileInfos = null;

  @SerializedName("firstReminderDelay")
  private Integer firstReminderDelay = null;

  @SerializedName("formFieldLayerTemplates")
  private List<FileInfo> formFieldLayerTemplates = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("locale")
  private String locale = null;

  @SerializedName("mergeFieldInfo")
  private List<MergefieldInfo> mergeFieldInfo = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("participantSetsInfo")
  private List<ParticipantSetInfo> participantSetsInfo = null;

  @SerializedName("postSignOption")
  private PostSignOption postSignOption = null;

  /**
   * Optional parameter that sets how often you want to send reminders to the participants. If it is not specified, the default frequency set for the account will be used. Should not be provided in offline agreement creation. If provided in PUT as a different value than the current one, an error will be thrown.
   */
  @JsonAdapter(ReminderFrequencyEnum.Adapter.class)
  public enum ReminderFrequencyEnum {
    DAILY_UNTIL_SIGNED("DAILY_UNTIL_SIGNED"),
    
    WEEKDAILY_UNTIL_SIGNED("WEEKDAILY_UNTIL_SIGNED"),
    
    EVERY_OTHER_DAY_UNTIL_SIGNED("EVERY_OTHER_DAY_UNTIL_SIGNED"),
    
    EVERY_THIRD_DAY_UNTIL_SIGNED("EVERY_THIRD_DAY_UNTIL_SIGNED"),
    
    EVERY_FIFTH_DAY_UNTIL_SIGNED("EVERY_FIFTH_DAY_UNTIL_SIGNED"),
    
    WEEKLY_UNTIL_SIGNED("WEEKLY_UNTIL_SIGNED"),
    
    ONCE("ONCE");

    private String value;

    ReminderFrequencyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ReminderFrequencyEnum fromValue(String text) {
      for (ReminderFrequencyEnum b : ReminderFrequencyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ReminderFrequencyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ReminderFrequencyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ReminderFrequencyEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ReminderFrequencyEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("reminderFrequency")
  private ReminderFrequencyEnum reminderFrequency = null;

  @SerializedName("securityOption")
  private SecurityOption securityOption = null;

  @SerializedName("senderEmail")
  private String senderEmail = null;

  /**
   * Specifies the type of signature you would like to request - written or e-signature. The possible values are &lt;br&gt; ESIGN : Agreement needs to be signed electronically &lt;br&gt;, WRITTEN : Agreement will be signed using handwritten signature and signed document will be uploaded into the system
   */
  @JsonAdapter(SignatureTypeEnum.Adapter.class)
  public enum SignatureTypeEnum {
    ESIGN("ESIGN"),
    
    WRITTEN("WRITTEN");

    private String value;

    SignatureTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SignatureTypeEnum fromValue(String text) {
      for (SignatureTypeEnum b : SignatureTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SignatureTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SignatureTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SignatureTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SignatureTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("signatureType")
  private SignatureTypeEnum signatureType = null;

  /**
   * The state in which the agreement should land. The state field can only be provided in POST calls, will never get returned in GET /agreements/{ID} and will be ignored if provided in PUT /agreements/{ID} call. The eventual status of the agreement can be obtained from GET /agreements/ID
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    AUTHORING("AUTHORING"),
    
    DRAFT("DRAFT"),
    
    IN_PROCESS("IN_PROCESS");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StateEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("state")
  private StateEnum state = null;

  /**
   * This is a server generated attribute which provides the detailed status of an agreement.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    OUT_FOR_SIGNATURE("OUT_FOR_SIGNATURE"),
    
    OUT_FOR_DELIVERY("OUT_FOR_DELIVERY"),
    
    OUT_FOR_ACCEPTANCE("OUT_FOR_ACCEPTANCE"),
    
    OUT_FOR_FORM_FILLING("OUT_FOR_FORM_FILLING"),
    
    OUT_FOR_APPROVAL("OUT_FOR_APPROVAL"),
    
    AUTHORING("AUTHORING"),
    
    CANCELLED("CANCELLED"),
    
    SIGNED("SIGNED"),
    
    APPROVED("APPROVED"),
    
    DELIVERED("DELIVERED"),
    
    ACCEPTED("ACCEPTED"),
    
    FORM_FILLED("FORM_FILLED"),
    
    EXPIRED("EXPIRED"),
    
    ARCHIVED("ARCHIVED"),
    
    PREFILL("PREFILL"),
    
    WIDGET_WAITING_FOR_VERIFICATION("WIDGET_WAITING_FOR_VERIFICATION"),
    
    DRAFT("DRAFT"),
    
    DOCUMENTS_NOT_YET_PROCESSED("DOCUMENTS_NOT_YET_PROCESSED"),
    
    WAITING_FOR_FAXIN("WAITING_FOR_FAXIN"),
    
    WAITING_FOR_VERIFICATION("WAITING_FOR_VERIFICATION");

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

  @SerializedName("vaultingInfo")
  private VaultingInfo vaultingInfo = null;

  @SerializedName("workflowId")
  private String workflowId = null;

  public AgreementInfo ccs(List<AgreementCcInfo> ccs) {
    this.ccs = ccs;
    return this;
  }

  public AgreementInfo addCcsItem(AgreementCcInfo ccsItem) {
    if (this.ccs == null) {
      this.ccs = new ArrayList<AgreementCcInfo>();
    }
    this.ccs.add(ccsItem);
    return this;
  }

   /**
   * A list of one or more CCs that will be copied in the agreement transaction. The CCs will each receive an email at the beginning of the transaction and also when the final document is signed. The email addresses will also receive a copy of the document, attached as a PDF file. Should not be provided in offline agreement creation.
   * @return ccs
  **/
  @ApiModelProperty(value = "A list of one or more CCs that will be copied in the agreement transaction. The CCs will each receive an email at the beginning of the transaction and also when the final document is signed. The email addresses will also receive a copy of the document, attached as a PDF file. Should not be provided in offline agreement creation.")
  public List<AgreementCcInfo> getCcs() {
    return ccs;
  }

  public void setCcs(List<AgreementCcInfo> ccs) {
    this.ccs = ccs;
  }

  public AgreementInfo createdDate(Date createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Date when agreement was created. This is a server generated attributed and can not be provided in POST/PUT calls. Format would be yyyy-MM-dd&#39;T&#39;HH:mm:ssZ. For example, e.g 2016-02-25T18:46:19Z represents UTC time
   * @return createdDate
  **/
  @ApiModelProperty(value = "Date when agreement was created. This is a server generated attributed and can not be provided in POST/PUT calls. Format would be yyyy-MM-dd'T'HH:mm:ssZ. For example, e.g 2016-02-25T18:46:19Z represents UTC time")
  public Date getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }

  public AgreementInfo deviceInfo(OfflineDeviceInfo deviceInfo) {
    this.deviceInfo = deviceInfo;
    return this;
  }

   /**
   * Device info of the offline device. It should only be provided in case of offline agreement creation.
   * @return deviceInfo
  **/
  @ApiModelProperty(value = "Device info of the offline device. It should only be provided in case of offline agreement creation.")
  public OfflineDeviceInfo getDeviceInfo() {
    return deviceInfo;
  }

  public void setDeviceInfo(OfflineDeviceInfo deviceInfo) {
    this.deviceInfo = deviceInfo;
  }

  public AgreementInfo documentVisibilityEnabled(Boolean documentVisibilityEnabled) {
    this.documentVisibilityEnabled = documentVisibilityEnabled;
    return this;
  }

   /**
   * If set to true, enable limited document visibility. Should not be provided in offline agreement creation.
   * @return documentVisibilityEnabled
  **/
  @ApiModelProperty(value = "If set to true, enable limited document visibility. Should not be provided in offline agreement creation.")
  public Boolean isDocumentVisibilityEnabled() {
    return documentVisibilityEnabled;
  }

  public void setDocumentVisibilityEnabled(Boolean documentVisibilityEnabled) {
    this.documentVisibilityEnabled = documentVisibilityEnabled;
  }

  public AgreementInfo emailOption(EmailOption emailOption) {
    this.emailOption = emailOption;
    return this;
  }

   /**
   * Email configurations for the agreement. Should not be provided in offline agreement creation or when updating a non draft agreement.
   * @return emailOption
  **/
  @ApiModelProperty(value = "Email configurations for the agreement. Should not be provided in offline agreement creation or when updating a non draft agreement.")
  public EmailOption getEmailOption() {
    return emailOption;
  }

  public void setEmailOption(EmailOption emailOption) {
    this.emailOption = emailOption;
  }

  public AgreementInfo expirationTime(Date expirationTime) {
    this.expirationTime = expirationTime;
    return this;
  }

   /**
   * Time after which Agreement expires and needs to be signed before it. Format should be yyyy-MM-dd&#39;T&#39;HH:mm:ssZ. For example, e.g 2016-02-25T18:46:19Z represents UTC time. Should not be provided in offline agreement creation.
   * @return expirationTime
  **/
  @ApiModelProperty(value = "Time after which Agreement expires and needs to be signed before it. Format should be yyyy-MM-dd'T'HH:mm:ssZ. For example, e.g 2016-02-25T18:46:19Z represents UTC time. Should not be provided in offline agreement creation.")
  public Date getExpirationTime() {
    return expirationTime;
  }

  public void setExpirationTime(Date expirationTime) {
    this.expirationTime = expirationTime;
  }

  public AgreementInfo externalId(ExternalId externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * An arbitrary value from your system, which can be specified at sending time and then later returned or queried. Should not be provided in offline agreement creation.
   * @return externalId
  **/
  @ApiModelProperty(value = "An arbitrary value from your system, which can be specified at sending time and then later returned or queried. Should not be provided in offline agreement creation.")
  public ExternalId getExternalId() {
    return externalId;
  }

  public void setExternalId(ExternalId externalId) {
    this.externalId = externalId;
  }

  public AgreementInfo fileInfos(List<FileInfo> fileInfos) {
    this.fileInfos = fileInfos;
    return this;
  }

  public AgreementInfo addFileInfosItem(FileInfo fileInfosItem) {
    if (this.fileInfos == null) {
      this.fileInfos = new ArrayList<FileInfo>();
    }
    this.fileInfos.add(fileInfosItem);
    return this;
  }

   /**
   * A list of one or more files (or references to files) that will be sent out for signature. If more than one file is provided, they will be combined into one PDF before being sent out. Note: Only one of the four parameters in every FileInfo object must be specified
   * @return fileInfos
  **/
  @ApiModelProperty(value = "A list of one or more files (or references to files) that will be sent out for signature. If more than one file is provided, they will be combined into one PDF before being sent out. Note: Only one of the four parameters in every FileInfo object must be specified")
  public List<FileInfo> getFileInfos() {
    return fileInfos;
  }

  public void setFileInfos(List<FileInfo> fileInfos) {
    this.fileInfos = fileInfos;
  }

  public AgreementInfo firstReminderDelay(Integer firstReminderDelay) {
    this.firstReminderDelay = firstReminderDelay;
    return this;
  }

   /**
   * Integer which specifies the delay in hours before sending the first reminder.&lt;br&gt;This is an optional field. The minimum value allowed is 1 hour and the maximum value can’t be more than the difference of agreement creation and expiry time of the agreement in hours.&lt;br&gt;If this is not specified but the reminder frequency is specified, then the first reminder will be sent based on frequency.&lt;br&gt;i.e. if the reminder is created with frequency specified as daily, the firstReminderDelay will be 24 hours. Should not be provided in offline agreement creation.
   * @return firstReminderDelay
  **/
  @ApiModelProperty(value = "Integer which specifies the delay in hours before sending the first reminder.<br>This is an optional field. The minimum value allowed is 1 hour and the maximum value can’t be more than the difference of agreement creation and expiry time of the agreement in hours.<br>If this is not specified but the reminder frequency is specified, then the first reminder will be sent based on frequency.<br>i.e. if the reminder is created with frequency specified as daily, the firstReminderDelay will be 24 hours. Should not be provided in offline agreement creation.")
  public Integer getFirstReminderDelay() {
    return firstReminderDelay;
  }

  public void setFirstReminderDelay(Integer firstReminderDelay) {
    this.firstReminderDelay = firstReminderDelay;
  }

  public AgreementInfo formFieldLayerTemplates(List<FileInfo> formFieldLayerTemplates) {
    this.formFieldLayerTemplates = formFieldLayerTemplates;
    return this;
  }

  public AgreementInfo addFormFieldLayerTemplatesItem(FileInfo formFieldLayerTemplatesItem) {
    if (this.formFieldLayerTemplates == null) {
      this.formFieldLayerTemplates = new ArrayList<FileInfo>();
    }
    this.formFieldLayerTemplates.add(formFieldLayerTemplatesItem);
    return this;
  }

   /**
   * Specifies the form field layer template or source of form fields to apply on the files in this transaction. If specified, the FileInfo for this parameter must refer to a form field layer template via libraryDocumentId or libraryDocumentName, or if specified via transientDocumentId or documentURL, it must be of a supported file type. Note: Only one of the four parameters in every FileInfo object must be specified
   * @return formFieldLayerTemplates
  **/
  @ApiModelProperty(value = "Specifies the form field layer template or source of form fields to apply on the files in this transaction. If specified, the FileInfo for this parameter must refer to a form field layer template via libraryDocumentId or libraryDocumentName, or if specified via transientDocumentId or documentURL, it must be of a supported file type. Note: Only one of the four parameters in every FileInfo object must be specified")
  public List<FileInfo> getFormFieldLayerTemplates() {
    return formFieldLayerTemplates;
  }

  public void setFormFieldLayerTemplates(List<FileInfo> formFieldLayerTemplates) {
    this.formFieldLayerTemplates = formFieldLayerTemplates;
  }

  public AgreementInfo id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique identifier of the agreement.If provided in POST, it will simply be ignored
   * @return id
  **/
  @ApiModelProperty(value = "The unique identifier of the agreement.If provided in POST, it will simply be ignored")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AgreementInfo locale(String locale) {
    this.locale = locale;
    return this;
  }

   /**
   * The locale associated with this agreement - specifies the language for the signing page and emails, for example en_US or fr_FR. If none specified, defaults to the language configured for the agreement sender
   * @return locale
  **/
  @ApiModelProperty(value = "The locale associated with this agreement - specifies the language for the signing page and emails, for example en_US or fr_FR. If none specified, defaults to the language configured for the agreement sender")
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  public AgreementInfo mergeFieldInfo(List<MergefieldInfo> mergeFieldInfo) {
    this.mergeFieldInfo = mergeFieldInfo;
    return this;
  }

  public AgreementInfo addMergeFieldInfoItem(MergefieldInfo mergeFieldInfoItem) {
    if (this.mergeFieldInfo == null) {
      this.mergeFieldInfo = new ArrayList<MergefieldInfo>();
    }
    this.mergeFieldInfo.add(mergeFieldInfoItem);
    return this;
  }

   /**
   * Optional default values for fields to merge into the document. The values will be presented to the signers for editable fields; for read-only fields the provided values will not be editable during the signing process. Merging data into fields is currently not supported when used with libraryDocumentId or libraryDocumentName. Only file and url are currently supported
   * @return mergeFieldInfo
  **/
  @ApiModelProperty(value = "Optional default values for fields to merge into the document. The values will be presented to the signers for editable fields; for read-only fields the provided values will not be editable during the signing process. Merging data into fields is currently not supported when used with libraryDocumentId or libraryDocumentName. Only file and url are currently supported")
  public List<MergefieldInfo> getMergeFieldInfo() {
    return mergeFieldInfo;
  }

  public void setMergeFieldInfo(List<MergefieldInfo> mergeFieldInfo) {
    this.mergeFieldInfo = mergeFieldInfo;
  }

  public AgreementInfo message(String message) {
    this.message = message;
    return this;
  }

   /**
   * An optional message to the participants, describing what is being sent or why their signature is required
   * @return message
  **/
  @ApiModelProperty(value = "An optional message to the participants, describing what is being sent or why their signature is required")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public AgreementInfo name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the agreement that will be used to identify it, in emails, website and other places
   * @return name
  **/
  @ApiModelProperty(value = "The name of the agreement that will be used to identify it, in emails, website and other places")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AgreementInfo participantSetsInfo(List<ParticipantSetInfo> participantSetsInfo) {
    this.participantSetsInfo = participantSetsInfo;
    return this;
  }

  public AgreementInfo addParticipantSetsInfoItem(ParticipantSetInfo participantSetsInfoItem) {
    if (this.participantSetsInfo == null) {
      this.participantSetsInfo = new ArrayList<ParticipantSetInfo>();
    }
    this.participantSetsInfo.add(participantSetsInfoItem);
    return this;
  }

   /**
   * A list of one or more participant set. A participant set may have one or more participant. If any member of the participant set takes the action that has been assigned to the set(Sign/Approve/Acknowledge etc ), the action is considered as the action taken by whole participation set. For regular (non-MegaSign) documents, there is no limit on the number of electronic signatures in a single document. Written signatures are limited to four per document
   * @return participantSetsInfo
  **/
  @ApiModelProperty(value = "A list of one or more participant set. A participant set may have one or more participant. If any member of the participant set takes the action that has been assigned to the set(Sign/Approve/Acknowledge etc ), the action is considered as the action taken by whole participation set. For regular (non-MegaSign) documents, there is no limit on the number of electronic signatures in a single document. Written signatures are limited to four per document")
  public List<ParticipantSetInfo> getParticipantSetsInfo() {
    return participantSetsInfo;
  }

  public void setParticipantSetsInfo(List<ParticipantSetInfo> participantSetsInfo) {
    this.participantSetsInfo = participantSetsInfo;
  }

  public AgreementInfo postSignOption(PostSignOption postSignOption) {
    this.postSignOption = postSignOption;
    return this;
  }

   /**
   * URL and associated properties for the success page the user will be taken to after completing the signing process. Should not be provided in offline agreement creation.
   * @return postSignOption
  **/
  @ApiModelProperty(value = "URL and associated properties for the success page the user will be taken to after completing the signing process. Should not be provided in offline agreement creation.")
  public PostSignOption getPostSignOption() {
    return postSignOption;
  }

  public void setPostSignOption(PostSignOption postSignOption) {
    this.postSignOption = postSignOption;
  }

  public AgreementInfo reminderFrequency(ReminderFrequencyEnum reminderFrequency) {
    this.reminderFrequency = reminderFrequency;
    return this;
  }

   /**
   * Optional parameter that sets how often you want to send reminders to the participants. If it is not specified, the default frequency set for the account will be used. Should not be provided in offline agreement creation. If provided in PUT as a different value than the current one, an error will be thrown.
   * @return reminderFrequency
  **/
  @ApiModelProperty(value = "Optional parameter that sets how often you want to send reminders to the participants. If it is not specified, the default frequency set for the account will be used. Should not be provided in offline agreement creation. If provided in PUT as a different value than the current one, an error will be thrown.")
  public ReminderFrequencyEnum getReminderFrequency() {
    return reminderFrequency;
  }

  public void setReminderFrequency(ReminderFrequencyEnum reminderFrequency) {
    this.reminderFrequency = reminderFrequency;
  }

  public AgreementInfo securityOption(SecurityOption securityOption) {
    this.securityOption = securityOption;
    return this;
  }

   /**
   * Optional secondary security parameters for the agreement. Should not be provided in offline agreement creation.
   * @return securityOption
  **/
  @ApiModelProperty(value = "Optional secondary security parameters for the agreement. Should not be provided in offline agreement creation.")
  public SecurityOption getSecurityOption() {
    return securityOption;
  }

  public void setSecurityOption(SecurityOption securityOption) {
    this.securityOption = securityOption;
  }

  public AgreementInfo senderEmail(String senderEmail) {
    this.senderEmail = senderEmail;
    return this;
  }

   /**
   * Email of agreement sender. Only provided in GET. Can not be provided in POST/PUT request. If provided in POST/PUT, it will be ignored
   * @return senderEmail
  **/
  @ApiModelProperty(value = "Email of agreement sender. Only provided in GET. Can not be provided in POST/PUT request. If provided in POST/PUT, it will be ignored")
  public String getSenderEmail() {
    return senderEmail;
  }

  public void setSenderEmail(String senderEmail) {
    this.senderEmail = senderEmail;
  }

  public AgreementInfo signatureType(SignatureTypeEnum signatureType) {
    this.signatureType = signatureType;
    return this;
  }

   /**
   * Specifies the type of signature you would like to request - written or e-signature. The possible values are &lt;br&gt; ESIGN : Agreement needs to be signed electronically &lt;br&gt;, WRITTEN : Agreement will be signed using handwritten signature and signed document will be uploaded into the system
   * @return signatureType
  **/
  @ApiModelProperty(value = "Specifies the type of signature you would like to request - written or e-signature. The possible values are <br> ESIGN : Agreement needs to be signed electronically <br>, WRITTEN : Agreement will be signed using handwritten signature and signed document will be uploaded into the system")
  public SignatureTypeEnum getSignatureType() {
    return signatureType;
  }

  public void setSignatureType(SignatureTypeEnum signatureType) {
    this.signatureType = signatureType;
  }

  public AgreementInfo state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * The state in which the agreement should land. The state field can only be provided in POST calls, will never get returned in GET /agreements/{ID} and will be ignored if provided in PUT /agreements/{ID} call. The eventual status of the agreement can be obtained from GET /agreements/ID
   * @return state
  **/
  @ApiModelProperty(value = "The state in which the agreement should land. The state field can only be provided in POST calls, will never get returned in GET /agreements/{ID} and will be ignored if provided in PUT /agreements/{ID} call. The eventual status of the agreement can be obtained from GET /agreements/ID")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public AgreementInfo status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * This is a server generated attribute which provides the detailed status of an agreement.
   * @return status
  **/
  @ApiModelProperty(value = "This is a server generated attribute which provides the detailed status of an agreement.")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public AgreementInfo vaultingInfo(VaultingInfo vaultingInfo) {
    this.vaultingInfo = vaultingInfo;
    return this;
  }

   /**
   * Vaulting properties that allows Adobe Sign to securely store documents with a vault provider
   * @return vaultingInfo
  **/
  @ApiModelProperty(value = "Vaulting properties that allows Adobe Sign to securely store documents with a vault provider")
  public VaultingInfo getVaultingInfo() {
    return vaultingInfo;
  }

  public void setVaultingInfo(VaultingInfo vaultingInfo) {
    this.vaultingInfo = vaultingInfo;
  }

  public AgreementInfo workflowId(String workflowId) {
    this.workflowId = workflowId;
    return this;
  }

   /**
   * The identifier of custom workflow which defines the routing path of an agreement. Should not be provided in offline agreement creation.
   * @return workflowId
  **/
  @ApiModelProperty(value = "The identifier of custom workflow which defines the routing path of an agreement. Should not be provided in offline agreement creation.")
  public String getWorkflowId() {
    return workflowId;
  }

  public void setWorkflowId(String workflowId) {
    this.workflowId = workflowId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgreementInfo agreementInfo = (AgreementInfo) o;
    return Objects.equals(this.ccs, agreementInfo.ccs) &&
        Objects.equals(this.createdDate, agreementInfo.createdDate) &&
        Objects.equals(this.deviceInfo, agreementInfo.deviceInfo) &&
        Objects.equals(this.documentVisibilityEnabled, agreementInfo.documentVisibilityEnabled) &&
        Objects.equals(this.emailOption, agreementInfo.emailOption) &&
        Objects.equals(this.expirationTime, agreementInfo.expirationTime) &&
        Objects.equals(this.externalId, agreementInfo.externalId) &&
        Objects.equals(this.fileInfos, agreementInfo.fileInfos) &&
        Objects.equals(this.firstReminderDelay, agreementInfo.firstReminderDelay) &&
        Objects.equals(this.formFieldLayerTemplates, agreementInfo.formFieldLayerTemplates) &&
        Objects.equals(this.id, agreementInfo.id) &&
        Objects.equals(this.locale, agreementInfo.locale) &&
        Objects.equals(this.mergeFieldInfo, agreementInfo.mergeFieldInfo) &&
        Objects.equals(this.message, agreementInfo.message) &&
        Objects.equals(this.name, agreementInfo.name) &&
        Objects.equals(this.participantSetsInfo, agreementInfo.participantSetsInfo) &&
        Objects.equals(this.postSignOption, agreementInfo.postSignOption) &&
        Objects.equals(this.reminderFrequency, agreementInfo.reminderFrequency) &&
        Objects.equals(this.securityOption, agreementInfo.securityOption) &&
        Objects.equals(this.senderEmail, agreementInfo.senderEmail) &&
        Objects.equals(this.signatureType, agreementInfo.signatureType) &&
        Objects.equals(this.state, agreementInfo.state) &&
        Objects.equals(this.status, agreementInfo.status) &&
        Objects.equals(this.vaultingInfo, agreementInfo.vaultingInfo) &&
        Objects.equals(this.workflowId, agreementInfo.workflowId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ccs, createdDate, deviceInfo, documentVisibilityEnabled, emailOption, expirationTime, externalId, fileInfos, firstReminderDelay, formFieldLayerTemplates, id, locale, mergeFieldInfo, message, name, participantSetsInfo, postSignOption, reminderFrequency, securityOption, senderEmail, signatureType, state, status, vaultingInfo, workflowId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgreementInfo {\n");
    
    sb.append("    ccs: ").append(toIndentedString(ccs)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    deviceInfo: ").append(toIndentedString(deviceInfo)).append("\n");
    sb.append("    documentVisibilityEnabled: ").append(toIndentedString(documentVisibilityEnabled)).append("\n");
    sb.append("    emailOption: ").append(toIndentedString(emailOption)).append("\n");
    sb.append("    expirationTime: ").append(toIndentedString(expirationTime)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    fileInfos: ").append(toIndentedString(fileInfos)).append("\n");
    sb.append("    firstReminderDelay: ").append(toIndentedString(firstReminderDelay)).append("\n");
    sb.append("    formFieldLayerTemplates: ").append(toIndentedString(formFieldLayerTemplates)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    mergeFieldInfo: ").append(toIndentedString(mergeFieldInfo)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    participantSetsInfo: ").append(toIndentedString(participantSetsInfo)).append("\n");
    sb.append("    postSignOption: ").append(toIndentedString(postSignOption)).append("\n");
    sb.append("    reminderFrequency: ").append(toIndentedString(reminderFrequency)).append("\n");
    sb.append("    securityOption: ").append(toIndentedString(securityOption)).append("\n");
    sb.append("    senderEmail: ").append(toIndentedString(senderEmail)).append("\n");
    sb.append("    signatureType: ").append(toIndentedString(signatureType)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    vaultingInfo: ").append(toIndentedString(vaultingInfo)).append("\n");
    sb.append("    workflowId: ").append(toIndentedString(workflowId)).append("\n");
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

