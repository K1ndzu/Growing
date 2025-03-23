package Desk;

import java.util.Random;
import java.util.Scanner;

public class Tiger {
	int points = 0;
	
	Scanner scanner = new Scanner(System.in);
	void menu() {
		int menu = scanner.nextInt();
		switch (menu) {
		
		case 1:
			rand();
			break;
		case 2:
			System.out.print("Thanks for play");
			System.exit(0);
			break;
		default:
			System.out.println("this is not a answer");
			break;
		
		}
			
		
		
		
		
	}
	int rand() {
		String[] emoji = new String[6];
		
		
		Random randEmoji = new Random();
		emoji[0] = "🍎";
		emoji[1] = "🍉​";
		emoji[2] = "🍇​";
		
		
			int a = randEmoji.nextInt(3);
			int b = randEmoji.nextInt(3);
			int c = randEmoji.nextInt(3);
			System.out.println(emoji[a] + " " + emoji[b] + " " + emoji[c]);
			if (a == b && a == c ) {
				points += 100;
				System.out.println("\nYou Wonnn!!!!\n🌈​🎇​🎆​✨​✨​🎆​🎇​🌈​\nYou have " + points + " Points\nYou want play again?");
				menu();
				
			}else {
				System.out.println("You want play again?\nInput 1\nPoints = " + points);
				menu();
			}
		return 0;
	}
	public static void main(String[] args) {
		 Tiger tiger = new Tiger(); 
	        System.out.println("Hello, let's check your luck");
	        System.out.println("1. Spin\n2. Exit\nPoints = " + tiger.points);

	        tiger.menu();
		
		
		
		
		
		
		
	}
	
	
}
