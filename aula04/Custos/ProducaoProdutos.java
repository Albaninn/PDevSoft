package Custos;

public class ProducaoProdutos extends Contexto{
	private double custoIndireto;
	
	public ProducaoProdutos(double CustoDireto, double CustoTotal) {
        this.CustoDireto = CustoDireto;
        this.CustoTotal = CustoTotal;
    }
	
	@Override
	public double calcularCustoTotal() {
		CustoTotal = CustoDireto + custoIndireto;
		return CustoTotal;
	}
}
