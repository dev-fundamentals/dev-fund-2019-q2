package main.java.JoseCardozo.polymorphism;

public class Square extends Shape {

	public Square() {
		super("Square");
	}

	public void print() {
		System.out.println("I am a shape of type: " + type);
	}

	public void draw() {
		System.out.println("***");
		System.out.println("***");
		System.out.println("***");
	}
}
