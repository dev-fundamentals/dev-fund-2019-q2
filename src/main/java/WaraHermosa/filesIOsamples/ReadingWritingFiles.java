package main.java.WaraHermosa.filesIOsamples;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ReadingWritingFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			byte bWrite [] = {11, 21, 3, 40, 5};
			OutputStream os = new FileOutputStream("test.txt");
			for (int x = 0; x < bWrite.length; x++) {
				os.write( bWrite [x]); 	//writes the bytes
		}
		os.close();
		
		InputStream is = new FileInputStream("test.txt");
		int size = is.available();
		
		for(int i = 0; i < size; i++) {
			System.out.print((char)is.read() + " ");
			
		}
		is.close();
		} catch (IOException e) {
			System.out.print("Exception");
		}
	}
}

