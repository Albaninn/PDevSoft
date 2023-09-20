package Aula02;

public class cartao_credito extends cartao_base{
	
	@Override
	public boolean validar() {
		boolean resultado = false;
		if (this.ValidarNome() && this.ValidarNumero()) {
			resultado = true;
		}
		else {
			resultado = false;
		}
		return resultado;
	}
	
	@Override
	public boolean pagar() {
		if(this.validar()) {
			return true;
		}else {
			return false;
		}
		
	}
}
