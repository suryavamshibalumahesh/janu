/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.15.6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.kubernetes.client.openapi.models;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.openapi.models.V1NonResourceAttributes;
import io.kubernetes.client.openapi.models.V1ResourceAttributes;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SelfSubjectAccessReviewSpec is a description of the access request.  Exactly one of ResourceAuthorizationAttributes and NonResourceAuthorizationAttributes must be set
 */
@ApiModel(description = "SelfSubjectAccessReviewSpec is a description of the access request.  Exactly one of ResourceAuthorizationAttributes and NonResourceAuthorizationAttributes must be set")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-11-06T10:41:07.822Z[Etc/UTC]")
public class V1SelfSubjectAccessReviewSpec {
  public static final String SERIALIZED_NAME_NON_RESOURCE_ATTRIBUTES = "nonResourceAttributes";
  @SerializedName(SERIALIZED_NAME_NON_RESOURCE_ATTRIBUTES)
  private V1NonResourceAttributes nonResourceAttributes;

  public static final String SERIALIZED_NAME_RESOURCE_ATTRIBUTES = "resourceAttributes";
  @SerializedName(SERIALIZED_NAME_RESOURCE_ATTRIBUTES)
  private V1ResourceAttributes resourceAttributes;


  public V1SelfSubjectAccessReviewSpec nonResourceAttributes(V1NonResourceAttributes nonResourceAttributes) {
    
    this.nonResourceAttributes = nonResourceAttributes;
    return this;
  }

   /**
   * Get nonResourceAttributes
   * @return nonResourceAttributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1NonResourceAttributes getNonResourceAttributes() {
    return nonResourceAttributes;
  }


  public void setNonResourceAttributes(V1NonResourceAttributes nonResourceAttributes) {
    this.nonResourceAttributes = nonResourceAttributes;
  }


  public V1SelfSubjectAccessReviewSpec resourceAttributes(V1ResourceAttributes resourceAttributes) {
    
    this.resourceAttributes = resourceAttributes;
    return this;
  }

   /**
   * Get resourceAttributes
   * @return resourceAttributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1ResourceAttributes getResourceAttributes() {
    return resourceAttributes;
  }


  public void setResourceAttributes(V1ResourceAttributes resourceAttributes) {
    this.resourceAttributes = resourceAttributes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    return EqualsBuilder.reflectionEquals(this, o);
  }

  @Override
  public int hashCode() {
    return HashCodeBuilder.reflectionHashCode(this);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1SelfSubjectAccessReviewSpec {\n");
    sb.append("    nonResourceAttributes: ").append(toIndentedString(nonResourceAttributes)).append("\n");
    sb.append("    resourceAttributes: ").append(toIndentedString(resourceAttributes)).append("\n");
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
