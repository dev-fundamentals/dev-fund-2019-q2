package main.java.RolandoMamani.Polimorfismo;

public class Rectangle extends Shape{
	void print() {
		super.print();
		System.out.println("I am a rectangle");
	}
	
	void draw() {
		System.out.println(".......................");
		System.out.println(".......................");
		System.out.println(".......................");
	}
}
