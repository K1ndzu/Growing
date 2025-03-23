import java.util.Scanner;
public class StringMethods {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.charAt(0));
		System.out.println(name.trim());
		System.out.println(name.replace(name.charAt(0), '$'));
		System.out.println(name.equals("sim"));
		System.out.println(name.equalsIgnoreCase("sim"));
		System.out.println(name.indexOf("s"));
		
		int comida = 1;
		Integer comidas = 2;
		
		
	}
 
}


