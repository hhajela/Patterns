public class DoNothingStrategy implements PostProcessStrategy
{
	public void postProcess()
	{
		System.out.println("Do nothing");
	}
}
