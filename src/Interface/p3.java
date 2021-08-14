package Interface;

public class p3 extends p1 //here inheriting class is implementing interface through it's child p1
{
    public void test3() {
    	System.out.println("from test3 of p2");
    }
    
    public static void main(String[] args)
    {
    	I1 ob1 = new p3();
    	p1 ob = new p3();
    	ob1.test1();
    	ob1.test2();
    	ob1.test3();
    	ob.test1();
    	ob.test2();
    	ob.test3();
    }
}
