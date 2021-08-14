package ScannerClass;

public class bike_driver {

	public static void main(String[] args) {
		Engine eng=new Engine(150,40.5);
		Bike bik= new Bike("RE","red",eng);
		System.out.println("Details of Bike are:");
		System.out.println(bik.name);
		System.out.println(bik.color);
		System.out.println(bik.eng.cc);
		System.out.println(bik.eng.mileage);

	}

}
