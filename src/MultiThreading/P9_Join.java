package MultiThreading;

public class P9_Join {
	
	public static void main(String[] args) throws InterruptedException {
		mythread ob= new mythread();
		Thread ob1 = new Thread(ob);
	 ob1.start();
     ob1.join(); //thread will wait until the other thread completes it's execution
	 for(int i=0;i<10;i++)
	 System.out.println("main thread");
	}
}
