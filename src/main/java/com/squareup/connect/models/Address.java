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
 * Represents a physical address.
 */
@ApiModel(description = "Represents a physical address.")

public class Address {
  @JsonProperty("address_line_1")
  private String addressLine1 = null;

  @JsonProperty("address_line_2")
  private String addressLine2 = null;

  @JsonProperty("address_line_3")
  private String addressLine3 = null;

  @JsonProperty("locality")
  private String locality = null;

  @JsonProperty("sublocality")
  private String sublocality = null;

  @JsonProperty("sublocality_2")
  private String sublocality2 = null;

  @JsonProperty("sublocality_3")
  private String sublocality3 = null;

  @JsonProperty("administrative_district_level_1")
  private String administrativeDistrictLevel1 = null;

  @JsonProperty("administrative_district_level_2")
  private String administrativeDistrictLevel2 = null;

  @JsonProperty("administrative_district_level_3")
  private String administrativeDistrictLevel3 = null;

  @JsonProperty("postal_code")
  private String postalCode = null;

  /**
   * The address's country, in ISO 3166-1-alpha-2 format.
   */
  public enum CountryEnum {
    ZZ("ZZ"),
    
    AD("AD"),
    
    AE("AE"),
    
    AF("AF"),
    
    AG("AG"),
    
    AI("AI"),
    
    AL("AL"),
    
    AM("AM"),
    
    AO("AO"),
    
    AQ("AQ"),
    
    AR("AR"),
    
    AS("AS"),
    
    AT("AT"),
    
    AU("AU"),
    
    AW("AW"),
    
    AX("AX"),
    
    AZ("AZ"),
    
    BA("BA"),
    
    BB("BB"),
    
    BD("BD"),
    
    BE("BE"),
    
    BF("BF"),
    
    BG("BG"),
    
    BH("BH"),
    
    BI("BI"),
    
    BJ("BJ"),
    
    BL("BL"),
    
    BM("BM"),
    
    BN("BN"),
    
    BO("BO"),
    
    BQ("BQ"),
    
    BR("BR"),
    
    BS("BS"),
    
    BT("BT"),
    
    BV("BV"),
    
    BW("BW"),
    
    BY("BY"),
    
    BZ("BZ"),
    
    CA("CA"),
    
    CC("CC"),
    
    CD("CD"),
    
    CF("CF"),
    
    CG("CG"),
    
    CH("CH"),
    
    CI("CI"),
    
    CK("CK"),
    
    CL("CL"),
    
    CM("CM"),
    
    CN("CN"),
    
    CO("CO"),
    
    CR("CR"),
    
    CU("CU"),
    
    CV("CV"),
    
    CW("CW"),
    
    CX("CX"),
    
    CY("CY"),
    
    CZ("CZ"),
    
    DE("DE"),
    
    DJ("DJ"),
    
    DK("DK"),
    
    DM("DM"),
    
    DO("DO"),
    
    DZ("DZ"),
    
    EC("EC"),
    
    EE("EE"),
    
    EG("EG"),
    
    EH("EH"),
    
    ER("ER"),
    
    ES("ES"),
    
    ET("ET"),
    
    FI("FI"),
    
    FJ("FJ"),
    
    FK("FK"),
    
    FM("FM"),
    
    FO("FO"),
    
    FR("FR"),
    
    GA("GA"),
    
    GB("GB"),
    
    GD("GD"),
    
    GE("GE"),
    
    GF("GF"),
    
    GG("GG"),
    
    GH("GH"),
    
    GI("GI"),
    
    GL("GL"),
    
    GM("GM"),
    
    GN("GN"),
    
    GP("GP"),
    
    GQ("GQ"),
    
    GR("GR"),
    
    GS("GS"),
    
    GT("GT"),
    
    GU("GU"),
    
    GW("GW"),
    
    GY("GY"),
    
    HK("HK"),
    
    HM("HM"),
    
    HN("HN"),
    
    HR("HR"),
    
    HT("HT"),
    
    HU("HU"),
    
    ID("ID"),
    
    IE("IE"),
    
    IL("IL"),
    
    IM("IM"),
    
    IN("IN"),
    
    IO("IO"),
    
    IQ("IQ"),
    
    IR("IR"),
    
    IS("IS"),
    
    IT("IT"),
    
    JE("JE"),
    
    JM("JM"),
    
    JO("JO"),
    
    JP("JP"),
    
    KE("KE"),
    
    KG("KG"),
    
    KH("KH"),
    
    KI("KI"),
    
    KM("KM"),
    
    KN("KN"),
    
    KP("KP"),
    
    KR("KR"),
    
    KW("KW"),
    
    KY("KY"),
    
    KZ("KZ"),
    
    LA("LA"),
    
    LB("LB"),
    
    LC("LC"),
    
    LI("LI"),
    
    LK("LK"),
    
    LR("LR"),
    
    LS("LS"),
    
    LT("LT"),
    
    LU("LU"),
    
    LV("LV"),
    
    LY("LY"),
    
    MA("MA"),
    
    MC("MC"),
    
    MD("MD"),
    
    ME("ME"),
    
    MF("MF"),
    
    MG("MG"),
    
    MH("MH"),
    
    MK("MK"),
    
    ML("ML"),
    
    MM("MM"),
    
    MN("MN"),
    
    MO("MO"),
    
    MP("MP"),
    
    MQ("MQ"),
    
    MR("MR"),
    
    MS("MS"),
    
    MT("MT"),
    
    MU("MU"),
    
    MV("MV"),
    
    MW("MW"),
    
    MX("MX"),
    
    MY("MY"),
    
    MZ("MZ"),
    
    NA("NA"),
    
    NC("NC"),
    
    NE("NE"),
    
    NF("NF"),
    
    NG("NG"),
    
    NI("NI"),
    
    NL("NL"),
    
    NO("NO"),
    
    NP("NP"),
    
    NR("NR"),
    
    NU("NU"),
    
    NZ("NZ"),
    
    OM("OM"),
    
    PA("PA"),
    
    PE("PE"),
    
    PF("PF"),
    
    PG("PG"),
    
    PH("PH"),
    
    PK("PK"),
    
    PL("PL"),
    
    PM("PM"),
    
    PN("PN"),
    
    PR("PR"),
    
    PS("PS"),
    
    PT("PT"),
    
    PW("PW"),
    
    PY("PY"),
    
    QA("QA"),
    
    RE("RE"),
    
    RO("RO"),
    
    RS("RS"),
    
    RU("RU"),
    
    RW("RW"),
    
    SA("SA"),
    
    SB("SB"),
    
    SC("SC"),
    
    SD("SD"),
    
    SE("SE"),
    
    SG("SG"),
    
    SH("SH"),
    
    SI("SI"),
    
    SJ("SJ"),
    
    SK("SK"),
    
    SL("SL"),
    
    SM("SM"),
    
    SN("SN"),
    
    SO("SO"),
    
    SR("SR"),
    
    SS("SS"),
    
    ST("ST"),
    
    SV("SV"),
    
    SX("SX"),
    
    SY("SY"),
    
    SZ("SZ"),
    
    TC("TC"),
    
    TD("TD"),
    
    TF("TF"),
    
    TG("TG"),
    
    TH("TH"),
    
    TJ("TJ"),
    
    TK("TK"),
    
    TL("TL"),
    
    TM("TM"),
    
    TN("TN"),
    
    TO("TO"),
    
    TR("TR"),
    
    TT("TT"),
    
    TV("TV"),
    
    TW("TW"),
    
    TZ("TZ"),
    
    UA("UA"),
    
    UG("UG"),
    
    UM("UM"),
    
    US("US"),
    
    UY("UY"),
    
    UZ("UZ"),
    
    VA("VA"),
    
    VC("VC"),
    
    VE("VE"),
    
    VG("VG"),
    
    VI("VI"),
    
    VN("VN"),
    
    VU("VU"),
    
    WF("WF"),
    
    WS("WS"),
    
    YE("YE"),
    
    YT("YT"),
    
    ZA("ZA"),
    
    ZM("ZM"),
    
    ZW("ZW");

    private String value;

    CountryEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CountryEnum fromValue(String text) {
      for (CountryEnum b : CountryEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("country")
  private CountryEnum country = null;

  @JsonProperty("first_name")
  private String firstName = null;

  @JsonProperty("last_name")
  private String lastName = null;

  @JsonProperty("organization")
  private String organization = null;

  public Address addressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
    return this;
  }

   /**
   * The first line of the address.  Fields that start with `address_line` provide the address's most specific details, like street number, street name, and building name. They do *not* provide less specific details like city, state/province, or country (these details are provided in other fields).
   * @return addressLine1
  **/
  @ApiModelProperty(value = "The first line of the address.  Fields that start with `address_line` provide the address's most specific details, like street number, street name, and building name. They do *not* provide less specific details like city, state/province, or country (these details are provided in other fields).")
  public String getAddressLine1() {
    return addressLine1;
  }

  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }

  public Address addressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
    return this;
  }

   /**
   * The second line of the address, if any.
   * @return addressLine2
  **/
  @ApiModelProperty(value = "The second line of the address, if any.")
  public String getAddressLine2() {
    return addressLine2;
  }

  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }

  public Address addressLine3(String addressLine3) {
    this.addressLine3 = addressLine3;
    return this;
  }

   /**
   * The third line of the address, if any.
   * @return addressLine3
  **/
  @ApiModelProperty(value = "The third line of the address, if any.")
  public String getAddressLine3() {
    return addressLine3;
  }

  public void setAddressLine3(String addressLine3) {
    this.addressLine3 = addressLine3;
  }

  public Address locality(String locality) {
    this.locality = locality;
    return this;
  }

   /**
   * The city or town of the address.
   * @return locality
  **/
  @ApiModelProperty(value = "The city or town of the address.")
  public String getLocality() {
    return locality;
  }

  public void setLocality(String locality) {
    this.locality = locality;
  }

  public Address sublocality(String sublocality) {
    this.sublocality = sublocality;
    return this;
  }

   /**
   * A civil region within the address's `locality`, if any.
   * @return sublocality
  **/
  @ApiModelProperty(value = "A civil region within the address's `locality`, if any.")
  public String getSublocality() {
    return sublocality;
  }

  public void setSublocality(String sublocality) {
    this.sublocality = sublocality;
  }

  public Address sublocality2(String sublocality2) {
    this.sublocality2 = sublocality2;
    return this;
  }

   /**
   * A civil region within the address's `sublocality`, if any.
   * @return sublocality2
  **/
  @ApiModelProperty(value = "A civil region within the address's `sublocality`, if any.")
  public String getSublocality2() {
    return sublocality2;
  }

  public void setSublocality2(String sublocality2) {
    this.sublocality2 = sublocality2;
  }

  public Address sublocality3(String sublocality3) {
    this.sublocality3 = sublocality3;
    return this;
  }

   /**
   * A civil region within the address's `sublocality_2`, if any.
   * @return sublocality3
  **/
  @ApiModelProperty(value = "A civil region within the address's `sublocality_2`, if any.")
  public String getSublocality3() {
    return sublocality3;
  }

  public void setSublocality3(String sublocality3) {
    this.sublocality3 = sublocality3;
  }

  public Address administrativeDistrictLevel1(String administrativeDistrictLevel1) {
    this.administrativeDistrictLevel1 = administrativeDistrictLevel1;
    return this;
  }

   /**
   * A civil entity within the address's country. In the US, this is the state.
   * @return administrativeDistrictLevel1
  **/
  @ApiModelProperty(value = "A civil entity within the address's country. In the US, this is the state.")
  public String getAdministrativeDistrictLevel1() {
    return administrativeDistrictLevel1;
  }

  public void setAdministrativeDistrictLevel1(String administrativeDistrictLevel1) {
    this.administrativeDistrictLevel1 = administrativeDistrictLevel1;
  }

  public Address administrativeDistrictLevel2(String administrativeDistrictLevel2) {
    this.administrativeDistrictLevel2 = administrativeDistrictLevel2;
    return this;
  }

   /**
   * A civil entity within the address's `administrative_district_level_1`. In the US, this is the county.
   * @return administrativeDistrictLevel2
  **/
  @ApiModelProperty(value = "A civil entity within the address's `administrative_district_level_1`. In the US, this is the county.")
  public String getAdministrativeDistrictLevel2() {
    return administrativeDistrictLevel2;
  }

  public void setAdministrativeDistrictLevel2(String administrativeDistrictLevel2) {
    this.administrativeDistrictLevel2 = administrativeDistrictLevel2;
  }

  public Address administrativeDistrictLevel3(String administrativeDistrictLevel3) {
    this.administrativeDistrictLevel3 = administrativeDistrictLevel3;
    return this;
  }

   /**
   * A civil entity within the address's `administrative_district_level_2`, if any.
   * @return administrativeDistrictLevel3
  **/
  @ApiModelProperty(value = "A civil entity within the address's `administrative_district_level_2`, if any.")
  public String getAdministrativeDistrictLevel3() {
    return administrativeDistrictLevel3;
  }

  public void setAdministrativeDistrictLevel3(String administrativeDistrictLevel3) {
    this.administrativeDistrictLevel3 = administrativeDistrictLevel3;
  }

  public Address postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * The address's postal code.
   * @return postalCode
  **/
  @ApiModelProperty(value = "The address's postal code.")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public Address country(CountryEnum country) {
    this.country = country;
    return this;
  }

   /**
   * The address's country, in ISO 3166-1-alpha-2 format.
   * @return country
  **/
  @ApiModelProperty(value = "The address's country, in ISO 3166-1-alpha-2 format.")
  public CountryEnum getCountry() {
    return country;
  }

  public void setCountry(CountryEnum country) {
    this.country = country;
  }

  public Address firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Optional first name when it's representing recipient.
   * @return firstName
  **/
  @ApiModelProperty(value = "Optional first name when it's representing recipient.")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Address lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Optional last name when it's representing recipient.
   * @return lastName
  **/
  @ApiModelProperty(value = "Optional last name when it's representing recipient.")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Address organization(String organization) {
    this.organization = organization;
    return this;
  }

   /**
   * Optional organization name when it's representing recipient.
   * @return organization
  **/
  @ApiModelProperty(value = "Optional organization name when it's representing recipient.")
  public String getOrganization() {
    return organization;
  }

  public void setOrganization(String organization) {
    this.organization = organization;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.addressLine1, address.addressLine1) &&
        Objects.equals(this.addressLine2, address.addressLine2) &&
        Objects.equals(this.addressLine3, address.addressLine3) &&
        Objects.equals(this.locality, address.locality) &&
        Objects.equals(this.sublocality, address.sublocality) &&
        Objects.equals(this.sublocality2, address.sublocality2) &&
        Objects.equals(this.sublocality3, address.sublocality3) &&
        Objects.equals(this.administrativeDistrictLevel1, address.administrativeDistrictLevel1) &&
        Objects.equals(this.administrativeDistrictLevel2, address.administrativeDistrictLevel2) &&
        Objects.equals(this.administrativeDistrictLevel3, address.administrativeDistrictLevel3) &&
        Objects.equals(this.postalCode, address.postalCode) &&
        Objects.equals(this.country, address.country) &&
        Objects.equals(this.firstName, address.firstName) &&
        Objects.equals(this.lastName, address.lastName) &&
        Objects.equals(this.organization, address.organization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressLine1, addressLine2, addressLine3, locality, sublocality, sublocality2, sublocality3, administrativeDistrictLevel1, administrativeDistrictLevel2, administrativeDistrictLevel3, postalCode, country, firstName, lastName, organization);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    addressLine3: ").append(toIndentedString(addressLine3)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    sublocality: ").append(toIndentedString(sublocality)).append("\n");
    sb.append("    sublocality2: ").append(toIndentedString(sublocality2)).append("\n");
    sb.append("    sublocality3: ").append(toIndentedString(sublocality3)).append("\n");
    sb.append("    administrativeDistrictLevel1: ").append(toIndentedString(administrativeDistrictLevel1)).append("\n");
    sb.append("    administrativeDistrictLevel2: ").append(toIndentedString(administrativeDistrictLevel2)).append("\n");
    sb.append("    administrativeDistrictLevel3: ").append(toIndentedString(administrativeDistrictLevel3)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
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

