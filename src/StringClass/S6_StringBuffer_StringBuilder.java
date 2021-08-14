package StringClass;

public class S6_StringBuffer_StringBuilder {

//Creating String Objects using String buffer an String Builder class
	public static void main(String[] args) {
		
		
		//Constructor has to be used to create object with these classes
		StringBuffer s1 = new StringBuffer("Infosys");
		System.out.println(s1);
		
		StringBuilder s2=new StringBuilder("Infosys");
		System.out.println(s2);
		
		//StringBuffer and StringBuilder class objects are mutable.
		System.out.println(s1.append(s2));
		
		System.out.println(s1.append("Ltd"));
	
		//s1 and s2 are incomparable operand types so we cannot compare then using == operator
//		if(s1 == s2)
//			System.out.println("true");
//		else
//			System.out.println("false");
	}

}