package main.java.ShayraAltamirano.PracticePolymorphism.Exercise2;

public class Rectangle extends GeometricFigure{
	protected int base;
	protected int height;
	
	public int getBase() {
	    return this.base;
	  }

	  public int getHeight() {
	    return this.height;
	  }

	  public void setBase(int base) {
	    this.base = base;
	  }

	  public void setHeight(int height) {
	    this.height = height;
	  }
	 
	  
	  public double area() {
		  return (this.base * this.height);
	  }
	  public void drawTxt() {
		  
		  String line="";
		  for(int i=0;i<this.height;i++) {
			  for(int j=0;j<base;j++) {
				  line=line+ "*";
			  }
			  System.out.println(line);
			  line="";
		  }
		  
	  }
}
