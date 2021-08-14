package FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class P13_BufferedReader2 {

    public static void main(String[] args) throws Throwable   {
	FileReader f = new FileReader("abc.txt");
	BufferedReader bw = new BufferedReader(f);
	
	//this methods returns ASCII value of the first character in the file.
	int c= bw.read();
	System.out.println(c);
	
	//to read and store data in the file into char array
	char[]ch = new char[13];
	bw.read(ch);
	for(int i=0;i<ch.length;i++)
	{
		System.out.println(ch[i]);
	} 
	bw.close();
}
}