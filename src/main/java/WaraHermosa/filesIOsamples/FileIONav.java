package main.java.WaraHermosa.filesIOsamples;

import java.io.File;

public class FileIONav {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dirname= "/tmp/user/java/bin";
		File d = new File(dirname);
		
		//Create Directory now
		d.mkdirs();
	}

}
