package projects;

import java.util.Random;
import java.util.Scanner;

public class Project {
	
	public static void main(String[] Args) {
	Random random = new Random();
	Scanner scanner = new Scanner(System.in);
	int guess = random.nextInt(1, 100); 	
	System.out.println("Hey everybody, guess what is the number");
	while(true) {
		int answer = scanner.nextInt();
		if (answer == guess) {
			System.out.println("woow, you won the game");
			System.exit(1);
		}
		if (answer > guess){
			System.out.println("too high, try again");
			
		}
		if (answer < guess){
			System.out.println("too low, try again");
			
		}
				
		}
	
	}
}


