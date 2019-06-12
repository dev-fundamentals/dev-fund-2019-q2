package main.java.JhasmanyQuiroz.classes.class09Polymorphism;

public class Principal {
  public static void main(String[] args) {
    Queen queen = new Queen(0);
    Castle castle = new Castle(1);

    Board board = new Board();
    board.addFigure(queen);
    board.addFigure(castle);
    board.iterateFigures();
  }
}