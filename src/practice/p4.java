package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class p4 {

	public static void main(String[] args) throws IOException {
		File f = new File("newfolder");
		f.mkdir();
		File f1 = new File(f,"abc.txt");
		f1.createNewFile();
		FileWriter f2 = new FileWriter(f1);
		
		FileReader f3 = new FileReader(f1);
		
       
//      BufferedWriter bw = new BufferedWriter(f2);
//      bw.write("Rama");
//      bw.newLine();
//      bw.write("Krishna");
//      bw.flush();
//      
//      BufferedReader br = new BufferedReader(f3);
//      System.out.println(br.readLine());
//      System.out.println(br.readLine());
      
      PrintWriter p = new PrintWriter(f1);
      p.println("Krishna");
      p.println("Rama");
      p.flush();    
	}
}
