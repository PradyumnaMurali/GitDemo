package ObjectClass;

public class p1 {
	int i=10;
	public String toString (){
		return "sim" + this.i;
	}

	public static void main(String[] args) {
		p1 ob1 = new p1();	
  System.out.println(ob1); //prints overridden value from toString method
  p1 ob2 = new p1();
  ob2.i=30;
  System.out.println(ob2);//prints reinitialised value of overridden toString method
	}
}
