

# QueryQueryFilter

Filter conditions for querying entities using complex expressions Supports logical operations (AND, OR, NOT), field comparisons, and relationship filtering Example: { \"expressions\": [ {\"field\": \"age\", \"operator\": \"gte\", \"value\": 18}, { \"operator\": \"AND\", \"expressions\": [ {\"field\": \"status\", \"operator\": \"eq\", \"value\": \"active\"} ] } ] }

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**expressions** | **List&lt;Object&gt;** | @Description Array of expressions to filter entities @Description Each expression can be a FieldExpression, LogicalExpression, or RelationshipExpression |  [optional] |



