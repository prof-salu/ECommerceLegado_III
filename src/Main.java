public class Main {
    public static void main(String[] args) {
        System.out.println("=== E-COMMERCE (PROBLEMAS COMPORTAMENTAIS) ===\n");

        System.out.println("--- 1. Problema do Acoplamento no Checkout ---");
        Pedido p1 = new Pedido(1000.0);
        Checkout checkout = new Checkout();
        checkout.finalizarCompra(p1); // Gera dependência forte com 3 classes!
        System.out.println();

        System.out.println("--- 2. Problema dos Ifs de Estado ---");
        Pedido p2 = new Pedido(500.0);
        p2.setStatus("ENVIADO");
        p2.cancelar(); // Vai cair no else if complexo
        System.out.println();

        System.out.println("--- 3. Problema da Matemática de Descontos ---");
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras(2000.0, "VIP");
        System.out.println("Total a pagar: R$ " + carrinho.calcularTotal());
    }
}
