package FileHandling;

import java.io.FileWriter;
import java.io.PrintWriter;

public class P15_PrintWriter {
public static void main(String[] args) throws Throwable {
	
	//using print writer we cannot append data to th existing file
	//it overrides the exisitng data in the file
	FileWriter fw = new FileWriter("abc.txt", true);
	PrintWriter p = new PrintWriter(fw); 
	p.write('a');
	p.write("\n");
	p.write("Rama");
	p.write("\n");
	p.println('a');
	p.println(true);
	p.println(10.55f);
	p.flush();
}
}
