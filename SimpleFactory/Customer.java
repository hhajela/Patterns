public abstract class Customer
{
	protected String name;
	protected String type;

	public Customer(String name, String type)
	{
		this.name = name;
		this.type = type;
	}

	public String getType() { return type; }

	public String getName() { return name; }

}
