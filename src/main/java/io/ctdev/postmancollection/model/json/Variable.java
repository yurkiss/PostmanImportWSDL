
package io.ctdev.postmancollection.model.json;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;


/**
 * Variable
 * <p>
 * Using variables in your Postman requests eliminates the need to duplicate requests, which can save a lot of time. Variables can be defined, and referenced to from any part of a request.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "key",
    "value",
    "type",
    "name",
    "description"
})
public class Variable {

    /**
     * A variable ID is a unique user-defined value that identifies the variable within a collection. In traditional terms, this would be a variable name.
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("A variable ID is a unique user-defined value that identifies the variable within a collection. In traditional terms, this would be a variable name.")
    private String id;
    /**
     * A variable ID is a unique user-defined value that identifies the variable within a collection. In traditional terms, this would be a variable name.
     * 
     */
    @JsonProperty("key")
    @JsonPropertyDescription("A variable ID is a unique user-defined value that identifies the variable within a collection. In traditional terms, this would be a variable name.")
    private String key;
    /**
     * The value that a variable holds in this collection. Ultimately, the variables will be replaced by this value, when say running a set of requests from a collection
     * 
     */
    @JsonProperty("value")
    @JsonPropertyDescription("The value that a variable holds in this collection. Ultimately, the variables will be replaced by this value, when say running a set of requests from a collection")
    private Object value;
    /**
     * A variable may have multiple types. This field specifies the type of the variable.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("A variable may have multiple types. This field specifies the type of the variable.")
    private String type;
    /**
     * Variable name
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Variable name")
    private String name;
    /**
     * A Description can be a raw text, or be an object, which holds the description along with its format.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("A Description can be a raw text, or be an object, which holds the description along with its format.")
    private Object description;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Variable() {
    }

    /**
     * 
     * @param id
     * @param description
     * @param name
     * @param value
     * @param type
     * @param key
     */
    public Variable(String id, String key, Object value, String type, String name, Object description) {
        super();
        this.id = id;
        this.key = key;
        this.value = value;
        this.type = type;
        this.name = name;
        this.description = description;
    }

    /**
     * A variable ID is a unique user-defined value that identifies the variable within a collection. In traditional terms, this would be a variable name.
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * A variable ID is a unique user-defined value that identifies the variable within a collection. In traditional terms, this would be a variable name.
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * A variable ID is a unique user-defined value that identifies the variable within a collection. In traditional terms, this would be a variable name.
     * 
     */
    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    /**
     * A variable ID is a unique user-defined value that identifies the variable within a collection. In traditional terms, this would be a variable name.
     * 
     */
    @JsonProperty("key")
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * The value that a variable holds in this collection. Ultimately, the variables will be replaced by this value, when say running a set of requests from a collection
     * 
     */
    @JsonProperty("value")
    public Object getValue() {
        return value;
    }

    /**
     * The value that a variable holds in this collection. Ultimately, the variables will be replaced by this value, when say running a set of requests from a collection
     * 
     */
    @JsonProperty("value")
    public void setValue(Object value) {
        this.value = value;
    }

    /**
     * A variable may have multiple types. This field specifies the type of the variable.
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * A variable may have multiple types. This field specifies the type of the variable.
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Variable name
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Variable name
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * A Description can be a raw text, or be an object, which holds the description along with its format.
     * 
     */
    @JsonProperty("description")
    public Object getDescription() {
        return description;
    }

    /**
     * A Description can be a raw text, or be an object, which holds the description along with its format.
     * 
     */
    @JsonProperty("description")
    public void setDescription(Object description) {
        this.description = description;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
