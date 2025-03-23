package project;
import java.util.Scanner;
public class project {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] answers = new String[4];
		System.out.println("this is a ____ for my project\ni hope that i can ____ it\nwith the _________ that i have now\nso, i will _____.");
		System.out.println("now, complete the spaces in blank");
		for (int i = 0; i < 4; i++) {
		answers[i] = scanner.nextLine().toUpperCase();
		}
		if (answers[0].equals("TEXT") && answers[1].equals("MAKE") & answers[2].equals("KNOWLEDGE") & answers[3].equals("START")){
			System.out.println("corrects answers, you have a super brain?\nthe text without blanks spaces is\n");
			System.out.println("this is a text for my project\ni hope that i can make it\nwith the knowledge that i have now\nso, i will start.");
		}else {
			System.out.println("you have issues in your mind, return later");
		}
	}
}
