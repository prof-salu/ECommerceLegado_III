public class EstadoEnviado implements EstadoPedido {
    public void cancelar(Pedido pedido) {
        throw new IllegalStateException("ERRO: O pedido já está em trânsito e não pode ser cancelado!");
    }
}