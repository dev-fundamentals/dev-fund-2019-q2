package main.java.RocioEncinas.practiceInheritancePolymorphism;

public interface IFigure {
	public final static int WHITE = 0;
	public final static int BLACK = 1;
	
	int color = 0;

	/** Identifier name of a figure */
	public String identifier = "";
	
	public int getColor();
	
	public boolean move(Position origin, Position destination);
	
	public void whoAmI();
}
