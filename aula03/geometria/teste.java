package geometria;

public class teste {

	public static void main(String[] args) {
		geometria cir = new circulo(5.0);
        geometria ret = new retangulo(4.0, 6.0);
        geometria tri = new triangulo(4.0, 5.0);

        System.out.println("Circulo");
        System.out.println("Área: " + cir.calc_area());
        System.out.println("Perímetro: " + cir.calc_perimetro());
        
        System.out.println("\nRetangulo");
        System.out.println("Área: " + ret.calc_area());
        System.out.println("Perímetro: " + ret.calc_perimetro());
        
        System.out.println("\nTriangulo");
        System.out.println("Área: " + tri.calc_area());
        System.out.println("Perímetro: " + tri.calc_perimetro());
        
	}
}