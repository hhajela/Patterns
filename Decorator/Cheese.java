public class Cheese extends PizzaWithToppings
{
	private Pizza pizza;
	public Cheese(Pizza pizza)
	{
		super("extra cheese");
		this.pizza = pizza;
		this.cost = 10;
	}

	//override get cost and get description methods
	public int getCost()
	{
		return pizza.getCost() + cost;
	}

	public String getDescription()
	{
		return pizza.getDescription() + " with " + name;
	}
}
