package PolyMorphism;

public class employee {
	
public int emp_id;
public String emp_name;
    public void work()
    {
    	System.out.println("I am an employee");
    }
    public employee() {
    }
    public employee(int id,String name) {
    	this.emp_id=id;
    	this.emp_name=name;
    }
}