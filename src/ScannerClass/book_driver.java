package ScannerClass;

import java.util.Scanner;

public class book_driver {
	
	public static void main(String[] args)
	{
    Scanner s=new Scanner(System.in);
	book ob=null;
    boolean flag = true;
    while(flag)
    {
    	System.out.println("enter 1 to add, 2 to read details");
         int choice = s.nextInt();
    	switch(choice) {
    	case 1: {
    		System.out.println("enter title");
    		String title = s.next();
    		System.out.println("enter price");
    		double price = s.nextDouble();
    		ob = new book(title,price);
    		break;
    		
    	}
    	case 2: {
    		if (ob!=null) {
    			System.out.println(ob.title);
    			System.out.println(ob.price);
    			
    		}
    		else {
    			System.out.println("no book");
    			break;
    		}
    	}
    	System.out.println("enter 1 to continue, 2 to break");
    	int var = s.nextInt();
    	if(var==1)
    		flag=true;
    	else
    		flag=false;
    	}
    	}
	}
}

    	
