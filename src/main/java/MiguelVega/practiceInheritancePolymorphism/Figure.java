package main.java.MiguelVega.practiceInheritancePolymorphism;

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

  /** Identifier name of a figure */
  protected String identifier;

  /** Every figure has a color */
  Figure(int color) {
    this.color = color;
    identifier = "";
  }

  /** Get the figure color */
  public int getColor() {
    return this.color;
  }

  /** General figures behavior */
  public boolean move(Position origin, Position destination)
  {
      return false;
  }

  /** For testing purposes */
  public void whoAmI() {
    if (color == Figure.WHITE) {
      System.out.println("WHITE");
    } else {
      System.out.println("BLACK");
    }
  }
  
  public static void main(String[] args) {
		// 2 objects of Queen class and 4 objects of Castle class.

	  Figure figure[] = new Figure[6];
	  
	  Queen q1= new Queen(0);
	  Queen q2= new Queen(1);
	  
	  Castle c1= new Castle(0);
  	  Castle c2= new Castle(1);
  	  Castle c3= new Castle(0);
  	  Castle c4= new Castle(1);
	      	  
      figure[0]=q1;
      figure[1]=q2;
      figure[2]=c1;
      figure[3]=c2;
      figure[4]=c3;
      figure[5]=c4;
      /*
      for (int i=0;i<figure.length;i++)
      {
    	  figure[i].whoAmI();    	  
      } 
      */      
      
      for (Figure fif : figure)
      {
    	   fif.whoAmI();   
    	    
      }    	
	}

} // Figure