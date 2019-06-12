package main.java.RocioEncinas.practiceInheritancePolymorphism;

public class Figure {
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
	public boolean move(Position origin, Position destination) {
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
}
