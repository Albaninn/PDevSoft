package FactoryMethod;

public class FabricaRetangulo implements IFabricaForma{

	@Override
	public IForma criarForma() {
		return new Retangulo();
	}

}
