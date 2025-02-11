class AuthenticationHandler extends RequestHandler {
    protected boolean process(HttpRequest request, HttpResponse response) {
        if (!request.isAuthenticated()) {
            System.out.println("Authentication failed");
            return false;
        }

        System.out.println("Authentication successful");
        return true;
    }
}