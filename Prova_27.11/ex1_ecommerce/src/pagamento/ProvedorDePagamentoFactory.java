package pagamento;

public class ProvedorDePagamentoFactory {
    // Métodos estáticos para criação dos objetos de pagamento.
    public static SistemaDePagamento criarPagamentoComCartao(String numeroCartao, String dataValidade, String cvv) {
        return new PagamentoComCartao(numeroCartao, dataValidade, cvv);
    }

    public static SistemaDePagamento criarPagamentoComBoleto(String numeroBoleto, String dataVencimento, double valor) {
        return new PagamentoComBoleto(numeroBoleto, dataVencimento, valor);
    }
}
