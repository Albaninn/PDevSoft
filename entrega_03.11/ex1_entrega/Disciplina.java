package ex1_entrega;

public class Disciplina {
    private String nome;
    private Object notaConceito; // Pode ser Float ou String

    public Disciplina(String nome, Object notaConceito) {
        this.nome = nome;
        this.notaConceito = notaConceito;
    }

    public Object getNotaConceito() {
        return notaConceito;
    }
}