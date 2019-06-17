package main.java.RocioEncinas.polymorphism;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class FiguresTesting {

	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Figure> figures = new ArrayList<Figure>();
		int option;
		try {
			do {
				System.out.println("Select an option: ");
				System.out.println("1.- Create rectangle");
				System.out.println("2.- Create square");
				System.out.println("3.- Display figure");
				System.out.println("0.- Exit");
				
				option = Integer.parseInt(br.readLine());
				if (option == 3) {
					figures.get(figures.size() - 1).printDescription();
				} else {
					figures.add(readFigureData(option));
				}
			} while (option != 0);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("null")
	public static Figure readFigureData(int option) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Figure figure = null;
		
		switch(option) {
			case 1: // create a rectangle
		        System.out.println("Please enter the 'base' of the rectangle in order to create it: ");
		        int base = Integer.parseInt(br.readLine());
		        System.out.println("Please enter the 'height' of the rectangle in order to create it: ");
		        int height = Integer.parseInt(br.readLine());
		        figure = new Rectangle(base, height);
		        figure.setTag("R-"+ base + " - " + height);
		        figure.setType("Rectangle");
				break;
			case 2: // create a square
				System.out.println("Please enter the 'side' of the square in order to create it: ");
				int side = Integer.parseInt(br.readLine());
				figure = new Square(side);
				figure.setTag("C-"+ side);
		        figure.setType("Square");
				break;
			default:
				figure.printDescription();
				break;
		}
		
		return figure;
	}	
}
