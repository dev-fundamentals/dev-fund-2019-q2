package main.java.ShayraAltamirano.PracticePolymorphism.Exercise2;

public abstract class GeometricFigure extends Figure implements IGeometricFigure{
	
	protected String figureType;
	
	/*GeometricFigure(String label){
		this.label=label;
	}*/
	
	public final void setFigureType(String figureType) {
	    this.figureType = figureType;
	  }
	public final String getFigureType() {
		 return this.figureType;
	  }
	public final void printDescription() {
		 System.out.println("Tag: "+ LABEL );
		 System.out.println("Figure Type: " +this.figureType);
		 System.out.println("Area: "+ this.area());
	}
}
