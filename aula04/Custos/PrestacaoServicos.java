package Custos;

public class PrestacaoServicos extends Contexto{
	private double taxaServico;
	
	public PrestacaoServicos(double CustoDireto, double CustoTotal) {
        this.CustoDireto = CustoDireto;
        this.CustoTotal = CustoTotal;
    }
	
	@Override
	public double calcularCustoTotal() {
		CustoTotal = CustoDireto + taxaServico;
		return CustoTotal;
	}
}
