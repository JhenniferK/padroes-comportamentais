import java.util.ArrayList;
import java.util.List;

public class ChatMediatorConcrete implements ChatMediator {
    private List<Usuario> usuarios = new ArrayList<>();

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    @Override
    public void enviarMensagem(String mensagem, Usuario usuarioRemetente) {
        for (Usuario usuario : usuarios) {
            if (usuario != usuarioRemetente) {
                usuario.receberMensagem(mensagem);
            }
        }
    }
}