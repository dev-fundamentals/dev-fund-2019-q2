package main.java.CristelhMiranda.practiceInheritancePolymorphism.exercise2;

public abstract class GeometricFigure implements IFigure{
	private String label;
	protected String type;
	GeometricFigure(String label, String type){
		this.label = label;
		this.type = type;
	}
	
	public final void setTag(String label) {
		this.label = label;
	}
	
	public final String getTag() {
		return label;
	}
	
	public String getFigureType(){
		return type;
	}
	
	public final void printDescription() {
		System.out.println("Tag: " + getTag());
		System.out.println("Figure Type: " + type);
		System.out.println("Area: " + area());
	}
}
