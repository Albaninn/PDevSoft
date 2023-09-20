package Aula02;

public class cartao_senf extends cartao_base {
	
	protected boolean ValidarData() {
		return true;
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
