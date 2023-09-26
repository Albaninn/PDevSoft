import java.util.List;

interface Armazenamento {
    void adicionar(Veiculo veiculo);
    Veiculo recuperar(String modelo);
    List<Veiculo> listar();
}