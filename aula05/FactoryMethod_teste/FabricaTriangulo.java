package FactoryMethod_teste;

public class FabricaTriangulo implements IFabricaForma{

	@Override
	public IForma criarForma() {
		return new Triangulo();
	}

}
