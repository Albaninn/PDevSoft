package Custos;

public abstract class Contexto implements Custo{
	protected double CustoDireto;
	protected double CustoTotal;
	
	@Override
	public double calcularCustoTotal() {
		CustoTotal = CustoDireto;
		return CustoTotal;
	}

}
