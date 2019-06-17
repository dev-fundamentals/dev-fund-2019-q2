package main.java.CristelhMiranda.practiceEx2;
public abstract class Figure implements IFigure {
	String type;
	String label;
	
	
  public String getTag()
  {
      return "";
  }

  public String getFigureType()
  {
      return "";
  }
  
  public double area()
  {
      return 0;
  }

  public void drawTxt()
  {      
  }

  public abstract void printDescription();
}
