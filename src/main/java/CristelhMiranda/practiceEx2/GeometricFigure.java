package main.java.CristelhMiranda.practiceEx2;

public class GeometricFigure extends Figure {
	public GeometricFigure(String label) {
		this.label=label;
	}
	public String getTag() {
		return label;
	}
	public void printDescription() {
		System.out.println("tag:"+getTag());
		System.out.println("Type of Figure:"+type);
		System.out.println("Area:"+area());
	}
}
