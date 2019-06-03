package main.java.MiguelVega.FileIOHomework;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

	public static void main(String[] args){
		
		 BufferedReader console = null;
		 File file=null;
		 String[] fileDir;
		 String input;
		 
	        try {
	            console = new BufferedReader(new InputStreamReader(System.in));
	            
	            while(true) {
	            	
	                System.out.print("Enter a path('q' to exit) : ");
	                input = console.readLine();

	                if ("q".equals(input)) {
	                    System.out.println("Exit!");
	                    System.exit(0);
	                }

	                file=new File(input);	                
	                fileDir=file.list();
	                
	    			for(String content:fileDir)
	    			{
	    				System.out.println(content);	    				
	    			}	              	                
	            }
	        } catch (IOException e) {
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