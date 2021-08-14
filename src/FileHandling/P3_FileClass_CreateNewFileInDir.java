package FileHandling;

import java.io.File;

public class P3_FileClass_CreateNewFileInDir {
public static void main(String[] args) throws Throwable {


	//to create file in subdir that already exists
	//constructor used accepts Sting parent and String Child
      File f = new File("test1", "abc.text");
       boolean con = f.exists();
       if(con==true)
       {
    	   System.out.println("file in the mentioned  dir already exists");
       }
       else
       {
    	   f.createNewFile();
    	   System.out.println("new file created in the mentioned dir");
       }
       
     
}
}
