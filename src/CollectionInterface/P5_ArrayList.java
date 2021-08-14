package CollectionInterface;

import java.util.ArrayList;

public class P5_ArrayList {
	
	public static void main(String[] args) {
		
		//generic ArrayList - heterogenous objects are allowed
		ArrayList a = new ArrayList();
		a.add("String");
		a.add(10);
		a.add('a');
		a.add(true);
		a.add(10.55f);
		
		System.out.println(a);
		
		
		//using for loop to print each object in the ArrayList
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		
	}

}
