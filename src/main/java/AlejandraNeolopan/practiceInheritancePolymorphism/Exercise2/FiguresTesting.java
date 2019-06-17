package main.java.AlejandraNeolopan.practiceInheritancePolymorphism.Exercise2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FiguresTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		 String value="1";
		 GeometricFigure figure= new GeometricFigure("");
		 
		 while (!value.equals("0")){
			 System.out.println("1.- Create rectangle\r\n" + 
						"2.- Create square\r\n" + 
						"3.- Display figure\r\n" + 
						"0.- Exit\r\n");
			 try {
				value= input.readLine();
				 
			 if (value.equals("1")) 
			    figure =Rectangle.readFigureData(input);
	 
	     	  if (value.equals("2"))
		    	 figure= Square.readFigureData(input);
	     	
	     	  if (value.equals("3")) {
		    	  figure.drawTxt();
		    	  figure.printDescription();
	     	  }
			 } catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	     	  
		  
		 }
	}

}
