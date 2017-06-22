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
import com.squareup.connect.models.Address;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Represents the non-confidential details of a credit card.
 */
@ApiModel(description = "Represents the non-confidential details of a credit card.")

public class Card {
  @JsonProperty("id")
  private String id = null;

  /**
   * The card's brand (such as `VISA`). See [CardBrand](#type-cardbrand) for all possible values.
   */
  public enum CardBrandEnum {
    OTHER_BRAND("OTHER_BRAND"),
    
    VISA("VISA"),
    
    MASTERCARD("MASTERCARD"),
    
    AMERICAN_EXPRESS("AMERICAN_EXPRESS"),
    
    DISCOVER("DISCOVER"),
    
    DISCOVER_DINERS("DISCOVER_DINERS"),
    
    JCB("JCB"),
    
    CHINA_UNIONPAY("CHINA_UNIONPAY"),
    
    SQUARE_GIFT_CARD("SQUARE_GIFT_CARD");

    private String value;

    CardBrandEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CardBrandEnum fromValue(String text) {
      for (CardBrandEnum b : CardBrandEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("card_brand")
  private CardBrandEnum cardBrand = null;

  @JsonProperty("last_4")
  private String last4 = null;

  @JsonProperty("exp_month")
  private Long expMonth = null;

  @JsonProperty("exp_year")
  private Long expYear = null;

  @JsonProperty("cardholder_name")
  private String cardholderName = null;

  @JsonProperty("billing_address")
  private Address billingAddress = null;

  @JsonProperty("fingerprint")
  private String fingerprint = null;

  public Card id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The card's unique ID, if any.
   * @return id
  **/
  @ApiModelProperty(value = "The card's unique ID, if any.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Card cardBrand(CardBrandEnum cardBrand) {
    this.cardBrand = cardBrand;
    return this;
  }

   /**
   * The card's brand (such as `VISA`). See [CardBrand](#type-cardbrand) for all possible values.
   * @return cardBrand
  **/
  @ApiModelProperty(value = "The card's brand (such as `VISA`). See [CardBrand](#type-cardbrand) for all possible values.")
  public CardBrandEnum getCardBrand() {
    return cardBrand;
  }

  public void setCardBrand(CardBrandEnum cardBrand) {
    this.cardBrand = cardBrand;
  }

  public Card last4(String last4) {
    this.last4 = last4;
    return this;
  }

   /**
   * The last 4 digits of the card's number.
   * @return last4
  **/
  @ApiModelProperty(value = "The last 4 digits of the card's number.")
  public String getLast4() {
    return last4;
  }

  public void setLast4(String last4) {
    this.last4 = last4;
  }

  public Card expMonth(Long expMonth) {
    this.expMonth = expMonth;
    return this;
  }

   /**
   * The month of the card's expiration date. This value is always between `1` and `12`, inclusive.
   * @return expMonth
  **/
  @ApiModelProperty(value = "The month of the card's expiration date. This value is always between `1` and `12`, inclusive.")
  public Long getExpMonth() {
    return expMonth;
  }

  public void setExpMonth(Long expMonth) {
    this.expMonth = expMonth;
  }

  public Card expYear(Long expYear) {
    this.expYear = expYear;
    return this;
  }

   /**
   * The four-digit year of the card's expiration date.
   * @return expYear
  **/
  @ApiModelProperty(value = "The four-digit year of the card's expiration date.")
  public Long getExpYear() {
    return expYear;
  }

  public void setExpYear(Long expYear) {
    this.expYear = expYear;
  }

  public Card cardholderName(String cardholderName) {
    this.cardholderName = cardholderName;
    return this;
  }

   /**
   * The cardholder name. This value is present only if this object represents a customer's card on file.
   * @return cardholderName
  **/
  @ApiModelProperty(value = "The cardholder name. This value is present only if this object represents a customer's card on file.")
  public String getCardholderName() {
    return cardholderName;
  }

  public void setCardholderName(String cardholderName) {
    this.cardholderName = cardholderName;
  }

  public Card billingAddress(Address billingAddress) {
    this.billingAddress = billingAddress;
    return this;
  }

   /**
   * The card's billing address. This value is present only if this object represents a customer's card on file.
   * @return billingAddress
  **/
  @ApiModelProperty(value = "The card's billing address. This value is present only if this object represents a customer's card on file.")
  public Address getBillingAddress() {
    return billingAddress;
  }

  public void setBillingAddress(Address billingAddress) {
    this.billingAddress = billingAddress;
  }

  public Card fingerprint(String fingerprint) {
    this.fingerprint = fingerprint;
    return this;
  }

   /**
   * The unique string fingerprint for the card.  The fingerprint is based on the credit card number and is unique to the merchant.  If a card is used at multiple locations for the same merchant, it will have the same fingerprint in each case. Note: Fingerprint may not exist on old transactions.
   * @return fingerprint
  **/
  @ApiModelProperty(value = "The unique string fingerprint for the card.  The fingerprint is based on the credit card number and is unique to the merchant.  If a card is used at multiple locations for the same merchant, it will have the same fingerprint in each case. Note: Fingerprint may not exist on old transactions.")
  public String getFingerprint() {
    return fingerprint;
  }

  public void setFingerprint(String fingerprint) {
    this.fingerprint = fingerprint;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Card card = (Card) o;
    return Objects.equals(this.id, card.id) &&
        Objects.equals(this.cardBrand, card.cardBrand) &&
        Objects.equals(this.last4, card.last4) &&
        Objects.equals(this.expMonth, card.expMonth) &&
        Objects.equals(this.expYear, card.expYear) &&
        Objects.equals(this.cardholderName, card.cardholderName) &&
        Objects.equals(this.billingAddress, card.billingAddress) &&
        Objects.equals(this.fingerprint, card.fingerprint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, cardBrand, last4, expMonth, expYear, cardholderName, billingAddress, fingerprint);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Card {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    cardBrand: ").append(toIndentedString(cardBrand)).append("\n");
    sb.append("    last4: ").append(toIndentedString(last4)).append("\n");
    sb.append("    expMonth: ").append(toIndentedString(expMonth)).append("\n");
    sb.append("    expYear: ").append(toIndentedString(expYear)).append("\n");
    sb.append("    cardholderName: ").append(toIndentedString(cardholderName)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    fingerprint: ").append(toIndentedString(fingerprint)).append("\n");
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

