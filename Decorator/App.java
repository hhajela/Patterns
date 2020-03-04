public class App
{
	public static void main(String[] args)
	{
		Pizza p1 = new Pepperoni();
		p1 = new Veggies(p1);
		p1 = new Cheese(p1);
		p1 = new Meat(p1);

		System.out.println("Decsription : " + p1.getDescription());
		System.out.println("Cost : " + p1.getCost());

		Pizza p2  = new Margherita();
		p2 = new Cheese(p2);
		p2 = new Cheese(p2);	

		System.out.println("Decsription : " + p2.getDescription());
		System.out.println("Cost : " + p2.getCost());
	}
}
