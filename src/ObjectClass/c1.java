package ObjectClass;

public class c1 implements Cloneable {

	public static void main(String[] args) throws CloneNotSupportedException {
		c1 ob=new c1();
		c1 ob2=(c1)ob.clone();
		System.out.println(ob);
		System.out.println(ob2);
		boolean con = ob.equals(ob2);
		System.out.println(con);
	}

}
