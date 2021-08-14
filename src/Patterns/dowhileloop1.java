package Patterns;

public class dowhileloop1 {

	public static void main(String[] args) {
		int row = 5;
		int column = 5;
		int i=0,j;
		do
		{
			j=0;
			do
			{
			System.out.print("*");
			j++;
			}
			while(j<column);
			System.out.println("");
			i++;
		}
		while(i<row);
	}

}
