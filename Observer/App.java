public class App
{
	public static void main(String[] args)
	{
		ConcreteSubject subject = new ConcreteSubject();

		MyObserver o  = new ConcreteObserver(subject);
		MyObserver o1 = new ConcreteObserver(subject);

		subject.increment();

		subject.removeObserver(o);

		subject.increment();
	}
}
