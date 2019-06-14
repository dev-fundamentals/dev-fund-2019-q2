public class Square extends Rectangle {
  public Square(String label, base) {
    super(label, base, base);
  }

  public String getFigureType() {
    System.out.print("Figure Type: Square");
  }

  public double area() {
    return this.base * this.height;
  }
}