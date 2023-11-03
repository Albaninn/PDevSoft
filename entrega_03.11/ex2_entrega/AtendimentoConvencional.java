package ex2_entrega;

public class AtendimentoConvencional extends Paciente {
    @Override
    public void admitir() {
        notifyObservers("Um novo paciente de atendimento convencional foi admitido!");
    }
    @Override
	public void sair() {
		notifyObservers("Paciente saiu do atendimento convencional!");
	}
}