public class Checkout {
    // ERRO: Alto acoplamento. Se a equipe de marketing quiser mandar um SMS, teremos que modificar esta classe.
    public void finalizarCompra(Pedido pedido) {
        System.out.println("Pagamento aprovado!");

        NotaFiscal nf = new NotaFiscal();
        Email email = new Email();
        Transportadora transportadora = new Transportadora();

        nf.gerar(pedido);
        email.enviar(pedido);
        transportadora.agendar(pedido);
    }
}
