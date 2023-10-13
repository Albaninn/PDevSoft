package avaliação;

public abstract class Product {
    String name;
    double price;
    String SKU;

    public Product(String name, double price, String SKU) {
        this.name = name;
        this.price = price;
        this.SKU = SKU;
    }
    
    public abstract void displayInfo();
}
