package geometria;

public class retangulo implements geometria {

	private double base;
    private double altura;

    public retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

	@Override
    public double calc_area() {
        return base * altura;
    }

    @Override
    public double calc_perimetro() {
        return 2 * (base + altura);
    }

}