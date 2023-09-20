package ValLiq;

public class PrestacaoServicos extends transacao {
	private double taxaServico;
	
	public PrestacaoServicos(double valorBruto, double taxaServico) {
        this.valorBruto = valorBruto;
        this.taxaServico = taxaServico;
    }
	
	@Override
	public double calcValorLiq() {
		valorLiq = valorBruto * (1-taxaServico/100);
		return valorLiq;
	}
}
