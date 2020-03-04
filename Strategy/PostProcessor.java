public abstract class PostProcessor
{
	private PostProcessStrategy postprocessBehaviour;
	private String name;

	//constructor, initialize using strategy
	public PostProcessor(String name, PostProcessStrategy postprocessStrategy)
	{
		this.name = name;
		this.postprocessBehaviour = postprocessStrategy;
	}

	public PostProcessor(String name)
	{
		this.name = name;
		this.postprocessBehaviour = new DoNothingStrategy();
	}

	//do post processing using specified strategy
	public void doPostProcess()
	{
		postprocessBehaviour.postProcess();
	}

	public void printName()
	{
		System.out.println("name : " + name);
	}
}
