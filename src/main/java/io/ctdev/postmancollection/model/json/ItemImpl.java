package io.ctdev.postmancollection.model.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Created by yurkiss on 7/24/17.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "name",
        "description",
        "event",
        "request",
        "response"
})

public class ItemImpl implements Item {

    @JsonProperty("id")
    private String id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("description")
    private String description;

    @JsonProperty("event")
    private Object event;

    @JsonProperty("request")
    private Request request;

    @JsonProperty("response")
    private Object response;

    public ItemImpl() {
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("event")
    public Object getEvent() {
        return event;
    }

    @JsonProperty("event")
    public void setEvent(Object event) {
        this.event = event;
    }

    @JsonProperty("request")
    public Request getRequest() {
        return request;
    }

    @JsonProperty("request")
    public void setRequest(Request request) {
        this.request = request;
    }

    @JsonProperty("response")
    public Object getResponse() {
        return response;
    }

    @JsonProperty("response")
    public void setResponse(Object response) {
        this.response = response;
    }
}
