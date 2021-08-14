package CollectionInterface;

import java.util.ArrayList;

public class P2_ArrayList {
	
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();

		a.add("audi");
		a.add(1, "Benz");
		a.add("Tata");
		a.add("Skoda");
		a.add("Benz");
		a.set(1,"Suzuki"); //ListInterface
		
		System.out.println(a);
		
		System.out.println(a.size()); //CollectionInterface
		
		//Methods that return boolean value in CollectionInterface
		System.out.println(a.isEmpty()); //to check if the ArrayList is empty
		System.out.println(a.contains("audi")); //to check if the ArrayList contains particular String Value
		System.out.println(a.contains("abcd"));
		
		//clears the objects from ArrayList
		a.clear(); //CollectionInterface
		System.out.println(a);	
	}

}
