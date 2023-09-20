package aula_03;

public class Curso {
	public String verific_aprov(Estudante e) {
		if(e.aprovado() != null) {
			return e.aprovado();
		}
		return null;
	}
}
