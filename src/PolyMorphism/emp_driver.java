package PolyMorphism;

public class emp_driver {

	public static void main(String[] args) {
		employee e1 = new employee(001,"Vinaya");
		employee e2 = new developer(002,"Simona");
		employee e3 = new tester (003,"Sneha");
	  employee[] ob = {e1,e2,e3};
	  for(employee i:ob) {
		  System.out.println(i.emp_id);
		  System.out.println(i.emp_name);
		  i.work();
	  }
	}
}
