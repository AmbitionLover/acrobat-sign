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
    /// SigningUrlSetInfo
    /// </summary>
    [DataContract]
    public partial class SigningUrlSetInfo :  IEquatable<SigningUrlSetInfo>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SigningUrlSetInfo" /> class.
        /// </summary>
        /// <param name="SigningUrlSetName">The name of the current signer set. Returned only, if the API caller is the sender of agreement.</param>
        /// <param name="SigningUrls">An array of urls for current signer set..</param>
        public SigningUrlSetInfo(string SigningUrlSetName = default(string), List<SigningUrl> SigningUrls = default(List<SigningUrl>))
        {
            this.SigningUrlSetName = SigningUrlSetName;
            this.SigningUrls = SigningUrls;
        }
        
        /// <summary>
        /// The name of the current signer set. Returned only, if the API caller is the sender of agreement
        /// </summary>
        /// <value>The name of the current signer set. Returned only, if the API caller is the sender of agreement</value>
        [DataMember(Name="signingUrlSetName", EmitDefaultValue=false)]
        public string SigningUrlSetName { get; set; }

        /// <summary>
        /// An array of urls for current signer set.
        /// </summary>
        /// <value>An array of urls for current signer set.</value>
        [DataMember(Name="signingUrls", EmitDefaultValue=false)]
        public List<SigningUrl> SigningUrls { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class SigningUrlSetInfo {\n");
            sb.Append("  SigningUrlSetName: ").Append(SigningUrlSetName).Append("\n");
            sb.Append("  SigningUrls: ").Append(SigningUrls).Append("\n");
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
            return this.Equals(input as SigningUrlSetInfo);
        }

        /// <summary>
        /// Returns true if SigningUrlSetInfo instances are equal
        /// </summary>
        /// <param name="input">Instance of SigningUrlSetInfo to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SigningUrlSetInfo input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.SigningUrlSetName == input.SigningUrlSetName ||
                    (this.SigningUrlSetName != null &&
                    this.SigningUrlSetName.Equals(input.SigningUrlSetName))
                ) && 
                (
                    this.SigningUrls == input.SigningUrls ||
                    this.SigningUrls != null &&
                    this.SigningUrls.SequenceEqual(input.SigningUrls)
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
                if (this.SigningUrlSetName != null)
                    hashCode = hashCode * 59 + this.SigningUrlSetName.GetHashCode();
                if (this.SigningUrls != null)
                    hashCode = hashCode * 59 + this.SigningUrls.GetHashCode();
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
