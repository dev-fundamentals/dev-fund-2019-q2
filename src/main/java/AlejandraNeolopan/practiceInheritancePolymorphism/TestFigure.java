package main.java.AlejandraNeolopan.practiceInheritancePolymorphism;

public class TestFigure {
	public static void main(String[] args) {
		Figure[] figures=new Figure[6];
		figures[0]= new Queen(0);
		figures[1]= new Queen(1);
		figures[2]= new Castle(1);
		figures[3]= new Castle(0);
		figures[4]= new Castle(0);
		figures[5]= new Castle(1);
		
		for (Figure fig:figures) {
			fig.whoAmI();
		}
	}
}
