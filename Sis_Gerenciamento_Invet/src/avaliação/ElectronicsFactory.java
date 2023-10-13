package avaliação;

public class ElectronicsFactory implements ProductFactory {
    @Override
    public Product createProductA(String name, double price, String SKU) {
        return new Notebook(name, price, SKU);
    }

    @Override
    public Product createProductB(String name, double price, String SKU) {
        return new Smartphone(name, price, SKU);
    }
}
