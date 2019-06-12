package main.java.RocioEncinas.practiceInheritancePolymorphism;

public class Test {
	public static void main(String[] args) {
		Figure[] figures = {
				new Queen(0),
				new Castle(0),
				new Castle(1),
				new Queen(1),
				new Castle(0),
				new Castle(1)
		};

		for (Figure f : figures) {
			f.whoAmI();
		} 
	}	
}
