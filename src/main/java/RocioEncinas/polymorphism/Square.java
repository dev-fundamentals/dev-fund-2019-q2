package main.java.RocioEncinas.polymorphism;

public class Square extends Rectangle {
	int side;
	
	Square(int side) {
		super(side, side);
		this.side = side;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getType() {
		return "Square";
	}
	
	@Override
	public double area() {
		return super.area();
		//return Math.pow(side, 2); 
	}
	
	@Override
	public void drawTxt() {
		super.drawTxt();
	}
}
