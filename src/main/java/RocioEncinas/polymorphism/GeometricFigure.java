package main.java.RocioEncinas.polymorphism;

public abstract class GeometricFigure extends Figure{
	String description;
	
	GeometricFigure() {
		super();
		//this.description = description;
	}
	
	final String getDescription() {
		return description;
	}
	
	final void setDescription(String newDescription) {
		this.description = newDescription;
	}
	
	@Override
	public final void printDescription() {
		System.out.println("Tag: " + tag);
		System.out.println("Figure Type: " + type);
		System.out.println("Area: " + area());
	}
}
