package Aula02;

public class venda {
	public double valor_cobrar; //atributo provisorio
	
	public boolean proc_pagamento(servico_financeiro f) {
		boolean resultado = false;
		if(f.pagar()) {
			resultado = true;
		}
		else {
			resultado = false;
		}
		return resultado;
	}
}
