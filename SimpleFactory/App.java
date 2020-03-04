import java.util.*;

public class App
{
	public static void main(String[] args)
	{
		CustomerFactory cmf = new CustomerFactory();

		ArrayList<String> names = new ArrayList<String>(Arrays.asList(
					"Brian",
					"Ryan",
					"Casey"));

		for(String name : names)
		{
			Customer customer = cmf.createCustomer(name);
			System.out.println(customer.getType() + " created");
		}
	}
}
