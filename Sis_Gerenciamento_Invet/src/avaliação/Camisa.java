package avaliação;

public class Camisa extends Product {
	
	public Camisa(String name, double price, String SKU) {
        super(name, price, SKU);
    }
	
    @Override
    public void displayInfo() {
        System.out.println("Camisa: " + name + ", Preço: " + price + ", SKU: " + SKU);
    }
}
