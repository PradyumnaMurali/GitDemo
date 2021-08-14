package CollectionInterface;

import java.util.ArrayList;
import java.util.Collections;

public class P6_Sorting_ArrayList {
	
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();

		a.add("Audi");
		a.add(1, "Benz");
		a.add("Tata");
		a.add("Skoda");
		System.out.println(a);
		
		//sort array list alphabetically
		Collections.sort(a);
		System.out.println(a);
		
		//reversing the sorted list
		Collections.reverse(a);
		System.out.println(a);
		
		//sorting and reversing
		Collections.sort(a, Collections.reverseOrder());
		System.out.println(a);
	}

}
