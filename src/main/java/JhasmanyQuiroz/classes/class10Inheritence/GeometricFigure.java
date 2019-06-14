public class GeometricFigure implements Figure {
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

  public final void printDescription() {
    System.out.print(getTag());
    System.out.print(getFigureType());
    System.out.print(area());
  }
}