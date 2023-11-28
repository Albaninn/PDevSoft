package ecommerce;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<ItemDoCarrinho> itens = new ArrayList<>();

    public void adicionarItem(ItemDoCarrinho item) {
        itens.add(item);
    }

    public void removerItem(ItemDoCarrinho item) {
        itens.remove(item);
    }

    public double calcularTotal() {
        return itens.stream().mapToDouble(ItemDoCarrinho::getPrecoTotal).sum();
    }
}
