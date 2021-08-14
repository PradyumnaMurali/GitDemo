package WrapperClass;

public class UnBoxing1 {
	
	public static void test(int a)
	{
		System.out.println(a);
	}
	
	public static void main(String[] args)
	{
		Integer i1=new Integer(10);
				UnBoxing1.test(i1);			
	}
	
}
