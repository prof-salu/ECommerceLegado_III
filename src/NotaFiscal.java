public class NotaFiscal {
    public void gerar(Pedido pedido) {
        System.out.println("Gerando NF para pedido valor: " + pedido.getValor());
    }
}