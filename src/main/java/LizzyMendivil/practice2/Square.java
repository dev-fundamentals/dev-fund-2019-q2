package main.java.LizzyMendivil.practice2;

public class Square extends Rectangle {

	public Square(String type) {
		super(type);
		// TODO Auto-generated constructor stub
	}
	
	public Square(int side) {
		super(side, side);
		super.type = "Square";
	}

}
