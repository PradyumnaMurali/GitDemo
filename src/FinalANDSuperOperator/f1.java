package FinalANDSuperOperator;

public class f1 {
	final int a=10;
	public final void test()
	{
		//a=50; //final field int a cannot be overridden
	}
	public static void main(String[] args)
	{
		f1 ob = new f1();
		ob.test();
		System.out.println(ob.a);
	}

}
