package main.java.JhasmanyQuiroz.classes.class10Inheritence;

public class Square extends Rectangle {
  public Square(String label, int base) {
    super(label, base, base);
  }

  public void getFigureType() {
    System.out.print("Figure Type: Square");
  }
}