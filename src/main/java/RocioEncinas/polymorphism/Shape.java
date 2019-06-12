package main.java.RocioEncinas.polymorphism;

public class Shape {
	void print() {
		System.out.println("I am a shape");
	}
	
	void print(int posX, int posY) {
		System.out.println("I am a shape with coordinates: " + posX + posY);
	}
}
