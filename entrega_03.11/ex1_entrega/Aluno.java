package ex1_entrega;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	private String nome;
    private String tipo;
    private List<Disciplina> disciplinas = new ArrayList<>();
    private IRegraAprovacao regraAprovacao;

    public Aluno(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
        this.regraAprovacao = AprovacaoFactory.getRegra(tipo);
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public boolean verificarAprovacao() {
        return regraAprovacao.aprovado(disciplinas);
    }

    public String getNome() {
        return nome;
    }
}
