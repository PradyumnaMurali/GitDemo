package MultiThreading;

public class P7_SetName {
	
	public static void main(String[] args) {
		
	System.out.println(Thread.currentThread().getName());	
	Thread.currentThread().setName("main2");
	System.out.println(Thread.currentThread().getName());
	for(int i=0;i<10;i++)
	System.out.println("1");
		
	}

}
