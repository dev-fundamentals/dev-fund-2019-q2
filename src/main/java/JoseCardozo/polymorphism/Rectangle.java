package main.java.JoseCardozo.polymorphism;

public class Rectangle extends Shape {

	public Rectangle() {
		super("Rectangle");
	}

	public void print() {
		System.out.println("I am a Shape of type: " + type);
	}
	
	public void draw() {
		System.out.println("********************");
		System.out.println("********************");
		System.out.println("********************");
	}
}
