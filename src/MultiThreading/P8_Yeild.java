package MultiThreading;

public class P8_Yeild {
	
	public static void main(String[] args) {
		mythread4 ob= new mythread4();
		Thread ob1 = new Thread(ob);
	 ob1.start();
	 for(int i=0;i<10;i++)
	 System.out.println("main thread");
	}
}
