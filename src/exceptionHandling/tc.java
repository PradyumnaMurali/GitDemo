package exceptionHandling;

public class tc extends ArithmeticException {

	public static void main(String[] args) {
		System.out.println("main begin");
		int i=200;
		int j=0;
		try {
		System.out.println("from try block 1");
		System.out.println(i/j); //JVM checks if exception raised has been handled and so the next statement wont get executed
		System.out.println("from try block 2"); //this statement is not executed and it is skipped.
		}
		catch(Exception e) {
			System.out.println("Arithmetic Exception");
		}
	}

}
