import java.util.ArrayList;
public class ArrayListss {
    public static void main(String[] args) {
    	ArrayList<String> food = new ArrayList<String>();
	
    	food.add("torta");
    	food.add("pizza");
    	food.add("maça");
    	food.set(1, "lasanha");
    	
    	food.remove(0); // see how madness is. if you remove the first unit, the second will be the first.
        System.out.println(food.get(0));
        System.out.println(food.get(1));
        
    }
}