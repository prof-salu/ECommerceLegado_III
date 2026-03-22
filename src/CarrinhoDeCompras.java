public class CarrinhoDeCompras {
    private double valorTotal;
    private EstrategiaDesconto estrategia; // Opcional, injetado

    public CarrinhoDeCompras(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void setEstrategia(EstrategiaDesconto estrategia) {
        this.estrategia = estrategia;
    }

    public double calcularTotal() {
        if (estrategia == null) return valorTotal;
        return estrategia.calcularDesconto(valorTotal); // Delega para a estratégia
    }
}