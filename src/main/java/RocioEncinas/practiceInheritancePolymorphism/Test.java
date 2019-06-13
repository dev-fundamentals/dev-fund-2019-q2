package main.java.RocioEncinas.practiceInheritancePolymorphism;

public class Test {
	public static void main(String[] args) {
		Figure[] figures = {
				// adding 2 Queen objects
				new Queen(0),
				new Queen(1),
				// adding 4 Castle objects
				new Castle(0),
				new Castle(1),
				new Castle(0),
				new Castle(1)
		};

		for (Figure f : figures) {
			f.whoAmI();
		} 
	}	
}
