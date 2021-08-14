package Exception;

public class SIOB {
	public static void main(String[] args)
	{
		String a = "EnoOndHesru";
		String b = a.substring(0,3); //this reads the fist 3 letters in string a
		System.out.print(b);
		String c = a.substring(0,25); //since there is no character at i=25 in String a it throws exception
	}

}
