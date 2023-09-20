package aula_03;

public class Graduacao extends Estudante {
	
	@Override
	public void calcularAprovacao() {
		if(nota >= 6) {
			setSituacao("aprovado");
		}
		else if(nota >= 4) {
			setSituacao("exame final");
		}
		else {
			setSituacao("reprovado");
		}
	}
}
