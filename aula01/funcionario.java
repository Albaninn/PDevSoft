package Aula01_0408;

public class funcionario {
	public String nome;
	public double salario;
	
	public double calc_salario_liq() {
		double salario_liquido = 0.0;
		descontoIR descIR = new descontoIR();
		descontoINSS descINSS = new descontoINSS();
		
		salario_liquido = this.salario - descIR.calcularIR(this.salario) - descINSS.calcularINSS(this.salario);
		
		
		return salario_liquido;
	}
	
	public String exibir_dados() {
		String detalhes = "Nome: " + this.nome + " / Salario: " + this.salario;
		
		return detalhes;
	}
	
	public void salvar_dados() {
		
	}
}
