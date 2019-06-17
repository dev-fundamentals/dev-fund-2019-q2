package main.java.AlejandraNeolopan.practiceInheritancePolymorphism.Exercise2;

import java.io.BufferedReader;
import java.io.IOException;

public class Rectangle extends GeometricFigure {
	
	protected int base;
	protected int height;
	public Rectangle(String desc){
		super(desc);
	}
	
	public int getBase() {
		return base;
	}
	public void setBase(int number) {
		 base=number;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int number) {
		 height=number;
	}
	public String getFigureType() {
		return identifier;
	}
	public double getArea(){
		return base*height;
	}
	public void drawTxt(){
		for (int i=1;i<=height;i++) {
			for (int j=1;j<=base;j++)
				System.out.print("*");
			System.out.println();
		}
	}
	
	public static GeometricFigure readFigureData(BufferedReader input) throws IOException {
		int base, line;
		String label;
	  System.out.println("Enter base of rectangle:");
	  base= Integer.parseInt(input.readLine());
	 
	  System.out.println("Enter heigth of rectangle:");
	  line= Integer.parseInt(input.readLine());
	  Rectangle rec= new Rectangle("Rectangle");

	  System.out.println("Enter label:");
	  label= input.readLine();
	  rec.setBase(base);
	  rec.setHeight(line);
	  rec.setLabel(label);
	  System.out.println("Enter color:0/1");
	  label= input.readLine();
	  rec.setColor(Integer.parseInt(label));
	  return rec;
	}

}
