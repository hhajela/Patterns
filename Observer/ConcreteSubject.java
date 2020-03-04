import java.util.*;

//Concrete Subject
//implement register , remove and notify observer
//maintain observers in a list
public class ConcreteSubject implements Subject
{
	private ArrayList<MyObserver> observers;
	private int observedValue;

	public ConcreteSubject()
	{
		observers = new ArrayList<MyObserver>();
	}

	public void registerObserver(MyObserver o) { observers.add(o); }
	public void removeObserver(MyObserver o) { observers.remove(o); }

	public void notifyObservers()
	{
		for(MyObserver o : observers)
		{
			o.update();
		}
	}

	public int getObservedValue()
	{
		return observedValue;
	}

	public void increment()
	{
		observedValue++;
		notifyObservers();
	}
}
