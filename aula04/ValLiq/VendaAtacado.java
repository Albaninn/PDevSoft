package ValLiq;

public class VendaAtacado extends transacao {
	private double desconto;
	
	public VendaAtacado(double valorBruto, double desconto) {
        this.valorBruto = valorBruto;
        this.desconto = desconto;
    }
	
	@Override
	public double calcValorLiq() {
		valorLiq = valorBruto * (1-desconto/100);
		return valorLiq;
	}
}
