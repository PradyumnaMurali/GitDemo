package programs;

public class Palindrome {

	public static void main(String[] args) {
     String s1="PRADYUMNA";
     char[]ch = s1.toCharArray();
     int x= 0;
     
     for(int i=0;i<ch.length/2;i++)
     {
    	 if(ch[i]!=ch[ch.length-1-i])
    	 {
    		 x=1;
    		 break;
    	 }
     }
     if(x==0)
    	 System.out.println(s1+" is a palindrome.");
     else
    	 System.out.println(s1+" is not a palindrome");

	}

}
