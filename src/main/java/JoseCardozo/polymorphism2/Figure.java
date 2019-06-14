package main.java.JoseCardozo.polymorphism2;

public abstract class Figure {
    String type;
    String tag;
    int base;
    int height;

    public Figure(String type, String tag) {
        this.type = type;
        this.tag = tag;
    }

    abstract void printDescription();
    abstract String getTag();

}
