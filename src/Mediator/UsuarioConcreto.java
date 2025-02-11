package Mediator;

public class UsuarioConcreto extends Usuario {
    public UsuarioConcreto(ChatMediator mediator, String nome) {
        super(mediator, nome);
    }

    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println(nome + " está enviando a mensagem: " + mensagem);
        mediator.enviarMensagem(mensagem, this);
    }

    public void receberMensagem(String mensagem) {
        System.out.println(nome + " recebeu a mensagem: " + mensagem);
    }
}