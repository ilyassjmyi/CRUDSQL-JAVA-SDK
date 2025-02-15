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
import java.util.Arrays;

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
 * Paginated response containing filtered entities and metadata Used for both simple list operations and complex filtered queries
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-12T09:59:16.176785Z[Europe/London]", comments = "Generator version: 7.11.0")
public class QueryFilterResponse {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  @javax.annotation.Nullable
  private Object data;

  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  @javax.annotation.Nullable
  private Integer page;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "page_size";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  @javax.annotation.Nullable
  private Integer pageSize;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  @javax.annotation.Nullable
  private Integer total;

  public static final String SERIALIZED_NAME_TOTAL_PAGES = "total_pages";
  @SerializedName(SERIALIZED_NAME_TOTAL_PAGES)
  @javax.annotation.Nullable
  private Integer totalPages;

  public QueryFilterResponse() {
  }

  public QueryFilterResponse data(@javax.annotation.Nullable Object data) {
    this.data = data;
    return this;
  }

  /**
   * @Description Array of entities matching the filter conditions @Description For relationship queries, includes related entities based on the filter
   * @return data
   */
  @javax.annotation.Nullable
  public Object getData() {
    return data;
  }

  public void setData(@javax.annotation.Nullable Object data) {
    this.data = data;
  }


  public QueryFilterResponse page(@javax.annotation.Nullable Integer page) {
    this.page = page;
    return this;
  }

  /**
   * @Description Current page number (1-based indexing) @Description Example: page&#x3D;2 returns the second page of results
   * @return page
   */
  @javax.annotation.Nullable
  public Integer getPage() {
    return page;
  }

  public void setPage(@javax.annotation.Nullable Integer page) {
    this.page = page;
  }


  public QueryFilterResponse pageSize(@javax.annotation.Nullable Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * @Description Number of items per page (default may vary) @Description Example: page_size&#x3D;20 returns 20 items per page
   * @return pageSize
   */
  @javax.annotation.Nullable
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(@javax.annotation.Nullable Integer pageSize) {
    this.pageSize = pageSize;
  }


  public QueryFilterResponse total(@javax.annotation.Nullable Integer total) {
    this.total = total;
    return this;
  }

  /**
   * @Description Total number of records matching the filter conditions @Description Used for calculating pagination metadata
   * @return total
   */
  @javax.annotation.Nullable
  public Integer getTotal() {
    return total;
  }

  public void setTotal(@javax.annotation.Nullable Integer total) {
    this.total = total;
  }


  public QueryFilterResponse totalPages(@javax.annotation.Nullable Integer totalPages) {
    this.totalPages = totalPages;
    return this;
  }

  /**
   * @Description Total number of pages based on total records and page size @Description Calculated as ceil(total/page_size)
   * @return totalPages
   */
  @javax.annotation.Nullable
  public Integer getTotalPages() {
    return totalPages;
  }

  public void setTotalPages(@javax.annotation.Nullable Integer totalPages) {
    this.totalPages = totalPages;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryFilterResponse queryFilterResponse = (QueryFilterResponse) o;
    return Objects.equals(this.data, queryFilterResponse.data) &&
        Objects.equals(this.page, queryFilterResponse.page) &&
        Objects.equals(this.pageSize, queryFilterResponse.pageSize) &&
        Objects.equals(this.total, queryFilterResponse.total) &&
        Objects.equals(this.totalPages, queryFilterResponse.totalPages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, page, pageSize, total, totalPages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryFilterResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
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
    openapiFields.add("data");
    openapiFields.add("page");
    openapiFields.add("page_size");
    openapiFields.add("total");
    openapiFields.add("total_pages");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to QueryFilterResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!QueryFilterResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in QueryFilterResponse is not found in the empty JSON string", QueryFilterResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!QueryFilterResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `QueryFilterResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QueryFilterResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QueryFilterResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QueryFilterResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QueryFilterResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<QueryFilterResponse>() {
           @Override
           public void write(JsonWriter out, QueryFilterResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QueryFilterResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of QueryFilterResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of QueryFilterResponse
   * @throws IOException if the JSON string is invalid with respect to QueryFilterResponse
   */
  public static QueryFilterResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QueryFilterResponse.class);
  }

  /**
   * Convert an instance of QueryFilterResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

