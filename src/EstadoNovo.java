public class EstadoNovo implements EstadoPedido {
    public void cancelar(Pedido pedido) {
        System.out.println("Pedido cancelado sem custos.");
        // Opcional: pedido.setEstado(new EstadoCancelado());
    }
}