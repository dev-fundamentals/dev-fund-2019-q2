package main.java.ShayraAltamirano.fileioSamples;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharStream {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		FileReader in = null;
		FileWriter out = null;
		try {
			in = new FileReader("D:\\Capacitaciones Jala\\DEV-FUNDAMENTALS\\input.txt");
			out = new FileWriter("D:\\Capacitaciones Jala\\DEV-FUNDAMENTALS\\output.txt");
			
			int c;
			while((c = in.read()) != -1){
				out.write(c);
			}
		}
		
		finally {
			if (in != null) {
				in.close();
			}
			if (out!= null) {
				out.close();
			}
			
		}

	}
}