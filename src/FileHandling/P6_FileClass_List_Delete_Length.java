package FileHandling;

import java.io.File;

public class P6_FileClass_List_Delete_Length {

	public static void main(String[] args) throws Throwable  {
		
		File dir = new File("D:\\M to C\\Java Programs\\test");
		dir.mkdir();
		
		//checks if the file by name abc.txt already exists
		//if it is available then it will point to that file
		File f1 = new File("D:\\M to C\\Java Programs\\test\\abc.txt");
		File f2 = new File("D:\\M to C\\Java Programs\\test\\efg.txt"); 
		System.out.println(f1);
		System.out.println(f2);
		f1.createNewFile();
		f2.createNewFile();//this wont replace the current file
		
		//Lists all the files in the mentioned directory
		String[] a = dir.list();
		
		for(String var : a)
		{
			System.out.println(var);
		}
		
		//returns the no. of characters present in the speified file
		Long l1 = f1.length();
		Long l2 = f2.length();
		System.out.println(l1);
		System.out.println(l2);
		
		//delete file and then delete directory
		System.out.println(f1.delete());
		System.out.println(f2.delete());
		System.out.println(dir.delete());
	}

}
