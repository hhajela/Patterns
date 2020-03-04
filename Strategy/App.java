import java.util.*;

public class App
{
	public static void main(String[] args)
	{
		PostProcessor movieProcessor = new MovieProcessor("movie");
		PostProcessor artProcessor = new PaintingProcessor("painting");
		PostProcessor textProcessor = new TextProcessor("text");

		ArrayList<PostProcessor> processors = new ArrayList<PostProcessor>(Arrays.asList(movieProcessor,artProcessor,textProcessor));

		for(PostProcessor p : processors)
		{
			p.doPostProcess();
		}
	}
}
