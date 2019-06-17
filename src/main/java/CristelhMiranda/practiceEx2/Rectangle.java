package main.java.CristelhMiranda.practiceEx2;

public class Rectangle extends GeometricFigure {
	
	private int base;
	private int height;
	
	Rectangle(int base, int height,String label)
	{
		super(label);
		this.base=base;
		this.height=height;
		type = "rectangle";
	}
	
	public String getFigureType(){
		return type;
	}
	public double area(){
		return base * height;
	}
	public void drawTxt(){
		String b = "";
		for(int i = 0; i<base; i++) {
			b += "*";
		}
		
		for (int i = 0; i<height; i++) {
			System.out.println(b);
		}
	}

	
	
}
