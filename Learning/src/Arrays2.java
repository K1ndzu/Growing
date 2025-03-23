
public class Arrays2 {
	public static void main(String[] args) {
	
		String[][] food = new String[3][4]; // you can do a array, not just with 1 dimension of values, but with 2 dimensions
 // Everytime the system see the first [], for that reason, the length will be evertyime the first 
		food[0][0] = "pizza"; 
		food[0][1] = "cake";
		food[0][2] = "burrito";	
		food[1][0] = "money";
		food[1][1] = "rice";
		food[1][2] = "beans";
		food[2][0] = "banana";
		food[2][1] = "yakisoba";
		food[2][2] = "pasta";	
		
		for (int i = 0; i < food.length; i++){
			for (int j = 0; j<food.length; j++) {
				System.out.print(food[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println(food.length);
		
		
		
		
	}
}
