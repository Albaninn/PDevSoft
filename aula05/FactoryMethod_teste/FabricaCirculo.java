package FactoryMethod_teste;

public class FabricaCirculo implements IFabricaForma{

	@Override
	public IForma criarForma() {
		return new Circulo();
	}

}
