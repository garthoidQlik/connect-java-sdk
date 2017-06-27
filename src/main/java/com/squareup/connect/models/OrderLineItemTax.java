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
import com.squareup.connect.models.Money;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Represents a tax that applies to one or more line items in an order.
 */
@ApiModel(description = "Represents a tax that applies to one or more line items in an order.")

public class OrderLineItemTax {
  @JsonProperty("name")
  private String name = null;

  /**
   * Indicates the calculation method used to apply the tax.  See [OrderLineItemTaxType](#type-orderlineitemtaxtype) for possible values.
   */
  public enum TypeEnum {
    UNKNOWN("UNKNOWN"),
    
    ADDITIVE("ADDITIVE"),
    
    INCLUSIVE("INCLUSIVE");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("type")
  private TypeEnum type = null;

  @JsonProperty("percentage")
  private String percentage = null;

  @JsonProperty("applied_money")
  private Money appliedMoney = null;

  public OrderLineItemTax name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The tax's name.
   * @return name
  **/
  @ApiModelProperty(value = "The tax's name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OrderLineItemTax type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Indicates the calculation method used to apply the tax.  See [OrderLineItemTaxType](#type-orderlineitemtaxtype) for possible values.
   * @return type
  **/
  @ApiModelProperty(value = "Indicates the calculation method used to apply the tax.  See [OrderLineItemTaxType](#type-orderlineitemtaxtype) for possible values.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public OrderLineItemTax percentage(String percentage) {
    this.percentage = percentage;
    return this;
  }

   /**
   * The percentage of the tax, as a string representation of a decimal number.  A value of `7.25` corresponds to a percentage of 7.25%.
   * @return percentage
  **/
  @ApiModelProperty(value = "The percentage of the tax, as a string representation of a decimal number.  A value of `7.25` corresponds to a percentage of 7.25%.")
  public String getPercentage() {
    return percentage;
  }

  public void setPercentage(String percentage) {
    this.percentage = percentage;
  }

  public OrderLineItemTax appliedMoney(Money appliedMoney) {
    this.appliedMoney = appliedMoney;
    return this;
  }

   /**
   * The amount of the money applied by the tax in an order.
   * @return appliedMoney
  **/
  @ApiModelProperty(value = "The amount of the money applied by the tax in an order.")
  public Money getAppliedMoney() {
    return appliedMoney;
  }

  public void setAppliedMoney(Money appliedMoney) {
    this.appliedMoney = appliedMoney;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderLineItemTax orderLineItemTax = (OrderLineItemTax) o;
    return Objects.equals(this.name, orderLineItemTax.name) &&
        Objects.equals(this.type, orderLineItemTax.type) &&
        Objects.equals(this.percentage, orderLineItemTax.percentage) &&
        Objects.equals(this.appliedMoney, orderLineItemTax.appliedMoney);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, percentage, appliedMoney);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderLineItemTax {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    appliedMoney: ").append(toIndentedString(appliedMoney)).append("\n");
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

