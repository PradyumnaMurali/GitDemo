package practice;

public class p3 implements Cloneable {
	
	protected void finalize()
	{
		System.out.println("object deleted");
	}

	public static void main(String[] args) throws CloneNotSupportedException  {
		p3 ob1 = new p3();
	  ob1 = new p3();
		
System.gc();

	}

}
