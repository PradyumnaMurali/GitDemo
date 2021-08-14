package WrapperClass;

import java.util.ArrayList;

public class AutoBoxing3 {

	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		Integer i1= new Integer(10);
		
		a.add(i1);
		a.add(20); //here autoboxing is happening
		
		System.out.println(a);
		
		//if you want the ArrayList objects to be printed one by one use for each loop
		 
		
	}

}
