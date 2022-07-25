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
    /// AgreementCancellationInfo
    /// </summary>
    [DataContract]
    public partial class AgreementCancellationInfo :  IEquatable<AgreementCancellationInfo>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="AgreementCancellationInfo" /> class.
        /// </summary>
        /// <param name="Comment">An optional comment describing to the recipients why you want to cancel the transaction.</param>
        /// <param name="NotifyOthers">Whether or not you would like the recipients to be notified that the transaction has been cancelled. The default value is false.</param>
        public AgreementCancellationInfo(string Comment = default(string), bool? NotifyOthers = default(bool?))
        {
            this.Comment = Comment;
            this.NotifyOthers = NotifyOthers;
        }
        
        /// <summary>
        /// An optional comment describing to the recipients why you want to cancel the transaction
        /// </summary>
        /// <value>An optional comment describing to the recipients why you want to cancel the transaction</value>
        [DataMember(Name="comment", EmitDefaultValue=false)]
        public string Comment { get; set; }

        /// <summary>
        /// Whether or not you would like the recipients to be notified that the transaction has been cancelled. The default value is false
        /// </summary>
        /// <value>Whether or not you would like the recipients to be notified that the transaction has been cancelled. The default value is false</value>
        [DataMember(Name="notifyOthers", EmitDefaultValue=false)]
        public bool? NotifyOthers { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class AgreementCancellationInfo {\n");
            sb.Append("  Comment: ").Append(Comment).Append("\n");
            sb.Append("  NotifyOthers: ").Append(NotifyOthers).Append("\n");
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
            return this.Equals(input as AgreementCancellationInfo);
        }

        /// <summary>
        /// Returns true if AgreementCancellationInfo instances are equal
        /// </summary>
        /// <param name="input">Instance of AgreementCancellationInfo to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(AgreementCancellationInfo input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Comment == input.Comment ||
                    (this.Comment != null &&
                    this.Comment.Equals(input.Comment))
                ) && 
                (
                    this.NotifyOthers == input.NotifyOthers ||
                    (this.NotifyOthers != null &&
                    this.NotifyOthers.Equals(input.NotifyOthers))
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
                if (this.Comment != null)
                    hashCode = hashCode * 59 + this.Comment.GetHashCode();
                if (this.NotifyOthers != null)
                    hashCode = hashCode * 59 + this.NotifyOthers.GetHashCode();
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
