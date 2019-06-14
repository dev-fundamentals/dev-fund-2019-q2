package main.java.JoseCardozo.polymorphism2;

public class GeometricFigure extends Figure{
    String label;
    double area;

    public GeometricFigure(String type, String tag, String label) {
        super(type, tag);
        this.label = label;
        area = 0;
    }

    final String getLabel() {
        return label;
    }

    final void setLabel(String label) {
        this.label = label;
    }

    final void printDescription() {
        System.out.println("Tag: " + tag);
        System.out.println("Figure Type: " + type);
        area = getArea();
        System.out.println("Area: " + area);
    }

    private double getArea() {
        return base * height;
    }

    final String getTag() {
        return null;
    }
}
