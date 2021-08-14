package FinalANDSuperOperator;

public class f4 extends f3{
	public void test() 
	{
		a=30; //overrides parent class
		super.test(); //access implementation of parent class which has been overridden.
	}
	public static void main(String[] args)
	{
		f4 ob = new f4();
		System.out.println(ob.a);
	}

}
