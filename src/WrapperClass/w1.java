package WrapperClass;

public class w1 {

	public static void main(String[] args) {
		
		//primitive data type>>>wrapper class object
		int m = 10;
		char n = 'd';
		
		//value of method is a static method present in Integer class
		Integer a = Integer.valueOf(m);
		System.out.println(a);
                
        Character b = Character.valueOf(n);
        System.out.println(b);
        
        //similarly other primitive data types can be converted to wrapper class object
	}

}
