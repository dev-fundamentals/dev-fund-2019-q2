package main.java.AlejandraNeolopan.practiceInheritancePolymorphism;

import main.java.AlejandraNeolopan.practiceInheritancePolymorphism.Exercise1.Position;

import java.io.*;
/**
 * Defines the general behavior of a figure
 * 
 * @author JRM
 * 
 */

public abstract class Figure implements IFigure{
  protected final static int WHITE = 0;
  protected final static int BLACK = 1;

  protected int color;
  protected String label;
  protected String tag;
  /** Identifier name of a figure */
  protected String identifier;

  /** Every figure has a color */
  protected Figure(int color) {
    this.color = color;
    identifier = "";
    label="C-5";
  }
  protected Figure(String description) {
	    this.color = 0;
	    identifier = description;
	    label="";
	   
	  }

  /** Get the figure color */
  public int getColor() {
    return this.color;
  }
  public void setColor(int color) {
	    this.color=color;
	  }
  
  public final String getLabel() {
	  
		    return this.label;
		  }
  
  public abstract void setLabel(String desc) ;
  public abstract void printDescription() ;
  /** General figures behavior */
  public boolean move(Position origin, Position destination)
  {
      return false;
  }
  public double getArea() {
	  return 0;
  }

  /** For testing purposes */
  public void whoAmI() {
    if (color == Figure.WHITE) {
      System.out.println("WHITE");
    } else {
      System.out.println("BLACK");
    }
  }
  
  public static Figure readFigureData(BufferedReader input) throws IOException {
	return null;
  }
} // Figure