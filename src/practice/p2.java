package practice;

public class p2 {

	public static void main(String[] args) {
		bike RE = new bike(100.5,150.5);
		bike RE2 = new bike(100.5,150.5);
		boolean con = RE.equals(RE2);
		System.out.println(con);

	}

}


class bike
{
	double mileage;
	double cc;
	
	public bike (double mileage,double cc)
	{
		this.mileage = mileage;
		this.cc = cc;
	}
	
	public boolean equals(Object obj)
	{
		bike temp = (bike)obj;
		if(this.cc==temp.cc && this.mileage == temp.mileage)
			return true;
		else
			return false;
		
	}
}