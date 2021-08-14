package Inheritance;

public class p3 {
	
	public p3()
	{
		this(10);
	}
	public p3(int a)
	{
		this(10.33f);
	}
	public p3(float b)
	{
	 System.out.println("from float constructor");
	}

	public static void main(String[] args) {
		p3 ob = new p3(); //multiple constructors are used to create a single object

	}

}
