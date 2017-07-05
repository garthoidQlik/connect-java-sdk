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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.squareup.connect.models.V1Money;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * V1PaymentDiscount
 */

public class V1PaymentDiscount {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("applied_money")
  private V1Money appliedMoney = null;

  @JsonProperty("discount_id")
  private String discountId = null;

  public V1PaymentDiscount name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The discount's name.
   * @return name
  **/
  @ApiModelProperty(value = "The discount's name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1PaymentDiscount appliedMoney(V1Money appliedMoney) {
    this.appliedMoney = appliedMoney;
    return this;
  }

   /**
   * The amount of money that this discount adds to the payment (note that this value is always negative or zero).
   * @return appliedMoney
  **/
  @ApiModelProperty(value = "The amount of money that this discount adds to the payment (note that this value is always negative or zero).")
  public V1Money getAppliedMoney() {
    return appliedMoney;
  }

  public void setAppliedMoney(V1Money appliedMoney) {
    this.appliedMoney = appliedMoney;
  }

  public V1PaymentDiscount discountId(String discountId) {
    this.discountId = discountId;
    return this;
  }

   /**
   * The ID of the applied discount, if available. Discounts applied in older versions of Square Register might not have an ID.
   * @return discountId
  **/
  @ApiModelProperty(value = "The ID of the applied discount, if available. Discounts applied in older versions of Square Register might not have an ID.")
  public String getDiscountId() {
    return discountId;
  }

  public void setDiscountId(String discountId) {
    this.discountId = discountId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PaymentDiscount v1PaymentDiscount = (V1PaymentDiscount) o;
    return Objects.equals(this.name, v1PaymentDiscount.name) &&
        Objects.equals(this.appliedMoney, v1PaymentDiscount.appliedMoney) &&
        Objects.equals(this.discountId, v1PaymentDiscount.discountId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, appliedMoney, discountId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PaymentDiscount {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    appliedMoney: ").append(toIndentedString(appliedMoney)).append("\n");
    sb.append("    discountId: ").append(toIndentedString(discountId)).append("\n");
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

