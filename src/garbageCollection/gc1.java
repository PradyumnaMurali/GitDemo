package garbageCollection;

public class gc1 {
	
	public void finalize() throws Throwable
	{
		System.out.println("garbage collected");
	}

	public static void main(String[] args) {
		gc1 ob1=new gc1();
		System.out.println(ob1);
	    ob1=null;
	    System.gc();
	}
}
