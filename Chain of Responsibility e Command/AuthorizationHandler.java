class AuthorizationHandler extends RequestHandler {
    protected boolean process(HttpRequest request) {
        if (!request.isAuthorized()) {
            System.out.println("User without permission");
            return false;
        }

        System.out.println("User authorized");
        return true;
    }
}