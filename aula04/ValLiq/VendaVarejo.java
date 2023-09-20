package ValLiq;

public class VendaVarejo extends transacao {
	private double taxaImposto;
	
	public VendaVarejo(double valorBruto, double taxaImposto) {
        this.valorBruto = valorBruto;
        this.taxaImposto = taxaImposto;
    }
	
	@Override
	public double calcValorLiq() {
		valorLiq = valorBruto * (1-taxaImposto/100);
		return valorLiq;
	}
}
