package ObjectClass;

public class hc3 {
	int a,b,c;
	public hc3 (int m,int n,int o) {
		this.a=m;
		this.b=n;
		this.c=o;
	}
	public int haschCode()
	{
		//The Integer class has a static method that returns a String object representing the specified int parameter.
		
		/*String k= Integer.toString(this.a);
		String l=Integer.toString(this.b);
		String o=Integer.toString(this.c);
		k.hashCode();
		int hasch = k.hashCode()+l.hashCode()+o.hashCode();
		return hasch;*/
		String k = Integer.toString(this.a);
		int hash = k.hashCode();
		return hash;
	}

	public static void main(String[] args) {
		hc3 ob= new hc3(10,20,30);
		int i=ob.haschCode();
		System.out.println(i);
	}

}
