import java.lang.*;

public class CustomerFactory
{
	public static Customer createCustomer(String name)
	{
		if (name.startsWith("B"))
			return new BusinessCustomer(name);
		else if (name.startsWith("R"))
			return new RegularCustomer(name);
		else
			return new CasualCustomer(name);
	}
}
