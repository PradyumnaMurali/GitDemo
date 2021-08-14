package programs;

public class Palindrome_Reverse {

	public static void main(String[] args) {
		String s1 = "ABCBA";
		char[]ch=s1.toCharArray();
		String s2=null;
		for(int i=0;i<ch.length;i++)
		{
			s2=s2+ch[ch.length-1-i];
		}
		if(s2.equals(s1))
			System.out.println(s1 +" is a palindrome");
		else
			System.out.println(s1+" is not a palindrome");
	}
}
