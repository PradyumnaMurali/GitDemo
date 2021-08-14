package ObjectClass;

public class Bike {
     int mileage;
     int cc;
      
  
      public Bike(int mil, int cc) {
    	  this.mileage=mil;
    	  this.cc=cc;
	}
	
	public boolean equals(Object obj)//upcasting Bike class object re to Object class
      {
		  boolean con = obj instanceof Bike;
		  System.out.println(con);
    	  Bike temp=(Bike)obj; //downcasting an upcasted Bike class object re
    	 if(this.cc==temp.cc && this.mileage== temp.mileage) // this means the currect object under construction which is rtm
    	 {
    		 return true;
    	 }
    	 else
    		 return false;
    	  
      }
	public static void main(String[] args) {
		bd.main(null); //I'm hiding the data in bike_driver by doing this.

	}

}
