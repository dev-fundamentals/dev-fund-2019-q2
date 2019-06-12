package main.java.ShayraAltamirano.PracticePolymorphism.Exercise2;

import java.io.IOException;
import java.io.InputStreamReader;

public class FiguresTesting {
	
	public static void main(String[] args) throws IOException {
				
			InputStreamReader cin =null;
			InputStreamReader baseRect =null;
			InputStreamReader heightRect =null;
			InputStreamReader sideSquare =null;
			
			Rectangle rectangle= new Rectangle();
			Square square= new Square();
			
			try {
				
				cin = new InputStreamReader(System.in);
				char c;
				do {
					
					cin = new InputStreamReader(System.in);
					System.out.println("1.- Create rectangle");
					System.out.println("2.- Create Square");
					System.out.println("3.- Display figure");
					System.out.println("0.- Exit");
				
					c = (char) cin.read();
					
					if (c=='1') {
						
						//Input base
						baseRect = new InputStreamReader(System.in);
						System.out.println("Base:");
						char b;
						b= (char) baseRect.read();
						
						//Input Height
						heightRect = new InputStreamReader(System.in);
						System.out.println("heigh:");
						char h;
						h= (char) heightRect.read();
						
						//Call methods
						rectangle.setFigureType("Rectangle");
						rectangle.setBase(Character.getNumericValue(b));
						rectangle.setHeight(Character.getNumericValue(h));
						//System.out.print(rectangle.base);	
						//System.out.print(rectangle.height);	
									
					}
					if (c=='2') {
						
						
						//Input side
						sideSquare = new InputStreamReader(System.in);
						System.out.println("Side:");
						char s;
						s= (char) sideSquare.read();
						//Call methods
						square.setFigureType("Square");
						square.setSide(Character.getNumericValue(s));
						
									
					}
					if (c=='3') {
						
						if (square.getFigureType()!=null) {
							square.printDescription();
							square.drawTxt();
						}
						if (rectangle!=null) {
							rectangle.printDescription();
							rectangle.drawTxt();
						}
						else {
						System.out.println("create a figure");
						}
					}
					
					
				}while (c!='0');
			}
			finally {
				if (cin != null) {
					cin.close();
				}
			}	
		
	}
}
