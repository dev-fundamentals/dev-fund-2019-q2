package main.java.BrunoAvila.fileIOSamples;

import java.io.FileOutputStream;
import java.io.IOException;

public class AppendTextFile {

	public static void main(String[] args) {
		String textToAppend = "\r\n Bruno deberia de morir!"; 
		try { 
			    FileOutputStream outputStream = new FileOutputStream("D:\\files\\test.txt", true);
			    byte[] strToBytes = textToAppend.getBytes();
			    outputStream.write(strToBytes);
			  
			    outputStream.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
