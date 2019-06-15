package main.java.AlejandraNeolopan.practiceInheritancePolymorphism;

import main.java.AlejandraNeolopan.practiceInheritancePolymorphism.Exercise1.Position;

/**
 * Defines the general behavior of a figure
 * 
 * @author JRM
 * 
 */
public interface IFigure {
  public int WHITE = 0;
  public int BLACK = 1;
 
  /** Get the figure color */
  public int getColor() ;
  public void setColor(int color);
  public String getLabel();
  public void setLabel(String desc);
  public void printDescription() ;
  /** General figures behavior */
  public boolean move(Position origin, Position destination);
  public double getArea();

  /** For testing purposes */
  public void whoAmI() ;


} // Figure