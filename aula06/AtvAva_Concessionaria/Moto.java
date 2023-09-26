class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String marca, String modelo, int anoFabricacao, double preco, int cilindradas) {
        super(marca, modelo, anoFabricacao, preco);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }
}