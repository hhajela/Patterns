public class Meat extends PizzaWithToppings
{
	private Pizza pizza;

	public Meat(Pizza pizza)
	{
		super("extra meat");
		this.pizza = pizza;
		cost = 30;
	}

	public int getCost()
	{
		return pizza.getCost() + cost;
	}

	public String getDescription()
	{
		return pizza.getDescription() + " with " + name;
	}
}
