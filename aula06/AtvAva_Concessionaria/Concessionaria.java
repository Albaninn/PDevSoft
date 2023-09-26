import java.util.List;

class Concessionaria {
    private Armazenamento armazenamento;

    public Concessionaria(Armazenamento armazenamento) {
        this.armazenamento = armazenamento;
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        armazenamento.adicionar(veiculo);
    }

    public Veiculo recuperarVeiculo(String modelo) {
        return armazenamento.recuperar(modelo);
    }

    public List<Veiculo> listarVeiculos() {
        return armazenamento.listar();
    }
}