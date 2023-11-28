package ecommerce;

import pagamento.ProvedorDePagamentoFactory;
import pagamento.SistemaDePagamento;

public class MainTeste {

    public static void main(String[] args) {
        // Criando um carrinho de compras e adicionando itens
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem(new ItemDoCarrinho("Livro Java Efetivo", 1, 199.99));
        carrinho.adicionarItem(new ItemDoCarrinho("Webcam HD", 1, 349.50));

        // Processando pagamento com cartão
        SistemaDePagamento pagamentoComCartao = ProvedorDePagamentoFactory.criarPagamentoComCartao("1234567890123456", "12/2025", "123");
        ECommerce ecommerceCartao = new ECommerce(carrinho, pagamentoComCartao);
        System.out.println("Tentando pagamento com cartão...");
        ecommerceCartao.realizarPagamento();

        // Processando pagamento com boleto
        SistemaDePagamento pagamentoComBoleto = ProvedorDePagamentoFactory.criarPagamentoComBoleto("987654321", "05/2024", carrinho.calcularTotal());
        ECommerce ecommerceBoleto = new ECommerce(carrinho, pagamentoComBoleto);
        System.out.println("Tentando pagamento com boleto...");
        ecommerceBoleto.realizarPagamento();
    }
}
