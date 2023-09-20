package Aula02;

public class boleto implements servico_financeiro {
	public String nosso_numero;
	public String dt_vencimento;
	public double valor;
	
	public boolean processar() {
		//codigo para processar o pagamento
		//invocar a api do banco emissor do boleto
		return true;
	}

	@Override
	public boolean pagar() {
		// TODO Auto-generated method stub
		return true;
	}
}
