package Aula02;

public class teste_pagamento {

	public static void main(String[] args) {
		cartao_credito cc = new cartao_credito();
		venda v = new venda();

		cc.nome = "Lucas";
		cc.numero = "1234";
		cc.data_validade = "12/2027";
		cc.valor_cobrar = 10100;
		if(v.proc_pagamento(cc)) {
			System.out.println("Compra CC confirmada");
		}
		else {
			System.out.println("Compra CC rejeitada");
		}
		
		cartao_senf cs = new cartao_senf();
		cs.nome = "Lucas";
		cs.numero = "1234";
		cs.data_validade = "12/2027";
		cs.valor_cobrar = 100;
		if(v.proc_pagamento(cs)) {
			System.out.println("Compra CS confirmada");
		}
		else {
			System.out.println("Compra CS rejeitada");
		}
		
		boleto b = new boleto();
		if(v.proc_pagamento(b)) {
			System.out.println("Compra BOLETO confirmada");
		}
		else {
			System.out.println("Compra BOLETO rejeitada");
		}
	}

}
