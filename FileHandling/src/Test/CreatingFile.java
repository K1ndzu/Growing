package Test;

import java.io.File;
import java.io.IOException;

public class CreatingFile {
	static File myFile = new File("myFile.txt"); // creating the object file, that we will use
	
	public void var() {
		
		try {
			
		if (myFile.createNewFile()) { // this create the file
			System.out.println("File Created");
			
		}
			else { // if already exist, will pop up this message
			System.out.println("That file already exist");
			
			}
		}
		catch (IOException e) { // if have an error
			System.out.println("occour a error");
			
		}
			
			
			
		
		
	
	}
}
