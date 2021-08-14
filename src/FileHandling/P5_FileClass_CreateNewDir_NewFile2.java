package FileHandling;

import java.io.File;

public class P5_FileClass_CreateNewDir_NewFile2 {
public static void main(String[] args) throws Throwable {


	//to create new dir and new file
	
	
	//THIS CONSTRUCTOR CANNOT BE USED TO CREATE DIR AND FILE 
//	File f = new File("test2", "abc.text");
//	System.out.println(f.mkdir());
//	System.out.println(f.createNewFile());   
	
          File f = new File("C:\\Users\\User\\Downloads\\test3");
          boolean con = f.mkdir();
          
          if(con==true)
          {
        	  //constructor used accepts Sting parent and String Child
        	 File f2 = new File(f,"cde.txt");
        	 f2.createNewFile();
        	 System.out.println("file inside dir created");
        	 
          }
          else
          {
        	  System.out.println("dir already exists");
        	  //constructor used accepts Sting parent and String Child
        	  File f2 = new File(f,"cde.txt");
         	 f2.createNewFile();
         	 System.out.println("file inside dir created");
          }
          
}
}
