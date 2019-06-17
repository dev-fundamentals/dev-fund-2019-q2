package main.java.MiguelVega.Figures;

 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Testing {          

           private static void showMenu() {
              System.out.println();
              System.out.println("1. Create rectangle");
              System.out.println("2. Create square");
              System.out.println("3. See figure");
              System.out.println("0. Exit");
              System.out.print("Select an option > ");
           }

           public static void main (String args[]) {    	   
        	      	   
        	   Figure fig = null;
               String sOption;
               int iOption = 0;

               BufferedReader entry = new BufferedReader( new InputStreamReader( System.in ));


               do {
                   showMenu();
                   try {
                       sOption = entry.readLine();
                       iOption = Integer.parseInt( sOption );
                   }
                   catch ( IOException e ) {
                       
                       System.err.println("IO error");
                       iOption = 0;
                   }                  
                   

                   switch( iOption ) {

                   case 0:
                      break;

                   case 1:  
                       fig = Rectangle.fillRectangle();
                       break;

                   case 2: 
                       fig = Square.fillSquare();
                       break;


                   case 3:           
                       if (fig != null ) {
                           fig.drawTxt();
                           fig.printDescription();
                       } else {
                           System.err.println( "Fugura is empty" );
                       }
                       break;

                   default:     
                       System.err.println("Wrong option");

                   }

               } while (iOption != 0);  

           }


   }