public class Main {
    public static void main(String[] args) {
        System.out.println("=== E-COMMERCE (COMPORTAMENTO REFATORADO) ===\n");

        System.out.println("--- 1. Observer em Ação ---");
        Pedido p1 = new Pedido(1000.0);
        Checkout checkout = new Checkout();
        // Adicionando assinantes dinamicamente no Publisher
        checkout.adicionarAcao(new NotaFiscal());
        checkout.adicionarAcao(new Email());
        checkout.adicionarAcao(new Transportadora());
        checkout.finalizarCompra(p1);
        System.out.println();

        System.out.println("--- 2. State em Ação ---");
        Pedido p2 = new Pedido(500.0);
        p2.setEstadoAtual(new EstadoEnviado()); // Simula o avanço do estado
        try {
            p2.cancelar(); // Vai estourar exceção correta sem usar if/else
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println();

        System.out.println("--- 3. Strategy em Ação ---");
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras(2000.0);
        carrinho.setEstrategia(new DescontoVIP()); // Injeta a estratégia desejada
        System.out.println("Total a pagar (VIP): R$ " + carrinho.calcularTotal());

        carrinho.setEstrategia(new DescontoBlackFriday()); // Muda a regra em tempo de execução!
        System.out.println("Total a pagar (Black Friday): R$ " + carrinho.calcularTotal());
    }
}
