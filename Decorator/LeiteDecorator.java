package Decorator;

public class LeiteDecorator extends ABSDecorator{

	public LeiteDecorator(iBebida bebida) {
		super(bebida);
	}

	@Override
	public String Descricao() {
		return bebida.Descricao() + " com Leite";
	}

	@Override
	public double Preco() {
		return bebida.Preco() + 0.5;
	}

}
