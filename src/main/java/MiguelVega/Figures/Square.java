package main.java.MiguelVega.Figures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Square extends Rectangle {
	
	public Square(int edge) {
		this(edge, "Square");
	    }

	    public Square(int edge, String tag) {
		super(edge, edge, tag);
	    }

	    public String getFigureType() 
	    {
	    	return "Square"; 
	    }

	    public static Square fillSquare() 
   	    {
		Square cuadrado = null;
		String tag;
		int side;
			
    	BufferedReader console = null;
    	
   	 try {
         console = new BufferedReader(new InputStreamReader(System.in));    	
	
         System.out.print("Side: ");
         side = Integer.parseInt(console.readLine());
         
         System.out.print("Tag: ");
         tag = console.readLine();   
         
         cuadrado = new Square( side, tag );
                                      
    	 }catch (IOException e) {
     	e.printStackTrace();
     } finally {
         if (console != null) {
             try {
                 console.close();
             } catch (IOException e) {
                 e.printStackTrace();
             }
         }
     }  	 
	 
	return cuadrado;        
         
}

		
				

}
