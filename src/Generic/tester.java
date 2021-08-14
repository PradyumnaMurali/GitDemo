package Generic;

public abstract class tester extends employee {
	
	public tester(int id,String name,double sal)
	{
		super(id,name,sal);
	}
	
	public void work()
	{
		System.out.println("I am a tester");
	}

}
