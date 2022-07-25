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
    /// Location information for form fields
    /// </summary>
    [DataContract]
    public partial class FormFieldLocation :  IEquatable<FormFieldLocation>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="FormFieldLocation" /> class.
        /// </summary>
        /// <param name="Height">Height of the form field in pixels.</param>
        /// <param name="Left">No. of pixels from left of the page for form field placement.</param>
        /// <param name="PageNumber">Number of the page where form field has to be placed, starting from 1..</param>
        /// <param name="Top">No. of pixels from bottom of the page for form field placement.</param>
        /// <param name="Width">Width of the form field in pixels.</param>
        public FormFieldLocation(double? Height = default(double?), double? Left = default(double?), int? PageNumber = default(int?), double? Top = default(double?), double? Width = default(double?))
        {
            this.Height = Height;
            this.Left = Left;
            this.PageNumber = PageNumber;
            this.Top = Top;
            this.Width = Width;
        }
        
        /// <summary>
        /// Height of the form field in pixels
        /// </summary>
        /// <value>Height of the form field in pixels</value>
        [DataMember(Name="height", EmitDefaultValue=false)]
        public double? Height { get; set; }

        /// <summary>
        /// No. of pixels from left of the page for form field placement
        /// </summary>
        /// <value>No. of pixels from left of the page for form field placement</value>
        [DataMember(Name="left", EmitDefaultValue=false)]
        public double? Left { get; set; }

        /// <summary>
        /// Number of the page where form field has to be placed, starting from 1.
        /// </summary>
        /// <value>Number of the page where form field has to be placed, starting from 1.</value>
        [DataMember(Name="pageNumber", EmitDefaultValue=false)]
        public int? PageNumber { get; set; }

        /// <summary>
        /// No. of pixels from bottom of the page for form field placement
        /// </summary>
        /// <value>No. of pixels from bottom of the page for form field placement</value>
        [DataMember(Name="top", EmitDefaultValue=false)]
        public double? Top { get; set; }

        /// <summary>
        /// Width of the form field in pixels
        /// </summary>
        /// <value>Width of the form field in pixels</value>
        [DataMember(Name="width", EmitDefaultValue=false)]
        public double? Width { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class FormFieldLocation {\n");
            sb.Append("  Height: ").Append(Height).Append("\n");
            sb.Append("  Left: ").Append(Left).Append("\n");
            sb.Append("  PageNumber: ").Append(PageNumber).Append("\n");
            sb.Append("  Top: ").Append(Top).Append("\n");
            sb.Append("  Width: ").Append(Width).Append("\n");
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
            return this.Equals(input as FormFieldLocation);
        }

        /// <summary>
        /// Returns true if FormFieldLocation instances are equal
        /// </summary>
        /// <param name="input">Instance of FormFieldLocation to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(FormFieldLocation input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Height == input.Height ||
                    (this.Height != null &&
                    this.Height.Equals(input.Height))
                ) && 
                (
                    this.Left == input.Left ||
                    (this.Left != null &&
                    this.Left.Equals(input.Left))
                ) && 
                (
                    this.PageNumber == input.PageNumber ||
                    (this.PageNumber != null &&
                    this.PageNumber.Equals(input.PageNumber))
                ) && 
                (
                    this.Top == input.Top ||
                    (this.Top != null &&
                    this.Top.Equals(input.Top))
                ) && 
                (
                    this.Width == input.Width ||
                    (this.Width != null &&
                    this.Width.Equals(input.Width))
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
                if (this.Height != null)
                    hashCode = hashCode * 59 + this.Height.GetHashCode();
                if (this.Left != null)
                    hashCode = hashCode * 59 + this.Left.GetHashCode();
                if (this.PageNumber != null)
                    hashCode = hashCode * 59 + this.PageNumber.GetHashCode();
                if (this.Top != null)
                    hashCode = hashCode * 59 + this.Top.GetHashCode();
                if (this.Width != null)
                    hashCode = hashCode * 59 + this.Width.GetHashCode();
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
