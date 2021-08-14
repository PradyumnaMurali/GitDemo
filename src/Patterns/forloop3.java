package Patterns;

public class forloop3 {
	public static void main(String[] args) {
		int row = 5;
		int column = 5;
		int num = 1;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(num);
			}
			System.out.println("");
			num++;
		}
	}

}
