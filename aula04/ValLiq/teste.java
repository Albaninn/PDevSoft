package ValLiq;

public class teste {

	public static void main(String[] args) {
		DetValorLiq Ata = new VendaAtacado(1000, 10);
        System.out.println("Valor líquido da venda atacado: " + Ata.calcValorLiq());

        DetValorLiq Var = new VendaVarejo(500, 8);
        System.out.println("Valor líquido da venda varejo: " + Var.calcValorLiq());

        DetValorLiq Ser = new PrestacaoServicos(800, 15);
        System.out.println("Valor líquido da prestação de serviços: " + Ser.calcValorLiq());
    
	}

}
