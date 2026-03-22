import java.util.ArrayList;
import java.util.List;

public class Checkout {
    // Lista dinâmica de assinantes (Baixíssimo acoplamento)
    private List<AcaoAposPagamento> acoes = new ArrayList<>();

    public void adicionarAcao(AcaoAposPagamento acao) {
        this.acoes.add(acao);
    }

    public void finalizarCompra(Pedido pedido) {
        System.out.println("Pagamento aprovado! Notificando assinantes...");
        for (AcaoAposPagamento acao : acoes) {
            acao.executar(pedido); // Polimorfismo puro!
        }
    }
}