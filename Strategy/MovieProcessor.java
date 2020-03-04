public class MovieProcessor extends PostProcessor
{
	public MovieProcessor(String name)
	{
		super(name,new SfxStrategy());
	}
}
