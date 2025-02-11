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

    public String getBody() { return body; }

    public void setBody(String body) { this.body = body; }

    public boolean isAuthenticated() { return authenticated; }

    public void setAuthenticated(boolean authenticated) { this.authenticated = authenticated; }

    public boolean isAuthorized() { return authorized; }

    public void setAuthorized(boolean authorized) { this.authorized = authorized; }

    public Map<String, String> getAttributes() { return attributes; }

    public void setAttributes(Map<String, String> attributes) { this.attributes = attributes; }
}