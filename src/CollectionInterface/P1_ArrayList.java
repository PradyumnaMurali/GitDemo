package CollectionInterface;

import java.util.ArrayList;
//ADD,GET,REMOVE METHODS

public class P1_ArrayList {
	
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		
		//to add String object
		a.add("audi"); //CollectionInterface
		
		//to add an object at a specified index
		a.add(1, "Benz"); //ListInterface
		
		//prints the ArrayList
		System.out.println(a);
		
		//prints the object from a specified index
		System.out.println(a.get(1)); //ListInterface
		
		//duplicates are allowed
		a.add("Benz");
		System.out.println(a);
		
		//null insertion is possible
		a.add(null);
		System.out.println(a);
		
		//to remove object at a specified index/object
		a.remove(0); //ListInterface
		
		//only one value will be removed. Another duplicate value will be retained
		a.remove("Benz"); //CollectionInterface
		System.out.println(a);
	
	}
}
