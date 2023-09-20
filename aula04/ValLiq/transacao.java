package ValLiq;

public abstract class transacao implements DetValorLiq{
	protected double valorBruto;
	protected double valorLiq;
	
	@Override
	public double calcValorLiq() {
		valorLiq = valorBruto;
		return valorLiq;
	}
}
