package main.java.MiguelVega.FileIOHomework;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {

	public static void main(String[] args) {
			
		 BufferedReader console = null;
		 File file=null;
		 String[] fileDir;
		 String input,input2;
		 int band=0;
		 
	        try 
	        {
	            console = new BufferedReader(new InputStreamReader(System.in));
	            
	            while(true)
	            {
	            	System.out.println("Enter path, extension or 'q' to exit");
	                
	            	System.out.print("Enter a path: ");
	                input = console.readLine();
	                
	                System.out.print("Enter extension: ");
	                input2 = console.readLine();               
	                                
	                if ("q".equals(input)) {
	                    System.out.println("Exit!");
	                    System.exit(0);
	                }

	                file=new File(input);	                
	                fileDir=file.list();
	                
	    			for(String content:fileDir)
	    			{
	    				if(content.toLowerCase().endsWith(input2) )
	    				{	    					
	    					System.out.println("The next file was found: "+content);
	    				}
	    				else	    					
	    				{	   					
	    					band=1;	    					
	    				}	    					    				
	    			}
	    			if (band==1)
	    			{
	    				System.out.println(input + " doesn't have any file with extension " + input2);
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
