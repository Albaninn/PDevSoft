package aula_03;

public class teste {

	public static void main(String[] args) {
		
		Estudante gra = new Graduacao(); // Substitua com os valores apropriados
        gra.nome = "Lucas";
        gra.matricula = "4321";
        gra.nota = 4.3;
		
        gra.calcularAprovacao();
        System.out.println("Graduacao - Situação: " + gra.aprovado());
    
		
		Estudante esp = new Especializacao(); // Substitua com os valores apropriados
        esp.nome = "Lucas";
        esp.matricula = "1234";
        esp.conceito = "";
       
        esp.calcularAprovacao();
        System.out.println("Especializacao - Situação: " + esp.aprovado());

    
	}

}
