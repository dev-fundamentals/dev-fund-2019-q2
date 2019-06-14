package main.java.RocioEncinas.polymorphism;

public abstract class Shape implements IShape {
	protected String type;
	
	Shape(String type){
		this.type = type;
		//TYPE_SHAPE = "X"; como es una variable constante no se puede modificar
	}
	
	/*public void print() {
		System.out.println("I am a Shape of type: " + type + TYPE_SHAPE);
	}
	
	void print(int posX, int posY) {
		System.out.println("I am a Shape with coordinates: " + posX + posY);
	}
	
	public abstract void draw();*/
}
