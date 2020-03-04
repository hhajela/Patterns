public class PaintingProcessor extends PostProcessor
{
	public PaintingProcessor(String name)
	{
		super(name,new ArtStrategy());
	}
}
