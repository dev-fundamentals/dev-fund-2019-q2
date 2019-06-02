package main.java.BrunoAvila.fileIOSamples;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class bytestreamsBB {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			in = new FileInputStream ("D:\\files\\input.txt");
			out = new FileOutputStream ("D:\\files\\output.txt");
		int c;
		while ((c= in.read())!= -1) {
			out.write(c);
		}
	}finally {
		if (in !=null) {
			in.close();
		}
		if (out !=null) {
			out.close();
		}
	}
	}
}
// si abrimos las entradas uy salidas tenemos que cerrar las conexiones