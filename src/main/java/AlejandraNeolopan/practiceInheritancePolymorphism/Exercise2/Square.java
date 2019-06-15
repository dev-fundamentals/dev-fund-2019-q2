package main.java.AlejandraNeolopan.practiceInheritancePolymorphism.Exercise2;

import java.io.BufferedReader;
import java.io.IOException;

import main.java.AlejandraNeolopan.practiceInheritancePolymorphism.Figure;

public class Square extends Rectangle{
	public Square(String description){
		super(description);
		
	}
	Square(String description,int value){
		super(description);
		this.base=value;
		this.height=value;
		
	}
	public static Figure readFigureData(BufferedReader input) throws IOException {
		int base;
		String label;
	
		System.out.println("Enter base of square:");
	    base= Integer.parseInt(input.readLine());
	    Square sq = new Square("Square"); 
	    sq.setBase(base);
	    sq.setHeight(base);
	   
	    System.out.println("Enter label:");
		  label= input.readLine();
		  sq.setLabel(label);
		System.out.println("Enter color:0/1");
		  label= input.readLine();
		  sq.setColor(Integer.parseInt(label));
	    return sq;
	}
}
