package ObjectClass;

public class bd {
	public static void main(String[] args) {
		Bike rtm= new Bike(350,20);
		Bike re=new Bike(250,20);
		boolean con = rtm.equals(re);//overriding equals method by passing object re
		System.out.print(con);

	}
}
