public class Transportadora implements AcaoAposPagamento{
    @Override
    public void executar(Pedido pedido) {
        System.out.println("Transportadora notificada para coleta.");
    }
}