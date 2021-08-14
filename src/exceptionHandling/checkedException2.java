package exceptionHandling;

public class checkedException2 {

	public static void main(String[] args)  {
		try {
			Class.forName("java.lang.string");
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		catch(Throwable t){
			
			System.out.println("exception");
		}
		
		finally
		{
			System.out.println("final");
		}
       
		
	}

}
