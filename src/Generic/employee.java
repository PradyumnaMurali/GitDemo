package Generic;

public abstract class employee implements i1 {
	public int id;
	public String name;
	public double sal;
	
	public employee(int id,String name,double sal)
	{
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	
	public void work()
	{
		System.out.println("I am an engineer");
	}

}
