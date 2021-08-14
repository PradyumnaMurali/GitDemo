package TypeCasting;

public class p2 extends p1{
	public void test() //visibility of parent class method should be >= child class method
	{
		System.out.println("from non-static method of p2");
	}

	public static void main(String[] args) {
		p1 ob1= new p2();
		boolean flag = ob1 instanceof p2;
		System.out.println(flag);
		System.out.println("-----------------------");
		p1 ob2 = (p2)ob1;
		boolean flag2 = ob2 instanceof p2;
		System.out.println(flag2);
		System.out.println("-----------------------");
		p1 ob3 = new p1();
		boolean flag3 = ob3 instanceof p2;
		System.out.println(flag3);
	}
}