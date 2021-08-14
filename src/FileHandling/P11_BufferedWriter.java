package FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class P11_BufferedWriter {

    public static void main(String[] args) throws Throwable   {
	FileWriter f = new FileWriter("abc.txt",false); 
	BufferedWriter bw = new BufferedWriter(f); //bufferedwriter can communicate with the file only via a FileWrierClass object.
	bw.write("Rama");
	bw.newLine(); //writes characters to the next line
	bw.write("Krishna");
	bw.flush();
	
	FileReader f2=new FileReader("abc.txt");
	BufferedReader bw2 = new BufferedReader(f2);
	System.out.println(bw2.read());
   
	bw.newLine();
    bw.write('a');
    bw.flush();
}
}