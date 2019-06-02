package main.java.BrunoAvila.fileIOSamples;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class characterstream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//FileReader in = null;
		//FileWriter out = null;
		InputStreamReader cin = null;
		try {
			//in = new FileReader ("D:\\files\\input.txt");
			//out = new FileWriter ("D:\\files\\output.txt");
			cin = new InputStreamReader (System.in);
			System.out.println("Enter characters, 'q' to quit.");
			//int c;
			char c;
			do {
				c= (char) cin.read();
				System.out.print(c);
			}
			while (c != 'q');
			
			//while ((c= cin.read ())!= 'q') {
				//out.write(c);
		 
		} finally {
			if (cin != null) {
				cin.close();
			//}
			//if (out != null) {
			//	out.close();
			}
		}
	}

}
