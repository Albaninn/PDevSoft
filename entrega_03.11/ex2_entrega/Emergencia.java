package ex2_entrega;

public class Emergencia extends Paciente {
    @Override
    public void admitir() {
        notifyObservers("Um novo paciente de emergência foi admitido!");
    }

	@Override
	public void sair() {
		notifyObservers("Paciente saiu da emergência!");
	}
}
