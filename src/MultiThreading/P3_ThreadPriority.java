package MultiThreading;

class P3_ThreadPriority {
	//some platforms wont provide proper support for thread priority
	public static void main(String[] args) {
    System.out.println(Thread.currentThread().getPriority());
    mythread ob = new mythread(); 
    ob.setPriority(10);
    ob.start();
		
   for(int i=0;i<10;i++)
	   System.out.println("main thread");
	}

}


