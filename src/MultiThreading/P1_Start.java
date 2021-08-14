package MultiThreading;

public class P1_Start {

	public static void main(String[] args) {
		mythread ob = new mythread();
		ob.start(); //this will create new thread where run method from mythread class gets executed
		ob.start(); //cannot restart the thread that has already started
		for(int i=0;i<10;i++)
		{
			System.out.println("main thread");
		}

	}

}
