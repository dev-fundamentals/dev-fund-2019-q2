package main.java.BrunoAvila.fileIOSamples;

import java.io.File;

public class ListFile {

	public static void main(String[] args) {
		
		File fileDir = new File("D:\\files\\");

        if (!fileDir.exists()){
            System.out.println("Path not found");
            System.exit(-1);
        }
        File[] fileList = fileDir.listFiles();
        
        for (File file : fileList) {
			System.out.println(file.getName());
		}

	}

}
