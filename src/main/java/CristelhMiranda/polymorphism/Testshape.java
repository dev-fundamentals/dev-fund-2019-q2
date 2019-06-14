package main.java.CristelhMiranda.polymorphism;

public class Testshape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s1 = new Shape();
		//s1.print(10, 15);
		//s1.print();
		
		Shape square = new Square();		
		Shape rectangle = new Rectangle();
		
		square.print();
		square.draw();
		
		rectangle.print();
		rectangle.draw();
	}

}
