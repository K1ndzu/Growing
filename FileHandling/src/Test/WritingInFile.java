package Test;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WritingInFile extends CreatingFile { // with this, i can access the variable myFile
	static Map<String, String> idName = new HashMap<>();
		public static void writeFile(String text){
			
			
		try {
			
	
			
			FileWriter writer = new FileWriter("myFile.txt", true); // you need declare a new object for write in a file. True to could make append.
			
			writer.write(text);// after you write, you need to close
			writer.write("\n");
			// write will write in above of others texts, and will delete another 
		
			writer.close(); // to code understanding that can save the file
				
		}
		catch (IOException e) {
			e.printStackTrace();
		
		}
	}
		
		public static void toHashMap() {
			String[] arrayRegen = new String[2];
			Scanner reader;
			String regen = ", ";
			try {
				reader = new Scanner(myFile);
				
				while (reader.hasNextLine()) {
					String readLine = reader.nextLine();
					arrayRegen = readLine.split(regen);
					idName.put(arrayRegen[0], arrayRegen[1]);
					
				}
			
			System.out.println(idName);
			reader.close();
				}
				catch (FileNotFoundException e) {
				
				e.printStackTrace();
			} //
		}
			
			
	}
	
	
	
	
	

