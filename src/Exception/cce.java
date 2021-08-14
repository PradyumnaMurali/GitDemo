package Exception;

public class cce {

	public static void main(String[] args) {
		Object ob2 = new Object();
		cce ob1 = new cce();
		boolean flag = ob2 instanceof cce;
		if (flag == true)
		{
		cce ob3 = (cce) ob2; //because instanceof ob3 is not present in cce
		}
		else
		{
			System.out.println("class cast exception");
	}
		
}
}