package MultiThreading;

public class mythread4 implements Runnable {
	
	public void run()
	{
		Thread.yield(); //pauses the current executing thread to give chance for remaining waiting threads of same priority
		for(int i=0;i<10;i++)
			System.out.println("child thread");
	}	
}


