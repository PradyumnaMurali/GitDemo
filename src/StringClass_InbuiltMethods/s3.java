package StringClass_InbuiltMethods;


//NON STATIC METHODS IN STRING CLASS
public class s3 {

	public static void main(String[] args) {
       
       //returns the index of last occurrence of specified character from the end
       String s1=new String("ALLEN");
      int a =  s1.lastIndexOf('L', 3); 
      System.out.println(a);
      
      String s2=new String("ARUNODAYA");
      int b = s2.lastIndexOf('A', 8);
      System.out.println(b);
      
      String s3=new String("ALLEN");
      int c =  s3.lastIndexOf('L',4); 
      System.out.println(c);
      System.out.println(s3.lastIndexOf("L", 3));
      
      //lastindexof will return -1 if the specified character or string is not present 
      System.out.println(s3.lastIndexOf("s",3));
      
      //substring
      System.out.println(s3.substring(2));
      System.out.println(s3.substring(2, 4)); //equal to beginindex but less thanendindex
      
      //replace
      System.out.println(s3.replace('L', 'A')); //replaces all 'L' with 'A'
      
      //concatination of 2 string objects with '+' or concat(String str) method
      String s4= s1+s2;
      System.out.println(s4);
      
      String s5=s1.concat(s2);
      System.out.println(s5);
      
      //upper and lower case
      String s6=new String("aAbBCC");
      System.out.println(s6.toLowerCase());
      System.out.println(s6.toUpperCase());
      
      //contains,isempty and length methods
      System.out.println(s6.contains("AL"));
      System.out.println(s6.contains("Ab"));
      System.out.println(s6.isEmpty());
      
      String s7="";
      System.out.println(s7.isEmpty());
      
     System.out.println( s7.length());
     
     System.out.println(s6.length());
      
	}

}
