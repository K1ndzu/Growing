package project;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
	
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> toList = new ArrayList<String>();
		System.out.println("Hey, this is your to do list\nWhat you gonna do today?");
		while(true) {
		String input = scanner.nextLine();
		if (input.equals("ok")) {
			for (int i = 0; i<toList.size(); i++) {
				System.out.println(i+1 + "." + toList.get(i));
			}
		}else if (input.equals("exit")){
			scanner.close();
			System.exit(0);
		}else {
			toList.add(input);
		}
		
		
		}

}




}
