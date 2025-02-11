package ChainOfResponsibilityAndCommand;

import java.util.HashMap;
import java.util.Map;

class HttpRequest {
    private String body;
    private boolean authenticated;
    private boolean authorized;
    private Map<String, String> attributes = new HashMap<>();

    public HttpRequest(String body, boolean authenticated, boolean authorized) {
        this.body = body;
        this.authenticated = authenticated;
        this.authorized = authorized;
    }

    public String getBody() {
        return body;
    }

    public boolean isAuthenticated() {
        return authenticated;
    }

    public boolean isAuthorized() {
        return authorized;
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }
}