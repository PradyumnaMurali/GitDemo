package FinalANDSuperOperator;

public class f2 extends f1{
//	public void test() //inheriting class also cannot override final field
//	{
//		a=20;
//	}
	public static void main(String[] args)
	{
		f2 ob = new f2();
		ob.test();
		System.out.println(ob.a);
	}

}
