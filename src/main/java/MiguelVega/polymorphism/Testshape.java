package main.java.MiguelVega.polymorphism;

public class Testshape {

	public static void main(String[] args) {

		//Shape s1 =new Shape();
		//s1.print(10,15);
		//s1.print();
		
		Square square = new Square();
		Rectangle rectangle = new Rectangle();
		
		square.print();
		square.draw();
		
		rectangle.print();
		rectangle.draw();
		
		
	}	
}