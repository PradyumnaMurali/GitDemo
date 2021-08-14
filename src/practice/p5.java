package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class p5 implements Serializable{
	String color = "Red";
	String color2 = null;
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		p5 obj = new p5();
		FileOutputStream fo= new FileOutputStream("abc.txt");
		ObjectOutputStream oo = new ObjectOutputStream(fo);
		oo.writeObject(obj);
		
		FileInputStream f = new FileInputStream("abc.txt");
		ObjectInputStream o = new ObjectInputStream(f);
		Object obj1 = o.readObject();
		p5 obj2 = (p5) obj1;
		System.out.println(obj2.color2);
		

	}

}
