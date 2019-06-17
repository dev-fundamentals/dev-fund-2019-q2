package main.java.LizzyMendivil.practice2;

public class Rectangle extends GeometricFigure {
	
	protected int base;
	protected int height;

	public Rectangle(String type) {
		super(type);
		this.type = type;
	}
	
	public Rectangle(int base, int height) {
		super("Rectangle");
		this.base = base;
		this.height = height;
		this.type = "Rectangle";
	}
	
	public int getBase() {
		return base;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setBase(int base) {
		this.base = base;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public String getFigureType() {
		return super.type;
	}
		
	public void drawTxt() {
		for (int i = 1; i <= this.height; i++) {
			for (int j = 1; j <= this.base; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return this.base * this.height;
	}

}
