package StringClass;

public class p4 {

//An object s1 of String class gets is created in string pool or constant pool
	public static void main(String[] args) {
		String s1=new String("HARI");
		
		String s2=new String("HARI");;
	
		
		//Address of s1 and s2 will be different when new operator is used to create object
		if (s1==s2)
			System.out.println("true");
		else
			System.out.println("false");
		
		System.out.println("-------------------------------------");
		//contents of S1 and S2 are compared
	    boolean con = s1.equals(s2);
	    System.out.println(con);
	    
	    System.out.println("-------------------------------------");
	    //ASCII values are subtracted
	    int a=s1.compareTo(s2);
	    System.out.println(a);
		
	}
}
