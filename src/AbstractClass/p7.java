package AbstractClass;

public class p7 extends p6{
	public void test3()
	{
		System.out.println("from test3 of p7");
	}

	public static void main(String[] args) {
		p7 ob = new p7();
		ob.test1();
		ob.test2();
		ob.test3();
	}

}
