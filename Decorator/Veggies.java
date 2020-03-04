public class Veggies extends PizzaWithToppings
{
	private Pizza pizza;

	public Veggies(Pizza pizza)
	{
		super("extra veggies");
		this.pizza = pizza;
		cost = 30;
	}

	//override getDescription and getCost
	public int getCost()
	{
		//get cumulative cost
		return pizza.getCost() +cost;
	}

	public String getDescription()
	{
		//get complete decsription
		return pizza.getDescription() + " with " + name;
	}
}
