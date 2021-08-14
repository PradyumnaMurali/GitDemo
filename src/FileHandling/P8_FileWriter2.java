package FileHandling;

import java.io.File;
import java.io.FileWriter;

public class P8_FileWriter2 {

	public static void main(String[] args) throws Throwable {
		File f1 = new File("D:\\M to C\\Java Programs\\abc.txt"); 
		System.out.println(f1);//if the text file is not found in the mentioned path then the name of the file is stored in variable f1 
		FileWriter f = new FileWriter(f1,true); //in this step passing file object as an argument will create the file mentioned in the string path of variable f1
		System.out.println(f);
		String str = "LakshmiJanardhana";
		f.write(str);
		f.write("\n");
		//writing char array into the file
	    char [] ch = {'a','e','i','o','u'}; //char array wont appear in the file character by character but all characters appear together in a single line
	    f.write(ch);
//		f.flush(); //if this is mentioned here then all the characters or values written after this statement wont get appended in to the file.
		f.write("\n");
		f.write('a');//to write single character in to the file
		f.flush();
	    System.out.println(f1.length());
	}
}
