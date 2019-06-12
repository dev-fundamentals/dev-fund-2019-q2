package main.java.RolandoMamani.practiceInheritancePolymorphism;

public class Main {

	public static void main(String[] args) {
		
		Figure castle1 = new Castle(0);
		Figure castle2 = new Castle(1);
		Figure castle3 = new Castle(0);
		Figure castle4 = new Castle(1);
		
		Figure queen1 = new Queen(0);
		Figure queen2 = new Queen(1);
		Figure [] figures = new Figure [] {castle1, castle2, castle3, castle4, queen1, queen2};
		
		for(int i = 0; i < figures.length ; i++) {
			figures[i].whoAmI();
		}
	}

}
