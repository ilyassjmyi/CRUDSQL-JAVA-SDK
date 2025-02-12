# openapi-java-client

CrudSQL API
- API version: 1.0.0
  - Build date: 2025-02-12T09:59:16.176785Z[Europe/London]
  - Generator version: 7.11.0

A powerful dynamic CRUD API engine that automatically generates RESTful endpoints for your data models
CrudSQL provides automatic CRUD operations, filtering, pagination, and sorting capabilities for any data model.
Features:
- Automatic REST API generation
- Dynamic model support
- Complex filtering and querying
- Pagination and sorting
- Swagger documentation
- Multiple database support (SQL & NoSQL)

  For more information, please visit [https://github.com/mobixdev/crudsql](https://github.com/mobixdev/crudsql)

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>openapi-java-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'openapi-java-client' jar has been published to maven central.
    mavenLocal()       // Needed if the 'openapi-java-client' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "org.openapitools:openapi-java-client:1.0.0"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/openapi-java-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.model.*;
import org.openapitools.client.api.DynamicApi;

public class Example {
  public static void main(String[] args) {
    // Initialize the default API client
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Set the base path
        defaultClient.setBasePath("https://api.example.com");

        // Configure API key authorization
        ApiKeyAuth apiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
        apiKeyAuth.setApiKey("YOUR_API_KEY");

        // Initialize the API instance
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

## Documentation for API Endpoints

All URIs are relative to */api*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DynamicApi* | [**modelFilterDelete**](docs/DynamicApi.md#modelFilterDelete) | **DELETE** /{model}/filter | Delete multiple entities
*DynamicApi* | [**modelFilterPost**](docs/DynamicApi.md#modelFilterPost) | **POST** /{model}/filter | Filter entities
*DynamicApi* | [**modelFilterPut**](docs/DynamicApi.md#modelFilterPut) | **PUT** /{model}/filter | Update multiple entities
*DynamicApi* | [**modelGet**](docs/DynamicApi.md#modelGet) | **GET** /{model} | List and filter entities
*DynamicApi* | [**modelIdDelete**](docs/DynamicApi.md#modelIdDelete) | **DELETE** /{model}/{id} | Delete an entity
*DynamicApi* | [**modelIdGet**](docs/DynamicApi.md#modelIdGet) | **GET** /{model}/{id} | Get an entity by ID
*DynamicApi* | [**modelIdPut**](docs/DynamicApi.md#modelIdPut) | **PUT** /{model}/{id} | Update an entity
*DynamicApi* | [**modelPost**](docs/DynamicApi.md#modelPost) | **POST** /{model} | Create a new entity
*SchemaApi* | [**modelSchemaGet**](docs/SchemaApi.md#modelSchemaGet) | **GET** /{model}/schema | Get model schema


## Documentation for Models

 - [ApiErrorResponse](docs/ApiErrorResponse.md)
 - [ApiFieldSchema](docs/ApiFieldSchema.md)
 - [ApiModelSchema](docs/ApiModelSchema.md)
 - [ApiRelationshipSchema](docs/ApiRelationshipSchema.md)
 - [QueryEntityWithRelations](docs/QueryEntityWithRelations.md)
 - [QueryFilterResponse](docs/QueryFilterResponse.md)
 - [QueryQueryFilter](docs/QueryQueryFilter.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization


Authentication schemes defined for the API:
<a id="BasicAuth"></a>
### BasicAuth

- **Type**: HTTP basic authentication

<a id="ApiKeyAuth"></a>
### ApiKeyAuth

- **Type**: API key
- **API key parameter name**: X-API-Key
- **Location**: HTTP header

<a id="BearerAuth"></a>
### BearerAuth

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

taqi@mobix.biz

