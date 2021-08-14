package StringClass;

public class p3 {

	//An object s1 of String class gets is created in string pool or constant pool
		public static void main(String[] args) {
			String s1="HARI";
			System.out.println(s1);
			
			//This gives address of String Class object
			System.out.println(s1.hashCode());
			
			//JVM will not create a new object. Instead the address of the similar object is stored in the new ref. variable.
			String s2="HARI";
			System.out.println(s2.hashCode());
		
		}

	}
