package main.java.AlejandraNeolopan.practiceInheritancePolymorphism;

/**
 * Defines the general behavior of a figure
 * 
 * @author JRM
 * 
 */
class Figure {
  protected final static int WHITE = 0;
  protected final static int BLACK = 1;

  protected int color;
  protected String label;
  protected String tag;
  /** Identifier name of a figure */
  protected String identifier;

  /** Every figure has a color */
  Figure(int color) {
    this.color = color;
    identifier = "";
    label="C-5";
  }
  Figure(String description) {
	    this.color = 0;
	    identifier = "";
	    label=description;
	   
	  }

  /** Get the figure color */
  public int getColor() {
    return this.color;
  }
  
  public final String getLabel() {
	  
		    return this.label;
		  }
  public final String getTag() {
	  
	    return this.tag;
	  }
  public final void setLabel(String desc) {
	     this.label=desc;
	  }
  public final void printDescription() {
	System.out.println("Tag: "+getTag());
	System.out.println("Figure Type: "+ identifier);
	System.out.println("Area: "+getArea());
  }
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

} // Figure