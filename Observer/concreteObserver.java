package Observer;

public class concreteObserver extends ABSObserver {

	public concreteObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);		
	}
	
	@Override
	public void Update() {
		// Lógica que reage à mudança de estado no objeto observado
		System.out.println("O observador foi notificado. Novo estado do objeto" + subject.getState());
	}

}
