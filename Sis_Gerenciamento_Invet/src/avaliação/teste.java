package avaliação;

public class teste {
    public static void main(String[] args) {
        ProductFactory electronicsFactory = DependencyContainer.getProductFactory("electronics");
        //System.out.println(electronicsFactory);
        if (electronicsFactory == null) {
            System.out.println("Erro: Factory não inicializada!");
            return;
        }
        InventoryManager manager = new InventoryManager(electronicsFactory);
        manager.addProductA("Notebook Dell", 5000.00, "12345");
        manager.addProductB("iPhone 13", 7000.00, "67890");

        manager.listProducts();
        
        ProductFactory clothingFactory = DependencyContainer.getProductFactory("clothing");
        //System.out.println(clothingFactory);
        if (clothingFactory == null) {
            System.out.println("Erro: Factory não inicializada!");
            return;
        }
        InventoryManager manager1 = new InventoryManager(clothingFactory);
        manager1.addProductA("Camisa Nike", 50.00, "1234");
        manager1.addProductB("Calça Vans", 70.00, "4321");

        manager1.listProducts();
    }
}

