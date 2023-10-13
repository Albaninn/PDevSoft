package avaliação;

public class CalcaJeans extends Product {
	
	public CalcaJeans(String name, double price, String SKU) {
        super(name, price, SKU);
    }
	
    @Override
    public void displayInfo() {
        System.out.println("Calça Jeans: " + name + ", Preço: " + price + ", SKU: " + SKU);
    }
}