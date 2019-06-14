package main.java.RocioEncinas.practiceInheritancePolymorphism;

public abstract class GeometricFigure implements IFigure {
	String label;
	
	GeometricFigure(String label) {
		this.label = label;
	}
	
	final String getLabel() {
		return label;
	}
	
	void setLabel(String newLabel) {
		label = newLabel;
	}
}
