class HttpRequestProcessor {
    private RequestHandler handlerChain;

    public HttpRequestProcessor() {
        handlerChain = new AuthenticationHandler();
        handlerChain
                .setNext(new AuthorizationHandler())
                .setNext(new JsonParsingHandler());
    }

    public void process(HttpRequest request) {
        handlerChain.handle(request);
    }
}