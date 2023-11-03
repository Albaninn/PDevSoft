package ex2_entrega;

public class PacienteFactory {
	public static Paciente criarPaciente(String tipo) {
        switch (tipo) {
            case "emergencia":
                return new Emergencia();
            case "convencional":
                return new AtendimentoConvencional();
            default:
                throw new IllegalArgumentException("Tipo de paciente desconhecido");
        }
    }
}
