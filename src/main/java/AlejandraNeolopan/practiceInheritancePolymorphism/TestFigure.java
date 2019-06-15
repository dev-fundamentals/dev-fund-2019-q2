package main.java.AlejandraNeolopan.practiceInheritancePolymorphism;

import main.java.AlejandraNeolopan.practiceInheritancePolymorphism.Exercise1.Castle;
import main.java.AlejandraNeolopan.practiceInheritancePolymorphism.Exercise1.Queen;
import main.java.AlejandraNeolopan.practiceInheritancePolymorphism.Exercise2.Rectangle;
import main.java.AlejandraNeolopan.practiceInheritancePolymorphism.Exercise2.Square;
import java.io.*;
public class TestFigure {
	public static void main(String[] args) throws IOException {
	
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
		
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		 String value="1";
		 Figure figure = new Figure("");
		 
		 while (!value.equals("0")){
			 System.out.println("1.- Create rectangle\r\n" + 
						"2.- Create square\r\n" + 
						"3.- Display figure\r\n" + 
						"0.- Exit\r\n");
			 value= input.readLine();	 
			 if (value.equals("1")) 
			    figure =Rectangle.readFigureData(input);
	 
	     	  if (value.equals("2"))
		    	 figure= Square.readFigureData(input);
	     	
	     	  if (value.equals("3")) {
		    	  figure.whoAmI();
		    	  figure.printDescription();
	     	  }
	     	  
		  
		 }
	}
}
