package ScannerClass;

import java.util.Scanner;

public class scan {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the integer");
	    int a = s.nextInt();
		System.out.println(++a);
	}
}