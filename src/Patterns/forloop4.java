package Patterns;

public class forloop4 {
public static void main(String[] args) {
	
	int row = 5;
	int column = 5;
    for(int i=0;i<row;i++)
    {
    	int num=1;
    	for(int j=0;j<=i;j++)
    	{
    		System.out.print(num);
    		num++;
    	}
    	System.out.println("");
    }
}
}
