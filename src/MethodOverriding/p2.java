package MethodOverriding;

public class p2 extends p1{
	public void test() //vibility of parent class method should be >= child class method
	{
		System.out.println("from non-static method of p2");
	}

	public static void main(String[] args) {
		p2 ob = new p2();
		ob.test();
	}
}