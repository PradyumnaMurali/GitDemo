package AbstractClass;

public abstract class p2{
	public void test() {
		System.out.println("from non-static method of p2");
	}	
	
	public static void main(String[] args)
	{
		//p2 ob2 = new p2(); >>>>> cannot instantiate a class that is declared as abstract
	}
}