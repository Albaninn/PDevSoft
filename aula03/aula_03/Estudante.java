package aula_03;

public abstract class Estudante {
	public String nome;
	public String matricula;
	private String situacao;
	public String conceito;
	public double nota;
	
	public abstract void calcularAprovacao();
	
	public String aprovado() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
}
