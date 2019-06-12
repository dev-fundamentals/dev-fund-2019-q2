package main.java.RocioEncinas.practiceInheritancePolymorphism;

public class Test {
	public static void main(String[] args) {
		Figure[] figures = {
				// adding Queen objects
				new Queen(0),
				new Queen(1),
				// adding Castle objects
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
