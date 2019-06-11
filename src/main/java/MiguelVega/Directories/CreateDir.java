package main.java.MiguelVega.Directories;

import java.io.File;

public class CreateDir {

	public static void main(String[] args) {
		
		//Creating a directory
				String dirname= "C:\\Miguel\\Directory";
				File d = new File(dirname);
				d.mkdirs();		

	}

}
