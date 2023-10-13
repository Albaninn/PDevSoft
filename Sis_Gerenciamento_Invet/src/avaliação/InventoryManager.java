package avaliação;

import java.util.ArrayList;
import java.util.List;

public class InventoryManager {
    private List<Product> products = new ArrayList<>();
    private ProductFactory factory;

    public InventoryManager(ProductFactory factory) {
    	//System.out.println("Factory recebida no InventoryManager: " + factory);
        this.factory = factory;
    }

    public void addProductA(String name, double price, String SKU) {
        products.add(factory.createProductA(name, price, SKU));
    }

    public void addProductB(String name, double price, String SKU) {
        products.add(factory.createProductB(name, price, SKU));
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public void listProducts() {
        for (Product product : products) {
            product.displayInfo();
        }
    }
}

