# DynamicApi

All URIs are relative to */api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**modelFilterDelete**](DynamicApi.md#modelFilterDelete) | **DELETE** /{model}/filter | Delete multiple entities |
| [**modelFilterPost**](DynamicApi.md#modelFilterPost) | **POST** /{model}/filter | Filter entities |
| [**modelFilterPut**](DynamicApi.md#modelFilterPut) | **PUT** /{model}/filter | Update multiple entities |
| [**modelGet**](DynamicApi.md#modelGet) | **GET** /{model} | List and filter entities |
| [**modelIdDelete**](DynamicApi.md#modelIdDelete) | **DELETE** /{model}/{id} | Delete an entity |
| [**modelIdGet**](DynamicApi.md#modelIdGet) | **GET** /{model}/{id} | Get an entity by ID |
| [**modelIdPut**](DynamicApi.md#modelIdPut) | **PUT** /{model}/{id} | Update an entity |
| [**modelPost**](DynamicApi.md#modelPost) | **POST** /{model} | Create a new entity |


<a id="modelFilterDelete"></a>
# **modelFilterDelete**
> Map&lt;String, Object&gt; modelFilterDelete(model, filter)

Delete multiple entities

Delete multiple entities that match the provided query expression

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DynamicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api");

    DynamicApi apiInstance = new DynamicApi(defaultClient);
    String model = "model_example"; // String | Model Name
    QueryQueryFilter filter = new QueryQueryFilter(); // QueryQueryFilter | Filter conditions
    try {
      Map<String, Object> result = apiInstance.modelFilterDelete(model, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DynamicApi#modelFilterDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **model** | **String**| Model Name | |
| **filter** | [**QueryQueryFilter**](QueryQueryFilter.md)| Filter conditions | |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **500** | Internal Server Error |  -  |

<a id="modelFilterPost"></a>
# **modelFilterPost**
> QueryFilterResponse modelFilterPost(model, filter, page, pageSize, sort)

Filter entities

Filter entities using complex conditions including field expressions, logical operations, and relationship filtering

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DynamicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api");

    DynamicApi apiInstance = new DynamicApi(defaultClient);
    String model = "model_example"; // String | Model name
    QueryQueryFilter filter = new QueryQueryFilter(); // QueryQueryFilter | Filter conditions
    Integer page = 1; // Integer | Page number
    Integer pageSize = 10; // Integer | Items per page
    String sort = "sort_example"; // String | Sort field and direction (e.g., name:asc,age:desc)
    try {
      QueryFilterResponse result = apiInstance.modelFilterPost(model, filter, page, pageSize, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DynamicApi#modelFilterPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **model** | **String**| Model name | |
| **filter** | [**QueryQueryFilter**](QueryQueryFilter.md)| Filter conditions | |
| **page** | **Integer**| Page number | [optional] [default to 1] |
| **pageSize** | **Integer**| Items per page | [optional] [default to 10] |
| **sort** | **String**| Sort field and direction (e.g., name:asc,age:desc) | [optional] |

### Return type

[**QueryFilterResponse**](QueryFilterResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

<a id="modelFilterPut"></a>
# **modelFilterPut**
> Map&lt;String, Object&gt; modelFilterPut(model, entity)

Update multiple entities

Update multiple entities that match the provided query expression

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DynamicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api");

    DynamicApi apiInstance = new DynamicApi(defaultClient);
    String model = "model_example"; // String | Model Name
    QueryEntityWithRelations entity = new QueryEntityWithRelations(); // QueryEntityWithRelations | Entity Data
    try {
      Map<String, Object> result = apiInstance.modelFilterPut(model, entity);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DynamicApi#modelFilterPut");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **model** | **String**| Model Name | |
| **entity** | [**QueryEntityWithRelations**](QueryEntityWithRelations.md)| Entity Data | |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |

<a id="modelGet"></a>
# **modelGet**
> QueryFilterResponse modelGet(model, page, pageSize, sort)

List and filter entities

Get a list of entities. Use query parameters for simple filtering or POST to /filter for complex conditions

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DynamicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api");

    DynamicApi apiInstance = new DynamicApi(defaultClient);
    String model = "model_example"; // String | Model Name
    Integer page = 56; // Integer | Page number
    Integer pageSize = 56; // Integer | Items per page
    String sort = "sort_example"; // String | Sort field and direction (e.g., name:asc)
    try {
      QueryFilterResponse result = apiInstance.modelGet(model, page, pageSize, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DynamicApi#modelGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **model** | **String**| Model Name | |
| **page** | **Integer**| Page number | [optional] |
| **pageSize** | **Integer**| Items per page | [optional] |
| **sort** | **String**| Sort field and direction (e.g., name:asc) | [optional] |

### Return type

[**QueryFilterResponse**](QueryFilterResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |

<a id="modelIdDelete"></a>
# **modelIdDelete**
> ApiErrorResponse modelIdDelete(model, id)

Delete an entity

Delete an entity by its ID

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DynamicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api");

    DynamicApi apiInstance = new DynamicApi(defaultClient);
    String model = "model_example"; // String | Model Name
    String id = "id_example"; // String | Entity ID
    try {
      ApiErrorResponse result = apiInstance.modelIdDelete(model, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DynamicApi#modelIdDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **model** | **String**| Model Name | |
| **id** | **String**| Entity ID | |

### Return type

[**ApiErrorResponse**](ApiErrorResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not Found |  -  |

<a id="modelIdGet"></a>
# **modelIdGet**
> QueryFilterResponse modelIdGet(model, id)

Get an entity by ID

Retrieve a single entity by its ID

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DynamicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api");

    DynamicApi apiInstance = new DynamicApi(defaultClient);
    String model = "model_example"; // String | Model Name
    String id = "id_example"; // String | Entity ID
    try {
      QueryFilterResponse result = apiInstance.modelIdGet(model, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DynamicApi#modelIdGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **model** | **String**| Model Name | |
| **id** | **String**| Entity ID | |

### Return type

[**QueryFilterResponse**](QueryFilterResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not Found |  -  |

<a id="modelIdPut"></a>
# **modelIdPut**
> QueryFilterResponse modelIdPut(model, id, entity)

Update an entity

Update an existing entity by its ID

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DynamicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api");

    DynamicApi apiInstance = new DynamicApi(defaultClient);
    String model = "model_example"; // String | Model Name
    String id = "id_example"; // String | Entity ID
    QueryEntityWithRelations entity = new QueryEntityWithRelations(); // QueryEntityWithRelations | Entity Data
    try {
      QueryFilterResponse result = apiInstance.modelIdPut(model, id, entity);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DynamicApi#modelIdPut");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **model** | **String**| Model Name | |
| **id** | **String**| Entity ID | |
| **entity** | [**QueryEntityWithRelations**](QueryEntityWithRelations.md)| Entity Data | |

### Return type

[**QueryFilterResponse**](QueryFilterResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |

<a id="modelPost"></a>
# **modelPost**
> QueryFilterResponse modelPost(model, entity)

Create a new entity

Create a new entity of the specified model type

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DynamicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api");

    DynamicApi apiInstance = new DynamicApi(defaultClient);
    String model = "model_example"; // String | Model Name
    QueryEntityWithRelations entity = new QueryEntityWithRelations(); // QueryEntityWithRelations | Entity Data
    try {
      QueryFilterResponse result = apiInstance.modelPost(model, entity);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DynamicApi#modelPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **model** | **String**| Model Name | |
| **entity** | [**QueryEntityWithRelations**](QueryEntityWithRelations.md)| Entity Data | |

### Return type

[**QueryFilterResponse**](QueryFilterResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad Request |  -  |

