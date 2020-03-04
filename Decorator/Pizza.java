public abstract class Pizza
{
	protected String name;
	protected int cost;
	public Pizza(String name)
	{
		this.name = name;
	}

	public String getName() { return name; }

	public String getDescription() { return "This is a " + name; }

	public int getCost() { return cost; }
}
