package main.java.JhasmanyQuiroz.classes.class10Inheritence;

public abstract class GeometricFigure implements Figure {
  protected String label;

  public GeometricFigure(String label) {
    this.label = label;
  }

  public final String getLabel() {
    return label;
  }

  public final void setLabel(String newLabel) {
    this.label = newLabel;
  }

  @Override
  public abstract String getTag();

  @Override
  public abstract void getFigureType();

  @Override
  public abstract double area();

  @Override
  public abstract void drawTxt();

  public final void printDescription() {
    System.out.print(getTag());
    getFigureType();
    System.out.print(area());
  }
}