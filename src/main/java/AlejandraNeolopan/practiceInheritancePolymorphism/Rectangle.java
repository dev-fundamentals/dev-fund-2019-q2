package main.java.AlejandraNeolopan.practiceInheritancePolymorphism;

public class Rectangle extends GeometricFigure {
	
	protected int base;
	protected int height;
	Rectangle(String desc){
		super(desc);
	}
	
	public int getBase() {
		return base;
	}
	public void setBase(int number) {
		 base=number;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int number) {
		 height=number;
	}
	public String getFigureType() {
		return identifier;
	}
	public double getArea(){
		return base*height;
	}
	public void drawTxt(){
		for (int i=1;i<=height;i++) {
			for (int j=1;j<=base;j++)
				System.out.print("*");
			System.out.println();
		}
	}
	

}
