package main.java.MiguelVega.FileIOHomework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Write a Java program to compare two files lexicographically
 */
public class Task3 
{

	public static void main(String[] args) 
	{ 
		BufferedReader console = null;
		String input,input2;
		System.out.print("Igrese name files");
		
		try 
        {
		console = new BufferedReader(new InputStreamReader(System.in));
		
        input = console.readLine();
        
        
        System.out.print("Enter file name: ");
        input2 = console.readLine();   
        
	       if (input.compareTo( input2 ) == input2.compareTo( input ))
	       {
	    	   System.out.println(input+" and "+input2+" are equals");   
	       }       
        }
		catch (IOException e) {
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
		
	}		 
}
