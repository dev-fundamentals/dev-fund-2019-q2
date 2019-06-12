package main.java.RolandoMamani.Polimorfismo;

public class Shape {
	void print() {
		System.out.println("I am a Shape");
	}
	
	void print(int posX, int posY) {
		System.out.println("I am a Shape with points " + posX + posY);
	}
	
	void draw() {}
}
