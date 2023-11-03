package ex2_entrega;

public class teste {
	public static void main(String[] args) {
        // Criando observadores
        UTI uti = new UTI();
        Enfermaria enfermaria = new Enfermaria();

        // Admitindo um paciente de emergência
        Paciente pacienteEmergencia = PacienteFactory.criarPaciente("emergencia");
        pacienteEmergencia.addObserver(uti);
        pacienteEmergencia.admitir();
        pacienteEmergencia.sair();

        // Admitindo um paciente de atendimento convencional
        Paciente pacienteConvencional = PacienteFactory.criarPaciente("convencional");
        pacienteConvencional.addObserver(enfermaria);
        pacienteConvencional.admitir();
        pacienteConvencional.sair();
    }
}
