package main.java.JoseCardozo.polymorphism;

public abstract class Shape implements IShape{

	protected String type;

	public Shape(String type) {
		this.type = type;
	}

	public void print() {
		System.out.println("I am a Shape of type: " + type + TYPE_SHAPE);
	}
	
	void print(int posX, int posY) {
		System.out.println("I am a Shape with coordinates: " + posX + posY);
	}
	
	public abstract void draw();
}
