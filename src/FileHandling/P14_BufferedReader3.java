package FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class P14_BufferedReader3 {

	//to read characters line by line
    public static void main(String[] args) throws Throwable   {
	FileReader f = new FileReader("abc.txt");
	BufferedReader bw = new BufferedReader(f);
	System.out.println(bw.readLine());
	System.out.println(bw.readLine());
	bw.close();
}
}