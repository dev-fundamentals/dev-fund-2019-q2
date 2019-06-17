package main.java.CristelhMiranda.practiceInheritancePolymorphism.exercise2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FiguresTesting {

	public static void main(String[] args) throws IOException {
		boolean exit = false;
		IFigure figure = null;
		
		while(!exit) {
			System.out.println();
			System.out.println("1.- Create rectangle\r\n" + 
					"2.- Create square\r\n" + 
					"3.- Display figure\r\n" + 
					"0.- Exit\r\n" + 
					"");
			
			//BufferedReader
			/*BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		    String input = reader.readLine();
		    int number = Integer.parseInt(input);	
		    */
		    //Scanner
		    Scanner scnr = new Scanner(System.in);	        
	        int number = scnr.nextInt();
			
			switch (number) {
			case 1: figure = new Rectangle("R-1", 5, 2);				
				break;
			case 2: figure = new Square("S-1", 2);				
				break;
			case 3:	figure.printDescription();			
				break;
			case 0:exit = true;				
				break;
			default:
				break;
			}
		}		
	}
}
