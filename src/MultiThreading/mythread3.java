package MultiThreading;

public class mythread3 extends Thread {
	
	public synchronized void start() 
	{
		System.out.println("start method");
		super.start(); //to access implementation before it was overidden. Therefore start will create new thread to execute run method.
	}
	
	public void run()
	{
			System.out.println("child thread");
	}
		
		public static void main(String[] args)
		{
			mythread3 ob = new mythread3();
			ob.start();
		}
	}


