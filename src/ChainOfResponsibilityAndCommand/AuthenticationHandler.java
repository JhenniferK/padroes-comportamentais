package ChainOfResponsibilityAndCommand;

class AuthenticationHandler extends RequestHandler {
    @Override
    protected boolean process(HttpRequest request) {
        if (!request.isAuthenticated()) {
            System.out.println("Erro: Usuário não autenticado.");
            return false;
        }
        System.out.println("Usuário autenticado.");
        return true;
    }
}