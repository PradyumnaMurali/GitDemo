package ObjectClass;

public class c2 implements Cloneable {
	public static void main(String[] args) throws CloneNotSupportedException {
	
		c2 ob=new c2();
		c2 []ob2=new c2[2];
		
		for (int i=0;i<ob2.length;i++)
		{
			ob2[i]=(c2) ob.clone();
			System.out.println(ob2[i]);
			
		}
	}

}
