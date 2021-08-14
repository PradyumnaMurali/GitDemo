package FileHandling;

import java.io.FileWriter;

public class P7_FileWriter {

	public static void main(String[] args) throws Throwable {
		
		//if naanu.txt is not found, this constructor creates the file and appends data into the file.
		FileWriter fw = new FileWriter("naanu.txt", false); //the constructor uses boolean append as the second argument which says whether or not the data written should be appended
		fw.write("Govinda");
		fw.write("\n"); //this statement acts as the print statement that moves the cursor to the next line
		fw.write("Krishna");
		fw.write("\n");
		fw.write("SriHari");
		//fw.flush(); //to give guarantee that the last character of data is returned to the file.
		fw.close();
	}
}
