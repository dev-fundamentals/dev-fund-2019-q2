package main.java.WaraHermosa.filesIOsamples;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
 
public class FileIO {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try {
			in = new FileInputStream("D:\\files\\input.txt");
			out = new FileOutputStream("D:\\files\\output.txt");
			int c;
			while ((c=in.read())!=-1) {
				out.write(c);
		}
		}finally {
			if (in != null) {
				in.close();
			}
			if (out !=null)  {
				out.close();
			}
		}
	}


//---------------------------	
	public static void main1(String[] args) throws IOException {
		// TODO Auto-generated method stub{
		FileReader in = null;
		FileWriter out = null;
		
		try {
			in = new FileReader("input.txt");
			out = new FileWriter("output.txt");
			
			int c;
			while((c = in.read()) != -1) {
				out.write(c);
			}
		} finally {
			if (in != null) {
				in.close();
			}
			if(out != null) {
				out.close();
			}
		}
	}
}

		
		