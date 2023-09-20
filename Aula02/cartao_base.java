package Aula02;

public abstract class cartao_base implements servico_financeiro {
	public String nome;
	public String numero;
	public String data_validade;
	public double valor_cobrar;
	
	protected boolean ValidarNome() {
		boolean resultado = false;
		
		if(this.nome.equalsIgnoreCase("Lucas")) {
			resultado = true;
		}
		else {
			resultado = false;
		}
		return resultado;
	}
	
	protected boolean ValidarNumero() {
		boolean resultado = false;
		
		if(this.numero.equalsIgnoreCase("1234")) {
			resultado = true;
		}
		else {
			resultado = false;
		}
		return resultado;
	}
	
	protected boolean ValidarDTValidade() {
		boolean resultado = false;
		
		if(this.data_validade.equalsIgnoreCase("12/2027")) {
			resultado = true;
		}
		else {
			resultado = false;
		}
		return resultado;
	}
	public boolean validar() {
		boolean resultado = false;
		if (this.ValidarNome() && this.ValidarNumero() && this.ValidarDTValidade()) {
			resultado = true;
		}
		else {
			resultado = false;
		}
		return resultado;
	}
	
}
