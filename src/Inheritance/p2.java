package Inheritance;

public class p2 extends p1 {
	int p = 10;
	
	public p2(int j){
		super(j);
	}
	{
		p=30;
		System.out.println("from non static block of p2");
	}
	public static void main(String[] args)
	{
	  p2 ob = new p2(20);
	  System.out.println(ob.a);
	  ob.a=50;
	  System.out.println(ob.a);
	  System.out.println(ob.b);
	  System.out.println(ob.p);
	}

}
