package ObjectClass;

public class pen_driver2 {

	public static void main(String[] args) {
		pen ob1 = new pen("black",20,10);
		pen ob2 = new pen("red",20,10);
		
		pen[] ob = {ob1,ob2};
		for (int i=0;i<ob.length;i++) {
			System.out.println(ob[i]);
		}
	}

}
