package Generic_Driver;

import java.util.Scanner;

import Generic.S_D;
import Generic.developer;
import Generic.employee;

public class employee_driver {

		static Scanner sc = new Scanner(System.in);
		static int id;
		static String name;
		static double sal;
		static int choice;
		
		
		public static void main(String[] args) {
		while(choice!=7)
		{
			System.out.println("Press 1 to add employee");
			System.out.println("Press 2 to edit employee");
			System.out.println("Press 3 to delete employee");
			System.out.println("Prss 4 to display empoyees based on id");
			System.out.println("Press 5 to display all the employees");
			System.out.println("Press 6 to display all employees based on department");
			choice = sc.nextInt();
			switch (choice)
			{
			case 1:
			add_employee();	
		  
		}

	}

}

	public static void add_employee() {
	     System.out.println("enter no. of senior developers to be added"); 
	     Scanner sc=new Scanner(System.in);
	     int n = sc.nextInt();
	     S_D []a=new S_D[n];
	     for (S_D e : a)
	     { 
	         System.out.println("enter the id of the employee");
	    	 id=sc.nextInt();
	    	 System.out.println("enter the name of the employee");
	    	 name=sc.next();
	    	 System.out.println("enter the sal of the employee");
	    	 sal=sc.nextDouble();
	    	  e= new S_D(id,name,sal);
	    	
	     }
	}
	}
