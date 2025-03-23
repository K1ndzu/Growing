import java.util.Scanner;


public class Calculator{

	public static void main(String[] args) {
		// is so much cute and more easy to use
		int amount = 0;
		Scanner scan = new Scanner(System.in);
		while(true) {
		System.out.println("say a number");
		int n2 = scan.nextInt();
		System.out.println("hey, now say your operator");
		scan.nextLine();
		String operator = scan.nextLine();
		
		switch(operator) {
			case "+":
				amount = amount + n2;
					System.out.println(amount);			
				break;
			case "-":
				amount = amount - n2;
                	System.out.println(amount);
				break;
			case "*":
				amount = amount * n2;
					System.out.println(amount);
			
				break;
			case "/":
				amount = amount / n2;
					System.out.println(amount);
				break;
			case "x":
				System.out.print("thanks for use the best calculator");
				System.exit(1);
				break;
				
			default:
				System.out.print("This is incorrect");
				break;
		}
		}
		
	}
	

}
