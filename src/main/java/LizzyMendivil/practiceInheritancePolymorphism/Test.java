package main.java.LizzyMendivil.practiceInheritancePolymorphism;

public class Test {
	
	public static void main(String[] args) {
		/* Queen queen1 = new Queen(0);
		Queen queen2 = new Queen(0);
		
		Castle castle1 = new Castle(1);
		Castle castle2 = new Castle(1);
		Castle castle3 = new Castle(1);
		Castle castle4 = new Castle(1);
		
		queen1.whoAmI();
		queen2.whoAmI();
		
		castle1.whoAmI();
		castle2.whoAmI();
		castle3.whoAmI();
		castle4.whoAmI(); */
		
		Figure[] figures = {
				new Queen(0),
				new Queen(0),
				new Castle(1),
				new Castle(1),
				new Castle(1),
				new Castle(1)
		};

		for (Figure current : figures) {
			current.whoAmI();	
		}
	}

}
