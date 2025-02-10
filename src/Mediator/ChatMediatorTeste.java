public class ChatMediatorTest {
    public static void main(String[] args) {
        ChatMediator chat = new ChatMediatorConcrete();

        Usuario user1 = new UsuarioConcreto(chat, "Jhennifer");
        Usuario user2 = new UsuarioConcreto(chat, "Jônatas");
        Usuario user3 = new UsuarioConcreto(chat, "Jhúlia");

        chat.adicionarUsuario(user1);
        chat.adicionarUsuario(user2);
        chat.adicionarUsuario(user3);

        user1.enviarMensagem("Olá, mundo!");
        user2.enviarMensagem("Olá!");
        user3.receberMensagem("Opa! Como estão?");
    }
}