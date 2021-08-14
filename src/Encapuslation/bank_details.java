package Encapuslation;

import java.util.Scanner;

public class bank_details {
	private int bank_account=12589;
	private int balance=1000;
	

 public void get()
 {
	 Scanner sc = new Scanner(System.in);
		System.out.println("Enter pin");
		int pin = sc.nextInt();
	 if(pin==1234)
		{
	 System.out.println("acc no:"+ bank_account);
	 System.out.println("acc balance:"+ balance); 
 }
	 else
		{
			System.out.println("wrong pin");
		}
}
 }
