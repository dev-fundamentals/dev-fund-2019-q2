package main.java.RocioEncinas.polymorphism;

public class Rectangle extends Shape{
	Rectangle() {
		//type = "Rectangle";
		super("Rectangle");
	}
	
	public void print() {
		//super.print();
		System.out.println("I am a rectangle");
	}
	
	public void draw() {
		System.out.println("********************");
		System.out.println("********************");
		System.out.println("********************");
	}
}
