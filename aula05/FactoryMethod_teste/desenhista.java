package FactoryMethod_teste;

import FactoryMethod.FabricaCirculo;
import FactoryMethod.FabricaRetangulo;
import FactoryMethod.IFabricaForma;
import FactoryMethod.IForma;

public class desenhista {
	public void desenhe(TipoFigura Figura) {
		switch (Figura) {
			case CIRCULO:{
				IFabricaForma FabCir = new FabricaCirculo();
				IForma circ = FabCir.criarForma();
				circ.desenhar();
			}
				break;
			case RETANGULO: {
				IFabricaForma FabRet = new FabricaRetangulo();
				IForma reta = FabRet.criarForma();
				reta.desenhar();
			}
				break;
			/*case TRIANGULO: {
				IFabricaForma FabTri = new FabricaTriangulo();
				IForma tria = FabTri.criarForma();
				tria.desenhar();
			}
				break;*/
			default:{
				throw new IllegalArgumentException("Enexpected varialvel");
			}
		}
	}
}
