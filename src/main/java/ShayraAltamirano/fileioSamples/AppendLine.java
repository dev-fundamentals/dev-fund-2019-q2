package main.java.ShayraAltamirano.fileioSamples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AppendLine {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		String filename= ("D:\\Capacitaciones Jala\\DEV-FUNDAMENTALS\\input.txt");
        FileWriter fw = new FileWriter(filename,true);
        
        //appends the string to the file
        fw.write("\nJava Exercises\n");
        fw.close();
        
		String cadena=new String();  
		
		BufferedReader reader = new BufferedReader(new FileReader("D:\\Capacitaciones Jala\\DEV-FUNDAMENTALS\\input.txt"));
		String line = reader.readLine();
		while (line != null) {
			System.out.println(line);
			// read next line
			cadena=cadena+line+ " ";
			line = reader.readLine();
			
		}
		reader.close();

	}

}
