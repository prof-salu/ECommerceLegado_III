public class Pedido {
    private double valor;
    private EstadoPedido estadoAtual; // Sai a String "status", entra o Objeto de Estado

    public Pedido(double valor) {
        this.valor = valor;
        this.estadoAtual = new EstadoNovo(); // Estado inicial
    }

    public void setEstadoAtual(EstadoPedido estadoAtual) {
        this.estadoAtual = estadoAtual;
    }
    public double getValor() {
        return valor;
    }

    public void cancelar() {
        estadoAtual.cancelar(this); // Delega para o estado atual
    }
}