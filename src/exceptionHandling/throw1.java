package exceptionHandling;

import java.util.Scanner;

public class throw1 {

	public static void main(String[] args) {
		int Balance = 20000;
		Scanner amount = new Scanner(System.in);
		System.out.println("Enter the amount you want to withdraw");
		int wa = amount.nextInt();
		if (wa<=Balance)
		{
			System.out.println("Transfer the amount");
		}
		else 
		{
			try {
			throw new Exception();
		}
		catch (Exception e) {
			System.out.println("Inufficient balance");
		}
		
	}
}
}