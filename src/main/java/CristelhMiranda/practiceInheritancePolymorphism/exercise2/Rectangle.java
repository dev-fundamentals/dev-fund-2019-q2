package main.java.CristelhMiranda.practiceInheritancePolymorphism.exercise2;

public class Rectangle extends GeometricFigure{
	private int height;
	private int base;
	
	Rectangle(String label, int height, int base){
		super(label, "Rectangle");
		this.height = height;
		this.base = base;
	}	
	
	public double area(){
		return base * height;
	}
	
	public void drawTxt(){
		for (int i = 1; i <= base; i++) {
			for (int j = 1; j <= height; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
