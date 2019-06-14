package main.java.RocioEncinas.polymorphism;

public class Square extends Shape{
	Square() {
		super("Square");
	}
	
	public void print() {
		System.out.println("I am a Square");
	}

	public void draw() {
		System.out.println("***");
		System.out.println("***");
		System.out.println("***");
	}
}
