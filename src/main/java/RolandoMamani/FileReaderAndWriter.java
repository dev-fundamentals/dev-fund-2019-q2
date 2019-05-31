package main.java.RolandoMamani;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderAndWriter {

	public static void main(String[] args) throws IOException {
		FileReader in = null;
		FileWriter out = null;
		
		try {
			in = new FileReader("D:\\DevFundamentals1\\input.txt");
			out = new FileWriter("D:\\DevFundamentals1\\output.txt");
			
			int c;
			while((c = in.read()) != -1) {
				out.write(c);
			}
			
		}finally {
			if(in != null) {
				in.close();
			}
			if(out != null) {
				out.close();
			}
		}

	}

}
