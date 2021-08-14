package CollectionInterface;

import java.util.ArrayList;

public class P3_ArrayList {
	
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();

		a.add("audi");
		a.add(1, "Benz");
		a.add("Tata");
		a.add("Skoda");
		System.out.println(a);
		
		
		ArrayList<String> b = new ArrayList<String>();
		b.add("Benz");
		//too add all objects from another ArrayList
		b.addAll(a); //CollectionInterface
		System.out.println(b);
				
	}

}
