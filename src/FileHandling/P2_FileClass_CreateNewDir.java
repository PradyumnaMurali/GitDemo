package FileHandling;

import java.io.File;

public class P2_FileClass_CreateNewDir {
public static void main(String[] args) {
	//checks if there is any dir by name test1 in the current directory
	//if it is not there then the file class object will store the name of the dir without creating the physical director
      File f = new File("test1");
      boolean con = f.exists();
     if(con == true)
     {
    	 System.out.println("directory exists");
     }
     else
     {
        System.out.println("dir doesn't exist");
    	 f.mkdir(); //to create new directory
    	System.out.println("so dir created");
    	}
}
}
