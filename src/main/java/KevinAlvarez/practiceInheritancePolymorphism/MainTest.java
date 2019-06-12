package main.java.KevinAlvarez.practiceInheritancePolymorphism;

public class MainTest {

	public static void main(String[] args) {
		Figure[] figures = {
				new Queen(0),
				new Castle(0),
				new Castle(1),
				new Queen(1),
				new Castle(0),
				new Castle(1)
		};
		
		for (Figure current : figures) current.whoAmI();
	}

}
