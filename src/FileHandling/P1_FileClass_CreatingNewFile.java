package FileHandling;

import java.io.File;

public class P1_FileClass_CreatingNewFile {
public static void main(String[] args) throws Throwable {
	//checks if there is any file by name abc.txt in the current directory
	//if it is not there then the file class object will store the name of the file without creating the physical file
      File f = new File("naanu.txt");
      System.out.println(f);
      System.out.println(f.exists());
      
      //to create def.text file in the current directory
      //f.createnewfie will return false if the file already exists
     System.out.println(f.createNewFile()); //throws IO exception
      System.out.println(f.exists());
}
}
