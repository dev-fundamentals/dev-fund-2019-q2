package main.java.ShayraAltamirano.PracticePolymorphism.Exercise2;

public class GeometricFigure extends Figure{


	protected String figureType;
	
	
	public final void setFigureType(String figureType) {
	    this.figureType = figureType;
	  }
	public final String getFigureType() {
		 return this.figureType;
	  }
	public final void printDescription() {
		 System.out.println("Tag: "+ this.getTag() );
		 System.out.println("Figure Type: " +this.figureType);
		 System.out.println("Area: "+ this.area());
	}
}
