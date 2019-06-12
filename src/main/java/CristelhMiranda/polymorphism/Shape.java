package main.java.CristelhMiranda.polymorphism;

public class Shape {
	void print() {
		System.out.println("I am a Shape");
	}
	
	void print(int posX, int posY) {
		System.out.println("I am a Shape with coordinates: " + posX + posY);
	}
	
	void draw() {}
}
