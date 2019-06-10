package main.java.ShayraAltamirano.fileioSamples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader reader;
		String cadena=new String();  
		
		try {
			reader = new BufferedReader(new FileReader("D:\\Capacitaciones Jala\\DEV-FUNDAMENTALS\\input.txt"));
			String line = reader.readLine();
			while (line != null) {
				// read next line
				cadena=cadena+line+ " ";
				line = reader.readLine();
				
			}

			System.out.println(cadena);
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
