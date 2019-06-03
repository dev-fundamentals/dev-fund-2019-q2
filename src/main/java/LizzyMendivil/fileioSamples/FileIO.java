package main.java.LizzyMendivil.fileioSamples;

import java.io.*;
/* import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream; */

import org.omg.CORBA.portable.InputStream;

public class FileIO {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/* FileInputStream in = null;
		FileOutputStream out = null;
		
		try {
			in = new FileInputStream("D:\\files\\input.txt");
			out = new FileOutputStream("D:\\files\\output.txt");
			
			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}
		} finally {
			// TODO: handle exception
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		} */
		
		/* FileReader in = null;
		FileWriter out = null;
		
		try {
			in = new FileReader("D:\\files\\input.txt");
			out = new FileWriter("D:\\files\\output.txt");
			
			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		} */
		
		/* InputStreamReader cin = null;
		try {
			cin = new InputStreamReader(System.in);
			System.out.println("Enter characters, 'q' to quit");
			char c;
			do {
				c = (char) cin.read();
				System.out.println(c);
			} while(c != 'q');
		} finally {
			// TODO: handle finally clause
			if (cin != null) {
				cin.close();
			}
		} */
		
		/* try {
			byte bWrite[] = { 11, 21, 3, 40, 5 };
			OutputStream os = new FileOutputStream("test.txt");
			for (int x = 0; x < bWrite.length; x++) {
				os.write(bWrite[x]); // writes the bytes
			}
			os.close();
			
			InputStream is = new FileInputStream("test.txt");
			int size = is.available();
			
			for (int i = 0; i < size; i++) {
				System.out.println((char)is.read() + " ");
			}
			is.close();
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("Exception");
		} */
		
	}

}
