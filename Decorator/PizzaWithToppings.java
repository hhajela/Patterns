public abstract class PizzaWithToppings extends Pizza
{
	
	public PizzaWithToppings(String name)
	{
		super(name);
	}

	public abstract String getDescription();

	public abstract int getCost();
}
