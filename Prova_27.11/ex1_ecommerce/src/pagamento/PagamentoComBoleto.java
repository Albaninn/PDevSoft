package pagamento;

public class PagamentoComBoleto implements SistemaDePagamento {
    private String numeroBoleto;
    private String dataVencimento;
    private double valor;

    public PagamentoComBoleto(String numeroBoleto, String dataVencimento, double valor) {
        this.numeroBoleto = numeroBoleto;
        this.dataVencimento = dataVencimento;
        this.valor = valor;
    }

    public boolean processarBoleto() {
        // Implementação do processamento do boleto.
        return true;
    }

    @Override
    public boolean processarPagamento(double valor) {
        return processarBoleto();
    }
}
