package CollectionInterface;

import java.util.ArrayList;

public class P4_ArrayList {
	
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();

		a.add("audi");
		a.add(1, "Benz");
		a.add("Tata");
		a.add("Skoda");
		System.out.println(a);
		
		//using foreach loop
				for(String loopvar : a)
				{
					System.out.println(loopvar);
				}
		
		ArrayList<String> b = new ArrayList<String>();
		b.add("Benz");
		b.add("Tata");
		b.add("TVS");
		b.add("Lamborgini");
		//to retain objects that are in common with ArrayList a
		b.retainAll(a); //CollectionInterface
		System.out.println(b);	
	}

}
