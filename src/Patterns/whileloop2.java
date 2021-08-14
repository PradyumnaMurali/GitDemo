package Patterns;

public class whileloop2 {

	public static void main(String[] args) {
		int i = 0,j;
		int row = 5;
		int column = 5;
		while(i<row)
		{
			j=0;
			while(j<column)
			{
				System.out.print("*");
				j++;
				
			}
			System.out.println("");
			i++;
		}

	}

}
