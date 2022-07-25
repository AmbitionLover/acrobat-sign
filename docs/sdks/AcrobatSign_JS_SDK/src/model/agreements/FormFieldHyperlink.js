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


/**
 * 
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 6.0.0
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.3.1
 *
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/agreements/FormFieldLocation'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./FormFieldLocation'));
  } else {
    // Browser globals (root is window)
    if (!root.SwaggerJsClient) {
      root.SwaggerJsClient = {};
    }
    root.SwaggerJsClient.FormFieldHyperlink = factory(root.SwaggerJsClient.ApiClient, root.SwaggerJsClient.FormFieldLocation);
  }
}(this, function(ApiClient, FormFieldLocation) {
  'use strict';




  /**
   * The FormFieldHyperlink model module.
   * @module model/agreements/FormFieldHyperlink
   * @version 6.0.0
   */

  /**
   * Constructs a new <code>FormFieldHyperlink</code>.
   * Hyperlink-specific data for hyperlink form fields
   * @alias module:model/agreements/FormFieldHyperlink
   * @class
   */
  var exports = function() {
    var _this = this;




  };

  /**
   * Constructs a <code>FormFieldHyperlink</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/agreements/FormFieldHyperlink} obj Optional instance to populate.
   * @return {module:model/agreements/FormFieldHyperlink} The populated <code>FormFieldHyperlink</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('documentLocation')) {
        obj['documentLocation'] = FormFieldLocation.constructFromObject(data['documentLocation']);
      }
      if (data.hasOwnProperty('linkType')) {
        obj['linkType'] = ApiClient.convertToType(data['linkType'], 'String');
      }
      if (data.hasOwnProperty('url')) {
        obj['url'] = ApiClient.convertToType(data['url'], 'String');
      }
    }
    return obj;
  }

  /**
   * Location on the document pointed by the link in case of INTERNAL type link
   * @member {module:model/agreements/FormFieldLocation} documentLocation
   */
  exports.prototype['documentLocation'] = undefined;
  /**
   * Type of link in an agreement.
   * @member {module:model/agreements/FormFieldHyperlink.LinkTypeEnum} linkType
   */
  exports.prototype['linkType'] = undefined;
  /**
   * URL, in case of EXTERNAL type link
   * @member {String} url
   */
  exports.prototype['url'] = undefined;


  /**
   * Allowed values for the <code>linkType</code> property.
   * @enum {String}
   * @readonly
   */
  exports.LinkTypeEnum = {
    /**
     * value: "INTERNAL"
     * @const
     */
    "INTERNAL": "INTERNAL",
    /**
     * value: "EXTERNAL"
     * @const
     */
    "EXTERNAL": "EXTERNAL",
    /**
     * value: "FROM_TEXT"
     * @const
     */
    "FROM_TEXT": "FROM_TEXT"  };


  return exports;
}));


