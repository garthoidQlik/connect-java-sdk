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
import com.squareup.connect.models.CatalogModifierOverride;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Controls the properties of a [CatalogModifierList](#type-catalogmodifierlist) as it applies to this [CatalogItem](#type-catalogitem).
 */
@ApiModel(description = "Controls the properties of a [CatalogModifierList](#type-catalogmodifierlist) as it applies to this [CatalogItem](#type-catalogitem).")

public class CatalogItemModifierListInfo {
  @JsonProperty("modifier_list_id")
  private String modifierListId = null;

  @JsonProperty("modifier_overrides")
  private List<CatalogModifierOverride> modifierOverrides = new ArrayList<CatalogModifierOverride>();

  @JsonProperty("min_selected_modifiers")
  private Integer minSelectedModifiers = null;

  @JsonProperty("max_selected_modifiers")
  private Integer maxSelectedModifiers = null;

  @JsonProperty("enabled")
  private Boolean enabled = null;

  public CatalogItemModifierListInfo modifierListId(String modifierListId) {
    this.modifierListId = modifierListId;
    return this;
  }

   /**
   * The ID of the [CatalogModifierList](#type-catalogmodifierlist) controlled by this [CatalogModifierListInfo](#type-catalogmodifierlistinfo).
   * @return modifierListId
  **/
  @ApiModelProperty(required = true, value = "The ID of the [CatalogModifierList](#type-catalogmodifierlist) controlled by this [CatalogModifierListInfo](#type-catalogmodifierlistinfo).")
  public String getModifierListId() {
    return modifierListId;
  }

  public void setModifierListId(String modifierListId) {
    this.modifierListId = modifierListId;
  }

  public CatalogItemModifierListInfo modifierOverrides(List<CatalogModifierOverride> modifierOverrides) {
    this.modifierOverrides = modifierOverrides;
    return this;
  }

  public CatalogItemModifierListInfo addModifierOverridesItem(CatalogModifierOverride modifierOverridesItem) {
    this.modifierOverrides.add(modifierOverridesItem);
    return this;
  }

   /**
   * A set of [CatalogModifierOverride](#type-catalogmodifieroverride) objects that override whether a given [CatalogModifier](#type-catalogmodifier) is enabled by default.
   * @return modifierOverrides
  **/
  @ApiModelProperty(value = "A set of [CatalogModifierOverride](#type-catalogmodifieroverride) objects that override whether a given [CatalogModifier](#type-catalogmodifier) is enabled by default.")
  public List<CatalogModifierOverride> getModifierOverrides() {
    return modifierOverrides;
  }

  public void setModifierOverrides(List<CatalogModifierOverride> modifierOverrides) {
    this.modifierOverrides = modifierOverrides;
  }

  public CatalogItemModifierListInfo minSelectedModifiers(Integer minSelectedModifiers) {
    this.minSelectedModifiers = minSelectedModifiers;
    return this;
  }

   /**
   * If zero or larger, the smallest number of [CatalogModifier](#type-catalogmodifier)s that must be selected from this [CatalogModifierList](#type-catalogmodifierlist).
   * @return minSelectedModifiers
  **/
  @ApiModelProperty(value = "If zero or larger, the smallest number of [CatalogModifier](#type-catalogmodifier)s that must be selected from this [CatalogModifierList](#type-catalogmodifierlist).")
  public Integer getMinSelectedModifiers() {
    return minSelectedModifiers;
  }

  public void setMinSelectedModifiers(Integer minSelectedModifiers) {
    this.minSelectedModifiers = minSelectedModifiers;
  }

  public CatalogItemModifierListInfo maxSelectedModifiers(Integer maxSelectedModifiers) {
    this.maxSelectedModifiers = maxSelectedModifiers;
    return this;
  }

   /**
   * If zero or larger, the largest number of [CatalogModifier](#type-catalogmodifier)s that can be selected from this [CatalogModifierList](#type-catalogmodifierlist).
   * @return maxSelectedModifiers
  **/
  @ApiModelProperty(value = "If zero or larger, the largest number of [CatalogModifier](#type-catalogmodifier)s that can be selected from this [CatalogModifierList](#type-catalogmodifierlist).")
  public Integer getMaxSelectedModifiers() {
    return maxSelectedModifiers;
  }

  public void setMaxSelectedModifiers(Integer maxSelectedModifiers) {
    this.maxSelectedModifiers = maxSelectedModifiers;
  }

  public CatalogItemModifierListInfo enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * If `true`, enable this [CatalogModifierList](#type-catalogmodifierlist).
   * @return enabled
  **/
  @ApiModelProperty(value = "If `true`, enable this [CatalogModifierList](#type-catalogmodifierlist).")
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogItemModifierListInfo catalogItemModifierListInfo = (CatalogItemModifierListInfo) o;
    return Objects.equals(this.modifierListId, catalogItemModifierListInfo.modifierListId) &&
        Objects.equals(this.modifierOverrides, catalogItemModifierListInfo.modifierOverrides) &&
        Objects.equals(this.minSelectedModifiers, catalogItemModifierListInfo.minSelectedModifiers) &&
        Objects.equals(this.maxSelectedModifiers, catalogItemModifierListInfo.maxSelectedModifiers) &&
        Objects.equals(this.enabled, catalogItemModifierListInfo.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modifierListId, modifierOverrides, minSelectedModifiers, maxSelectedModifiers, enabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogItemModifierListInfo {\n");
    
    sb.append("    modifierListId: ").append(toIndentedString(modifierListId)).append("\n");
    sb.append("    modifierOverrides: ").append(toIndentedString(modifierOverrides)).append("\n");
    sb.append("    minSelectedModifiers: ").append(toIndentedString(minSelectedModifiers)).append("\n");
    sb.append("    maxSelectedModifiers: ").append(toIndentedString(maxSelectedModifiers)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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

