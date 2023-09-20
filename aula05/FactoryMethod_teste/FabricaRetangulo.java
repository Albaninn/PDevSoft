package FactoryMethod_teste;

public class FabricaRetangulo implements IFabricaForma{

	@Override
	public IForma criarForma() {
		return new Retangulo();
	}

}
