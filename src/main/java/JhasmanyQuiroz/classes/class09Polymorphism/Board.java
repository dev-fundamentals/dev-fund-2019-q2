package main.java.JhasmanyQuiroz.classes.class09Polymorphism;

class Board {
  private ArrayList<Figure> figures;

  Board() {
    figures = new ArrayList<>();
  }

  public void addFigure(Figure figure) {
    figure.add(figure);
  }

  public void iterateFigures() {
    for(Figure figure : figures) {
      figure.whoAmI();
    }
  }
}