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
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 6.0.0
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using SwaggerDateConverter = IO.Swagger.Client.SwaggerDateConverter;

namespace IO.Swagger.model.agreements
{
    /// <summary>
    /// SendOptions
    /// </summary>
    [DataContract]
    public partial class SendOptions :  IEquatable<SendOptions>, IValidatableObject
    {
        /// <summary>
        /// Control notification mails for agreement completion events - COMPLETED, CANCELLED, EXPIRED and REJECTED
        /// </summary>
        /// <value>Control notification mails for agreement completion events - COMPLETED, CANCELLED, EXPIRED and REJECTED</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum CompletionEmailsEnum
        {
            
            /// <summary>
            /// Enum ALL for value: ALL
            /// </summary>
            [EnumMember(Value = "ALL")]
            ALL = 1,
            
            /// <summary>
            /// Enum NONE for value: NONE
            /// </summary>
            [EnumMember(Value = "NONE")]
            NONE = 2
        }

        /// <summary>
        /// Control notification mails for agreement completion events - COMPLETED, CANCELLED, EXPIRED and REJECTED
        /// </summary>
        /// <value>Control notification mails for agreement completion events - COMPLETED, CANCELLED, EXPIRED and REJECTED</value>
        [DataMember(Name="completionEmails", EmitDefaultValue=false)]
        public CompletionEmailsEnum? CompletionEmails { get; set; }
        /// <summary>
        /// Control notification mails for agreement-in-process events - DELEGATED, REPLACED
        /// </summary>
        /// <value>Control notification mails for agreement-in-process events - DELEGATED, REPLACED</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum InFlightEmailsEnum
        {
            
            /// <summary>
            /// Enum ALL for value: ALL
            /// </summary>
            [EnumMember(Value = "ALL")]
            ALL = 1,
            
            /// <summary>
            /// Enum NONE for value: NONE
            /// </summary>
            [EnumMember(Value = "NONE")]
            NONE = 2
        }

        /// <summary>
        /// Control notification mails for agreement-in-process events - DELEGATED, REPLACED
        /// </summary>
        /// <value>Control notification mails for agreement-in-process events - DELEGATED, REPLACED</value>
        [DataMember(Name="inFlightEmails", EmitDefaultValue=false)]
        public InFlightEmailsEnum? InFlightEmails { get; set; }
        /// <summary>
        /// Control notification mails for Agreement initiation events - ACTION_REQUESTED and CREATED
        /// </summary>
        /// <value>Control notification mails for Agreement initiation events - ACTION_REQUESTED and CREATED</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum InitEmailsEnum
        {
            
            /// <summary>
            /// Enum ALL for value: ALL
            /// </summary>
            [EnumMember(Value = "ALL")]
            ALL = 1,
            
            /// <summary>
            /// Enum NONE for value: NONE
            /// </summary>
            [EnumMember(Value = "NONE")]
            NONE = 2
        }

        /// <summary>
        /// Control notification mails for Agreement initiation events - ACTION_REQUESTED and CREATED
        /// </summary>
        /// <value>Control notification mails for Agreement initiation events - ACTION_REQUESTED and CREATED</value>
        [DataMember(Name="initEmails", EmitDefaultValue=false)]
        public InitEmailsEnum? InitEmails { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="SendOptions" /> class.
        /// </summary>
        /// <param name="CompletionEmails">Control notification mails for agreement completion events - COMPLETED, CANCELLED, EXPIRED and REJECTED.</param>
        /// <param name="InFlightEmails">Control notification mails for agreement-in-process events - DELEGATED, REPLACED.</param>
        /// <param name="InitEmails">Control notification mails for Agreement initiation events - ACTION_REQUESTED and CREATED.</param>
        public SendOptions(CompletionEmailsEnum? CompletionEmails = default(CompletionEmailsEnum?), InFlightEmailsEnum? InFlightEmails = default(InFlightEmailsEnum?), InitEmailsEnum? InitEmails = default(InitEmailsEnum?))
        {
            this.CompletionEmails = CompletionEmails;
            this.InFlightEmails = InFlightEmails;
            this.InitEmails = InitEmails;
        }
        



        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class SendOptions {\n");
            sb.Append("  CompletionEmails: ").Append(CompletionEmails).Append("\n");
            sb.Append("  InFlightEmails: ").Append(InFlightEmails).Append("\n");
            sb.Append("  InitEmails: ").Append(InitEmails).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as SendOptions);
        }

        /// <summary>
        /// Returns true if SendOptions instances are equal
        /// </summary>
        /// <param name="input">Instance of SendOptions to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SendOptions input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.CompletionEmails == input.CompletionEmails ||
                    (this.CompletionEmails != null &&
                    this.CompletionEmails.Equals(input.CompletionEmails))
                ) && 
                (
                    this.InFlightEmails == input.InFlightEmails ||
                    (this.InFlightEmails != null &&
                    this.InFlightEmails.Equals(input.InFlightEmails))
                ) && 
                (
                    this.InitEmails == input.InitEmails ||
                    (this.InitEmails != null &&
                    this.InitEmails.Equals(input.InitEmails))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.CompletionEmails != null)
                    hashCode = hashCode * 59 + this.CompletionEmails.GetHashCode();
                if (this.InFlightEmails != null)
                    hashCode = hashCode * 59 + this.InFlightEmails.GetHashCode();
                if (this.InitEmails != null)
                    hashCode = hashCode * 59 + this.InitEmails.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
