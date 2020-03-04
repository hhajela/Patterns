public class ConcreteObserver implements MyObserver
{
	private ConcreteSubject concreteSubject;

	//set reference in constructor
	public ConcreteObserver(ConcreteSubject s)
	{
		concreteSubject = s;
		s.registerObserver(this);
	}

	//implement update
	public void update()
	{
		System.out.println("Message from subject to observer #" + this.toString() + ": Be advised, observed value has changed to " + concreteSubject.getObservedValue());
	}
}
