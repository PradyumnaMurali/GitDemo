package programs;

public class Reverse_String {

	public static void main(String[] args) {
			String s1 = "ENADU";
			char[]ch=s1.toCharArray();
			char[]ch2= new char[ch.length];
			for(int i=0;i<ch.length;i++)
			{
				ch2[i]=ch[ch.length-1-i];
			}
			String s2 = new String(ch2);
			System.out.println(s2);
		}
	}
