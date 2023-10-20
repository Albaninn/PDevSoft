package Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	private int state;
	private List<ABSObserver> observers = new ArrayList<>();
	
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
		this.notifyAllObservers();
	}
	
	public void notifyAllObservers() {
		for (ABSObserver observer : observers) {
			observer.Update();
		}
	}
	
	public void attach(ABSObserver observer) {
		this.observers.add(observer);
	}
	public void detach(ABSObserver observer) {
		this.observers.remove(observer);
	}
}
