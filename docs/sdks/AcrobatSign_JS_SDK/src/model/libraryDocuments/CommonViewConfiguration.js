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
    define(['ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.SwaggerJsClient) {
      root.SwaggerJsClient = {};
    }
    root.SwaggerJsClient.CommonViewConfiguration = factory(root.SwaggerJsClient.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The CommonViewConfiguration model module.
   * @module model/libraryDocuments/CommonViewConfiguration
   * @version 6.0.0
   */

  /**
   * Constructs a new <code>CommonViewConfiguration</code>.
   * @alias module:model/libraryDocuments/CommonViewConfiguration
   * @class
   */
  var exports = function() {
    var _this = this;




  };

  /**
   * Constructs a <code>CommonViewConfiguration</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/libraryDocuments/CommonViewConfiguration} obj Optional instance to populate.
   * @return {module:model/libraryDocuments/CommonViewConfiguration} The populated <code>CommonViewConfiguration</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('autoLoginUser')) {
        obj['autoLoginUser'] = ApiClient.convertToType(data['autoLoginUser'], 'Boolean');
      }
      if (data.hasOwnProperty('locale')) {
        obj['locale'] = ApiClient.convertToType(data['locale'], 'String');
      }
      if (data.hasOwnProperty('noChrome')) {
        obj['noChrome'] = ApiClient.convertToType(data['noChrome'], 'Boolean');
      }
    }
    return obj;
  }

  /**
   * Auto LogIn Flag. If true, the URL returned will automatically log the user in. If false, the URL returned will require the credentials. By default its value is false
   * @member {Boolean} autoLoginUser
   */
  exports.prototype['autoLoginUser'] = undefined;
  /**
   * Message template locale
   * @member {String} locale
   */
  exports.prototype['locale'] = undefined;
  /**
   * No Chrome Flag. If true, the embedded page is shown without a navigation header or footer. If false, the standard page header and footer will be present. By default its value is false
   * @member {Boolean} noChrome
   */
  exports.prototype['noChrome'] = undefined;



  return exports;
}));


