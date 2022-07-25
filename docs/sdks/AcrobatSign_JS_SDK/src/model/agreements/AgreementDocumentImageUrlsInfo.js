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
    define(['ApiClient', 'model/agreements/DocumentImageUrls'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./DocumentImageUrls'));
  } else {
    // Browser globals (root is window)
    if (!root.SwaggerJsClient) {
      root.SwaggerJsClient = {};
    }
    root.SwaggerJsClient.AgreementDocumentImageUrlsInfo = factory(root.SwaggerJsClient.ApiClient, root.SwaggerJsClient.DocumentImageUrls);
  }
}(this, function(ApiClient, DocumentImageUrls) {
  'use strict';




  /**
   * The AgreementDocumentImageUrlsInfo model module.
   * @module model/agreements/AgreementDocumentImageUrlsInfo
   * @version 6.0.0
   */

  /**
   * Constructs a new <code>AgreementDocumentImageUrlsInfo</code>.
   * @alias module:model/agreements/AgreementDocumentImageUrlsInfo
   * @class
   */
  var exports = function() {
    var _this = this;



  };

  /**
   * Constructs a <code>AgreementDocumentImageUrlsInfo</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/agreements/AgreementDocumentImageUrlsInfo} obj Optional instance to populate.
   * @return {module:model/agreements/AgreementDocumentImageUrlsInfo} The populated <code>AgreementDocumentImageUrlsInfo</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('documentId')) {
        obj['documentId'] = ApiClient.convertToType(data['documentId'], 'String');
      }
      if (data.hasOwnProperty('documentImageUrlsList')) {
        obj['documentImageUrlsList'] = ApiClient.convertToType(data['documentImageUrlsList'], [DocumentImageUrls]);
      }
    }
    return obj;
  }

  /**
   * Id of the document
   * @member {String} documentId
   */
  exports.prototype['documentId'] = undefined;
  /**
   * A list of documents image URLs.
   * @member {Array.<module:model/agreements/DocumentImageUrls>} documentImageUrlsList
   */
  exports.prototype['documentImageUrlsList'] = undefined;



  return exports;
}));


