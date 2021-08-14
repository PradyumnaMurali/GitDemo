package ConstructorChaining;

public class p2 extends p1{
	public p2(int j)
	{
		super(20);
		System.out.println("from constructor of p2");
	}

	public static void main(String[] args) {
		p2 ob = new p2(10);
		System.out.println(ob.m);
	}

}
