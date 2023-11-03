package ex1_entrega;

import java.util.List;

public class RegraAprovacaoMestrado implements IRegraAprovacao {
    
	public boolean aprovado(List<Disciplina> disciplinas) {
        for (Disciplina d : disciplinas) {
            if ("D".equals(d.getNotaConceito())) {
                return false;
            }
        }
        return true;
    }
}
