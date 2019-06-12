package main.java.ShayraAltamirano.PracticePolymorphism.Exercise2;

public class Square extends Rectangle {
	 
	
	protected int side;
	
	public int getSide() {
	    return this.side;
	  }

	  public void setSide(int side) {
		
		
	    this.side=side;
	    this.base=side;
	    this.height=side;
	    
	  }
}
