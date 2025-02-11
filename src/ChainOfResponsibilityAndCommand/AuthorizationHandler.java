package ChainOfResponsibilityAndCommand;

class AuthorizationHandler extends RequestHandler {
    @Override
    protected boolean process(HttpRequest request) {
        if (!request.isAuthorized()) {
            System.out.println("Erro: Usuário sem permissão.");
            return false;
        }
        System.out.println("Usuário autorizado.");
        return true;
    }
}