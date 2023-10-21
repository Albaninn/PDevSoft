package Decorator;

public class Cafe implements iBebida{

	@Override
	public String Descricao() {
		return "Café";
	}

	@Override
	public double Preco() {
		return 3.0;
	}

}
