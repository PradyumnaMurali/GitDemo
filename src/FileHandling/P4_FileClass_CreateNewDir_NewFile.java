package FileHandling;

import java.io.File;

public class P4_FileClass_CreateNewDir_NewFile {
public static void main(String[] args) throws Throwable {


	//to create new dir and new file
	
	
	//THIS CONSTRUCTOR CANNOT BE USED TO CREATE DIR AND FILE 
//	File f = new File("test2", "abc.text");
//	System.out.println(f.mkdir());
//	System.out.println(f.createNewFile());   
	
	//FIRST DIRECTORY HAS TO BE CREATED AND ONLY THEN WE CAN CREATE FILE INSIDE IT
          File f = new File("C:\\Users\\User\\Downloads\\test3");
          boolean con = f.mkdir();
          
          if(con==true)
          {
        	 File f2 = new File("C:\\Users\\User\\Downloads\\test2\\abc.txt");
        	 f2.createNewFile();
        	 System.out.println("file inside dir created");
          }
          else
          {
        	  System.out.println("dir already exists");
          }
          
}
}
