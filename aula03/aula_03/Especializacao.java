package aula_03;

public class Especializacao extends Estudante {
	
	@Override
	public void calcularAprovacao() {
		if (conceito.equals("A") || conceito.equals("B") || conceito.equals("C")) {
	        setSituacao("aprovado");
	    } else if (conceito.equals("D")) {
	        setSituacao("reprovado");
	    } else {
	        setSituacao("pendente");
	    }
	}
}
