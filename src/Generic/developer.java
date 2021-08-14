package Generic;

public abstract class developer extends employee {
	
	public developer(int id,String name,double sal)
	{
		super(id,name,sal);
	}
	
	public void work()
	{
		System.out.println("I am a developer");
	}

}
