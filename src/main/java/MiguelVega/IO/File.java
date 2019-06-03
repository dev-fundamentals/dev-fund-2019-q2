package main.java.MiguelVega.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
	
public class File {

	public static void main(String[] args) throws IOException {
				
		// Reading an writing files using FileInputStream or FileOutputStream
		FileInputStream in=null;
		FileOutputStream out=null;
		try {				
		in = new FileInputStream("C:\\File\\input.txt");
		out = new FileOutputStream("C:\\File\\output.txt");

		int c;
		while ((c=in.read())!=-1) 
		{
		out.write(c);
		}
		}
		finally
		{
			if (in!=null)
			{
				in.close();
			}
			if (out!=null)
			{
				out.close();
			}
			
		}

		// Reading an writing files using FileReader or FileWriter
		FileReader inr=null;
		FileWriter outw=null;
		
		try {
			inr=new FileReader("C:\\File\\input.txt");
			outw=new FileWriter("C:\\File\\output.txt");
			
			int c;
			while ((c=inr.read())!=-1)
			{
				outw.write(c);
				
			}
		}
			finally
			{
				if (inr!=null)
				{
					inr.close();
				}
				if (outw!=null)
				{
					outw.close();
				}
				
			}			
		
		// Reading from console
		
		InputStreamReader cin=null;
		try {
			cin = new InputStreamReader(System.in);
			System.out.println("Enter characters, 'q' to quit.");
			char c;
			do {
				c=(char) cin.read();
				System.out.print(c);
				
			}
			while (c!='q');						
			}
		finally {
			if (cin!=null)
			{
				cin.close();
			}
						
		}		
		
		}
		
	}


