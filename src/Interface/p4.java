package Interface;

public class p4 implements I2 //here inheriting class is implementing interface through it's child p1
{
	 public void test1() {
	    	System.out.println("from test1 of p4");
	    }
	 
	 public void test2() {
	    	System.out.println("from test2 of p4");
	    }
	 
	 public void test3() {
	    	System.out.println("from test3 of p4");
	    }
	 
	 public void test4() {
    	System.out.println("from test4 of p4");
    }
	 
	 public void test5() {
	    	System.out.println("from test5 of p4");
	    }
    
    public static void main(String[] args)
    {
    //I2 ob= new I2(); >>> cannot create object for Interface
    I2 ob= new p4(); //however we can create object for implementing class and upcast it to Interface class
    ob.test1();
    	ob.test2();
    	ob.test3();
    	ob.test4();
    	ob.test5();
    }
}
