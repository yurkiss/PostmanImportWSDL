
package io.ctdev.postmancollection.model.json;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "info",
    "item",
    "event",
    "variable",
    "auth"
})
public class Root {

    /**
     * Information
     * <p>
     * Detailed description of the info block
     * (Required)
     * 
     */
    @JsonProperty("info")
    @JsonPropertyDescription("Detailed description of the info block")
    private Info info;
    /**
     * Items are the basic unit for a Postman collection. You can think of them as corresponding to a single API endpoint. Each ItemImpl has one request and may have multiple API responses associated with it.
     * (Required)
     * 
     */
    @JsonProperty("item")
    @JsonPropertyDescription("Items are the basic unit for a Postman collection. You can think of them as corresponding to a single API endpoint. Each ItemImpl has one request and may have multiple API responses associated with it.")
    private List<Item> item = null;
    /**
     * Postman allows you to configure scripts to run when specific events occur. These scripts are stored here, and can be referenced in the collection by their ID.
     * 
     */
    @JsonProperty("event")
    @JsonPropertyDescription("Postman allows you to configure scripts to run when specific events occur. These scripts are stored here, and can be referenced in the collection by their ID.")
    private List<Event> event = null;
    /**
     * Collection variables allow you to define a set of variables, that are a *part of the collection*, as opposed to environments, which are separate entities.
     * *Note: Collection variables must not contain any sensitive information.*
     * 
     */
    @JsonProperty("variable")
    @JsonPropertyDescription("Collection variables allow you to define a set of variables, that are a *part of the collection*, as opposed to environments, which are separate entities.\n*Note: Collection variables must not contain any sensitive information.*")
    private List<Variable> variable = null;
    /**
     * Auth
     * <p>
     * Represents authentication helpers provided by Postman
     * 
     */
    @JsonProperty("auth")
    @JsonPropertyDescription("Represents authentication helpers provided by Postman")
    private Auth auth;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Root() {
    }

    /**
     * 
     * @param event
     * @param item
     * @param variable
     * @param auth
     * @param info
     */
    public Root(Info info, List<Item> item, List<Event> event, List<Variable> variable, Auth auth) {
        super();
        this.info = info;
        this.item = item;
        this.event = event;
        this.variable = variable;
        this.auth = auth;
    }

    /**
     * Information
     * <p>
     * Detailed description of the info block
     * (Required)
     * 
     */
    @JsonProperty("info")
    public Info getInfo() {
        return info;
    }

    /**
     * Information
     * <p>
     * Detailed description of the info block
     * (Required)
     * 
     */
    @JsonProperty("info")
    public void setInfo(Info info) {
        this.info = info;
    }

    /**
     * Items are the basic unit for a Postman collection. You can think of them as corresponding to a single API endpoint. Each ItemImpl has one request and may have multiple API responses associated with it.
     * (Required)
     * 
     */
    @JsonProperty("item")
    public List<Item> getItem() {
        return item;
    }

    /**
     * Items are the basic unit for a Postman collection. You can think of them as corresponding to a single API endpoint. Each ItemImpl has one request and may have multiple API responses associated with it.
     * (Required)
     * 
     */
    @JsonProperty("item")
    public void setItem(List<Item> item) {
        this.item = item;
    }

    /**
     * Postman allows you to configure scripts to run when specific events occur. These scripts are stored here, and can be referenced in the collection by their ID.
     * 
     */
    @JsonProperty("event")
    public List<Event> getEvent() {
        return event;
    }

    /**
     * Postman allows you to configure scripts to run when specific events occur. These scripts are stored here, and can be referenced in the collection by their ID.
     * 
     */
    @JsonProperty("event")
    public void setEvent(List<Event> event) {
        this.event = event;
    }

    /**
     * Collection variables allow you to define a set of variables, that are a *part of the collection*, as opposed to environments, which are separate entities.
     * *Note: Collection variables must not contain any sensitive information.*
     * 
     */
    @JsonProperty("variable")
    public List<Variable> getVariable() {
        return variable;
    }

    /**
     * Collection variables allow you to define a set of variables, that are a *part of the collection*, as opposed to environments, which are separate entities.
     * *Note: Collection variables must not contain any sensitive information.*
     * 
     */
    @JsonProperty("variable")
    public void setVariable(List<Variable> variable) {
        this.variable = variable;
    }

    /**
     * Auth
     * <p>
     * Represents authentication helpers provided by Postman
     * 
     */
    @JsonProperty("auth")
    public Auth getAuth() {
        return auth;
    }

    /**
     * Auth
     * <p>
     * Represents authentication helpers provided by Postman
     * 
     */
    @JsonProperty("auth")
    public void setAuth(Auth auth) {
        this.auth = auth;
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
