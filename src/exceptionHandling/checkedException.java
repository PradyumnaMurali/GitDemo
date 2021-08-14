package exceptionHandling;

public class checkedException {

	public static void main(String[] args) throws ClassNotFoundException {
		try 
		{
			Class.forName("com.a.Mai");
		}
catch (Exception e) {
	System.out.println(e);
}
	}

}
