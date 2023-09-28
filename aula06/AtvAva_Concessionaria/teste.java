public class teste{
	public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 2023, 100000, 4);
        Moto moto = new Moto("Honda", "CBR 500", 2023, 30000, 500);
        Concessionaria concessionaria = new Concessionaria(new BancoDeDadosArmazenamento());
        concessionaria.adicionarVeiculo(carro);
        concessionaria.adicionarVeiculo(moto);
        for (Veiculo veiculo : concessionaria.listarVeiculos()) {
            System.out.println("Modelo: " + veiculo.getModelo() + ", Marca: " + veiculo.getMarca() + ", Ano: " + veiculo.getAnoFabricacao() + ", Preço: " + veiculo.getPreco());
        }
        Veiculo veiculoRecuperado = concessionaria.recuperarVeiculo("Corolla");
        if (veiculoRecuperado != null) {
            System.out.println("Veículo recuperado: " + veiculoRecuperado.getModelo() + ", Marca: " + veiculoRecuperado.getMarca());
        }
    }
}