package PorpogationOfException;

public class ep {
public static void test2()
{
    int a=10,b=0;
	System.out.println(a/b);
	 System.out.println("after throwing exception"); //this statement doesnt get executed since there is exception in the previous step.
}
public static void test1()
{
  try {
	  test2();
  }
  catch(ArithmeticException e) {
	  System.out.println("Arithmetic Exception"); //execution stops in test2() and checks if exception is handled in test1() method.
	  											  //order of catch block in case of multiple catch blocks should be from subclass type to parentclass type.
  }
  
  /*catch (Throwable t) {
	  
  }*/ //exception class of catch block should be from sub class type to parent class type
  /*finally {
		System.out.println("after throwing exception"); //finally block should be after all the catch blocks.
	}*/
  catch (Exception e) {
	  System.out.println("Exception"); 
  }
finally {
	System.out.println("after throwing exception"); 
	
}
}
	public static void main(String[] args) {
		 System.out.println("main begin");
		 test1();
		 System.out.println("main end");
	}

}
