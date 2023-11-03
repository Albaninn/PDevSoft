package ex1_entrega;

import java.util.List;

public class RegraAprovacaoMedio implements IRegraAprovacao {
	
	public boolean aprovado(List<Disciplina> disciplinas) {
        for (Disciplina d : disciplinas) {
            if ((Float) d.getNotaConceito() <= 7.0) {
                return false;
            }
        }
        return true;
    }
}
