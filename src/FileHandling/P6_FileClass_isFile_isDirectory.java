package FileHandling;

import java.io.File;

public class P6_FileClass_isFile_isDirectory {

	public static void main(String[] args) throws Throwable  {
		
		//to check whether it is a file
		 File f = new File("Rama.txt"); //this file is already created
		System.out.println(f.isFile());
		
		//to check whether it is a directory
		File f1 = new File("NewFolder"); //this directory is already created.
		System.out.println(f1.isDirectory());
	}

}
