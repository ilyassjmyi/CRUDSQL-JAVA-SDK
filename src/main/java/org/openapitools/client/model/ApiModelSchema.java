/*
 * CrudSQL API
 * A powerful dynamic CRUD API engine that automatically generates RESTful endpoints for your data models CrudSQL provides automatic CRUD operations, filtering, pagination, and sorting capabilities for any data model. Features: - Automatic REST API generation - Dynamic model support - Complex filtering and querying - Pagination and sorting - Swagger documentation - Multiple database support (SQL & NoSQL)
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: taqi@mobix.biz
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.ApiFieldSchema;
import org.openapitools.client.model.ApiRelationshipSchema;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * Schema information for a model including fields and relationships
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-12T09:59:16.176785Z[Europe/London]", comments = "Generator version: 7.11.0")
public class ApiModelSchema {
  public static final String SERIALIZED_NAME_FIELDS = "fields";
  @SerializedName(SERIALIZED_NAME_FIELDS)
  @javax.annotation.Nullable
  private List<ApiFieldSchema> fields = new ArrayList<>();

  public static final String SERIALIZED_NAME_RELATIONSHIPS = "relationships";
  @SerializedName(SERIALIZED_NAME_RELATIONSHIPS)
  @javax.annotation.Nullable
  private List<ApiRelationshipSchema> relationships = new ArrayList<>();

  public ApiModelSchema() {
  }

  public ApiModelSchema fields(@javax.annotation.Nullable List<ApiFieldSchema> fields) {
    this.fields = fields;
    return this;
  }

  public ApiModelSchema addFieldsItem(ApiFieldSchema fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

  /**
   * Fields contains information about each field in the model
   * @return fields
   */
  @javax.annotation.Nullable
  public List<ApiFieldSchema> getFields() {
    return fields;
  }

  public void setFields(@javax.annotation.Nullable List<ApiFieldSchema> fields) {
    this.fields = fields;
  }


  public ApiModelSchema relationships(@javax.annotation.Nullable List<ApiRelationshipSchema> relationships) {
    this.relationships = relationships;
    return this;
  }

  public ApiModelSchema addRelationshipsItem(ApiRelationshipSchema relationshipsItem) {
    if (this.relationships == null) {
      this.relationships = new ArrayList<>();
    }
    this.relationships.add(relationshipsItem);
    return this;
  }

  /**
   * Relationships contains information about model relationships
   * @return relationships
   */
  @javax.annotation.Nullable
  public List<ApiRelationshipSchema> getRelationships() {
    return relationships;
  }

  public void setRelationships(@javax.annotation.Nullable List<ApiRelationshipSchema> relationships) {
    this.relationships = relationships;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiModelSchema apiModelSchema = (ApiModelSchema) o;
    return Objects.equals(this.fields, apiModelSchema.fields) &&
        Objects.equals(this.relationships, apiModelSchema.relationships);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fields, relationships);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiModelSchema {\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    relationships: ").append(toIndentedString(relationships)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("fields");
    openapiFields.add("relationships");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ApiModelSchema
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ApiModelSchema.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApiModelSchema is not found in the empty JSON string", ApiModelSchema.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ApiModelSchema.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApiModelSchema` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("fields") != null && !jsonObj.get("fields").isJsonNull()) {
        JsonArray jsonArrayfields = jsonObj.getAsJsonArray("fields");
        if (jsonArrayfields != null) {
          // ensure the json data is an array
          if (!jsonObj.get("fields").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `fields` to be an array in the JSON string but got `%s`", jsonObj.get("fields").toString()));
          }

          // validate the optional field `fields` (array)
          for (int i = 0; i < jsonArrayfields.size(); i++) {
            ApiFieldSchema.validateJsonElement(jsonArrayfields.get(i));
          };
        }
      }
      if (jsonObj.get("relationships") != null && !jsonObj.get("relationships").isJsonNull()) {
        JsonArray jsonArrayrelationships = jsonObj.getAsJsonArray("relationships");
        if (jsonArrayrelationships != null) {
          // ensure the json data is an array
          if (!jsonObj.get("relationships").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `relationships` to be an array in the JSON string but got `%s`", jsonObj.get("relationships").toString()));
          }

          // validate the optional field `relationships` (array)
          for (int i = 0; i < jsonArrayrelationships.size(); i++) {
            ApiRelationshipSchema.validateJsonElement(jsonArrayrelationships.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApiModelSchema.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApiModelSchema' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApiModelSchema> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApiModelSchema.class));

       return (TypeAdapter<T>) new TypeAdapter<ApiModelSchema>() {
           @Override
           public void write(JsonWriter out, ApiModelSchema value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApiModelSchema read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ApiModelSchema given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ApiModelSchema
   * @throws IOException if the JSON string is invalid with respect to ApiModelSchema
   */
  public static ApiModelSchema fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApiModelSchema.class);
  }

  /**
   * Convert an instance of ApiModelSchema to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

