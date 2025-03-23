package Scissor;

public class Fight {
	public static void main(String[] args) { 
		// creating objects, and giving for they data for each
		Pokemon Chinchar = new Pokemon();
		Pokemon Pikachu = new Pokemon();
		Chinchar.level = 2;
		Chinchar.name = "chinchar";
		Chinchar.power = "Fireball";
		
		Pikachu.level = 4;
		Pikachu.name = "pikachu";
		Pikachu.power = "Eletrik";
		// each object is unique, compared for class, class is more macro than micro
		// for that reason, i can put level, name or power. Because it object is unique
		System.out.println(Pikachu.level + " " + Pikachu.name + " " + Pikachu.power);
		System.out.println(Chinchar.level + " " + Chinchar.name + " " + Chinchar.power);
		Chinchar.attack();
		// when with class, i can take methods of her, to not make here
	}
}
