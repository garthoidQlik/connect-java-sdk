/*
 * Square Connect API
 * Client library for accessing the Square Connect APIs
 *
 * OpenAPI spec version: 2.0
 * Contact: developers@squareup.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.squareup.connect.models;

import java.util.Objects;
import io.swagger.annotations.ApiModel;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Indicates how the discount is applied to the associated line item or order.
 */
public enum OrderLineItemDiscountType {
  
  UNKNOWN("UNKNOWN"),
  
  FIXED_PERCENTAGE("FIXED_PERCENTAGE"),
  
  FIXED_AMOUNT("FIXED_AMOUNT"),
  
  VARIABLE_PERCENTAGE("VARIABLE_PERCENTAGE"),
  
  VARIABLE_AMOUNT("VARIABLE_AMOUNT");

  private String value;

  OrderLineItemDiscountType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OrderLineItemDiscountType fromValue(String text) {
    for (OrderLineItemDiscountType b : OrderLineItemDiscountType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

