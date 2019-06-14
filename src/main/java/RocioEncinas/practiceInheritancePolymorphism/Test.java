package main.java.RocioEncinas.practiceInheritancePolymorphism;

public class Test {
	public static void main(String[] args) {
		GeometricFigure[] figures = {
				// adding 2 Queen objects
				new Queen("Queen1"),
				new Queen("Queen2"),
				// adding 4 Castle objects
				new Castle("Castle1"),
				new Castle("Castle2"),
				new Castle("Castle3"),
				new Castle("Castle4")
		};

		for (GeometricFigure f : figures) {
			f.whoAmI();
		} 
	}	
}
