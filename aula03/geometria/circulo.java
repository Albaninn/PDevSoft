package geometria;

public class circulo implements geometria {

	private double raio;

    public circulo(double raio) {
        this.raio = raio;
    }

	@Override
    public double calc_area() {
        return Math.PI * raio * raio;
    }

    @Override
    public double calc_perimetro() {
        return 2 * Math.PI * raio;
    }


}