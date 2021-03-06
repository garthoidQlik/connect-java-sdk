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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * V1PaymentItemDetail
 */

public class V1PaymentItemDetail {
  @JsonProperty("category_name")
  private String categoryName = null;

  @JsonProperty("sku")
  private String sku = null;

  @JsonProperty("item_id")
  private String itemId = null;

  @JsonProperty("item_variation_id")
  private String itemVariationId = null;

  public V1PaymentItemDetail categoryName(String categoryName) {
    this.categoryName = categoryName;
    return this;
  }

   /**
   * The name of the item's merchant-defined category, if any.
   * @return categoryName
  **/
  @ApiModelProperty(value = "The name of the item's merchant-defined category, if any.")
  public String getCategoryName() {
    return categoryName;
  }

  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }

  public V1PaymentItemDetail sku(String sku) {
    this.sku = sku;
    return this;
  }

   /**
   *  The item's merchant-defined SKU, if any.
   * @return sku
  **/
  @ApiModelProperty(value = " The item's merchant-defined SKU, if any.")
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  public V1PaymentItemDetail itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

   /**
   * The unique ID of the item purchased, if any.
   * @return itemId
  **/
  @ApiModelProperty(value = "The unique ID of the item purchased, if any.")
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public V1PaymentItemDetail itemVariationId(String itemVariationId) {
    this.itemVariationId = itemVariationId;
    return this;
  }

   /**
   * The unique ID of the item variation purchased, if any.
   * @return itemVariationId
  **/
  @ApiModelProperty(value = "The unique ID of the item variation purchased, if any.")
  public String getItemVariationId() {
    return itemVariationId;
  }

  public void setItemVariationId(String itemVariationId) {
    this.itemVariationId = itemVariationId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PaymentItemDetail v1PaymentItemDetail = (V1PaymentItemDetail) o;
    return Objects.equals(this.categoryName, v1PaymentItemDetail.categoryName) &&
        Objects.equals(this.sku, v1PaymentItemDetail.sku) &&
        Objects.equals(this.itemId, v1PaymentItemDetail.itemId) &&
        Objects.equals(this.itemVariationId, v1PaymentItemDetail.itemVariationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryName, sku, itemId, itemVariationId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PaymentItemDetail {\n");
    
    sb.append("    categoryName: ").append(toIndentedString(categoryName)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    itemVariationId: ").append(toIndentedString(itemVariationId)).append("\n");
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

