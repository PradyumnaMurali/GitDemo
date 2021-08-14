package WrapperClass;

public class AutoBoxing1 {
	
	public static void test(Integer i1)
	{
		System.out.println(i1);
	}

	public static void main(String[] args) {
		
		//Automatic conversion of primitive data type to object of their corresponding wrapper class
		int a = 10;
		
		AutoBoxing1.test(a);
	}

}
