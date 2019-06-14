package main.java.JoseCardozo.practiceInheritancePolymorphism;

public class Main {
    public static void main(String[] args) {
        Figure figure = new Figure(1);
        Figure figure2 = new Figure(2);
        Figure figure3 = new Figure(3);

        Board board = new Board();
        Castle castle = new Castle(2);
        Castle castle1 = new Castle(4);

        Position pos = new Position();

        Queen queen = new Queen(2);
        Queen queen1 = new Queen(6);

        figure.color = 1;
        figure.identifier = "red";
        figure.whoAmI();

        board.addFigure(figure);
        board.addFigure(figure2);
        board.addFigure(figure3);
        board.addFigure(castle);
        board.addFigure(castle1);
        board.addFigure(queen);
        board.addFigure(queen1);

        board.iterateFigures();
    }
}
