package FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class P17_Deserialization_Dog2 {
//to write state of an object to file
	
	int tail = 1;
	double weight = 15.55;
	String name = "Ramu";
	
	public static void main(String[] args) throws Throwable
	{
		
		FileInputStream fo = new FileInputStream("abc.txt");
		
		ObjectInputStream ois = new ObjectInputStream(fo);
		
		 Object ob1 = ois.readObject();

         P16_Serialization_Dog ob2 = (P16_Serialization_Dog) ob1;
         
         System.out.println(ob2.name);;
         System.out.println(ob2.tail);
         System.out.println(ob2.weight);
	}

}
