package Decorator;

public class UisqueDecorator extends ABSDecorator{
	
	public UisqueDecorator(iBebida bebida) {
		super(bebida);
	}

	@Override
	public String Descricao() {
		return bebida.Descricao() + " com Uisque";
	}

	@Override
	public double Preco() {
		return bebida.Preco() + 27;
	}
}
