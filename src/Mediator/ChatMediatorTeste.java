package Mediator;

public class ChatMediatorTeste {
    public static void main(String[] args) {
        ChatMediator chat = new ChatMediatorConcreto();

        Usuario usuario1 = new UsuarioConcreto(chat, "Jhennifer");
        Usuario usuario2 = new UsuarioConcreto(chat, "Jônatas");
        Usuario usuario3 = new UsuarioConcreto(chat, "Jhúlia");

        chat.adicionarUsuario(usuario1);
        chat.adicionarUsuario(usuario2);
        chat.adicionarUsuario(usuario3);

        usuario1.enviarMensagem("Olá, mundo!");
        usuario2.enviarMensagem("Olá!");
        usuario3.enviarMensagem("Opa! Como estão?");
    }
}