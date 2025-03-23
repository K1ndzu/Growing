import java.util.Random;
import java.util.Scanner;
public class colluns {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		while(true) {
		int x = random.nextInt(1 , 20);
		int y = random.nextInt(1 , 15);
		System.out.println("hello, say your favorite key in keyboard");
		String food = scanner.nextLine(); // will scan a Symbol
		
		
		for (int i = 0; i < y; i++) { // will repeat the numbers of colluns
			
			for (int a = 0; a < x; a++) { // will repeat the number of rows
				System.out.print(food);
			}
			System.out.println(); // that make colluns. will be downing the lines after make the rows
		}
		}
		
	
	
	
	
	
	
	}
}