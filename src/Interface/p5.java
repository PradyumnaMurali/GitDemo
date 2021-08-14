package Interface;

public class p5 implements I1,I3 
{
	 public void test1() {
	    	System.out.println("from test1 of p5");
	    }
	 
	 public void test2() {
	    	System.out.println("from test2 of p5");
	    }
	 
	 public void test3() {
	    	System.out.println("from test3 of p5");
	    }
	 
	 public void test4() {
    	System.out.println("from test4 of p5");
    }
	 
	 public void test5() {
	    	System.out.println("from test5 of p5");
	    }
    
    public static void main(String[] args)
    {
    p5 ob= new p5();
    ob.test1();
    	ob.test2();
    	ob.test3();
    	ob.test4();
    	ob.test5();
    	I3 ob1=new p5();
    	ob1.test4();
    	ob1.test5();
    }
}
