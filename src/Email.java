public class Email implements AcaoAposPagamento{
    @Override
    public void executar(Pedido pedido) {
        System.out.println("Enviando e-mail de confirmação ao cliente.");
    }
}