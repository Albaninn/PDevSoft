package Decorator;

public class consumidorDecorator {

	public static void main(String[] args) {
		//Criar o componente concreto
		iBebida cafe = new Cafe();
		System.out.println("Pedido 1: " + cafe.Descricao() + ", Preço: " + cafe.Preco());
		
		cafe = new UisqueDecorator(cafe);
		System.out.println("Pedido Irish: " + cafe.Descricao() + ", Preço: " + cafe.Preco());
		
		cafe = new AcucarDecorator(cafe);
		System.out.println("Pedido 2: " + cafe.Descricao() + ", Preço: " + cafe.Preco());
		
		cafe = new LeiteDecorator(cafe);
		System.out.println("Pedido 3: " + cafe.Descricao() + ", Preço: " + cafe.Preco());
	}

}
