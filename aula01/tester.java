package Aula01_0408;

public class tester {

	public static void main(String[] args) {
		funcionario f = new funcionario();
		f.nome = "Escobar";
		f.salario = 10000;
		System.out.println(f.exibir_dados());
		System.out.println(f.calc_salario_liq());
	}

}
