
package io.ctdev.postmancollection.model.json;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "consumerKey",
    "consumerSecret",
    "token",
    "tokenSecret",
    "signatureMethod",
    "timestamp",
    "nonce",
    "version",
    "realm",
    "encodeOAuthSign"
})
public class Oauth1 {

    @JsonProperty("consumerKey")
    private String consumerKey;
    @JsonProperty("consumerSecret")
    private String consumerSecret;
    @JsonProperty("token")
    private String token;
    @JsonProperty("tokenSecret")
    private String tokenSecret;
    @JsonProperty("signatureMethod")
    private String signatureMethod;
    @JsonProperty("timestamp")
    private String timestamp;
    @JsonProperty("nonce")
    private String nonce;
    @JsonProperty("version")
    private String version;
    @JsonProperty("realm")
    private String realm;
    @JsonProperty("encodeOAuthSign")
    private String encodeOAuthSign;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Oauth1() {
    }

    /**
     * 
     * @param encodeOAuthSign
     * @param timestamp
     * @param signatureMethod
     * @param consumerKey
     * @param realm
     * @param nonce
     * @param token
     * @param tokenSecret
     * @param consumerSecret
     * @param version
     */
    public Oauth1(String consumerKey, String consumerSecret, String token, String tokenSecret, String signatureMethod, String timestamp, String nonce, String version, String realm, String encodeOAuthSign) {
        super();
        this.consumerKey = consumerKey;
        this.consumerSecret = consumerSecret;
        this.token = token;
        this.tokenSecret = tokenSecret;
        this.signatureMethod = signatureMethod;
        this.timestamp = timestamp;
        this.nonce = nonce;
        this.version = version;
        this.realm = realm;
        this.encodeOAuthSign = encodeOAuthSign;
    }

    @JsonProperty("consumerKey")
    public String getConsumerKey() {
        return consumerKey;
    }

    @JsonProperty("consumerKey")
    public void setConsumerKey(String consumerKey) {
        this.consumerKey = consumerKey;
    }

    @JsonProperty("consumerSecret")
    public String getConsumerSecret() {
        return consumerSecret;
    }

    @JsonProperty("consumerSecret")
    public void setConsumerSecret(String consumerSecret) {
        this.consumerSecret = consumerSecret;
    }

    @JsonProperty("token")
    public String getToken() {
        return token;
    }

    @JsonProperty("token")
    public void setToken(String token) {
        this.token = token;
    }

    @JsonProperty("tokenSecret")
    public String getTokenSecret() {
        return tokenSecret;
    }

    @JsonProperty("tokenSecret")
    public void setTokenSecret(String tokenSecret) {
        this.tokenSecret = tokenSecret;
    }

    @JsonProperty("signatureMethod")
    public String getSignatureMethod() {
        return signatureMethod;
    }

    @JsonProperty("signatureMethod")
    public void setSignatureMethod(String signatureMethod) {
        this.signatureMethod = signatureMethod;
    }

    @JsonProperty("timestamp")
    public String getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @JsonProperty("nonce")
    public String getNonce() {
        return nonce;
    }

    @JsonProperty("nonce")
    public void setNonce(String nonce) {
        this.nonce = nonce;
    }

    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    @JsonProperty("realm")
    public String getRealm() {
        return realm;
    }

    @JsonProperty("realm")
    public void setRealm(String realm) {
        this.realm = realm;
    }

    @JsonProperty("encodeOAuthSign")
    public String getEncodeOAuthSign() {
        return encodeOAuthSign;
    }

    @JsonProperty("encodeOAuthSign")
    public void setEncodeOAuthSign(String encodeOAuthSign) {
        this.encodeOAuthSign = encodeOAuthSign;
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
