package FactoryMethod;

public class Consumidor {

	public static void main(String[] args) {
		IFabricaForma FabCir = new FabricaCirculo();
		IForma circ = FabCir.criarForma();
		circ.desenhar();
		
		IFabricaForma FabRet = new FabricaRetangulo();
		IForma reta = FabRet.criarForma();
		reta.desenhar();

	}

}
