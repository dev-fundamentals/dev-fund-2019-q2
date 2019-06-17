package main.java.RocioEncinas.polymorphism;

public abstract class Figure {
	String type;
    String tag;
    
	public String getTag() {
		return tag;
	}

	public String getType() {
		return type;
	}
	
	public void setTag(String tag) {
		this.tag = tag;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	// abstract methods
	abstract double area();
	abstract void printDescription();
}
