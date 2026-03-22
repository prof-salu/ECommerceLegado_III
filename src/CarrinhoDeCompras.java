public class CarrinhoDeCompras {
    private double valorTotal;
    private String tipoDesconto; // "VIP", "BLACKFRIDAY", "NENHUM"

    public CarrinhoDeCompras(double valorTotal, String tipoDesconto) {
        this.valorTotal = valorTotal;
        this.tipoDesconto = tipoDesconto;
    }

    // ERRO: A matemática da regra de negócio está chumbada no carrinho com condicionais.
    public double calcularTotal() {
        if (tipoDesconto.equals("VIP")) {
            return valorTotal * 0.90; // 10% de desconto
        } else if (tipoDesconto.equals("BLACKFRIDAY")) {
            return valorTotal * 0.50; // 50% de desconto
        } else {
            return valorTotal;
        }
    }
}
