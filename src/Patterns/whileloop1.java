package Patterns;

public class whileloop1 {
	public static void main(String[] args) {
	int row = 6;
	int column = 6;
	int i=0;
	int j=0;
	while (i<row)
	{
		if(j<column)
		System.out.print("*");
		else {
			j=-1;
		System.out.println("");
		i++;
		}
		
		j++;
	}

}
}
