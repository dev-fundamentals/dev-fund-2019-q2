package main.java.RocioEncinas.polymorphism;

public class Rectangle extends Shape {
	void print() {
		super.print();
		System.out.println("I am a Rectangle");
	}
	
	void draw() {
		System.out.println("Draw a Rectangle");
	}
}
