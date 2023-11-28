package pagamento;

public class PagamentoComCartao implements SistemaDePagamento {
    private String numeroCartao;
    private String dataValidade;
    private String cvv;

    public PagamentoComCartao(String numeroCartao, String dataValidade, String cvv) {
        this.numeroCartao = numeroCartao;
        this.dataValidade = dataValidade;
        this.cvv = cvv;
    }

    public boolean validarCartao() {
        // Implementação da validação do cartão.
        return true;
    }

    @Override
    public boolean processarPagamento(double valor) {
        if (validarCartao()) {
            // Processamento do pagamento com cartão.
            return true;
        }
        return false;
    }
}
