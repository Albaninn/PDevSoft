package geometria;

public class triangulo implements geometria {

	private double peri;
	private double base;
    private double altura;

    public triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
	
	@Override
	public double calc_area() {
		return (base * altura) / 2;
	}

	@Override
	public double calc_perimetro() {
		double q;
		double hip;
		
		q = (base + altura);
		hip = Math.sqrt((base * base) + (altura * altura));

		peri = q / 2 + hip;
		return peri;
	}

}