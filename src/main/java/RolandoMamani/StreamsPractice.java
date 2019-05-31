package main.java.RolandoMamani;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamsPractice {

	public static void main(String[] args) throws IOException {
		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			in = new FileInputStream("D:\\DevFundamentals1\\input.txt");
			out = new FileOutputStream("D:\\DevFundamentals1\\output.txt");
			
			int c;
			while((c = in.read()) != -1) {
				out.write(c);
				System.out.println(c);
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
