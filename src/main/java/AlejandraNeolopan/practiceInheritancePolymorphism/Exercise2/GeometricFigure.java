package main.java.AlejandraNeolopan.practiceInheritancePolymorphism.Exercise2;

import main.java.AlejandraNeolopan.practiceInheritancePolymorphism.Figure;

public class GeometricFigure extends Figure {
	public GeometricFigure(String description){
		super(description);
	}
	 public final void setLabel(String desc) {
	     this.label=desc;
	  }
	public final void printDescription() {
	System.out.println("Tag: "+getLabel());
	System.out.println("Figure Type: "+ identifier);
	System.out.println("Area: "+getArea());
	}
	public void drawTxt(){
	
	}
}
