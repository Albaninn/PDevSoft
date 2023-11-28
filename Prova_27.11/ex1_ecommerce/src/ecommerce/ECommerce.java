package ecommerce;

import pagamento.SistemaDePagamento;

public class ECommerce {
    private CarrinhoDeCompras carrinho;
    private SistemaDePagamento sistemaPagamento;

    public ECommerce(CarrinhoDeCompras carrinho, SistemaDePagamento sistemaPagamento) {
        this.carrinho = carrinho;
        this.sistemaPagamento = sistemaPagamento;
    }

    public void realizarPagamento() {
        double total = carrinho.calcularTotal();
        if (sistemaPagamento.processarPagamento(total)) {
            System.out.println("Pagamento realizado com sucesso!");
        } else {
            System.out.println("Falha no pagamento.");
        }
    }
}
