package random;
import java.util.Scanner;


public class Bank {
	static double balance = 1000.00;
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
	while(true) {
		System.out.println("****************");
		System.out.println("Programming Bank");
		System.out.println("****************");
		System.out.println("1.Deposit\n2.Withdraw\n3.balance\n4.Exit");
		int s = scanner.nextInt();
		switch (s) {
		case 1:
			deposit();
			break;
		case 2:
			withdraw();
			break;
		case 3:
			System.out.println(balance);
			break;
		case 4:
			System.exit(1);
			blank();
			break;
		default:
			System.out.println("that value is not acceptable");
			break;
		}
	}
}	
	 // method for deposit, every time will increase in balance
	static void deposit() {
		System.out.println("say what of amount you will deposit");
		double deposit = scanner.nextDouble();
		if (deposit >= 0) {
			balance = balance + deposit;
			blank();
			System.out.println("now, your balance is "+ balance);
		}else {
			System.out.println("this value is not aceitavel");
		}
	}
	static void withdraw() {
		System.out.println("Say the amount that you want withdraw");
		double withdraw = scanner.nextDouble();
		if (withdraw >= 0) {
			balance = balance - withdraw;
			blank();
			System.out.println("now, your balance is "+ balance);
		}else {
			System.out.println("this value is not acceptable");
		}
		
	}

	static void blank() {
		for (int i = 0; i < 30; i++) {
			System.out.println("");
		}
	}
	
	
	
	
	
	
	
}
