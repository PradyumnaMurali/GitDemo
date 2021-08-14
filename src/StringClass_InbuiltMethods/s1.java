package StringClass_InbuiltMethods;


//NON STATIC METHODS IN STRING CLASS
public class s1 {

	public static void main(String[] args) {
		
		//converts string to character array
		String s1 = new String("abcd");
		char[]ch=s1.toCharArray();
		
		for(char i:ch)
		{
			System.out.println(i);
		}
		
		//prints character at a specified index
		char c=s1.charAt(1);
		System.out.println(c);
		
		//trims of spaces if any in the string
	     String s2=new String("  ABCD  ");
	     System.out.println(s2.trim());
	     
	     
	     String s3=new String("ABCD");
	     //compares two strings ignoring the cases
	     System.out.println(s1.equalsIgnoreCase(s3));
	     
	     String s4=new String(" Infosys Ltd ");
	     String s5=s4.trim(); 
	   //if the string having spaces is compared with a trimmed string it throws false
	     boolean con = s4.equals(s5);
	     System.out.println(con); 

	}

}
