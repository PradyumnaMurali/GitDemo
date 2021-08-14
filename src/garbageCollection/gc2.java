package garbageCollection;

public class gc2 {
 int a=10;
 int b=30;
 public void finalize() throws Throwable
	{
		System.out.println("garbage collected");
	}

	public static void main(String[] args) {
	gc2 ob1=new gc2();
	ob1 = new gc2();
	System.gc();
	System.out.println(ob1);
	

	}

}
