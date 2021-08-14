package FileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class P10_FileReader {

    public static void main(String[] args) throws Throwable {
	File f = new File("abc.txt");
	f.createNewFile();
	FileWriter fw = new FileWriter(f,true);
	fw.write("Ramanuja");
	fw.flush();
	FileReader f2 = new FileReader(f);
	int c = f2.read(); //returns ASCII value of the first character
	System.out.println(c);
	
	char []ch=new char[20];
	f2.read(ch);
	for(int i=0;i<ch.length;i++)
	{
		System.out.println(ch[i]);
	}
	fw.close();
	f.delete(); //this method wont work if FileReader class is used in the previous steps
	}
}
