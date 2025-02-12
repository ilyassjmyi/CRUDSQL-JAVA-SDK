# SchemaApi

All URIs are relative to */api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**modelSchemaGet**](SchemaApi.md#modelSchemaGet) | **GET** /{model}/schema | Get model schema |


<a id="modelSchemaGet"></a>
# **modelSchemaGet**
> ApiModelSchema modelSchemaGet(model)

Get model schema

Returns the schema information for a specific model including fields and relationships

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SchemaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api");

    SchemaApi apiInstance = new SchemaApi(defaultClient);
    String model = "model_example"; // String | Model name
    try {
      ApiModelSchema result = apiInstance.modelSchemaGet(model);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SchemaApi#modelSchemaGet");
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

### Return type

[**ApiModelSchema**](ApiModelSchema.md)

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
| **500** | Internal Server Error |  -  |

