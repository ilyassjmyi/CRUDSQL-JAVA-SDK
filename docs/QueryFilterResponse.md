

# QueryFilterResponse

Paginated response containing filtered entities and metadata Used for both simple list operations and complex filtered queries

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**data** | **Object** | @Description Array of entities matching the filter conditions @Description For relationship queries, includes related entities based on the filter |  [optional] |
|**page** | **Integer** | @Description Current page number (1-based indexing) @Description Example: page&#x3D;2 returns the second page of results |  [optional] |
|**pageSize** | **Integer** | @Description Number of items per page (default may vary) @Description Example: page_size&#x3D;20 returns 20 items per page |  [optional] |
|**total** | **Integer** | @Description Total number of records matching the filter conditions @Description Used for calculating pagination metadata |  [optional] |
|**totalPages** | **Integer** | @Description Total number of pages based on total records and page size @Description Calculated as ceil(total/page_size) |  [optional] |



