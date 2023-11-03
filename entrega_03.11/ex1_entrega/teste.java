package ex1_entrega;

public class teste {

	public static void main(String[] args) {
		// Criando um aluno de nível médio
        Aluno alunoMedio = new Aluno("João", "medio");
        alunoMedio.adicionarDisciplina(new Disciplina("Matemática", 8.0f));
        alunoMedio.adicionarDisciplina(new Disciplina("Português", 7.5f));
        System.out.println(alunoMedio.getNome() + " foi " + (alunoMedio.verificarAprovacao() ? "aprovado" : "reprovado") + " no nível médio.");

        // Criando um aluno de bacharelado
        Aluno alunoBacharelado = new Aluno("Maria", "bacharelado");
        alunoBacharelado.adicionarDisciplina(new Disciplina("Física", 6.5f));
        alunoBacharelado.adicionarDisciplina(new Disciplina("Química", 5.9f));
        System.out.println(alunoBacharelado.getNome() + " foi " + (alunoBacharelado.verificarAprovacao() ? "aprovado" : "reprovado") + " no bacharelado.");

        // Criando um aluno de mestrado
        Aluno alunoMestrado = new Aluno("Pedro", "mestrado");
        alunoMestrado.adicionarDisciplina(new Disciplina("Pesquisa", "A"));
        alunoMestrado.adicionarDisciplina(new Disciplina("Metodologia", "C"));
        System.out.println(alunoMestrado.getNome() + " foi " + (alunoMestrado.verificarAprovacao() ? "aprovado" : "reprovado") + " no mestrado.");
        
	}

}
