package MultiThreading;

public class P2_Run {

	//
	public static void main(String[] args) {
		mythread ob = new mythread();
		ob.run(); //this will not create new thread so run method will get excuted like a normal method
		for(int i=0;i<10;i++)
		{
			System.out.println("main thread");
		}

	}

}
