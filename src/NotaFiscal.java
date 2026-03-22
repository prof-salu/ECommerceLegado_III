public class NotaFiscal implements AcaoAposPagamento {
    public void executar(Pedido pedido) {
        System.out.println("Gerando NF para pedido valor: " + pedido.getValor());
    }
}