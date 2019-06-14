package main.java.JhasmanyQuiroz.classes.class10Inheritence;

public class Rectangle extends GeometricFigure {
  private int base;
  private int height;

  public Rectangle(String label, int base, int height) {
    super(label);
    this.base = base;
    this.height = height;
  }

  @Override
  public String getTag() {
    return null;
  }

  public int getBase() {
    return this.base;
  }

  public void setBase(int newBase) {
    this.base = newBase;
  }

  public int getHeight() {
    return this.height;
  }

  public void setHeight(int newHeight) {
    this.height = newHeight;
  }

  public void getFigureType() {
    System.out.print("Figure Type: Rectangle");
  }

  public double area() {
    return this.base * this.height;
  }

  public void drawTxt() {
    for(int index = 0; index < height; index ++) {
      for(int indexRow = 0; indexRow < base; indexRow ++) {
        System.out.print("*");
      }

      System.out.println();
    }
  }
}