package ecommerce;

public class ItemDoCarrinho {
    private String produto;
    private int quantidade;
    private double precoUnitario;

    public ItemDoCarrinho(String produto, int quantidade, double precoUnitario) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public double getPrecoTotal() {
        return quantidade * precoUnitario;
    }

    // Getters e setters omitidos para brevidade.
}
