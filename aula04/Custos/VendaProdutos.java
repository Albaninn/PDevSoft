package Custos;

public class VendaProdutos extends Contexto{
	private double margemLucro;
	
	public VendaProdutos(double CustoDireto, double CustoTotal) {
        this.CustoDireto = CustoDireto;
        this.CustoTotal = CustoTotal;
    }
	
	@Override
	public double calcularCustoTotal() {
		CustoTotal = CustoDireto + margemLucro;
		return CustoTotal;
	}
}
