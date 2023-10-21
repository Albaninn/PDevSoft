package Decorator;

public abstract class ABSDecorator implements iBebida{
	
	protected iBebida bebida;
	public ABSDecorator(iBebida bebida) {
		this.bebida = bebida;
	}
}
