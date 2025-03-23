import java.util.ArrayList;
public class ArraysArrayslists {
	public static void main (String[] args){
		ArrayList<String> menu = new ArrayList();
		menu.add("pasta");
		menu.add("eggs");
		menu.add("rice");
		ArrayList<String> drinks = new ArrayList();
		drinks.add("coca");
		drinks.add("soda");
		drinks.add("juice");
		ArrayList<String> sandwichs = new ArrayList();
		sandwichs.add("x-burguer");
		sandwichs.add("x-salad");
		sandwichs.add("siri burguer");
		ArrayList<ArrayList<String>> amount = new ArrayList();
		amount.add(menu);
		amount.add(drinks);
		amount.add(sandwichs);
		amount.get(0).remove(2); 
		amount.get(1).set(0, "beer");
		
		
		System.out.println(amount);
		
		
	}
}
