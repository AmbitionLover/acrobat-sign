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
    // AMD.
    define(['expect.js', '../../src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require('../../src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.SwaggerJsClient);
  }
}(this, function(expect, SwaggerJsClient) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new SwaggerJsClient.AgreementView();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('AgreementView', function() {
    it('should create an instance of AgreementView', function() {
      // uncomment below and update the code to test AgreementView
      //var instane = new SwaggerJsClient.AgreementView();
      //expect(instance).to.be.a(SwaggerJsClient.AgreementView);
    });

    it('should have the property embeddedCode (base name: "embeddedCode")', function() {
      // uncomment below and update the code to test the property embeddedCode
      //var instane = new SwaggerJsClient.AgreementView();
      //expect(instance).to.be();
    });

    it('should have the property expiration (base name: "expiration")', function() {
      // uncomment below and update the code to test the property expiration
      //var instane = new SwaggerJsClient.AgreementView();
      //expect(instance).to.be();
    });

    it('should have the property isCurrent (base name: "isCurrent")', function() {
      // uncomment below and update the code to test the property isCurrent
      //var instane = new SwaggerJsClient.AgreementView();
      //expect(instance).to.be();
    });

    it('should have the property name (base name: "name")', function() {
      // uncomment below and update the code to test the property name
      //var instane = new SwaggerJsClient.AgreementView();
      //expect(instance).to.be();
    });

    it('should have the property url (base name: "url")', function() {
      // uncomment below and update the code to test the property url
      //var instane = new SwaggerJsClient.AgreementView();
      //expect(instance).to.be();
    });

  });

}));
