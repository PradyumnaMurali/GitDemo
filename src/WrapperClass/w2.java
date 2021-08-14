package WrapperClass;

public class w2 {

	public static void main(String[] args) {
		
		//wrapper class object>>primitive data type
		Integer m = new Integer(10);
		
		int a = m.intValue(); //this is explicit unboxing
		System.out.println(a);
		
		Character c = new Character('s');
		char ch = c.charValue();
		System.out.println(ch);
	}

}
