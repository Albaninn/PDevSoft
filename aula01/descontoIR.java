package Aula01_0408;

public class descontoIR {
	public double calcularIR(double salario) {
		double aliquota = 0.0;
		if (salario < 2000) {
			aliquota = 0.0;
		}
		else {
			aliquota = 0.275;
		}
		return salario * aliquota;
	}
}
