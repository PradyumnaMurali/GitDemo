package MultiThreading;

public class mythread2 extends Thread {
	
	public synchronized void start() //overrides start method of Thread Interface
	{
		System.out.println("start method");
	}
	
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("child thread");
		}
	}

}
