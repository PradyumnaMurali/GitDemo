package StringClass;

public class p2 {

	//An object s1 of String class gets is created in string pool or constant pool
	public static void main(String[] args) {
		String s1="HARI";
		System.out.println(s1.hashCode());
		s1="RAMA";
		System.out.println(s1.hashCode());
		
	//Contents of the object will be returned with toString Method and not address.
		System.out.println(s1.toString());
	}

}
