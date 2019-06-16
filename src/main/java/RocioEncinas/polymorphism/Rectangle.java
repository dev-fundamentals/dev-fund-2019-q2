package main.java.RocioEncinas.polymorphism;

public class Rectangle extends GeometricFigure{
	int base;
	int height;
	
	Rectangle(int base, int height) {
		//super(description);
		this.height = height;
		this.base = base;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getType() {
		return "Rectangle";
	}
	
	public double area() {
		return base * height; 
	}
	
	public void drawTxt() {
		for(int h = 0; h < height; h++) {
			for (int b = 0; b < base; b++) {
				System.out.print("*");
			}
			System.out.println();
	    }
	}
}
