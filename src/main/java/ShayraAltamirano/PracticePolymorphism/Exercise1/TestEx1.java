package main.java.ShayraAltamirano.PracticePolymorphism.Exercise1;

public class TestEx1 {
	public static void main(String[] args) {
			// TODO Auto-generated method stub
		
		Queen queen1= new Queen(1);
		Queen queen2= new Queen(0);
		Castle castle1 =new Castle(1);
		Castle castle2 =new Castle(1);
		Castle castle3 =new Castle(0);
		Castle castle4 =new Castle(0);
		
		Figure arrayFigure[] = new Figure[6];
		
		arrayFigure[0]=queen1;
		arrayFigure[1]=queen2;
		arrayFigure[2]=castle1;
		arrayFigure[3]=castle2;
		arrayFigure[4]=castle3;
		arrayFigure[5]=castle4;
		
		for(int i=0;i<arrayFigure.length;i++) {
			arrayFigure[i].whoAmI();
		}
	}
}
