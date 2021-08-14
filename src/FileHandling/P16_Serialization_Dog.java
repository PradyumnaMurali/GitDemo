package FileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class P16_Serialization_Dog implements Serializable{
//to write state of an object to file
	
	int tail = 1;
	double weight = 15.55;
	String name = "Ramu";
	
	public static void main(String[] args) throws IOException {
		P16_Serialization_Dog ob = new P16_Serialization_Dog();
		FileOutputStream fo = new FileOutputStream("abc.txt");
		
		ObjectOutputStream oos = new ObjectOutputStream(fo);
		oos.writeObject(ob);
		
		FileReader fr = new FileReader("abc.txt");
		BufferedReader br = new BufferedReader(fr);
		System.out.println(br.readLine());

	}

}
