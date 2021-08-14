package programs;

public class Fibonnaci_Series {

	public static void main(String[] args) {
		int f_n = 0;
		int s_n=1;
		int temp=0;

		while(temp<89)
		{
			temp=f_n;
			f_n=s_n;
			s_n=temp+s_n;
			System.out.print(temp+",");
		}

	}

}
