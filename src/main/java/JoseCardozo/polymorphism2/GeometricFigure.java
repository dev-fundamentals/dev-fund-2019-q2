package main.java.JoseCardozo.polymorphism2;

public abstract class GeometricFigure extends Figure{
    protected String label;

    public GeometricFigure(String type) {
        super(type);
    }

    protected final String getLabel() {
        return label;
    }

    protected final void setLabel(String label) {
        this.label = label;
    }

    protected final void printDescription(double area) {
        System.out.println("Tag: " + tag);
        System.out.println("Figure Type: " + type);
        System.out.println("Area: " + area);
    }
}
