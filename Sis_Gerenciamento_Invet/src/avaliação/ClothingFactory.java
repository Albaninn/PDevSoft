package avaliação;

public class ClothingFactory implements ProductFactory {
    @Override
    public Product createProductA(String name, double price, String SKU) {
        return new Camisa(name, price, SKU);
    }

    @Override
    public Product createProductB(String name, double price, String SKU) {
        return new CalcaJeans(name, price, SKU);
    }
}
