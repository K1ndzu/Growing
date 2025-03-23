package ArraysEverytime;

import java.util.LinkedList;

public class HashMaps {
	
	
	public static void main(String[] args) {
		String comida = "master";
		key(comida);
		
		
		
	}
	
	static void key(String name) {
		int key;
		int len = name.length();
		for (int i = 0; i < len; i++) {
		key = (name.charAt(i) % 10) % 10;
		System.out.print(key);
		
		
	}
	}
}
