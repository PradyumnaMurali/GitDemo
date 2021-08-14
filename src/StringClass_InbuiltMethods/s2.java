package StringClass_InbuiltMethods;


//NON STATIC METHODS IN STRING CLASS
public class s2 {

	public static void main(String[] args) {
		
		//Compares 2 strings ignoring cases
		String s1= new String("Enough");
		String s2= new String("enough");
		int a= s1.compareToIgnoreCase(s2);
       System.out.println(a);
         
       
       //checks if the string object has specified prefix
       String s3=new String("English");
       
       String s4 = new String("Hindi");
       
       boolean con = s3.startsWith("e");
       System.out.println(con);
       
       boolean con2 = s4.startsWith("i", 1); //checks if the string prefix starts from the specified index
       System.out.println(con2);
       
       boolean con3 = s4.startsWith("i", 5);
       System.out.println(con3);
       
       //checks if a String object ends with the specified suffix 
       boolean con4 = s4.endsWith("en");
       System.out.println(con4);
    	
       
       //returns the index of 1st occurrence of specified character 
       String s5=new String("ALLEN");
      int b =  s5.indexOf('L', 2); //starts searching from index=1
      System.out.println(b);
      
      int c = s5.indexOf('L');
      System.out.println(c);
       
       
	}

}
