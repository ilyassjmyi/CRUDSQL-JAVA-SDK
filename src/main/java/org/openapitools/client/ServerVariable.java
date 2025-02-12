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


package org.openapitools.client;

import java.util.HashSet;

/**
 * Representing a Server Variable for server URL template substitution.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-12T09:59:16.176785Z[Europe/London]", comments = "Generator version: 7.11.0")
public class ServerVariable {
    public String description;
    public String defaultValue;
    public HashSet<String> enumValues = null;

    /**
     * @param description A description for the server variable.
     * @param defaultValue The default value to use for substitution.
     * @param enumValues An enumeration of string values to be used if the substitution options are from a limited set.
     */
    public ServerVariable(String description, String defaultValue, HashSet<String> enumValues) {
        this.description = description;
        this.defaultValue = defaultValue;
        this.enumValues = enumValues;
    }
}
