package main.java.JoseCardozo.practiceInheritancePolymorphism;


import java.util.ArrayList;

class Board {
  private ArrayList<Figure> figures;

  Board() {
    figures = new ArrayList<>();
  }

  /**
   * Method that adds a figure to collection.
   *
   * @param figure
     */
  public void addFigure(Figure figure) {
    figures.add(figure);
  }

  /**
   * Method that show up all collection.
   *
   */
  public void iterateFigures() {
    for(Figure figure : figures) {
      figure.whoAmI();
    }
  }
}