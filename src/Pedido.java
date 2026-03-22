public class Pedido {
    private double valor;
    private String status; // Pode ser "NOVO", "PAGO" ou "ENVIADO"

    public Pedido(double valor) {
        this.valor = valor;
        this.status = "NOVO";
    }

    public double getValor() { return valor; }
    public void setStatus(String status) { this.status = status; }

    // ERRO: O pesadelo do switch/case para controlar o estado da máquina.
    public void cancelar() {
        if (status.equals("NOVO")) {
            System.out.println("Pedido cancelado sem custos.");
            status = "CANCELADO";
        } else if (status.equals("PAGO")) {
            System.out.println("Pedido cancelado. Reembolsando cartão.");
            status = "CANCELADO";
        } else if (status.equals("ENVIADO")) {
            System.out.println("ERRO: O pedido já está em trânsito e não pode ser cancelado!");
        }
    }
}
