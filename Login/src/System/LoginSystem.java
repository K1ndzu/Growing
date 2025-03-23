package System;

import java.util.Scanner;

public class LoginSystem {
	String name = "Pedro";
	String password = "1234";
	Scanner scanner = new Scanner(System.in);
	
	public void login() {
		System.out.println("hey, what's up");
		System.out.println("say your Name and Password");
		String nameLogin = scanner.nextLine();
		String passwordLogin = scanner.nextLine();
		if (nameLogin.equals(name) && passwordLogin.equals(password)) {
			System.out.println("Helo");
			
		}
		
		
		
		
		
	}
	
	
}
