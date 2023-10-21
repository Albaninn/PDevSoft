package Decorator;

public class AcucarDecorator extends ABSDecorator{
	
	public AcucarDecorator(iBebida bebida) {
		super(bebida);
	}

	@Override
	public String Descricao() {
		return bebida.Descricao() + " com Açucar";
	}

	@Override
	public double Preco() {
		return bebida.Preco() + 0.1;
	}
}
