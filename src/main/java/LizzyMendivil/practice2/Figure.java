package main.java.LizzyMendivil.practice2;

public abstract class Figure {
	
	protected String type;
	protected String tag;
	
	public Figure(String type) {
		this.type = type;
	}
	
	public final String getTag() {
		return tag;
	}
	
	public final String getType() {
		return type;
	}
	
	public final void setTag(String tag) {
		this.tag = tag;
	}
	
	public final void setType(String type) {
		this.type = type;
	}
	
	public final void printDescription() {
		System.out.println("Tag: " + this.tag);
		System.out.println("Figure Type: " + this.type);
		System.out.println("Area: " + this.getArea());
	}
	
	abstract double getArea();

}
