package ChainOfResponsibilityAndCommand;

abstract class RequestHandler {
    private RequestHandler next;

    public RequestHandler setNext(RequestHandler next) {
        this.next = next;
        return next;
    }

    public final void handle(HttpRequest request) {
        if (process(request) && next != null) {
            next.handle(request);
        }
    }

    protected abstract boolean process(HttpRequest request);
}