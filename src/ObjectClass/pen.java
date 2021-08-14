package ObjectClass;

public class pen {
	String color;
	double weight;
	double price;
	
	public pen(String clr,double wt,double mrp)
	{
		this.color = clr;
		this.weight = wt;
		this.price = mrp;
	}
	public String toString() {
		return ("color of the pen is:"+this.color+","
				+ "weight of pen: "+ this.weight + "," + 
				"price:"+ this.price );
	}
	}

