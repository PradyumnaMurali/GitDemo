package WrapperClass;

import java.util.ArrayList;

public class UnBoxing3 {
	
public static void main(String[] args)
{
	Integer i1=Integer.valueOf(10);
	Integer i2=Integer.valueOf(20);
	
	ArrayList<Integer> a = new ArrayList<Integer>();
	
	a.add(i1);
	a.add(i2);
	
	//to get an object from an arraylist we use get method
	Integer p = a.get(0);
	System.out.println(p);
	
	int b = a.get(1); 
	System.out.println(b);
	}
	
}
