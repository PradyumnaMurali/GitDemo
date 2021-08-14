package Interface;

public class p2 extends p1 //here inheriting class is implementing interface through it's parent p1
{
    public void test3() {
    	System.out.println("from test3 of p2");
    }
    
    public static void main(String[] args)
    {
    	p2 ob1 = new p2();
    	ob1.test1();
    	ob1.test2();
    	ob1.test3();
    }
}
