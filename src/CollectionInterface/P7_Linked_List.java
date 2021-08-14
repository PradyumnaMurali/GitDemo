package CollectionInterface;

import java.util.LinkedList;

public class P7_Linked_List {
	
	public static void main(String[] args) {
		LinkedList<String> a = new LinkedList<String>();

		a.add("Audi");
		a.add(1, "Benz");
		a.add("Tata");
		System.out.println(a.add("Skoda"));
		
		System.out.println(a);
		
		System.out.println("--------------");
	
		a.addFirst(null);
		a.addLast("Maruti");
		System.out.println(a);
		
		System.out.println("------------------------");
		
		//gets first and last element in the list
		System.out.println(a.getFirst());
		System.out.println(a.getLast());
		
		System.out.println("--------------");
		
		//remove the first and last elements and prints it
		System.out.println(a.removeFirst());
		System.out.println(a.removeLast());
		
		System.out.println("---------------");
		
		System.out.println(a);
		
	}
}
