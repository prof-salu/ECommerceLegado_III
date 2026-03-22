public class EstadoPago implements EstadoPedido {
    public void cancelar(Pedido pedido) {
        System.out.println("Pedido cancelado. Reembolsando cartão.");
    }
}