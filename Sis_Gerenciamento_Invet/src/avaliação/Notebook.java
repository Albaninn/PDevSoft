package avaliação;

public class Notebook extends Product {
	
	public Notebook(String name, double price, String SKU) {
        super(name, price, SKU);
    }
	
    @Override
    public void displayInfo() {
        System.out.println("Notebook: " + name + ", Preço: " + price + ", SKU: " + SKU);
    }
}
