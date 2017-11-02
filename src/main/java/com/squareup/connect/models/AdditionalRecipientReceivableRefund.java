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
 * A refund of an [AdditionalRecipientReceivable](#type-additionalrecipientreceivable). This includes the ID of the additional recipient receivable associated to this object, as well as a reference to the [Refund](#type-refund) that created this receivable refund.
 */
@ApiModel(description = "A refund of an [AdditionalRecipientReceivable](#type-additionalrecipientreceivable). This includes the ID of the additional recipient receivable associated to this object, as well as a reference to the [Refund](#type-refund) that created this receivable refund.")

public class AdditionalRecipientReceivableRefund {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("receivable_id")
  private String receivableId = null;

  @JsonProperty("refund_id")
  private String refundId = null;

  @JsonProperty("transaction_location_id")
  private String transactionLocationId = null;

  @JsonProperty("amount_money")
  private Money amountMoney = null;

  @JsonProperty("created_at")
  private String createdAt = null;

  public AdditionalRecipientReceivableRefund id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The receivable refund's unique ID, issued by Square payments servers.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The receivable refund's unique ID, issued by Square payments servers.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AdditionalRecipientReceivableRefund receivableId(String receivableId) {
    this.receivableId = receivableId;
    return this;
  }

   /**
   * The ID of the receivable that the refund was applied to.
   * @return receivableId
  **/
  @ApiModelProperty(required = true, value = "The ID of the receivable that the refund was applied to.")
  public String getReceivableId() {
    return receivableId;
  }

  public void setReceivableId(String receivableId) {
    this.receivableId = receivableId;
  }

  public AdditionalRecipientReceivableRefund refundId(String refundId) {
    this.refundId = refundId;
    return this;
  }

   /**
   * The ID of the refund that is associated to this receivable refund.
   * @return refundId
  **/
  @ApiModelProperty(required = true, value = "The ID of the refund that is associated to this receivable refund.")
  public String getRefundId() {
    return refundId;
  }

  public void setRefundId(String refundId) {
    this.refundId = refundId;
  }

  public AdditionalRecipientReceivableRefund transactionLocationId(String transactionLocationId) {
    this.transactionLocationId = transactionLocationId;
    return this;
  }

   /**
   * The ID of the location that created the receivable. This is the location ID on the associated transaction.
   * @return transactionLocationId
  **/
  @ApiModelProperty(required = true, value = "The ID of the location that created the receivable. This is the location ID on the associated transaction.")
  public String getTransactionLocationId() {
    return transactionLocationId;
  }

  public void setTransactionLocationId(String transactionLocationId) {
    this.transactionLocationId = transactionLocationId;
  }

  public AdditionalRecipientReceivableRefund amountMoney(Money amountMoney) {
    this.amountMoney = amountMoney;
    return this;
  }

   /**
   * The amount of the refund. This will always be non-negative.
   * @return amountMoney
  **/
  @ApiModelProperty(required = true, value = "The amount of the refund. This will always be non-negative.")
  public Money getAmountMoney() {
    return amountMoney;
  }

  public void setAmountMoney(Money amountMoney) {
    this.amountMoney = amountMoney;
  }

  public AdditionalRecipientReceivableRefund createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The time when the refund was created, in RFC 3339 format.
   * @return createdAt
  **/
  @ApiModelProperty(value = "The time when the refund was created, in RFC 3339 format.")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalRecipientReceivableRefund additionalRecipientReceivableRefund = (AdditionalRecipientReceivableRefund) o;
    return Objects.equals(this.id, additionalRecipientReceivableRefund.id) &&
        Objects.equals(this.receivableId, additionalRecipientReceivableRefund.receivableId) &&
        Objects.equals(this.refundId, additionalRecipientReceivableRefund.refundId) &&
        Objects.equals(this.transactionLocationId, additionalRecipientReceivableRefund.transactionLocationId) &&
        Objects.equals(this.amountMoney, additionalRecipientReceivableRefund.amountMoney) &&
        Objects.equals(this.createdAt, additionalRecipientReceivableRefund.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, receivableId, refundId, transactionLocationId, amountMoney, createdAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalRecipientReceivableRefund {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    receivableId: ").append(toIndentedString(receivableId)).append("\n");
    sb.append("    refundId: ").append(toIndentedString(refundId)).append("\n");
    sb.append("    transactionLocationId: ").append(toIndentedString(transactionLocationId)).append("\n");
    sb.append("    amountMoney: ").append(toIndentedString(amountMoney)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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

