package FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class P12_BufferedReader {

    public static void main(String[] args) throws Throwable   {
	FileWriter f = new FileWriter("abc.txt",false); 
	BufferedWriter bw = new BufferedWriter(f); //bufferedwriter can communicate with the file only via a FileWrierClass object.
	bw.write("Rama");
	bw.newLine(); //writes characters to the next line
	bw.write("Krishna");
	bw.newLine();
	char [] ch = {'a','b','c','d'};
	bw.write(ch);
	bw.flush();
	bw.close();
}
}