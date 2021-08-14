package MultiThreading;

public class P5_OverloadingOfRunMethod extends Thread {

	//oVERLOADING OF RUN METHOD IS POSSIBLE BUT START METHOD WILL ALWAYS CALL RUN METHOD WITH NO ARGUMENT ONLY
	public void run()
	{
		for(int i=0;i<10;i++)
		System.out.println("child thread");
	}
	
	public void run(String s1)
	{
		for(int i=0;i<10;i++)
			System.out.println("child thread");
	}
	
	public static void main(String[] args) {
		P5_OverloadingOfRunMethod ob = new P5_OverloadingOfRunMethod();
		ob.start(); //will always call run method with no argument
		for(int i=0;i<10;i++)
		System.out.println("main thread");

	}

}
