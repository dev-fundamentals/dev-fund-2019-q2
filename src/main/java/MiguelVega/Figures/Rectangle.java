package main.java.MiguelVega.Figures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rectangle extends GeometricFigure {
   
    private int base;
    private int height;   
      
    public Rectangle(int base, int height, String tag) {
	super(tag);
	this.base = base;
	this.height = height;
    }

    public int getBase() { return base; }
    public void setBase(int base) { this.base = base; }

    public int getHeight() { return height; }
    public void setHeight(int height) { this.height = height; }

    public String getFigureType() {
	return "Rectangle";
    }
   
    public double area() {
	return (base * height);
    }
    
    public void drawTxt() {
	for (int row=1; row<=height; row++) 
	{   
     for (int col=1; col<=base; col++) 
     {
		System.out.print("*");
      }
	  System.out.println();
	}		
	
    }    

    public static Rectangle fillRectangle()
    {  		
    	Rectangle rec = null;
    	int base, height;
    	String tag;
    	BufferedReader console = null;
    	
    	 try {
	            console = new BufferedReader(new InputStreamReader(System.in));    	
    	
                System.out.print("Base: ");
                base = Integer.parseInt(console.readLine());
                
                System.out.print("Height: ");
                height = Integer.parseInt(console.readLine());

                System.out.print("Tag: ");
                tag = console.readLine();   
                
                rec = new Rectangle( base, height, tag );
                                             
           	 }catch (IOException e) {
	        	e.printStackTrace();
	        } finally {
	            if (console != null) {
	                try {
	                    console.close();
	                } catch (IOException e) {
	                    e.printStackTrace();
	                }
	            }
	        }  	 
    	 
    	return rec;        
                
    }
}