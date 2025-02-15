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
 * Filter conditions for querying entities using complex expressions Supports logical operations (AND, OR, NOT), field comparisons, and relationship filtering Example: { \&quot;expressions\&quot;: [ {\&quot;field\&quot;: \&quot;age\&quot;, \&quot;operator\&quot;: \&quot;gte\&quot;, \&quot;value\&quot;: 18}, { \&quot;operator\&quot;: \&quot;AND\&quot;, \&quot;expressions\&quot;: [ {\&quot;field\&quot;: \&quot;status\&quot;, \&quot;operator\&quot;: \&quot;eq\&quot;, \&quot;value\&quot;: \&quot;active\&quot;} ] } ] }
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-12T09:59:16.176785Z[Europe/London]", comments = "Generator version: 7.11.0")
public class QueryQueryFilter {
  public static final String SERIALIZED_NAME_EXPRESSIONS = "expressions";
  @SerializedName(SERIALIZED_NAME_EXPRESSIONS)
  @javax.annotation.Nullable
  private List<Object> expressions = new ArrayList<>();

  public QueryQueryFilter() {
  }

  public QueryQueryFilter expressions(@javax.annotation.Nullable List<Object> expressions) {
    this.expressions = expressions;
    return this;
  }

  public QueryQueryFilter addExpressionsItem(Object expressionsItem) {
    if (this.expressions == null) {
      this.expressions = new ArrayList<>();
    }
    this.expressions.add(expressionsItem);
    return this;
  }

  /**
   * @Description Array of expressions to filter entities @Description Each expression can be a FieldExpression, LogicalExpression, or RelationshipExpression
   * @return expressions
   */
  @javax.annotation.Nullable
  public List<Object> getExpressions() {
    return expressions;
  }

  public void setExpressions(@javax.annotation.Nullable List<Object> expressions) {
    this.expressions = expressions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryQueryFilter queryQueryFilter = (QueryQueryFilter) o;
    return Objects.equals(this.expressions, queryQueryFilter.expressions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expressions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryQueryFilter {\n");
    sb.append("    expressions: ").append(toIndentedString(expressions)).append("\n");
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
    openapiFields.add("expressions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to QueryQueryFilter
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!QueryQueryFilter.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in QueryQueryFilter is not found in the empty JSON string", QueryQueryFilter.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!QueryQueryFilter.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `QueryQueryFilter` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("expressions") != null && !jsonObj.get("expressions").isJsonNull() && !jsonObj.get("expressions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `expressions` to be an array in the JSON string but got `%s`", jsonObj.get("expressions").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QueryQueryFilter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QueryQueryFilter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QueryQueryFilter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QueryQueryFilter.class));

       return (TypeAdapter<T>) new TypeAdapter<QueryQueryFilter>() {
           @Override
           public void write(JsonWriter out, QueryQueryFilter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QueryQueryFilter read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of QueryQueryFilter given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of QueryQueryFilter
   * @throws IOException if the JSON string is invalid with respect to QueryQueryFilter
   */
  public static QueryQueryFilter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QueryQueryFilter.class);
  }

  /**
   * Convert an instance of QueryQueryFilter to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

