package main.java.JoseCardozo.polymorphism2;

public class Rectangle extends GeometricFigure {
    protected int base;
    protected int height;

    public Rectangle(String type, int base, int height) {
        super(type);
        this.base = base;
        this.height = height;
    }

    protected int getBase() {
        return base;
    }

    protected void setBase(int base) {
        this.base = base;
    }

    protected int getHeight() {
        return height;
    }

    protected void setHeight(int height) {
        this.height = height;
    }

    protected double getArea(){
        return base * height;
    }

    protected String getFigureType(){
        return super.getType();
    }

    protected void drawTxt(){
        String draw = "";
        for (int i = 0; i < base; i++) {
            draw += "*";
        }

        for (int i = 0; i < height; i++) {
            System.out.println(draw);
        }
    }
}
