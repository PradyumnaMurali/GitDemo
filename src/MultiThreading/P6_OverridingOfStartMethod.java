package MultiThreading;

public class P6_OverridingOfStartMethod {
	
	//since start method is overridden run method will not get executed.
	public static void main(String[] args) {
		mythread2 ob = new mythread2();
		ob.start(); 
		
	}

}
