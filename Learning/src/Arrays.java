
public class Arrays {
	public static void main (String[] args) {
		
		String[] cars = new String[3];
		cars[0] = "Opala";
		cars[1] = "Camaro";
		cars[2] = "Tesla";

		for(int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		// you can too use the method of for-each, that get all members in a array
		}
		for(String j : cars) {
			System.out.println(j);
		}
		
	}
}
