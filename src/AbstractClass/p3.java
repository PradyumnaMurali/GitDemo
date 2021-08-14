package AbstractClass;

public class p3 extends p1 {
	 public void test1() {
		 System.out.println("from nsm of p3"); //implements abstract class p1
	 }
	 public static void main(String[] args) {
		 p3 ob = new p3();
		 ob.test1();
		 //p1 ob2 = new p1(); //cannot create object for abstract class
	 }
}
