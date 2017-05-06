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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents one of a business&#39;s employees.
 */
@ApiModel(description = "Represents one of a business's employees.")

public class V1Employee {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("first_name")
  private String firstName = null;

  @JsonProperty("last_name")
  private String lastName = null;

  @JsonProperty("role_ids")
  private List<String> roleIds = new ArrayList<String>();

  @JsonProperty("authorized_location_ids")
  private List<String> authorizedLocationIds = new ArrayList<String>();

  @JsonProperty("email")
  private String email = null;

  /**
   * CWhether the employee is ACTIVE or INACTIVE. Inactive employees cannot sign in to Square Register.Merchants update this field from the Square Dashboard. 
   */
  public enum StatusEnum {
    ACTIVE("ACTIVE"),
    
    INACTIVE("INACTIVE");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("status")
  private StatusEnum status = null;

  @JsonProperty("external_id")
  private String externalId = null;

  @JsonProperty("created_at")
  private String createdAt = null;

  @JsonProperty("updated_at")
  private String updatedAt = null;

   /**
   * The employee's unique ID.
   * @return id
  **/
  @ApiModelProperty(value = "The employee's unique ID.")
  public String getId() {
    return id;
  }

  public V1Employee firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * The employee's first name.
   * @return firstName
  **/
  @ApiModelProperty(required = true, value = "The employee's first name.")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public V1Employee lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * The employee's last name.
   * @return lastName
  **/
  @ApiModelProperty(required = true, value = "The employee's last name.")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public V1Employee roleIds(List<String> roleIds) {
    this.roleIds = roleIds;
    return this;
  }

  public V1Employee addRoleIdsItem(String roleIdsItem) {
    this.roleIds.add(roleIdsItem);
    return this;
  }

   /**
   * The ids of the employee's associated roles. Currently, you can specify only one or zero roles per employee.
   * @return roleIds
  **/
  @ApiModelProperty(value = "The ids of the employee's associated roles. Currently, you can specify only one or zero roles per employee.")
  public List<String> getRoleIds() {
    return roleIds;
  }

  public void setRoleIds(List<String> roleIds) {
    this.roleIds = roleIds;
  }

  public V1Employee authorizedLocationIds(List<String> authorizedLocationIds) {
    this.authorizedLocationIds = authorizedLocationIds;
    return this;
  }

  public V1Employee addAuthorizedLocationIdsItem(String authorizedLocationIdsItem) {
    this.authorizedLocationIds.add(authorizedLocationIdsItem);
    return this;
  }

   /**
   * The IDs of the locations the employee is allowed to clock in at.
   * @return authorizedLocationIds
  **/
  @ApiModelProperty(value = "The IDs of the locations the employee is allowed to clock in at.")
  public List<String> getAuthorizedLocationIds() {
    return authorizedLocationIds;
  }

  public void setAuthorizedLocationIds(List<String> authorizedLocationIds) {
    this.authorizedLocationIds = authorizedLocationIds;
  }

  public V1Employee email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The employee's email address.
   * @return email
  **/
  @ApiModelProperty(value = "The employee's email address.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

   /**
   * CWhether the employee is ACTIVE or INACTIVE. Inactive employees cannot sign in to Square Register.Merchants update this field from the Square Dashboard. 
   * @return status
  **/
  @ApiModelProperty(value = "CWhether the employee is ACTIVE or INACTIVE. Inactive employees cannot sign in to Square Register.Merchants update this field from the Square Dashboard. ")
  public StatusEnum getStatus() {
    return status;
  }

   /**
   * An ID the merchant can set to associate the employee with an entity in another system.
   * @return externalId
  **/
  @ApiModelProperty(value = "An ID the merchant can set to associate the employee with an entity in another system.")
  public String getExternalId() {
    return externalId;
  }

   /**
   * The time when the employee entity was created, in ISO 8601 format.
   * @return createdAt
  **/
  @ApiModelProperty(value = "The time when the employee entity was created, in ISO 8601 format.")
  public String getCreatedAt() {
    return createdAt;
  }

   /**
   * The time when the employee entity was most recently updated, in ISO 8601 format.
   * @return updatedAt
  **/
  @ApiModelProperty(value = "The time when the employee entity was most recently updated, in ISO 8601 format.")
  public String getUpdatedAt() {
    return updatedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1Employee v1Employee = (V1Employee) o;
    return Objects.equals(this.id, v1Employee.id) &&
        Objects.equals(this.firstName, v1Employee.firstName) &&
        Objects.equals(this.lastName, v1Employee.lastName) &&
        Objects.equals(this.roleIds, v1Employee.roleIds) &&
        Objects.equals(this.authorizedLocationIds, v1Employee.authorizedLocationIds) &&
        Objects.equals(this.email, v1Employee.email) &&
        Objects.equals(this.status, v1Employee.status) &&
        Objects.equals(this.externalId, v1Employee.externalId) &&
        Objects.equals(this.createdAt, v1Employee.createdAt) &&
        Objects.equals(this.updatedAt, v1Employee.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, firstName, lastName, roleIds, authorizedLocationIds, email, status, externalId, createdAt, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1Employee {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    roleIds: ").append(toIndentedString(roleIds)).append("\n");
    sb.append("    authorizedLocationIds: ").append(toIndentedString(authorizedLocationIds)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
