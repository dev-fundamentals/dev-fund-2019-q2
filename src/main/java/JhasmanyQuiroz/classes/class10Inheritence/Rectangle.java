public class Rectangle extends GeometricFigure {
  private int base;
  private int height;

  public Rectangle(String label, base, height) {
    super(label);
    this.base = base;
    this.height = height;
  }

  public String getBase() {
    return this.base;
  }

  public void setBase(String newBase) {
    this.base = newBase;
  }

  public String getHeight() {
    return this.height;
  }

  public void setHeight(String newHeight) {
    this.height = newHeight;
  }

  public String getFigureType() {
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