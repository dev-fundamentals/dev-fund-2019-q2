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
	
	public static Figure createRectangle(BufferedReader br) throws IOException {
		System.out.println("Please enter the 'base' of the rectangle in order to create it: ");
        int base = Integer.parseInt(br.readLine());
        System.out.println("Please enter the 'height' of the rectangle in order to create it: ");
        int height = Integer.parseInt(br.readLine());
        Figure figure = new Rectangle(base, height);
        figure.setTag("R-1"+ base + "-" + height);
        figure.setType("Rectangle");
        return figure;
	}
	
	public static Figure createSquare(BufferedReader br) throws NumberFormatException, IOException {
		System.out.println("Please enter the 'side' of the square in order to create it: ");
		int side = Integer.parseInt(br.readLine());
		Figure figure = new Square(side);
		figure.setTag("S-"+ side);
        figure.setType("Square");
        return figure;
	}
	
	public static Figure readFigureData(int option) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Figure figure = null;
		switch(option) {
			case 1: // create an instance of rectangle
		        figure = createRectangle(br);
				break;
			case 2: // create an instance of square
				figure = createSquare(br);
				break;			
		}
		
		return figure;
	}	
}
