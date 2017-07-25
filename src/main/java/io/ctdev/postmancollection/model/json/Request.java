package io.ctdev.postmancollection.model.json;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "url",
        "method",
        "header",
        "body",
        "description"
})
public class Request {

    @JsonProperty("url")
    private String url;
    @JsonProperty("method")
    private String method;
    @JsonProperty("header")
    private List<Header> header = null;
    @JsonProperty("body")
    private Body body;
    @JsonProperty("description")
    private String description;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Request() {
    }

    /**
     *
     * @param body
     * @param description
     * @param method
     * @param header
     * @param url
     */
    public Request(String url, String method, List<Header> header, Body body, String description) {
        super();
        this.url = url;
        this.method = method;
        this.header = header;
        this.body = body;
        this.description = description;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("method")
    public String getMethod() {
        return method;
    }

    @JsonProperty("method")
    public void setMethod(String method) {
        this.method = method;
    }

    @JsonProperty("header")
    public List<Header> getHeader() {
        return header;
    }

    @JsonProperty("header")
    public void setHeader(List<Header> header) {
        this.header = header;
    }

    @JsonProperty("body")
    public Body getBody() {
        return body;
    }

    @JsonProperty("body")
    public void setBody(Body body) {
        this.body = body;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
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

