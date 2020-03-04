import java.util.*;

//subject notifies observers, allows adding and removing observers

public interface Subject
{
	void registerObserver(MyObserver o);
	void removeObserver(MyObserver o);
	void notifyObservers();
	
}
