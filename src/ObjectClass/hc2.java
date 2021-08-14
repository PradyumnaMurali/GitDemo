package ObjectClass;

public class hc2 {
	int a,b,c;
	
	public int hashCode () {
		this.a=10;
		this.b=20;
		this.c=30;
		return a+b+c;	
	}

	public static void main(String[] args) {
		hc2 ob = new hc2();
		System.out.println(ob.hashCode());
	}

}
