package Observer;

public class tester_observadores{

	public static void main(String[] args) {
		Subject observado = new Subject();
		ABSObserver observador1 = new concreteObserver(observado);
		ABSObserver observador2 = new concreteObserver(observado);
		observado.setState(10);
	}

}
