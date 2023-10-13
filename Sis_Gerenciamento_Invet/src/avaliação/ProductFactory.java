package avaliação;

public interface ProductFactory {
	Product createProductA(String name, double price, String SKU);
    Product createProductB(String name, double price, String SKU);
}
