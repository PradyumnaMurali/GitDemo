package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class P9_FileWriter3 {

    public static void main(String[] args) throws Throwable {
	FileWriter	f = new FileWriter("D:\\M to C\\Java Programs\\Test\\abc.txt");
//	f.write("Rama");
//	f.flush();
	f.write("Krishna");
	f.flush();
	
	File f2= new File("test.txt");
	FileWriter f3 = new FileWriter(f2);
	f3.write("Ramanuja");
	f3.flush();
	
	}
}
