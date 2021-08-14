package ObjectClass;

import java.util.Scanner;

public class car implements Cloneable {
  String name;
  double price;
  
  public car(String n,double p)
  {
	  this.name=n;
	  this.price=p;
  }
	public static void main(String[] args) throws CloneNotSupportedException {
		car ob=new car("benz", 1000);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no. of cars");
		int n=sc.nextInt();
		car[]ob2=new car[n];
		for (car i : ob2)
		{
			i=(car)ob.clone();
			System.out.println(i.name);
			System.out.println(i.price);
		}
		
		

	}

}
