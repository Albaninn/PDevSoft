package ex1_entrega;

public class AprovacaoFactory {
	public static IRegraAprovacao getRegra(String tipo) {
        switch (tipo) {
            case "medio":
                return new RegraAprovacaoMedio();
            case "bacharelado":
                return new RegraAprovacaoBacharelado();
            case "mestrado":
                return new RegraAprovacaoMestrado();
            default:
                throw new IllegalArgumentException("Tipo de aluno inválido");
        }
    }
}
