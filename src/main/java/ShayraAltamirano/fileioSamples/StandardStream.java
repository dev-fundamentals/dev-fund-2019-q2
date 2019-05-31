package main.java.ShayraAltamirano.fileioSamples;

import java.io.IOException;
import java.io.InputStreamReader;

public class StandardStream {

	public static void main(String[] args) throws IOException  {
		InputStreamReader cin =null;
		try {
			cin = new InputStreamReader(System.in);
			System.out.println("Enter characters, 'q' to quit");
			char c;
			do {
				c = (char) cin.read();
				System.out.print(c);			
			}while (c!='q');
		}finally {
			if (cin != null) {
				cin.close();
			}
		}	
	}
}
