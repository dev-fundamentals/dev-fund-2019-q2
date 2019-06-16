package main.java.JoseCardozo.polymorphism2;

public abstract class Figure {
    String type;
    String tag;

    public Figure(String type) {
        this.type = type;
    }

    abstract void printDescription(double area);
    abstract double getArea();

    protected String getType() {
        return type;
    }

    protected void setType(String type) {
        this.type = type;
    }

    protected String getTag() {
        return tag;
    }

    protected void setTag(String tag) {
        this.tag = tag;
    }
}
