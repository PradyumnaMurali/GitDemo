package practice;

public class p1 extends pen
{
	

	public p1(String name, String color, int price) {
		super(name, color, price);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		pen ob = new pen("Cello", "Black", 10);
		System.out.println(ob);
	}
}

class pen
{
	String name;
	String color;
	int price;
	
	public pen(String name,String color,int price)
	{
		this.name=name;
		this.color=color;
		this.price=price;
	}
	
	public String toString()
	{
		return ("pen name= "+ this.name+", pen color= "+this.color+", pen price= "+this.price);
	}
	
}