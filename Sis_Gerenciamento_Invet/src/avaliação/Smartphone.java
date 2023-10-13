package avaliação;

public class Smartphone extends Product {
	
	public Smartphone(String name, double price, String SKU) {
        super(name, price, SKU);
    }
	
    @Override
    public void displayInfo() {
        System.out.println("Smartphone: " + name + ", Preço: " + price + ", SKU: " + SKU);
    }
}
